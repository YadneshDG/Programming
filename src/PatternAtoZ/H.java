package PatternAtoZ;

public class H {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int n=11;
				for(int r=1; r<=n; r++) {
					for(int c=1; c<=n; c++) {
						if((c==2)||(c==9)||(r==6 && c>=2 && c<=9)){
							System.out.print("* ");
						}else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
	}

}
