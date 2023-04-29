package PatternAtoZ;

public class R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int r=1; r<=n; r++) {
			for(int c=1; c<=n; c++) {
				if((c==3) ||(r==1 && c>=3 && c<=8)|| (r==5 && c>=3 && c<=8)||(c==9 && r>=2 && r<=4)) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
