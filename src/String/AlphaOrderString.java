package String;
//WAp to display all the strings in a lexographical order
import java.util.Arrays;

//wap to display to store string in alphabetical ordar
public class AlphaOrderString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a= {"Biryani","Tikka","ButterChicken","pav Bhaji", "Anda Curry"};
		
		

		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) 
			{
				if(a[i].compareTo(a[j])>0)  
				{
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
