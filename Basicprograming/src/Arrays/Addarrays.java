package Arrays;


import java.util.Scanner;

public class Addarrays {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of first Array");
		int a=s.nextInt();
		int[] A= new int[a];
		for(int i=0;i<a;i++)
		{
			System.out.println("enter the values");
			A[i]=s.nextInt();
		}
		System.out.println("Enter the size of second Array");
		int b=s.nextInt();
		int[] B= new int[b];
		for(int i=0;i<b;i++)
		{
			System.out.println("enter the values");
			B[i]=s.nextInt();
			
		}
		for(int i=0;i<b;i++)
		{
			
			int c=A[i]+B[i];
			System.out.println("Sum" +c);
		}
	}

}
