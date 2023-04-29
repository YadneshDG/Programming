package String;
/*1. append
 * 2. insert
 * 3. delete
 * 4. replace
 * 5. reverse
*/
public class newMethodString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("java ");
		System.out.println(sb);
		sb.append("is a programing lang");
		System.out.println(sb);
		sb.insert(10, "high level ");//after 110th index it will add high level
		System.out.println(sb);
		sb.delete(21, 31);//between 21 and 31 index charecter will be deleted
		System.out.println(sb);
		sb.replace(0, 4, "Python");
		System.out.println(sb);
		System.out.println(sb.reverse());//revere all string
		
		
	}

}
