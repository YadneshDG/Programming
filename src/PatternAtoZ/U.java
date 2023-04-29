package PatternAtoZ;

public class U {
	public static void main(String[] args) {
		int n=10;
		for(int r=1; r<=n; r++) {
			for(int c=1; c<=n; c++) {
				if((c==2 && r<=8)|| (c==9 && r<=8)||(r==n && c>=4 && c<=7)||(r==9 && c>=3 && c<=3)||(r==9 && c>=8 && c<=8)){
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	

}
