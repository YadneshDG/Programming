package Sorting;

public class BinarySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]a= {1,2,3,4,5};
		int StartPoint=0;
		int EndPoint=a.length-1;
		int MiddelPoint=(StartPoint+EndPoint)/2;
		int search=3;
		while (StartPoint<=EndPoint)
		{
			if(search==a[MiddelPoint]) 
			{
				System.out.println("Element is present at index "+MiddelPoint);
				break;
			}
			else if(search>a[MiddelPoint]) 
			{
				StartPoint=MiddelPoint+1;
			}
			else if(search<a[MiddelPoint]) 
			{
				EndPoint=MiddelPoint-1;
			}
			MiddelPoint=(StartPoint+EndPoint)/2;
		} 
		if(StartPoint > EndPoint) {
			System.out.println("The element is not present ");
		}
	}

}
