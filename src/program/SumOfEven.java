package program;

public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123456;
		int sum=0;
		while(n!=0) {
			int d=n%10;
			if(d%2==0) {
				System.out.println("even no ="+d);
				sum=sum+d;
			}
			n=n/10;
		}
		System.out.println("sum ="+sum);
	}

}
