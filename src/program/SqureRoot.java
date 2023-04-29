package program;
/*SquareRoot 
 * num=9
 * 
 * */
public class SqureRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=16;
		double t;
		double sqrt = n/2; //16/2=8.0
		do {
			t=sqrt;//8.0
			sqrt=(t+(n/t))/2;//(8+(16/8))/2=8+2/2=10/2=5
			}while(t-sqrt!=0);//8-5 !=0 -->3
		System.out.println(sqrt);
	}

}
