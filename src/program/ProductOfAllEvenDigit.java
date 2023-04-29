package program;

import java.util.Scanner;

// Product (multipication) Of All Even Digit
public class ProductOfAllEvenDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no = ");
		int num = sc.nextInt();
		
		int d;
		int Pro = 1;
		while (num !=0)//it will cheak num 0 or not 
		{
			d=num%10; 
			num=num/10;
			if(d%2 ==0) //it will check num(d) is Even or not
			{
				System.out.println("Even num = "+ d);
				Pro = Pro*d; 
			}
	}
		System.out.println("Product = "+Pro);

}}
