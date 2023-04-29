package HomePractice;

import java.util.Scanner;

public class SwapThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st num = ");
		int n1=sc.nextInt();
		
		System.out.println("Enter 2nd num = ");
		int n2=sc.nextInt();
		
		System.out.println("Enter 3rd num = ");
		int n3=sc.nextInt();
		
		System.out.println("Begfor swap number is n1="+n1+" n2="+n2+" n3="+n3);
		
		n1=n1+n2+n3;
		n3=n1-n2-n3;
		n2=n1-n2-n3;
		n1=n1-n2-n3;
		
		
		System.out.println("After swap number is n1="+n1+" n2="+n2+" n3="+n3);

		
	}

}
