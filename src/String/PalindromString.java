package String;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st="Level ";
		st=st.trim(); //remove the space  
		String rev="";
		for(int i=st.length()-1; i>=0; i-- ) {
			rev=rev+st.charAt(i);
		}
		System.out.println(rev);
		
		if(st.equalsIgnoreCase(rev)) {
			System.out.println(rev + " is a palindrome");
		}else {
			System.out.println(rev + " is a Not palindrome");
		}
		
		
	}

}
