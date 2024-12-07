package javaprogram;

public class SumOFArray 
{
	public static void main(String[] args) 
	{
//		int a[]= {5,2,7,9,6};
//		int sum=0;
//		for(int i=0;i<=a.length-1;i++)
//		{
//			sum=sum+a[i];
//		}
//		System.out.println("Sum Of Array is "+sum);
		
		//Approach-2
		//Enhanced For Loop
		int a[]= {5,2,7,9,6};
		int sum=0;
		for(int value:a)
		{
			sum=sum+value;
		}	
		System.out.println("Sum Of Array is :"+sum);
		
	}
}
