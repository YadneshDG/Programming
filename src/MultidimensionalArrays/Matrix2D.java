package MultidimensionalArrays;
//2d array
//wap to print all element of 2d array in matrix form
import java.util.Arrays;

public class Matrix2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i = 0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
