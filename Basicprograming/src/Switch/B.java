package Switch;
import java.util.*;
class B
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		String  A=s.next();
		char c; 
		int i=0;
		int cn=0;
		for(i=0;i<A.length();i++)
		{
			c=A.charAt(i);
			if((c=='a'||c=='A')||(c=='e'||c=='E')||(c=='i'||c=='I')||(c=='o'||c=='O')||(c=='u'||c=='U'))
			{
				
				cn++;
				for(int j=0;j<cn;j++)
				{
				System.out.print("*");
				}
				System.out.print(c);
			
				for(int k=0;k<cn;k++)
				{
				System.out.print("*");
				}
			}
			else {
				System.out.print(c);	
			}
			}
		}
	                           
		 }