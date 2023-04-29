package String;
//wrp to convert all lowercase char to upper case and uppercase char into lower case 
public class UpperLowerChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String st="Apna Time AAyeGA";
		char []arr=st.toCharArray(); //convert string into char
		//without using inbuild method
		for(int i=0; i<st.length(); i++) {
			if(arr[i]>='a' && arr[i]<='z') 
			{
			arr[i]= (char)(arr[i]-32); // typecast conversion 	and asccii value a=97  A=97-32=65
			}
			else if( arr[i]>='A' && arr[i]<='Z') 
			{
				arr[i]= (char)(arr[i]+32); 
			}
			
		}
		st=new String(arr);//convert char into string 
		System.out.println(st);
		
	
	}

}
