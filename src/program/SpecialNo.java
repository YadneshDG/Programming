package program;
//Special no
/*1. separate num 
 *2. sum find 
 *3. find product
 *4.and compaired orignal num is equal to sum+product  
 * */
public class SpecialNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 29;
		int temp=num;
		int sum=0;
		int pro=1;
		while(num != 0) {
			int d= num%10;
			sum=sum+d;
			pro=pro*d;
			num=num/10;
		}

		System.out.println("sum = "+sum);
		System.out.println("product = "+pro);
		int sum2=sum+pro;

		if(temp == sum2) {
			System.out.println(temp+" num is special");
		}else {
			System.out.println(temp+" num is NOT special");

		}
	}

}
