package Pattern;
//box pattern 
//Box 
//        *****
//        *   *
//        *   *
//        *   *
//        *****
public class PatternEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int r=1; r<=n; r++) {//rows
			for(int c=1; c<=n; c++) {//column
				if(r==1 || r==n || c==1 || c==n) {
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
