package Switch;
import java.util.Scanner;
public class Nestedswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Choose your College");
		System.out.println("1.AJCE\n2.MBC\n");
		int a=s.nextInt();
        switch(a)
        {
        case 1:
    		System.out.println("Welcome to AJCE");
    		System.out.println("Choose your Branch");
    		System.out.println("A.Btech\nB.MCA\n");
    		char b=s.next().charAt(0);
    		switch(b)	
    		{	
    		case 'A':
    			System.out.println("Welcome friends");
    			break;
    		case 'B':
    			System.out.println("Welcome guys");
    			break;
    			default:
    				System.out.println("Check your option plz..");
    		}
        case 2:
        	System.out.println("Welcome to MBC");
    		System.out.println("Choose your Branch");
    		System.out.println("C.MSc\nD.BCA\n");
    		char f=s.next().charAt(0);
    		switch(f)
    		{
    		case 'C':
    			System.out.println("Welcome to Msc");
    			break;
    		case 'D':
    			System.out.println("Welcome to BCA");
    			break;
    			default:
    				System.out.println("Check your option plz..");
    		}
    		break;	    			
    		}

        }
	}


