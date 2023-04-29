package program;
// IBM--> wrp product of sum of all even digit of a number and sum of all odd digit of a num
import java.util.Scanner;

public class InterviewQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no = ");
		int num = sc.nextInt();
		
		int d;
		int Pro = 1;
		int sum=0, sum2=0;
		while (num !=0)//it will cheak num 0 or not 
		{
			d=num%10; 
			num=num/10;
			if(d%2 ==0) //it will check num(d) is Even or not
			{
				System.out.println("Even num = "+ d);
				sum=sum+d;
			}else {
				System.out.println("Odd num = "+ d);
				sum2=sum2+d;
			}
	}
		System.out.println("Even no Sum= "+sum);
		System.out.println("Odd no sum= "+sum2);
		System.out.println("Product = "+sum*sum2);
	}

}
