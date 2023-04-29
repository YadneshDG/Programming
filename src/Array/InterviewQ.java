package Array;

import java.util.Arrays;

//Q.2 Array in magic values 
//Q wap to calculate the magic value of the array. magic value is diff between sum 
//of good integer and sum of bad integer. 
//good integer are values whose indexes are not changed after sorting
//rest are bad
//good integer--> the position will not change
// bad integer --> after sorting position change
public class InterviewQ {
	
	public static void main(String[] args) {
		int[] a = {0, 3, 1, 2, 0, 4};
		int[] b = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}

		System.out.println("Befor Sorting " + Arrays.toString(a));
		int count = 0;
		int count2=0;
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] > b[j]) {
					int temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		System.out.println("Bubble Sort Array B = " + Arrays.toString(b));

		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i]) {
				count++;
			}else if (a[i] != b[i]) {
				count2++;
			}
		}
		System.out.println("Good integers count = "+count);
		System.out.println("Bad integers count = "+count2);
	}
}