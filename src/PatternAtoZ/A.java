package PatternAtoZ;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		for(int r=1; r<=10; r++) 
		{
			for(int c=1; c<=10; c++) 
			{
				if((r==4 && c>=3 && c<=8) ||(r==1 && c>=3 && c<=8)|| c==3 || c==8 ) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
	}

}
