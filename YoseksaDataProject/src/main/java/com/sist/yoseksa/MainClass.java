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
		String place=""; // DB 장소명
		String addr="";
//		String gu="강남구"; // DB 규
//		String dong="논현동"; // DB동
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
			// no값 인서트
			vo.setNo(pk);
			// 음식점명 입력
			vo.setName(place);
			// 음식점 주소 입력
			vo.setAddr(addr);
			for(int page=1;page<50;page++){
				link=vo.getFirstLink();
				jsonComent=dm.readJson(place, gu, dong, page);
				vo=dm.jsonParse(jsonComent,place,vo);
				if(vo.getFirstLink().equals(link)) break;
				System.out.println(page);
			}
			System.out.println("몇번째 번호?"+vo.getNo());
			System.out.println("어느 음식점?"+vo.getName());
			System.out.println("주소는?"+vo.getAddr());
			System.out.println("몇개를 검색했니?"+vo.getCount());
			System.out.println("1월?"+vo.getJan());
			System.out.println("2월?"+vo.getFeb());
			System.out.println("3월?"+vo.getMar());
			System.out.println("4월?"+vo.getApr());
			System.out.println("5월?"+vo.getMay());
			System.out.println("6월?"+vo.getJune());
			System.out.println("7월?"+vo.getJul());
			System.out.println("8월?"+vo.getAug());
			System.out.println("9월?"+vo.getSep());
			System.out.println("10월?"+vo.getOct());
			System.out.println("11월?"+vo.getNov());
			System.out.println("12월?"+vo.getDec());
			System.out.println("점수는? "+vo.getScore());
			int c=(int)(((double)vo.getScore()/vo.getCount())*10);
			vo.setScore(c);
			System.out.println("최종 점수는 = "+c);
			//vo 를 가지고 DB인서트
			dbc.dbInsert(vo);
		}		
		// 검색해야하는 업체명 -> 디비로 불러온다(업체명,구,동).
//		place="정가네";
		// 업체명을 가지고 다음에있는 JSON파싱(ok)
/*		for(int page=1;page<3;page++){
			jsonComent=dm.readJson(place, gu, dong, page);
			dm.jsonParse(jsonComent, place);
		}*/
		// Json파싱이 끝나면 링크를 가지고 jsoup파싱(ok)
		// Jsoup 파싱이 끝나면 필터링 (점수. .. . .)
		// 필터링이 끝나고 저장해놓은 텍스트파일을 파일로 저장 (ok)
		// 알 연동해서 파일을 알로 보낸후 형태소분석 후 형태소분석한 내용을 파일로 저장
		// 형태소 분석한 파일을 가지고 워드클라우드를 만든다
		// 디비에 저장해야된다. ( 필터링이 끝낸후 점수, 몇월에 작성한 블로그인지, 아침,점심,저녁,야식 (형태소에서 카운트를세서)
		// 키워드-형태소분석한것 중에서 가장 많이 언급된 내용 , 사징파일명
		// 파일저장후 워드클라우드 제작
//		r.wordcloud(place); (나중엥 텍스트 수집 다한후에)
		System.out.println("종료");
	}

}
