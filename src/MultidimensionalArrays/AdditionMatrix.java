package MultidimensionalArrays;
//Addition of 2 matrix 
public class AdditionMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		int [][]b= {{1,1,0},{0,0,2},{1,1,0}};
		
		for(int i = 0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
//		
//		for (int i = 0; i < b.length; i++) {
//			for (int j = 0; j < b.length; j++) {
//				System.out.print(a[i][j]+b[i][j]+" ");
//
//			}
//			System.out.println();
//
//		}


	}

}
