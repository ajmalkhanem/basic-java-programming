package Operator;

import java.util.Scanner;

public class Converttwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  value");
		int a=s.nextInt();
		int b=a%10;
		int c=a/100;
		int d=b*c;
		int e=b*b;
		int f=d*e;
		System.out.printf("%d%d\n",e,d);
		System.out.println(f);
	}

}
