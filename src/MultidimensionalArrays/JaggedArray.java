package MultidimensionalArrays;
//Jagged array
public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][]a=new int[3][];
		a[0]=new int[4];
		a[1]=new int[5];
		a[2]=new int[6];
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i].length);
		}
	}

}
