package com.neuedu.part03;

import java.util.Scanner;

public class TestPart304 {
	public static void main(String[] args) {
		//������������������ǵ����Լ��
		Scanner scanner=new Scanner(System.in);
//		System.out.println("�������һ����");
//		int a=scanner.nextInt();
//		System.out.println("������ڶ�����");
//		int b=scanner.nextInt();
//		int c=a<b?a:b;
//		for (int i = c; i >1; i--) {
//			if (a%i==0&&b%i==0) {
//				System.out.println(i);
//				break;
//			}
//		}
		
		//1000����ˮ�ɻ���
//		int ge=0;
//		int shi=0;
//		int bai=0;
//		for (int i = 100; i < 1000; i++) {
//			ge=i%10;
//			shi=i/10%10;
//			bai=i/100;
//			if (ge*ge*ge+shi*shi*shi+bai*bai*bai==i) {
//				System.out.print(i+"   ");
//			}
//		}
		
		
		//���ӵ�һ��ժ�����ɸ����ӣ�
		//��������һ�룬����񫣬�ֶ����һ����
		//�ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬
		//�ֶ����һ�����Ժ�ÿ�����϶�����
		//ǰһ��ʣ�µ�һ����һ��������10��
		//�������ٳ�ʱ����ֻʣ��һ�������ˡ�
		//���һ�칲ժ�˶���
		int c=1;
		for (int i = 9; i >=1; i--) {
			c=(c+1)*2;
		}
		System.out.println(c);
		
		//��ҵ
		//������������һ��4λ�������󽫸�����ת�Ժ��������ԭ��Ϊ1234����ת�����λ4321��
		int s=scanner.nextInt();
		int ge2=0;
		int shi2=0;
		int bai2=0;
		int qian=0;
		int t;
		ge2=s%10;
		shi2=s/10%10;
		bai2=s/100%10;
		qian=s/1000;

		
		System.out.println(qian+bai2*10+shi2*100+ge2*1000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
