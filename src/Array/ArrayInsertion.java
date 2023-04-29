package Array;

import java.util.Arrays;

//array insertion 
public class ArrayInsertion {
	public static int[] addToStart(int element,int[]a) {
		int[]b=new int[a.length+1];
		b[0]=element;
		for(int i=0; i<a.length; i++) {
			b[i+1]=a[i];
		}
		return b;
	}
	
	public static int[] addToLast(int element, int[]a) {
		int[]b=new int [a.length+1];
		b[b.length-1]=element;
		for(int i=0; i<a.length;i++) {
			b[i]=a[i];
		}
		return b;
	}
	
	public static int[] addAtIndex(int element, int index, int[]a) {
		if(index < 0 || index > a.length) {
			System.out.println("Not valid index");
			return a;
		}
		int[]b=new int [a.length+1];
		b[index]=element;
		for(int i=0; i<b.length-1; i++) {
			if(i<index) {
				b[i]=a[i];
			}else {
				b[i+1]=a[i];
				
			}
		}
		
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
	System.out.println(Arrays.toString(a));
//		a=addToStart(8, a);
//		System.out.println(Arrays.toString(a));
		
		 a= addToStart(12,a);
	        System.out.println(Arrays.toString(a));
		
//		a=addAtIndex(12, 2, a);
//		System.out.println(Arrays.toString(a));
		
//	a=addAtIndex(15, 2, a);
//	System.out.println(Arrays.toString(a));

		
	}

}
