package Basicprograming;

import java.util.*;

public class Mathfunction {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter the Float Value");
	       
			Scanner s = new Scanner(System.in);
			float n=s.nextFloat();
			System.out.println(Math.round(n));
			System.out.println(Math.ceil(n));
			System.out.println(Math.floor(n));
	}

}
