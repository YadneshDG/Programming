package Array;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size = ");
		int size = sc.nextInt();
		//int []a={10,20,30,40,50};
		int[] a= new int[size];
		for(int i=0; i<a.length; i++) {
			System.out.println("Enter num = ");
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
			 sum=sum+a[i];
		}
		 System.out.println("sum = "+sum);


		

	}

}
