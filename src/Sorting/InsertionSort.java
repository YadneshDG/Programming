package Sorting;

import java.util.Arrays;

//Insertion Sort :- 
// Compaire with previouse value , if previouse value is greater then it will swap value
//compairing till to values in acending 
//
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]a= {4,2,5,3,1};
		System.out.println(Arrays.toString(a));
		
		for(int i=1; i<a.length; i++) {
			int temp=a[i];//element
			int j=i; //index
			
			while(j>0 && a[j-1]>temp) {
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
