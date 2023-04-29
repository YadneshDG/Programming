package String;
//convert lower case charecter into uppercase charecter 

public class StringLowHigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st="Abcdefghijklnopqrst";
		char []arr=st.toCharArray();
		//without using inbuild method
		for(int i=0; i<st.length(); i++) {
			if(arr[i]>='a' && arr[i]<='z') {
			arr[i]= (char)(arr[i]-32); // typecast conversion 	and asccii value a=97  A=97-32=65
			}
		}
		st=new String(arr);
		System.out.println(st);
		
	//using inbuild method
//		for(int i=0; i<st.length(); i++) {
//		System.out.print(st.toUpperCase().charAt(i)); 
//		}
	}

}

