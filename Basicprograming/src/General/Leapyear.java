package General;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Year");
		int a=s.nextInt();
		if(((a%4==0) && (a%100!=0))||(a%400==0))
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
s.close();
	}

}
