package Mock;
//Q. perfect number --> sum of factors 
public class PerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		int temp =num;
		int sum=0;
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				System.out.println("Fcators = "+i);
				sum=sum+i;
			}
		}
		System.out.println("addition of factors = "+sum);
		if(temp==sum) {
			System.out.println(temp+" it is Perfect number");
			}else {
				System.out.println(temp+" it is NOT Perfect number");
			}
	}

}
