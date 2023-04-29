package Array;
// smaller element in array
import java.util.Arrays;

public class SmallInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {2,3,8,9,7};
		System.out.println(Arrays.toString(a));
		
		int Small=Integer.MAX_VALUE;
		
		for(int i=0; i<a.length; i++) {
		if(a[i]<Small) {
			Small=a[i];
			}
		}
		System.out.println("Small = "+Small);
	}

	

}
