package program;
//find All the strong in the range of 1 to 1000
public class AllStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		for( num=1; num<=1000; num++ ) {
			int temp = num;
			int sum=0;	
			while(num!=0) 
			{
				int d=num%10;
				int fact=1;
				for(int i=1; i<=d; i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println(temp+" is Strong number");
		}
		num=temp;
		}
	}
}
