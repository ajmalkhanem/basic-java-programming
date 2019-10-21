package Operator;

import java.util.Scanner;

public class Simpleint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Amount");
		int p=s.nextInt();
		System.out.println("Enter the Duration");
		int d=s.nextInt();
		System.out.println("Enter the Interest rate");
		float r=s.nextFloat();
		float si=(p*d*r)/100;
		System.out.printf("Simple Interest is %.02f",si);
	}

}
