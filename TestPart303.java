package com.neuedu.part03;

/**
 * ѭ��
 * 1.while�����ʽ��{�����}  ������ʽ���Ϊ�� ��ִ�д����
 * 2.do.....while     do{�����}while(���ʽ)������ʽ���Ϊ�� ��ִ�д����
 * 3.for(���ʽ1;���ʽ2;���ʽ3){�����} ���ʽ1����ʼ��������ִֻ��һ�� �����ʽ2��ѭ���ж��������Ϊ�����ͣ� ���ʽ3��3.for(���ʽ1;���ʽ2;���ʽ3){�����}���ʽ1����ʼ��������ִֻ��һ�Σ����ʽ2��ѭ���ж��������Ϊ�����ͱ��ʽ3�������仯
 * ���ʽ����ʡ�ԣ��ֺű���д
 * 4.ѭ�����ж�
 * break �ؼ��ֿ���
 * continue
 * 
 *
 *debug �ȼӶϵ㣬F6ִ�д���  F8������ǰ�ϵ�
 *ѡ����Ҫ��ʽ���Ĵ��룬ctrl+shift+F
 *ѭ������Ƕ��
 */

public class TestPart303 {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		while (a>b) {
			System.out.println("ִ����ѭ��");
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
		
		
		//���5��7�е�*
		for (int j = 0; j < 5; j++) {
			for (int j2 = 0; j2 < 7; j2++) {
				System.out.print("*");
			}
			System.out.println();
			
			//�ж�һ�����Ƿ�Ϊ����
			
		}
		
		int q=9;
		boolean ff=true;
		for (int j = 2; j < q; j++) {
			if (q%j==0) {
				ff=false;
			}
		}
		if (ff) {
			System.out.println(q+"������");
		}else {
			System.out.println(q+"��������");
			
		}
		
		double bj=1000000;
		for (int j = 0; j < 3; j++) {
			bj=bj+bj*0.04;
			System.out.println(bj);
		}
		
		
		//���1+1/2+1/3+1/4+������+1/100
		double sums=0;
		for (double j = 1; j <=100; j++) {
			sums=sums+1/j;
			System.out.println(sums);
		}
		
		//����žų˷���
		for (int j = 1; j <=9; j++) {
			for (int j2 = 1; j2 <=j; j2++) {
				System.out.print(j+"*"+j2+"="+(j*j2)+"	");
			}
			System.out.println();
		}
		
		//1+2+3+4+...�ж϶��ٴ��ܳ���666
		//ѭ������ֹ���жϣ�
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
			boolean pd=true;//��ǳ�ʼ��
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
		
		//�ƶ�ѭ��λ������   ��Ŀ��λ�ô������ƣ�lable����ʶ����ð�ţ��������ؼ��ֺ���ӱ�ʶ������
		inner:for (int j = 0; j < 20; j++) {
			if (j%2==0) {
				continue inner;
			}
			System.out.print(j+"  ");
		}
		
		//break lable ��ָ��ѭ����ֹ
		//continue lable ���ƶ�ѭ����ʼ
		
		//��չ���������ģʽ�еĲ���ģʽ 
		//     ����ģʽ���else if��������
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
