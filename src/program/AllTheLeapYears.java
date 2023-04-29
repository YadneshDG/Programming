package program;
/* all the leap years between 1600 to 3000*/
public class AllTheLeapYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int year=1600; year<=3000; year++) {
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
	
	}
	}

}
