package assignment1;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		int i,n;
		int x=0;
		Scanner a = new Scanner(System.in);
		System.out.println("enter a number");
		n= a.nextInt();
		
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
				x++;
		}
		if(x<=2)
		{
			System.out.println("its a prime number");
			
		}
		else {
			System.out.println("not a prime number");
		}
	}

}
