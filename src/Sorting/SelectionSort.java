package Sorting;

import java.util.Arrays;

/* Selection sort
 * faster than bubble sort 
 * 
 * */
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {3,5,4,2,1};
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<a.length; i++) {
			int min=i;//store index-->0,2
			for(int j=i+1; j<a.length; j++) {
				if(a[j]<a[min]) //5<3-->f 1<3-->t same for next 
				{
					min=j;//2
				}
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
		System.out.println("Selection sort = "+Arrays.toString(a));
	}

}
