package NumberConversion;

public class BinarytoHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1111;
		int sum=0;
		int p=0;
		while(n!=0) {
			int d=n%10;
			sum=sum+d*pow(2,p);
			p++;
			n=n/10;
		}
		System.out.println(sum);
		Hexa(sum);
	}
	public static int pow(int n,int p) {
		int res=1;
		for(int i=1; i<=p; i++ ) {
			res=res*n;
		}
		return res;
	}
	
	public static int Hexa(int n) {
		String result = "";
		while(n!=0) {
			int reminder=n%16;
			if(reminder == 10) {
				result = "a"+result;
			}else if(reminder == 11) {
				result = "b"+result;
			}else if(reminder == 12) {
				result = "c"+result;
			}else if(reminder == 13) {
				result = "d"+result;
			}else if(reminder == 14) {
				result = "e"+result;
			}else if(reminder == 15) {
				result = "f"+result;
			}else {
				result=reminder+result;
			}
			n=n/16;
		
		}
		System.out.println("Hexadecimal = "+result);
		return n;

	}

}