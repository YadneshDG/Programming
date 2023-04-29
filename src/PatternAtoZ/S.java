package PatternAtoZ;

public class S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		for(int r=1; r<=n; r++) {
			for(int c=1; c<=n; c++) {
				if((r==1 && c>=2 && c<=9)||(r==n && c>=2 && c<=9)||(r==6 && c>=2 && c<=9)||(c==2 && r<=6)||(c==9 && r>=6)) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
