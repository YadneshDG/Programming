package Array;

public class EvenIndexArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3,4,5,6};
		for(int i=0; i<a.length; i++) {
			if(i%2==0) {
				System.out.println("Even index = "+a[i]);
			}
		}
	}

}
