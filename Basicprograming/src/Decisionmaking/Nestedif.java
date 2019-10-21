package Decisionmaking;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age");
		int a=s.nextInt();
		if(a>18)
		{
			System.out.println("Congrats!..your first stage complete");
			System.out.println("Enter your mark");
			int m=s.nextInt();
		if(m>=50)
		{
			
			System.out.println("you second stage complete");
		}
		else
		{
				System.out.println("sorrry..better luck next time");
			
		}
	}
		else
		{
			System.out.println("Sorry..You are not eligible");
		}
	}

}
