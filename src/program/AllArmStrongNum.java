package program;
/*all the armtrong num in range of 1 to 1000*/
public class AllArmStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int n=1; n<=1000; n++) 
		{
			int temp=n;
			int sum=0;
			int count=countDigit(n);
			while(n!=0) {
				int d=n%10;
				sum=sum+power(d,count);
				n=n/10;
			}
			if(sum == temp) {
				System.out.println(temp+" Armstromg num");
			}
			n=temp;
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