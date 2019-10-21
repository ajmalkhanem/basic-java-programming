package Arrays;

import java.util.Scanner;

public class Maximumarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of first Array");
		int a=s.nextInt();
		int[] A= new int[a];
		int m=0;
		int i=0;
		for(i=0;i<a;i++)
		{
			System.out.println("enter the values");
			A[i]=s.nextInt();
		}
		for(i=0;i<a;i++)
		{
			if(A[i]>=m)
			{
				m=A[i];
			}
			
				
			}
		System.out.println("Largest element is "+m);
		}
	}


