package Controlstructures;

import java.util.Scanner;

public class Fibinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Choose your limit");
		int n=s.nextInt();
		int a=0;
		int b=1;
		int c=0;
		for(int i=3;i<=n;i++)
		{
			c=a+b;
			
			a=b;
			b=c;
		}
		System.out.printf(" %d",c);
	}

}
