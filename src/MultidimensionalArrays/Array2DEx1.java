package MultidimensionalArrays;

import java.util.Arrays;

//2d array
//wap to print all element of 2d array 
public class Array2DEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(a);
		System.out.println(a[0]);
		System.out.println(Arrays.toString(a));
		
		for(int i = 0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}

	}

}
