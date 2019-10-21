package Operator;

import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  value");
		int a=s.nextInt();
		int b=a%10;
		int c=a/10;
		int d=b*c;
		int e=c*c;
		System.out.printf("%d%d",d,e);

	}

}
