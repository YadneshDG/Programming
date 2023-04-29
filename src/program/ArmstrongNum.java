package program;
/*Armstrong num
 * 1st separate the num 
 * 2nd then calculate cube of separated num 
 * 3rd addition of all cube and compaire with orignal number
 * if num is same this num is armstrong num*/
public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int temp=n;
		int sum=0;
		int count=countDigit(n);
		while(n!=0) {
			int d=n%10;
			sum=sum+power(d,count);
			n=n/10;
		}
		if(sum == temp) {
			System.out.println("Armstromg num");
		}else {
			System.out.println("Not Armstrong num");
		}

	}
	
	public static int power(int n,int p) {
		int result =1;
		for(int i=1; i<=p; i++) {
			result=result*n;
		}
		return result;
	}
	
	public static int countDigit(int n) {
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;
		}
		return count;
	}

}
