package program;

import java.util.Scanner;

public class SumOfAllDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num = ");
		int num = sc.nextInt();
		
		int n;
		int sum=0;
		while(num != 0) {
			n=num%10;			
			sum=sum+n;
			num=num/10;
		}
		System.out.println(sum);

	}

}
