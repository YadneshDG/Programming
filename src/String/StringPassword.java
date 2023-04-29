package String;

import java.util.Scanner;

//write a program to check password is strong or not
/*
 * 1. atleast 8 
 * 2. atleast 1 in uppercase
 * 3. atleast 1 in lowercase
 * 4. atleast 1 in Numeric
 * 5. atleast 1 special 
 * */
public class StringPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Pass : ");
		String pass = sc.next();
		boolean isUpper = false, isLower=false, isNumeric=false, isSpecial=false;
		
		for(int i=0; i<pass.length(); i++) {
			if(pass.charAt(i) >= 'A' && pass.charAt(i) <='Z') {
				isUpper=true;
			}else if(pass.charAt(i) >= 'a' && pass.charAt(i) <='z') {
				isLower=true;
			}else if(pass.charAt(i) >= '0' && pass.charAt(i) <='9') {
				isNumeric=true;
			}else {
				isSpecial=true;
			}
		}
		if(isUpper && isLower && isNumeric && isSpecial) {
			System.out.println(" Password is Strong");
		}else {
			System.out.println(" Password is Not strong");
		}
	}

}

