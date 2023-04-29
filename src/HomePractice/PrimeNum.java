package HomePractice;

import java.util.Scanner;

// wap num is prime or not
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no = ");
		int num=sc.nextInt();
		boolean flag=false;
		if(num != 0) {
			for(int i=2; i<=num/2; i++) {
				if(num%i==0) {
					flag=true;
					break;
				}
			}
		}
		if(!flag) {
			System.out.println("Number is prime no");
		}else {
			System.out.println("Number is not prime");
		}
	}

}
