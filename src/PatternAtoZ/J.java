package PatternAtoZ;

public class J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int r=1; r<=n; r++) {
			for(int c=1; c<=n; c++) {
				if((c==5)||(r==1 && c>=2 && c<=8)||(r==n && c>=3 && c<=5)||(r==9 &&c>=2 && c<=2)){
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
