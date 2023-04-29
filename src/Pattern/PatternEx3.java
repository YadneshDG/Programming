package Pattern;
/*     *
 * 	   *
 *     * 
 * * * * * * *
 *     * 
 *     *
 *     *
 * */
public class PatternEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for(int r=1; r<=n; r++) {//rows
			for(int c=1; c<=n; c++) {//column
				if(r==n/2+1 || c==n/2+1) {
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	}


