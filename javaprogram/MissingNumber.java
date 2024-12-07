package javaprogram;

public class MissingNumber 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,5,6,7};
		//Array Should not have duplicate value
		//Array No Need to be sorted order
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
			
		}	
		System.out.println("Sum of Element is "+sum1);
		int sum2=0;
		for(int i=1;i<=7;i++)
		{
			sum2=sum2+i;
		}	
		System.out.println("Sum OF Range Of Elements "+sum2);
		System.out.println("Missing Number is "+(sum2-sum1));
	}
}
