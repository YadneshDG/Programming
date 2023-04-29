package program;

import java.util.Scanner;

//wap to print all the odd digit from the num
public class OddDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter no = ");
			int num = sc.nextInt();
			
			int d;
			while (num !=0)//it will cheak num 0 or not 
			{
				d=num%10; 
				num=num/10;
				if(d%2 !=0) //it will check num(d) is odd or not
				{
					System.out.println(d);

				}
			}
	}

}
