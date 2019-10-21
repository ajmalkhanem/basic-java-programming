package General;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Choose your Month dd/mm/yyyy");
		String a=s.next();
		
		String c=""+a.charAt(3)+a.charAt(4);
		switch(c)
		{
		case "01":
			System.out.println("January");
			break;
		case "02":
			System.out.println("February");
			break;
		case "03":
			System.out.println("March");
			break;
		case "04":
			System.out.println("April");
			break;
		case "05":
			System.out.println("may");
			break;
		case "06":
			System.out.println("June");
			break;
		case "07":
			System.out.println("July");
			break;
		case "09":
			System.out.println("September");
			break;
		case "10":
			System.out.println("october");
			break;
		case "08":
			System.out.println("August");
			break;
		}
		
}}