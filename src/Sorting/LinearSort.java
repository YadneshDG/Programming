package Sorting;
//linear array : compaire each and every element
public class LinearSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {2,4,3,5,1};
		int search=9;
		boolean b=false;
		for(int i=0;i<a.length; i++) {
			if(a[i]==search) {
				b=true;
				System.out.println("element is present");
				break;
			}
		}
		if(!b)//!b--> b==false 
		{
			System.out.println(search+" Not Present");
		}

	}

}
