package HomePractice;

import java.util.Scanner;

//wap to check num is perfect squre or not
public class PerfectSq {

	static boolean persq(int num) {
		if(num >=0) {
			int srt= (int)Math.sqrt(num);
			return((srt*srt)==num);
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no = ");
		int num = sc.nextInt();
		
		if(persq(num)) {
			System.out.println("Yes "+num+" is perfect squre");
		}else {
			System.out.println("No "+num+" is a NOT perfect squre");

		}
	}

}
