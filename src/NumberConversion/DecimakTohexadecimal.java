package NumberConversion;
// decimal to hexadecimal
public class DecimakTohexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=420;
		String result = "";
		while(num!=0) {
			int reminder=num%16;
			if(reminder == 10) {
				result = "a"+result;
			}else if(reminder == 11) {
				result = "b"+result;
			}else if(reminder == 12) {
				result = "c"+result;
			}else if(reminder == 13) {
				result = "d"+result;
			}else if(reminder == 14) {
				result = "e"+result;
			}else if(reminder == 15) {
				result = "f"+result;
			}else {
				result=reminder+result;
			}
			num=num/16;
		
		}
		System.out.println(result);

	}

}
