package NumberConversion;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=14;
		String res="";
		while(n!=0) {
			int r=n%2;
			res=r+res;
			n=n/2;
		}
		System.out.println(res);

	}

}
