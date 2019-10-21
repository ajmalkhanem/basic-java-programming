package Operator;

import java.util.Scanner;

public class Midpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  x1 value");
		float x1=s.nextFloat();
		System.out.println("Enter the  y1 value");
		float y1=s.nextFloat();
		System.out.println("Enter the  x2 value");
		float x2=s.nextFloat();
		System.out.println("Enter the  y2 value");
		float y2=s.nextFloat();
		System.out.println("First line:"+"("+x1+","+y1+")");
		System.out.println("Second line:"+"("+x2+","+y2+")");
		float m=(x1+x2)/2;
		float m1=(y1+y2)/2;
		System.out.println("Midpoint is :"+"("+m+","+m1+")");
		
		
	}

}
