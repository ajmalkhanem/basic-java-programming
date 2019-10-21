package Operator;

import java.util.Scanner;

public class Swapwithvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first value");
		int a=s.nextInt();
		System.out.println("Enter the second value");
		int b=s.nextInt();
		System.out.println("A=:"+a);
		System.out.println("B=:"+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("After Swapping");
		System.out.println("A=:"+a);
		System.out.println("B=:"+b);


	}

}
