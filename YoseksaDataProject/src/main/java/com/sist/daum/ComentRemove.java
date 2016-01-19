package com.sist.daum;

public class ComentRemove {
	public String remove(String coment) throws Exception{
		coment=coment.replaceAll("\u00a0", "");
		coment=coment.replaceAll("³×ÀÌ¹ö", "");
		coment=coment.replaceAll("ºí·Î±×", "");
		coment=coment.replaceAll("¹Ù·Î°¡±â", "");
		coment=coment.replaceAll("º»¹®", "");
		coment=coment.replaceAll("ÀÌ¿ô", "");
		coment=coment.replaceAll("¸ğµÎÀÇ", "");
		coment=coment.replaceAll("·Î±×ÀÎ", "");
		coment=coment.replaceAll("Áöµµ", "");
		coment=coment.replaceAll("¼­Àç", "");
		coment=coment.replaceAll("¾Û½º", "");
		coment=coment.replaceAll("¸Ş¸ğ", "");
		coment=coment.replaceAll("¾ÈºÎ", "");
		coment=coment.replaceAll("¸ñ·Ï¿­±â", "");
		coment=coment.replaceAll("½ºÅ©·¦", "");
		coment=coment.replaceAll("¿«ÀÎ±Û", "");
		coment=coment.replaceAll("ÀüÃ¼º¸±â", "");
		coment=coment.replaceAll("Æ÷½ºÆ®¾²±â", "");
		int a=coment.indexOf("ÅÂ±×ÀúÀå");
//		System.out.println("Áö¿ì´Â aÀÇ ¹øÈ£´Â"+a);
		if(a>0){
			String b=coment.substring(a);
			coment=coment.replace(b, "");
		}		
//		System.out.println("Áö¿ö¾ßÇÏ´Â ½ºÆ®¸µ°ªÀº"+b);		
		coment=coment.replaceAll("ÅÂ±×", "");
		coment=coment.replace("Áö±İ ¶°¿À¸¥ »ı°¢À» Äü¿¡µğÅÍ·Î ÇØº¸¼¼¿ä", "");
		coment=coment.replace("ÀÌ ´ŞÀÇ °á½É, ½ÇÃµÀÏ±â¸¦ Äü¿¡µğÅÍ·Î ±â·ÏÇØº¸¼¼¿ä", "");
		coment=coment.replace("¿À´Ã ÂïÀº »çÁøÀ» Äü¿¡µğÅÍ·Î ³²°Üº¸¼¼¿ä.", "");
		coment=coment.replace("¿À´Ã ÀÖ¾ú´ø ÀÏÀ» Äü¿¡µğÅÍ·Î ±â·ÏÇØº¸¼¼¿ä.", "");
		coment=coment.replace("Áö±İ ¶°¿À¸¥ »ı°¢À» Äü¿¡µğÅÍ·Î ÇØº¸¼¼¿ä", "");
		coment=coment.replace("Æ÷½ºÆ®¾²±â °¡º­¿î ±Û¾²±âÅø Äü¿¡µğÅÍ°¡ ¿ÀÇÂÇß¾î¿ä!", "");
		coment=coment.replace("´Ù½Ã ÀĞ°í ½ÍÀº ¸µÅ©¸¦ Äü¿¡µğÅÍ·Î ³²°Üº¸¼¼¿ä.", "");
		coment=coment.replace("°¡º­¿î ±Û¾²±âÅø Äü¿¡µğÅÍ°¡ ¿ÀÇÂÇß¾î¿ä!", "");
		coment=coment.replace("¿À´Ã ÂïÀº »çÁøÀ» Äü¿¡µğÅÍ·Î ³²°Üº¸¼¼¿ä.", "");
		coment=coment.replaceAll("\u00a0", "");
//		coment=coment.replaceAll("[", "");
//		coment=coment.replaceAll("]", "");
		coment=coment.replaceAll("\\]", "").replaceAll("\\[", "");
		coment=coment.replaceAll("[-]", "");
		coment=coment.replaceAll("[~]", "");
		coment=coment.replaceAll("¤¾", "");
		coment=coment.replaceAll("¡Ú", "").replaceAll("¡¦", "").replaceAll("¢½", "").replaceAll("¢¾", "").replaceAll("¢Ü", "");
		coment=coment.replaceAll("[#]", "");
//		coment=coment.replaceAll("(", "");
//		coment=coment.replaceAll(")", "");
		coment=coment.replaceAll("\\(", "").replaceAll("\\)", "");
		coment=coment.replaceAll("[\"]", "").replaceAll("[+]", "").replaceAll("[;]", "");
		coment=coment.replaceAll("'", "");
		coment=coment.replaceAll("[/]", "").replaceAll("[.]", "").replaceAll("[!]", "").replaceAll("\\^", "");
		coment=coment.replaceAll("[?]", "").replaceAll("[~]", "").replaceAll("[:]", "").replaceAll("[.]", "").replaceAll("[_]", "");
		coment=coment.replaceAll("\\d", ""); // ¼ıÀÚ Á¦°Å
		coment=coment.replaceAll("[a-zA-Z]", "");
		coment=coment.replaceAll("[^°¡-ÆR] ", "");
		coment=coment.replaceAll("[¤¡-¤¾]", "");
		coment=coment.replaceAll("[¤¿-¤Ó]", "");
		coment=coment.replace("¸ğ¹ÙÀÏ¿¡¼­ ÀÛ¼ºµÈ ±ÛÀÔ´Ï´Ù ¾Û¿¡¼­ º¸±â ¾Û ¼³Ä¡ À» ¾Û ¾Ë¸²À¸·Î Àü¼ÛÇß½À´Ï´Ù ¾Ë¸²ÀÌ ¿ÀÁö ¾Ê´Â´Ù¸é¾ÛÀ» ÃÖ½Å¹öÀüÀ¸·Î ¾÷µ¥ÀÌÆ® ÇÏ°Å³ª·Î±×¾Æ¿ô»óÅÂÀÎÁö È®ÀÎÇØÁÖ¼¼¿ä", "");
		return coment;
	}
}
