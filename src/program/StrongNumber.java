package program;

import java.util.Scanner;

/*Strong Number:-
 * Factorial of all numbers 
 * 1.sepeareate num, factorial of separated num, sum of all factorial, then compaire to orignal num
 * ex- 145
 * 1!+4!+5!
 * 1+24+120
 * =145
 * */
public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new  Scanner(System.in);
		System.out.println("Enter no = ");
		int num = sc.nextInt();
		
		int temp=num;
		int sum=0;
		
		while(num!=0) {
			int d=num%10;
			int fact=1;
			for(int i=1; i<=d; i++) {
			fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println(temp+" is Strong number");
		}else {
			System.out.println(temp+" is NOT Strong number");
		}
	}

}
