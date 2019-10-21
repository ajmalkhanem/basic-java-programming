package General;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Choose your Number");
		int a=s.nextInt();
		String [] A=new String[a];
		char c; 
		int i=0;
		for(i=0;i<a;i++)
		{
			System.out.println("Enter the values");
			A[i]=s.next();
			
		}
		for(i=0;i<a;i++)
		{
		
			c=A[i].charAt(0);
			if((c=='a'||c=='A')||(c=='e'||c=='E')||(c=='i'||c=='I')||(c=='o'||c=='O')||(c=='u'||c=='U'))
			{
				System.out.println(A[i]);
			}
		}
	}

}
