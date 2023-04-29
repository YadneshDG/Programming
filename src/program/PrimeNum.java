package program;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No = ");
		int num=sc.nextInt();
		boolean flag = false;
		if(num != 0) {
			
			for(int i=2; i<=num/2;i++) {
				//condition for non prime num
				if(num%i==0) {
					flag=true;
					break;
				}
			}
		}
		if(!flag) {
			System.out.println("Num is prime");
		}else {
			System.err.println("Num is not prime");
		}
		

	}

}
