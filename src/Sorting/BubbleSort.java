package Sorting;

import java.util.Arrays;

//Bubble Sort
/*sort element accending and decending 
 * a={2,1,5,9,8,7}
 * if 2-1 compaire who is smaller and then swap num small number position place in 1st
 * 1-2
 * {1,2,5,9,8,7}
 * if 2-5 compaire who is smaller and then swap num small number position place in 1st
	2-5 --> 2 is small 
		


 * sort element in accending order
 * */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {3,5,4,2,1};
		System.out.println(Arrays.toString(a));

		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] > a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Bubule Sort = "+Arrays.toString(a));
	}

}
