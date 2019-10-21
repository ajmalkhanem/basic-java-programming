package General;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hcf {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Numbers");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int i=0;
		int gcd=0;
		int min=(a<b)?a:b;
		for(i=min;i>0;i--)
		{
			if((a%i==0)&&(b%i==0))
			{
				gcd=i;
				break;
			}
		}
		System.out.printf("GCD is %d",gcd);
br.close();
	}

}
