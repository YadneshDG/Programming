package MultidimensionalArrays;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		int [][]b= {{1,1,0},{0,0,2},{1,1,0}};
		
		for(int i = 0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}

}
