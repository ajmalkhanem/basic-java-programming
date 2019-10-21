package General;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Strong {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number");
		int a = Integer.parseInt(br.readLine());
		int b=a;
		int n;
		int i=0;
		int m=0;
		int d=0;
		while(a!=0)
		{   
			n=1;
			m=a%10;
			for(i=1;i<=m;i++)
			{
			  n=n*i;
				
			}
			d=d+n;
			a=a/10;
		}
		if(d==b)
			System.out.println("strong");
		else
			
			System.out.println("not");
		
	}

}
