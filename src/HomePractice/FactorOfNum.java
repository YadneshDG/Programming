package HomePractice;

import java.util.Scanner;

// Display Factors of a Number
public class FactorOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no =");
		int num=sc.nextInt();
		
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		
	}

}
