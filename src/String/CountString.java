package String;
//Count string space or string or character 
public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st="How are you baby";
		int count =0;
		for (int i=0; i<st.length(); i++) {
			if(st.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);

	}

}
