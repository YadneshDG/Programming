package PatternAtoZ;

public class T {
	public static void main(String[] args) {
		int n=10;
		for(int r=1; r<=n; r++) {
			for(int c=1; c<=n; c++) {
				if((c==5 && r>=2 && r<=9)||(r==2 && c>=2 && c<=8)){
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
}
}
