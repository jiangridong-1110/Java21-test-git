package com.neuedu.part03;

/**
 * 循环
 * 1.while（表达式）{代码块}  如果表达式结果为真 就执行代码块
 * 2.do.....while     do{代码块}while(表达式)如果表达式结果为真 就执行代码块
 * 3.for(表达式1;表达式2;表达式3){代码块} 表达式1，初始化变量，只执行一次 ，表达式2，循环判断条件结果为布尔型， 表达式3，3.for(表达式1;表达式2;表达式3){代码块}表达式1，初始化变量，只执行一次，表达式2，循环判断条件结果为布尔型表达式3，变量变化
 * 表达式可以省略，分号必须写
 * 4.循环的中断
 * break 关键字可以
 * continue
 * 
 *
 *debug 先加断点，F6执行代码  F8结束当前断点
 *选中需要格式化的代码，ctrl+shift+F
 *循环可以嵌套
 */

public class TestPart303 {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		while (a>b) {
			System.out.println("执行了循环");
			a++;
		}
		int sum=0;
		int c=1;
		while (c<=100) {
			sum=sum+c;
			c++;
		}
		System.out.println(sum);
		
		int i=1;
		sum=0;
		while (i<=1000) {
			if (i%2!=0) {
				sum=sum+i;
			}
			i++;
		}
		System.out.println(sum);
		
		
		//输出5行7列的*
		for (int j = 0; j < 5; j++) {
			for (int j2 = 0; j2 < 7; j2++) {
				System.out.print("*");
			}
			System.out.println();
			
			//判断一个数是否为质数
			
		}
		
		int q=9;
		boolean ff=true;
		for (int j = 2; j < q; j++) {
			if (q%j==0) {
				ff=false;
			}
		}
		if (ff) {
			System.out.println(q+"是质数");
		}else {
			System.out.println(q+"不是质数");
			
		}
		
		double bj=1000000;
		for (int j = 0; j < 3; j++) {
			bj=bj+bj*0.04;
			System.out.println(bj);
		}
		
		
		//输出1+1/2+1/3+1/4+。。。+1/100
		double sums=0;
		for (double j = 1; j <=100; j++) {
			sums=sums+1/j;
			System.out.println(sums);
		}
		
		//输出九九乘法表
		for (int j = 1; j <=9; j++) {
			for (int j2 = 1; j2 <=j; j2++) {
				System.out.print(j+"*"+j2+"="+(j*j2)+"	");
			}
			System.out.println();
		}
		
		//1+2+3+4+...判断多少次能超过666
		//循环的终止（中断）
		int s=0;
		int n=1;
		while (true ) {
			s=s+n;
			System.out.println(s);
			if (s>666) {
				break;
			}
			n++;
		}
		System.out.println(n);
		
		int zs=200;
		
		while (true) {
			boolean pd=true;//标记初始化
			zs++;
			for (int j = 2; j < zs; j++) {
				if (zs%j==0) {
					pd=false;
				}
			}
			if (pd) {
				System.out.println(zs);
				break;
			}
			
		}
		
		
		for (int j = 0; j < 20; j++) {
			if (j%2==0) {
				continue;
			}
			System.out.print(j+"  ");
		}
		System.out.println();
		
		//制定循环位置跳出   在目标位置创建名称（lable）标识符加冒号，在跳出关键字后面加标识符名称
		inner:for (int j = 0; j < 20; j++) {
			if (j%2==0) {
				continue inner;
			}
			System.out.print(j+"  ");
		}
		
		//break lable 是指定循环终止
		//continue lable 是制定循环开始
		
		//扩展：常用设计模式中的策略模式 
		//     策略模式解决else if过多问题
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
