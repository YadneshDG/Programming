package HomePractice;

import java.util.Scanner;

//ibm--> wap product of sum of all even digit number and sum of all odd digit numbers
public class IBMQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. = ");
		int num = sc.nextInt();
		
		int n;
		int sum=0, sum2=0;
		int pro=1;
		
		while(num != 0) {
			n=num%10;
			num=num/10;

			if(n%2==0) {
				System.out.println(n+" this is Even no.");
				sum=sum+n;
			}else {
				System.out.println(n+" this is Odd no. ");
				sum2=sum2+n;
			}
		}
		pro=sum*sum2;
		System.out.println("Sum of all Even no. = "+sum);
		System.out.println("Sum of all ODD no. = "+sum2);
		System.out.println("Total Producr = "+pro);

	
	}

}
