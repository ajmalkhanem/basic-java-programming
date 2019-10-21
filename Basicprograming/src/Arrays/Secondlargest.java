package Arrays;

import java.util.*;

public class Secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of first Array");
		int a=s.nextInt();
		int[] A= new int[a];
		
		int i=0;
		for(i=0;i<a;i++)
		{
			System.out.println("enter the values");
			A[i]=s.nextInt();
		}
		Arrays.sort(A);
		System.out.println(A[a-2]);
	}

}
