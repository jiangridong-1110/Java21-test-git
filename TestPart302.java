package com.neuedu.part03;

import java.util.Scanner;

/**
 * switch 流程判断
 * 语句结构 switch(表达式){表达式结果为预期值
 *               case 值: 
 *                     代码块;
 *                     [break;]可写可不写 作用是执行到这停止
 *               case 值: 
 *                     代码块;
 *                     [break;]可写可不写 作用是执行到这停止
 *               case 值: 
 *                     代码块;
 *                     [break;]可写可不写 作用是执行到这停止
 *               ...
 *               default:
 *                     代码块;
 *         }
 *         
 * 注意事项:1.表达式的值必须为 byte,short,char,int和String
 *         2.case 后面的值必须为常量,定值,且不能重复
 *         3.功能代码块部分可以为多行
 *         4.default 相当于if else 中的else
 *         
 * 常量:不可变的量,固定值   在定义变量时前面加上final关键字
 * 
 * 
 * 
 * 
 * 
 */


public class TestPart302 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
//		System.out.println("请输入数值:");
//		int sc=scanner.nextInt();
//		if (sc<=100&&sc>=0) {
//			switch (sc/10) {
//			case 10:
//				System.out.println("优");
//				break;
//			case 9:
//				System.out.println("优");
//				break;
//			case 8:
//				System.out.println("良");
//				break;
//			case 7:
//				System.out.println("中");
//				break;
//			case 6:
//				System.out.println("及");
//				break;
//			default:
//				System.out.println("不及");
//				break;
//			}
//		}else {
//			System.out.println("不符合规定");
//		}
		
		
//		int nian=scanner.nextInt();
//		if (nian%4==0&&nian%100!=0||nian %400==0) {
//			System.out.println(nian+"年是闰年");
//		}else {
//			System.out.println(nian+"年不是闰年");
//		}
		
		
		System.out.println("请输入年份:");
		int nian=scanner.nextInt();
		System.out.println("请输入月份:");
		int month=scanner.nextInt();
		switch (month) {
		case 1:			
		case 3:			
		case 5:			
		case 7:			
		case 8:		
		case 10:
		case 12:System.out.println("1,3,5,7,8,10,12是31天");
		    break;
		case 4:			
		case 6:			
		case 9:			
		case 11:System.out.println("4，6，9，11是30天");
			break;
		case 2:
			
			if (nian%4==0&&nian%100!=0||nian %400==0) {
				System.out.println("2是29天");
			}else {
				System.out.println("2是28天");
			}
			
			break;
		

		default:
			break;
		}
		
		
	}

}
