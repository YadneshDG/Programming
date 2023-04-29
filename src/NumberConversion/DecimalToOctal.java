package NumberConversion;
//Decimal To Octal
public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=14;
		String result="";
		while(n!=0) {
			int remender=n%8;
			result=remender+result;
			n=n/8;
		}
		System.out.println(result);

	}
	

}


