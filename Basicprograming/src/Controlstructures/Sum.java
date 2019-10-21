package Controlstructures;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Choose your lower limit");
		int n=s.nextInt();
		System.out.println("Choose your upper limit");
		int m=s.nextInt();
		int sm=0;
		for(int i=n;i<=m;i++)
		{
			sm=sm+i;
			
		}
		System.out.println(sm);

	}

}
