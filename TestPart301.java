package com.neuedu.part03;

import java.util.Scanner;

/**
 * ���̿������
 * 1.������䣺�ڳ������й����У����������Ƿ����ѡ��ִ�д���Ĺ���
 *   if���if�����ʽ��{ִ������;}���б��ʽ�������Ϊtrue/false��������ʽΪ��ʱ��������ִ��
 */

public class TestPart301 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("��������ֵ1��");
		int sc=scanner.nextInt();
//		if (sc%2==0) {
//			System.out.println("��ż��");
//		} else {
//			System.out.println("������");
//
//		}
		if (sc>=90) {
			System.out.println("��");
		}else if (sc>=80) {
			System.out.println("��");
		}else if (sc>=70) {
			System.out.println("�е�");
		}else if (sc>=60) {
			System.out.println("����");
		}else {
			System.out.println("������");
		}
		
	}

}
