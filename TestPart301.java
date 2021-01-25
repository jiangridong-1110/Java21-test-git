package com.neuedu.part03;

import java.util.Scanner;

/**
 * 流程控制语句
 * 1.条件语句：在程序运行过程中，根据条件是否成立选择执行代码的过程
 *   if语句if（表达式）{执行语句块;}其中表达式结果是能为true/false，如果表达式为真时进入语句块执行
 */

public class TestPart301 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入数值1：");
		int sc=scanner.nextInt();
//		if (sc%2==0) {
//			System.out.println("是偶数");
//		} else {
//			System.out.println("是奇数");
//
//		}
		if (sc>=90) {
			System.out.println("优");
		}else if (sc>=80) {
			System.out.println("良");
		}else if (sc>=70) {
			System.out.println("中等");
		}else if (sc>=60) {
			System.out.println("及格");
		}else {
			System.out.println("不及格");
		}
		
	}

}
