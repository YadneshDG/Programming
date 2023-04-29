package Array;
//ssecond largest num in array
import java.util.Arrays;

public class SecondLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {11,3,11,9,7};
		System.out.println(Arrays.toString(a));
		int large=Integer.MIN_VALUE;
		int secLarge=Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++) {
		if(a[i]>large) {
			secLarge=large;
			large=a[i];
		}else if(a[i]>secLarge && a[i]!=large){
			secLarge=a[i];
		}
		}
		System.out.println("Large = "+large);

		System.out.println("Second Large = "+secLarge);
	}

	}
//next Q - input user
/*
 * update
 * delete
 * */

