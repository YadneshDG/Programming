package Array;

import java.util.Scanner;

//Q. wap to find perfect square and perfect cube in a range
//Note - if any number is perfect square as well perfect cube it should be counted once not twice
public class InterviQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int q=sc.nextInt();
		int[]a= new int[q];
		
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i<a.length; i++) {
			int count=0;
			for(int j=1; j<=a[i]; j++) {
			
				if(perfectSqure(j)) {
				count++;
					}
				else if(perfectCube(j)) {
				count++;
				}
		}
		System.out.println(count);

		}
		
	}
	public static boolean perfectSqure(int n) {
		for(int i=1; i*i<=n; i++) {
			if(i*i==n) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean perfectCube(int n) {
		for(int i=1; i*i*i<=n; i++) {
			if(i*i*i==n) {
				return true;
			}
		}
		return false;
	}

}
