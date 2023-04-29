package PatternAtoZ;

public class Y {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		for(int r=1; r<=n; r++) {
			for(int c=1; c<=n; c++) {
				if((c==r && r<=5)||(r+c==n+1 && r<=5)||(c==6 && r>=6)){
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
