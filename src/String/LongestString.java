package String;
//wap to find longest String in array 
public class LongestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []a= {"Yadnesh", "Suraj", "Boobremon", "Bhamtya"};
		int max=0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i].length() > a[max].length()) {
				max=i;
			}
			
		
		}
		System.out.println(a[max]);
	}

}
