package General;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lcm {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Numbers");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int i=0;
		int lcm=0;
		int max=(a<b)?b:a;
		for(i=max;i<=(a*b);i++)
		{
			if((i%a==0)&&(i%b==0))
			{
				lcm=i;
				break;
			}
		}
		System.out.printf("LCM %d",lcm);
br.close();

	}

}
