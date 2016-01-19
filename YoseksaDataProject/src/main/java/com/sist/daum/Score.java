package com.sist.daum;

public class Score {
	public int comentScore(String coment) {
		String co = coment;
		int score = 0;
		String[] jumsu = jumsu();
		String[] jumsum = jumsuMinus();
		for (int i = 0; i < jumsu.length; i++) {
			if (coment.indexOf(jumsu[i]) > 0) {
				score++;
				System.out.println(jumsu[i]);
			}
			if(i<jumsum.length){
				if(coment.indexOf(jumsum[i])>0 && jumsum[i]!=null){
					score--;
				}
			}			
		}
		return score;
	}

	public String[] jumsu() {
		String[] j = { "너무너무 맛있", "너무너무 맛잇", "맛있게 먹었", "제일 좋아요", "좋았", "꼭 가세요", "정말 최고", "10점 만점에 10점", "100점 만점에 100점",
				"또 먹고싶네요", "또 먹고싶어요", "하니 맛있더라", "깔끔해요", "깔끔합니다", "맛깔", "맛있어요", "신선해요", "신선하고", "신선하죠", "극찬했어요",
				"재방문의사 있어요", "굳굳", "굿굿", "친절해요", "친절했습", "단골", "최고에요", "최고예요", "최고b", "와우", "극치", "존맛", "또 가고싶",
				"티비에 나온", "저렴하게", "퀄리티가 높아", "고퀄리티", "만족스러운", "안성맞춤", "단골", "단골집", "괜찮은", "자주 이용하는", "소문난", "유명한", "쵝오",
				"채고", "체고", "마싯", "맛있다", "입에서 녹는", "즐겁게 먹었", "시키세요", "양이 푸짐하", "금방 나온", "오래 기다린", "정갈하", "깨끗하", "입소문",
				"가성비 좋", "푸짐", "깔끔하", "친절했", "분위기가 편안하", "넘나 맛" };
		return j;
	}
	public String[] jumsuMinus(){
		String[] j = { "재방문의사 없어요", "불친절", "오래 기다렸", "아쉬움이 있었", "엄청 늦게 나왔", "기다린거 같", "다시는",
				"가성비 별로", "가성비 안좋", "가지마", "맛 없어요", "실망", "기대이하", "평범했" };
		return j;
	}
}
