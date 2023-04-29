package String;
//Remove all the Vowels froem string
public class Removevowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st = "My Name is yadnesh Hello friends";
		String store = "";
		int count =0;
		for (int i=0; i<st.length(); i++) {
			if(st.charAt(i)!='a'&& st.charAt(i)!='e'&& st.charAt(i) !='i'&& st.charAt(i)!='o'&& st.charAt(i)!='u') {
				store= store +st.charAt(i);
			}
		}
		System.out.println(store);

	}

	

}
