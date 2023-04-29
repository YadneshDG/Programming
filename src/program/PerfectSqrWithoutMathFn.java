	package program;

import java.util.Scanner;

public class PerfectSqrWithoutMathFn {
	static boolean Sqroot(int num) {
		for(int i=1; i*i<=num; i++) {
			if((num%i==0)&&(num/i==i)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no = ");
		int num=sc.nextInt();
		if(Sqroot(num)) {
			System.out.println(num +" this is perfect Squre number");
		}else {
			System.out.println(num +" this is NOT perfect Squre number");

		}
		
		

	}

}
