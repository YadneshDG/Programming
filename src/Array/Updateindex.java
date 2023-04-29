package Array;

import java.util.Arrays;

public class Updateindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,0,3,4};
		System.out.println(Arrays.toString(a));
		
		a=update(-1, 2, a);
		System.out.println(Arrays.toString(a));
		
		a=update(9, 2, a);
		System.out.println(Arrays.toString(a));
		
		a=update(1, 2, a);
		System.out.println(Arrays.toString(a));
		
		


	}
	
	
	public static int[] update(int index, int element, int[]a) {
		if(index <0|| index >=a.length) { 
			System.out.println("Not Valid Index");
		return a;
		}
	
	a[index]=element;
	return a;
	}
	}


