package com.neuedu.part03;

import java.util.Scanner;

public class TestPart304 {
	public static void main(String[] args) {
		//输入两个数，输出他们的最大公约数
		Scanner scanner=new Scanner(System.in);
//		System.out.println("请输入第一个数");
//		int a=scanner.nextInt();
//		System.out.println("请输入第二个数");
//		int b=scanner.nextInt();
//		int c=a<b?a:b;
//		for (int i = c; i >1; i--) {
//			if (a%i==0&&b%i==0) {
//				System.out.println(i);
//				break;
//			}
//		}
		
		//1000以内水仙花数
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
		
		
		//猴子第一天摘下若干个桃子，
		//当即吃了一半，还不瘾，又多吃了一个，
		//第二天早上又将剩下的桃子吃掉一半，
		//又多吃了一个。以后每天早上都吃了
		//前一天剩下的一半零一个。到第10天
		//早上想再吃时，见只剩下一个桃子了。
		//求第一天共摘了多少
		int c=1;
		for (int i = 9; i >=1; i--) {
			c=(c+1)*2;
		}
		System.out.println(c);
		
		//作业
		//由命令行输入一个4位整数，求将该数反转以后的数，如原数为1234，反转后的数位4321。
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
