package PatternAtoZ;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int r=1; r<=n; r++) {
			for(int c=1; c<=n; c++) {
				if((c==3 && r>=3 && r<=8) ||(c==4 && r>=2 && r<=2)||(c==4 && r>=9 && r<=9)|| (r==1 && c>=5 && c<=8) || (r==n && c>=5 && c<=8)) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		

	}

}
