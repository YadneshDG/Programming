package Pattern;
//interview IMP Q 
public class PatternEx6Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int r=1; r<=n; r++) {//rows
			for(int c=1; c<=n; c++) {//column
				if(r==1 || r==3 || (c==1 && r<=3)||(c==n && r<=3)|| (c==3 && r>=3)) {
				System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	}


