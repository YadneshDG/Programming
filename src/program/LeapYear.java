package program;
/*Leap Year
 *check the year leap year or not
 *year  will divided by year%4==0
 *{
 *then find century year%100==0
 *{
 *if year is divided by year%400==0
   then it is a leap year
   }
   if year is not century then year is not leap year
   }
 * */
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int year=2012; year<=3000; year++) {
		boolean b=false;
		if(year%4==0) {//to check if leap year
			if(year%100==0) {//to check century number
				if(year%400==0) {//check century year
					b=true;
				}else {
					b=false;
				}
			}else {
				b=true;
			}
		}else {
			b=false;
		}
		if(b==true) {
			System.out.println(year+"Leap year");
		}
//		else {
//			System.out.println("Not Leap Year");
//		}
	
		}
	}
}