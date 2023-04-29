package NumberConversion;

public class BinaryToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1100;
		int sum=0;
		int p=0;
		while(n!=0) {
			int d=n%10;
			sum=sum+d*pow(2,p);
			p++;
			n=n/10;
		}
		System.out.println("Decimal = "+sum);
		octal(sum);
	}
	
	public static int octal(int num) {// decimal to octal
		
		String result="";
		while(num!=0) {
			int remender=num%8;
			result=remender+result;
			num=num/8;
		}
		System.out.println("Octal = "+result);
		return num;
	}

	
	public static int pow(int n,int p) {//power method
		int res=1;
		for(int i=1; i<=p; i++ ) {
			res=res*n;
		}
		return res;
	}
	}


