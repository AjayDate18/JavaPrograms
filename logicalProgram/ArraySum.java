package logicalProgram;

public class ArraySum 
{
	public static void main(String args[])
	{
		int arr[]= {2,4,5,7,8,10,12,14};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}	
		System.out.println("Sum is :"+sum);
	}
}
