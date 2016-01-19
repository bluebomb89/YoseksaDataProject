package com.sist.yoseksa;

import com.sist.dao.YoseksaAllVO;
import com.sist.daum.AddrParse;
import com.sist.daum.DBConnect;
import com.sist.daum.DaumManager;
import com.sist.daum.R;

public class MainClass {
	public static void main(String[] args) throws Exception {
		YoseksaAllVO vo=new YoseksaAllVO();
		R r=new R();
		DBConnect dbc=new DBConnect();
		AddrParse adp=new AddrParse();
		DaumManager dm = new DaumManager();
		String place=""; // DB ��Ҹ�
		String addr="";
//		String gu="������"; // DB ��
//		String dong="������"; // DB��
		String gu="";
		String dong="";
		String jsonComent="";
		int count=dbc.dbcount();
//		for(int pk=1;pk<count;pk++){
		for(int pk=2;pk<3;pk++){
			place=dbc.dbname(pk);
			System.out.println(place);
			addr=dbc.dbaddr(pk);
			System.out.println(addr);
			gu=adp.getGu(addr);
			System.out.println(gu);
			dong=adp.getDong(addr);
			System.out.println(dong);
			String beforelink="";
			String link="";
			// no�� �μ�Ʈ
			vo.setNo(pk);
			// �������� �Է�
			vo.setName(place);
			// ������ �ּ� �Է�
			vo.setAddr(addr);
			for(int page=1;page<50;page++){
				link=vo.getFirstLink();
				jsonComent=dm.readJson(place, gu, dong, page);
				vo=dm.jsonParse(jsonComent,place,vo);
				if(vo.getFirstLink().equals(link)) break;
				System.out.println(page);
			}
			System.out.println("���° ��ȣ?"+vo.getNo());
			System.out.println("��� ������?"+vo.getName());
			System.out.println("�ּҴ�?"+vo.getAddr());
			System.out.println("��� �˻��ߴ�?"+vo.getCount());
			System.out.println("1��?"+vo.getJan());
			System.out.println("2��?"+vo.getFeb());
			System.out.println("3��?"+vo.getMar());
			System.out.println("4��?"+vo.getApr());
			System.out.println("5��?"+vo.getMay());
			System.out.println("6��?"+vo.getJune());
			System.out.println("7��?"+vo.getJul());
			System.out.println("8��?"+vo.getAug());
			System.out.println("9��?"+vo.getSep());
			System.out.println("10��?"+vo.getOct());
			System.out.println("11��?"+vo.getNov());
			System.out.println("12��?"+vo.getDec());
			System.out.println("������? "+vo.getScore());
			int c=(int)(((double)vo.getScore()/vo.getCount())*10);
			vo.setScore(c);
			System.out.println("���� ������ = "+c);
			//vo �� ������ DB�μ�Ʈ
			dbc.dbInsert(vo);
		}		
		// �˻��ؾ��ϴ� ��ü�� -> ���� �ҷ��´�(��ü��,��,��).
//		place="������";
		// ��ü���� ������ �������ִ� JSON�Ľ�(ok)
/*		for(int page=1;page<3;page++){
			jsonComent=dm.readJson(place, gu, dong, page);
			dm.jsonParse(jsonComent, place);
		}*/
		// Json�Ľ��� ������ ��ũ�� ������ jsoup�Ľ�(ok)
		// Jsoup �Ľ��� ������ ���͸� (����. .. . .)
		// ���͸��� ������ �����س��� �ؽ�Ʈ������ ���Ϸ� ���� (ok)
		// �� �����ؼ� ������ �˷� ������ ���¼Һм� �� ���¼Һм��� ������ ���Ϸ� ����
		// ���¼� �м��� ������ ������ ����Ŭ���带 �����
		// ��� �����ؾߵȴ�. ( ���͸��� ������ ����, ����� �ۼ��� ��α�����, ��ħ,����,����,�߽� (���¼ҿ��� ī��Ʈ������)
		// Ű����-���¼Һм��Ѱ� �߿��� ���� ���� ��޵� ���� , ��¡���ϸ�
		// ���������� ����Ŭ���� ����
//		r.wordcloud(place); (���߿� �ؽ�Ʈ ���� �����Ŀ�)
		System.out.println("����");
	}

}
