package String;
//Reverse String 
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st="Thane";
		String rev="";
		int leng=st.length();
		System.out.println(leng);
		
		for(int i=leng-1; i>=0; i--) {
			rev=rev+st.charAt(i);
		}
		System.out.println(rev);
	}

}
