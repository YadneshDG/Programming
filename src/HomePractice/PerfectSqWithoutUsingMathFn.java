package HomePractice;

import java.util.Scanner;

//wap to check num is perfect squre or not without using math fn
public class PerfectSqWithoutUsingMathFn {

	static boolean squrper(int num) {
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
		
		if(squrper(num)) {
			System.out.println(num+" is a perfect Square");
		}else {
			System.out.println(num+" num is Not perfect Square");
		}

	}

}
