package Array;
//Q. perform CRUD operation in array. accept values from user
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayCRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array Size = ");
		int size =sc.nextInt();
		
		int[]a =new int[size];
		for(int i=0; i<a.length; i++) {
				System.out.print("Enter num = ");
				a[i]=sc.nextInt();	
		}
		for(int i=0; i<a.length; i++) {
	//	System.out.print(a[i]+" ");
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println();
		System.out.println(" Enter 1 for add number");
		System.out.println(" Enter 2 for Remove number");
		System.out.println(" Enter 3 for Update number");
		int n=sc.nextInt();
		if(n==1) {
			System.out.print("Enter  num = ");
			int num =sc.nextInt();
			System.out.print("Enter index = ");
			a=addNum(num, sc.nextInt(), a);
			System.out.println(Arrays.toString(a));

		}else if(n==2) {
			System.out.print("Enter index = ");
			a=DelelNum(sc.nextInt(), a);
			System.out.println(Arrays.toString(a));

		}else if(n==3) {
			System.out.print("Enter  num = ");
			int num =sc.nextInt();
			System.out.print("Enter index = ");
			a=update(num, sc.nextInt(), a);
			System.out.println(Arrays.toString(a));
		}else {
			System.out.println("Envalid Input");
		}
		

	}
	
	public static void add() {
		
	}
	
	public static int[] addNum(int element ,int index, int[]a) {
		if(index < 0 || index > a.length) {
			System.out.println("Invalid Input Bro Dekh ke Type kar ");
			return a;
		}
		
		int[]b=new int[a.length+1];
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
	
	public static int [] DelelNum(int index, int[]a) {
		if(index < 0 || index > a.length) {
			System.out.println("Invalid ");
			return a;
		}
		int[]b=new int[a.length-1];
		for(int i=0; i<b.length; i++) {
			if(i<index) {
				b[i]=a[i];
			}else {
				b[i]=a[i+1];
			}
		}
		return b;
	}
	
	public static int[] update(int element, int index, int[]a) {
		if(index <0|| index >=a.length) { 
			System.out.println("Not Valid Index");
		return a;
		}
	
	a[index]=element;
	return a;
	}
}


