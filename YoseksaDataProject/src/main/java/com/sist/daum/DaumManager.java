package com.sist.daum;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sist.dao.YoseksaAllVO;

public class DaumManager {
	public String readJson(String ss,String gu,String dong,int page) throws Exception {
		StringBuffer sb = new StringBuffer();
		URL url = new URL("https://apis.daum.net/search/blog?apikey=6727e27025118f69c9959544e4dd00cc&q=\""+URLEncoder.encode(ss, "UTF-8")+"\"+"+URLEncoder.encode(dong, "UTF-8")+"|"+URLEncoder.encode(gu, "UTF-8")+"&output=json&advance=y&pageno="+page+"&result=20");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		if (conn != null)
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			while (true) {
				String data = in.readLine();
				if (data == null)
					break;
				System.out.println(data);
				sb.append(data + "\n");
			}
			conn.disconnect();
		}

		return sb.toString();
	}
	public YoseksaAllVO jsonParse(String jsonComent,String place,YoseksaAllVO vo) throws Exception {
		YoseksaAllVO yvo=vo;
		int count=yvo.getCount();
		int score=yvo.getScore();
		JSONParser jp = new JSONParser();
		JSONObject jo = (JSONObject) jp.parse(jsonComent);
		JSONObject channel = (JSONObject) jo.get("channel");
		// description
		JSONArray array = (JSONArray) channel.get("item");
		String data = "";
		String coment="";
		String firstlink=vo.getFirstLink();
		List list=new ArrayList();
		for (int i = 0; i < array.size(); i++) {
			System.out.println("���° ��α�??"+i);
			JSONObject obj = (JSONObject) array.get(i);
			String link = (String)obj.get("link");
			// ���� ��ũ�� ��Ÿ���� BREAK ��Ų��.
			if(i==0){
				yvo.setFirstLink(link);
				if(firstlink.equals(link)) break;
			}
			count=count+1;
			String month = (String)obj.get("pubDate");
			// Json�Ľ��� ������ ��ũ�� ������ jsoup�Ľ�
			coment=daumJsoup(link,place); // 
			System.out.println("��α� �ۼ� ��¥�� ?  = "+month);
			System.out.println("��α� �ۼ� ��¥  substring = "+month.substring(4, 6));
			month=month.substring(4,6);
			// VO�� month�� �μ�Ʈ
			monthInsert(yvo,month);
			String a=taste(coment);
			if(a.equals("y")){
				list.add(coment);
			}
			// ���͸�
			score=score+score(coment);
		}
		// ī��Ʈ ������ vo�� �Է�
		yvo.setCount(count);
		yvo.setScore(score);
		// ���͸��� ������ �����س��� �ؽ�Ʈ������ ���Ϸ� ����
		comentFile(list, place);
		return yvo;
	}
	public String daumJsoup(String daumlink,String sub) throws Exception{
		System.out.println("��α� �˻� ��ũ�� =="+daumlink);
		Document document;
		document = Jsoup.connect(daumlink).timeout(100000).get();
		String div="div";
		String html="html";
//		String coment=document.getElementsByTag(html).text();
		String coment=document.select("html").text();
		ComentRemove cr=new ComentRemove();
		coment=cr.remove(coment);
		System.out.println("�ڸ�Ʈ�� = "+coment);
//		System.out.println(document);
		return coment;
	}
	public void comentFile(List list,String sub) throws Exception{
		// ������ ������ �ҷ����� ������ ����
		File file=new File("\\\\211.238.142.144\\datas\\files\\"+sub+".txt");
		if(file.exists()==false){
			file.createNewFile();
		}		
		FileWriter fw=new FileWriter(file);
		String placecoment="";
		for(int a=0;a<list.size();a++){
			placecoment+=list.get(a)+"\n";			
		}
		fw.write(placecoment);
		fw.close();	
	}
	public int score(String coment){
		int score=0;
		Score sc=new Score();
		score=sc.comentScore(coment);
		return score;
	}
	public String taste(String coment) throws Exception{
		String a="n";
		int b=coment.indexOf("����");
		if(b>0){
			a="y";
		}
		return a;
	}
	public void monthInsert(YoseksaAllVO vo,String month) throws Exception{
		int a=Integer.parseInt(month);
		switch(a){
		case 1:
			vo.setJan(vo.getJan()+1);
			break;
		case 2:
			vo.setFeb(vo.getFeb()+1);
			break;
		case 3:
			vo.setMar(vo.getMar()+1);
			break;
		case 4:
			vo.setApr(vo.getApr()+1);
			break;
		case 5:
			vo.setMay(vo.getMay()+1);
			break;
		case 6:
			vo.setJune(vo.getJune()+1);
			break;
		case 7:
			vo.setJul(vo.getJul()+1);
			break;
		case 8:
			vo.setAug(vo.getAug()+1);
			break;
		case 9:
			vo.setSep(vo.getSep()+1);
			break;
		case 10:
			vo.setOct(vo.getOct()+1);
			break;
		case 11:
			vo.setNov(vo.getNov()+1);
			break;
		case 12:
			vo.setDec(vo.getDec()+1);
			break;		
		}	
	}
}
