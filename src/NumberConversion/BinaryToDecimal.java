package NumberConversion;
/*binary to decimal
 * 1.separat the number
 * 2. multiply each separted valu by base number 
 * when the multiply second value  base value power incremented by 1*/
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1110;
		int sum=0;
		int p=0;
		while(n!=0) {
			int d=n%10;
			sum=sum+d*pow(2,p);
			p++;
			n=n/10;
		}
		System.out.println(sum);
	}
	public static int pow(int n,int p) {
		int res=1;
		for(int i=1; i<=p; i++ ) {
			res=res*n;
		}
		return res;
	}

}
