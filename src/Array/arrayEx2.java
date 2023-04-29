package Array;

import java.util.Scanner;

public class arrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size = ");
		int size = sc.nextInt();
		int[] a= new int[size];
		for(int i=0; i<a.length; i++) {
			System.out.println("Enter num = ");
			a[i]=sc.nextInt();
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
