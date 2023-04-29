package program;
//wap Perfect Square 
import java.util.Scanner;

public class PerfectSqure {

	public static Boolean perSq(int num) {
		if(num >= 0) {
			int srt =(int)Math.sqrt(num);
			return ((srt*srt)==num);
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No =");
		int num = sc.nextInt();
		if(perSq(num)) {
			System.out.println("yes num is perfect Squre");
		}else {
			System.out.println("No num is not perfect Squre ");
		}
	
	}

}
