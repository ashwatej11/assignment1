package assignment1;
import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		int i,n,x;
		Scanner a = new Scanner(System.in);
		System.out.println("enter the number");
		n=a.nextInt();
		for(i=0;i<=10;i++)
		{
			x=i*n;
		
        System.out.println(n + "*" + i + "=" + x);
		}
	}
	

}
