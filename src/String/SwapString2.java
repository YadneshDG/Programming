package String;
//wap to swap two string whithout using third variable 
public class SwapString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String  s1="hello";
		String s2="word";
		System.out.println("before swap s1= "+s1+" s2 ="+s2);
		s1=s1.concat(s2);
		//System.out.println(s1);
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("after swap s1= "+s1+" s2 ="+s2);

		

	}

}
