package Array;
//wrp Product  Of All Element which are divisible by 3
public class ProductOfAllElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {10,15,20,25,30}; 
		int pro=1;
		for(int i=0; i<a.length; i++) {
			if(a[i]%3==0) {
			pro=pro*a[i];
			}
		}
		System.out.println("product = "+ pro);
	}

}
