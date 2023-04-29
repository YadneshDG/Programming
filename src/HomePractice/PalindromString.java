package HomePractice;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Radar";
		String revStr="";
		
		int strLength = str.length();
		
		for(int i=(strLength-1); i>=0; i--) {
			revStr=revStr+str.charAt(i); //charAt() method accesses each character of the string.
			//Each character of the string is accessed in reverse order and stored in reverseStr.
			
		}
		/*The toLowerCase() method converts both str and reverseStr to lowercase.
		 *  This is because Java is case sensitive and 'r' and 'R' are two different values.
		 *  
		 *  The equals() method checks if two strings are equal.
		 */
		if(str.toLowerCase().equals(revStr.toLowerCase())) {
			System.out.println(str+" is palindrome String");
		}else {
			System.out.println(str+" is NOT palindrome String");

		}
			
		
	}

}
