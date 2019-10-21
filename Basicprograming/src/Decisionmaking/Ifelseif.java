package Decisionmaking;
import java.util.Scanner;
public class Ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age");
		int a=s.nextInt();
		if(a>18)
		{
			System.out.println("you are eligible for Indain ID card");
		}
		else if(a==21)
		{
			System.out.println("you are eligible for marriage");
		}
				else
		{
			
				System.out.println("better luck next time");
			
		}
	}
	}
	


