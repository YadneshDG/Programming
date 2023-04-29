package PatternAtoZ;

public class M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int r=1; r<=n; r++) {
			for(int c=1; c<=n; c++) {
				if((c==2 && r>=2 && r<=9)||(c==9 && r>=2 && r<=9)||(r==c && r>=2 && r<=5)||(r+c==n+1 && r>=2 && r<=5)){
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
