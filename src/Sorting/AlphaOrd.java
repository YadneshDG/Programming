package Sorting;

import java.util.Arrays;

//wap sort charecter of the name in alphabet order aseneding order
public class AlphaOrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]a= {'y','a','d','n','e','s','h'};
		System.out.println(Arrays.toString(a));

		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] > a[j]) {
					char temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Bubule Sort = "+Arrays.toString(a));
	}

	}



