package PatternAtoZ;

public class O {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int r=1; r<=n; r++) {
			for(int c=1; c<=n; c++) {
				if((c==2 && r>=4 && r<=7)||(c==9 && r>=4 && r<=7)|| (r==2 && c>=4 && c<=7)||(r==9 && c>=4 && c<=7)||(r==3 && c>=3 && c<=3) || (r==8 && c>=3 && c<=3)||(r==3 && c>=8 && c<=8) || (r==8 && c>=8 && c<=8)){
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
