package program;
//WAP to print all the digit from a number
import java.util.Scanner;

public class PrintNumSeparatli {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no = ");
		int num = sc.nextInt();
		
		int d;
		while (num !=0)//it will cheak num 0 or not 
		{
			d=num%10; 
			System.out.println(d);
			num=num/10;
		}
				

	}

}
