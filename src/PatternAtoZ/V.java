package PatternAtoZ;

public class V {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int r=1; r<=n; r++) {
			for(int c=1; c<=n; c++) {
				if((c==1 && r>=1 && r<=1)||(c==1 && r>=2 && r<=2)||
					(c==2 && r>=3 && r<=3)||(c==2 && r>=4 && r<=4)||
					(c==3 && r>=5 && r<=5)||(c==3 && r>=6 && r<=6)||
					(c==4 && r>=7 && r<=7)||(c==4 && r>=8 && r<=8)||
					(c==5 && r>=9 && r<=9)||(c==5 && r>=10 && r<=10)||
					(c==6 && r>=9 && r<=9)||(c==6 && r>=10 && r<=10)||
					(c==7 && r>=7 && r<=7)||(c==7 && r>=8 && r<=8)||
					(c==8 && r>=5 && r<=5)||(c==8 && r>=6 && r<=6)||
					(c==9 && r>=3 && r<=3)||(c==9 && r>=4 && r<=4)||
					(c==10 && r>=1 && r<=1)||(c==10 && r>=2 && r<=2)){
System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
