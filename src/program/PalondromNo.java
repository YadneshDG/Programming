package program;
/*Palindrom number --> reverse the orignal number 121=121
 * 
 * */
public class PalondromNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =1441;
		int temp=num;
		int rev=0;
		System.out.println("Orignal num ="+num);
		//System.out.print ("Reverse =");
		while(num!=0) {
			int d=num%10;
			rev=rev*10+d;
			//System.out.print(d);
			num=num/10;
		}
		if(temp==rev) {
			System.out.println(rev+" = palindrom");
		}else {
			System.out.println(rev+" = not palindrom");
		}
	}

}
