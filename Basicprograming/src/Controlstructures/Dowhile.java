package Controlstructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dowhile {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int sm=0;
		int a;
		do
		{
		System.out.println("Enter the Number");
		 a = Integer.parseInt(br.readLine());
		if(a>0)
		{
			sm=sm+a;
		}
		
		}while(a>0);
		
			
			
        	System.out.print("sum of the positive numbers is "+sm);
        
	}
}
