package com.neuedu.part03;

import java.util.Scanner;

/**
 * switch �����ж�
 * ���ṹ switch(���ʽ){���ʽ���ΪԤ��ֵ
 *               case ֵ: 
 *                     �����;
 *                     [break;]��д�ɲ�д ������ִ�е���ֹͣ
 *               case ֵ: 
 *                     �����;
 *                     [break;]��д�ɲ�д ������ִ�е���ֹͣ
 *               case ֵ: 
 *                     �����;
 *                     [break;]��д�ɲ�д ������ִ�е���ֹͣ
 *               ...
 *               default:
 *                     �����;
 *         }
 *         
 * ע������:1.���ʽ��ֵ����Ϊ byte,short,char,int��String
 *         2.case �����ֵ����Ϊ����,��ֵ,�Ҳ����ظ�
 *         3.���ܴ���鲿�ֿ���Ϊ����
 *         4.default �൱��if else �е�else
 *         
 * ����:���ɱ����,�̶�ֵ   �ڶ������ʱǰ�����final�ؼ���
 * 
 * 
 * 
 * 
 * 
 */


public class TestPart302 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
//		System.out.println("��������ֵ:");
//		int sc=scanner.nextInt();
//		if (sc<=100&&sc>=0) {
//			switch (sc/10) {
//			case 10:
//				System.out.println("��");
//				break;
//			case 9:
//				System.out.println("��");
//				break;
//			case 8:
//				System.out.println("��");
//				break;
//			case 7:
//				System.out.println("��");
//				break;
//			case 6:
//				System.out.println("��");
//				break;
//			default:
//				System.out.println("����");
//				break;
//			}
//		}else {
//			System.out.println("�����Ϲ涨");
//		}
		
		
//		int nian=scanner.nextInt();
//		if (nian%4==0&&nian%100!=0||nian %400==0) {
//			System.out.println(nian+"��������");
//		}else {
//			System.out.println(nian+"�겻������");
//		}
		
		
		System.out.println("���������:");
		int nian=scanner.nextInt();
		System.out.println("�������·�:");
		int month=scanner.nextInt();
		switch (month) {
		case 1:			
		case 3:			
		case 5:			
		case 7:			
		case 8:		
		case 10:
		case 12:System.out.println("1,3,5,7,8,10,12��31��");
		    break;
		case 4:			
		case 6:			
		case 9:			
		case 11:System.out.println("4��6��9��11��30��");
			break;
		case 2:
			
			if (nian%4==0&&nian%100!=0||nian %400==0) {
				System.out.println("2��29��");
			}else {
				System.out.println("2��28��");
			}
			
			break;
		

		default:
			break;
		}
		
		
	}

}
