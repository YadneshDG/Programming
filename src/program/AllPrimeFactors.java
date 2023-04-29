package program;
// find all prime factors of a numbers 
public class AllPrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =6;
		for(int i =1; i<=num; i++) {
			if(num%i==0) {
			//System.out.println(i);
		//PRIMe Number Lodgic
			int count=0;
			if(i != 0) {
				for(int j=1; j<=i; j++) {
					if(i%j==0) {
						count++;
					}
				}
			}
			if(count==2) {
				System.out.println(i);
			}
			}
		}
	}

}
