package com.sist.daum;

public class ComentRemove {
	public String remove(String coment) throws Exception{
		coment=coment.replaceAll("\u00a0", "");
		coment=coment.replaceAll("네이버", "");
		coment=coment.replaceAll("블로그", "");
		coment=coment.replaceAll("바로가기", "");
		coment=coment.replaceAll("본문", "");
		coment=coment.replaceAll("이웃", "");
		coment=coment.replaceAll("모두의", "");
		coment=coment.replaceAll("로그인", "");
		coment=coment.replaceAll("지도", "");
		coment=coment.replaceAll("서재", "");
		coment=coment.replaceAll("앱스", "");
		coment=coment.replaceAll("메모", "");
		coment=coment.replaceAll("안부", "");
		coment=coment.replaceAll("목록열기", "");
		coment=coment.replaceAll("스크랩", "");
		coment=coment.replaceAll("엮인글", "");
		coment=coment.replaceAll("전체보기", "");
		coment=coment.replaceAll("포스트쓰기", "");
		int a=coment.indexOf("태그저장");
//		System.out.println("지우는 a의 번호는"+a);
		if(a>0){
			String b=coment.substring(a);
			coment=coment.replace(b, "");
		}		
//		System.out.println("지워야하는 스트링값은"+b);		
		coment=coment.replaceAll("태그", "");
		coment=coment.replace("지금 떠오른 생각을 퀵에디터로 해보세요", "");
		coment=coment.replace("이 달의 결심, 실천일기를 퀵에디터로 기록해보세요", "");
		coment=coment.replace("오늘 찍은 사진을 퀵에디터로 남겨보세요.", "");
		coment=coment.replace("오늘 있었던 일을 퀵에디터로 기록해보세요.", "");
		coment=coment.replace("지금 떠오른 생각을 퀵에디터로 해보세요", "");
		coment=coment.replace("포스트쓰기 가벼운 글쓰기툴 퀵에디터가 오픈했어요!", "");
		coment=coment.replace("다시 읽고 싶은 링크를 퀵에디터로 남겨보세요.", "");
		coment=coment.replace("가벼운 글쓰기툴 퀵에디터가 오픈했어요!", "");
		coment=coment.replace("오늘 찍은 사진을 퀵에디터로 남겨보세요.", "");
		coment=coment.replaceAll("\u00a0", "");
//		coment=coment.replaceAll("[", "");
//		coment=coment.replaceAll("]", "");
		coment=coment.replaceAll("\\]", "").replaceAll("\\[", "");
		coment=coment.replaceAll("[-]", "");
		coment=coment.replaceAll("[~]", "");
		coment=coment.replaceAll("ㅎ", "");
		coment=coment.replaceAll("★", "").replaceAll("…", "").replaceAll("♡", "").replaceAll("♥", "").replaceAll("♪", "");
		coment=coment.replaceAll("[#]", "");
//		coment=coment.replaceAll("(", "");
//		coment=coment.replaceAll(")", "");
		coment=coment.replaceAll("\\(", "").replaceAll("\\)", "");
		coment=coment.replaceAll("[\"]", "").replaceAll("[+]", "").replaceAll("[;]", "");
		coment=coment.replaceAll("'", "");
		coment=coment.replaceAll("[/]", "").replaceAll("[.]", "").replaceAll("[!]", "").replaceAll("\\^", "");
		coment=coment.replaceAll("[?]", "").replaceAll("[~]", "").replaceAll("[:]", "").replaceAll("[.]", "").replaceAll("[_]", "");
		coment=coment.replaceAll("\\d", ""); // 숫자 제거
		coment=coment.replaceAll("[a-zA-Z]", "");
		coment=coment.replaceAll("[^가-힣] ", "");
		coment=coment.replaceAll("[ㄱ-ㅎ]", "");
		coment=coment.replaceAll("[ㅏ-ㅣ]", "");
		coment=coment.replace("모바일에서 작성된 글입니다 앱에서 보기 앱 설치 을 앱 알림으로 전송했습니다 알림이 오지 않는다면앱을 최신버전으로 업데이트 하거나로그아웃상태인지 확인해주세요", "");
		return coment;
	}
}
