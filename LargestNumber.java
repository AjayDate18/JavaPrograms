package logicalProgram;

import java.util.Arrays;

public class LargestNumber 
{
	public static void main(String args[])
	{
		int arr[]= {300,45,220,58,950,110,40,80};
		int len=arr.length;
		System.out.println("Array Length is "+len);
		
		int maximum=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>maximum)
				maximum=arr[i];
				
		}	
		System.out.println("Maximum Number is " +maximum);
		
		Arrays.sort(arr);
		System.out.println("Second Largest Number is "+arr[len-2]);
		
	}
}
