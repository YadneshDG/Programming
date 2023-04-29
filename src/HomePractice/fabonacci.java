package HomePractice;
//fabbonachi - addition of two privious numbers
//next num = first num + second num
//first num = second num
//secind num = next num
public class fabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0; int b=1; 
		for(int i=1; i<=10; i++) {
			System.out.print(a+" ");

			int c=a+b;
			a=b;
			b=c;
		}
	}

}
