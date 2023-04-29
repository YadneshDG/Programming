package Array;
//largest element in array
import java.util.Arrays;

public class LargeInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {2,3,8,9,7};
		System.out.println(Arrays.toString(a));
		int large=Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++) {
		if(a[i]>large) {
			large=a[i];
		}
		}
		System.out.println("Large = "+large);
	}

}
