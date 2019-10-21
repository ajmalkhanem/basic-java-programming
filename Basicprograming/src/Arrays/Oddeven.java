package Arrays;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of first Array");
		int a=s.nextInt();
		int e=0;;
		int o=0;
		int b=0;;
		int c=0;
		int sm=0;;
		int sm1=0;
		int ev=0;
		int od=0;
		int[] A= new int[a];
		for(int i=0;i<a;i++)
		{
			System.out.println("enter the values");
			A[i]=s.nextInt();
			
		}
		System.out.println(" even numbers is");
		for(int i=0;i<a;i++)
		{
			if(A[i]%2==0)
			{
				System.out.println(A[i]);
				 sm=sm+A[i];
				 b++;
				 
			}
		}
		System.out.println(" even numbers is");
		for(int i=0;i<a;i++)
		{
			if(A[i]%2!=0)
			{
				System.out.println(A[i]);
				sm1=sm1+A[i];
				c++;
			}
			
			
		}
		
		System.out.println("sum of even numbers is"+sm);
		System.out.println("sum of odd numbers is "+sm1);
		System.out.println("Average of even numbers is"+sm/b);
		System.out.println("Average of even numbers is"+sm1/c);
		
	}

}
