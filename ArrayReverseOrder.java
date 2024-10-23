package logicalProgram;

public class ArrayReverseOrder
{
	public static void main(String args[])
	{
		int arr[]= {2,3,8,24,14,20,18,50};
		System.out.println("Array Length :"+arr.length);
		System.out.println("Original Array is ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}	
		
		System.out.println("Reverse Of Array is");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}	
	}
}
