package com.sist.daum;

public class ComentRemove {
	public String remove(String coment) throws Exception{
		coment=coment.replaceAll("\u00a0", "");
		coment=coment.replaceAll("���̹�", "");
		coment=coment.replaceAll("��α�", "");
		coment=coment.replaceAll("�ٷΰ���", "");
		coment=coment.replaceAll("����", "");
		coment=coment.replaceAll("�̿�", "");
		coment=coment.replaceAll("�����", "");
		coment=coment.replaceAll("�α���", "");
		coment=coment.replaceAll("����", "");
		coment=coment.replaceAll("����", "");
		coment=coment.replaceAll("�۽�", "");
		coment=coment.replaceAll("�޸�", "");
		coment=coment.replaceAll("�Ⱥ�", "");
		coment=coment.replaceAll("��Ͽ���", "");
		coment=coment.replaceAll("��ũ��", "");
		coment=coment.replaceAll("���α�", "");
		coment=coment.replaceAll("��ü����", "");
		coment=coment.replaceAll("����Ʈ����", "");
		int a=coment.indexOf("�±�����");
//		System.out.println("����� a�� ��ȣ��"+a);
		if(a>0){
			String b=coment.substring(a);
			coment=coment.replace(b, "");
		}		
//		System.out.println("�������ϴ� ��Ʈ������"+b);		
		coment=coment.replaceAll("�±�", "");
		coment=coment.replace("���� ������ ������ �������ͷ� �غ�����", "");
		coment=coment.replace("�� ���� ���, ��õ�ϱ⸦ �������ͷ� ����غ�����", "");
		coment=coment.replace("���� ���� ������ �������ͷ� ���ܺ�����.", "");
		coment=coment.replace("���� �־��� ���� �������ͷ� ����غ�����.", "");
		coment=coment.replace("���� ������ ������ �������ͷ� �غ�����", "");
		coment=coment.replace("����Ʈ���� ������ �۾����� �������Ͱ� �����߾��!", "");
		coment=coment.replace("�ٽ� �а� ���� ��ũ�� �������ͷ� ���ܺ�����.", "");
		coment=coment.replace("������ �۾����� �������Ͱ� �����߾��!", "");
		coment=coment.replace("���� ���� ������ �������ͷ� ���ܺ�����.", "");
		coment=coment.replaceAll("\u00a0", "");
//		coment=coment.replaceAll("[", "");
//		coment=coment.replaceAll("]", "");
		coment=coment.replaceAll("\\]", "").replaceAll("\\[", "");
		coment=coment.replaceAll("[-]", "");
		coment=coment.replaceAll("[~]", "");
		coment=coment.replaceAll("��", "");
		coment=coment.replaceAll("��", "").replaceAll("��", "").replaceAll("��", "").replaceAll("��", "").replaceAll("��", "");
		coment=coment.replaceAll("[#]", "");
//		coment=coment.replaceAll("(", "");
//		coment=coment.replaceAll(")", "");
		coment=coment.replaceAll("\\(", "").replaceAll("\\)", "");
		coment=coment.replaceAll("[\"]", "").replaceAll("[+]", "").replaceAll("[;]", "");
		coment=coment.replaceAll("'", "");
		coment=coment.replaceAll("[/]", "").replaceAll("[.]", "").replaceAll("[!]", "").replaceAll("\\^", "");
		coment=coment.replaceAll("[?]", "").replaceAll("[~]", "").replaceAll("[:]", "").replaceAll("[.]", "").replaceAll("[_]", "");
		coment=coment.replaceAll("\\d", ""); // ���� ����
		coment=coment.replaceAll("[a-zA-Z]", "");
		coment=coment.replaceAll("[^��-�R] ", "");
		coment=coment.replaceAll("[��-��]", "");
		coment=coment.replaceAll("[��-��]", "");
		coment=coment.replace("����Ͽ��� �ۼ��� ���Դϴ� �ۿ��� ���� �� ��ġ �� �� �˸����� �����߽��ϴ� �˸��� ���� �ʴ´ٸ���� �ֽŹ������� ������Ʈ �ϰų��α׾ƿ��������� Ȯ�����ּ���", "");
		return coment;
	}
}
