package Mock;
//Q. reverse the number
public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		System.out.println("Orignal num = "+num);
		System.out.print("reverse = ");
		while(num!=0) {
			int d=num%10;
			System.out.print(d);
			num=num/10;
		}
		
	}

}
