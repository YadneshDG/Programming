package HomePractice;

import java.util.Scanner;

//wap check the charecter alphabet or not
public class AlphabetCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch= 'Z';
		if((ch>='a'&&ch<='z')||((ch>='A'&&ch<='Z'))) {
			System.out.println(ch+"--> it is charecter");
		}else {
			System.out.println(ch+"--> it is not charecter");
		}
	}

}
