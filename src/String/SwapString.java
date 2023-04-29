package String;
//wap to swap two string using third variable
public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s1="hello";
		String s2="word";
		System.err.println("before swap = "+s1+" "+s2);
		String temp=s1;
		s1=s2;
		s2=temp;
		System.err.println("After swap = "+s1+" "+s2);

	}

}
