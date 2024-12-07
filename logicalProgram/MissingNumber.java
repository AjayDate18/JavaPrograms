package logicalProgram;

import java.util.HashSet;

public class MissingNumber 
{
	public static void main(String args[])
	{
		int arr[]= {1,3,4,5};
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for(int num:arr)
		{
			hs.add(num);
		}	
		int length=arr.length+1;
		//System.out.println(length);
		for(int i=0;i<length-1;i++)
		{	
			if(!hs.contains(i))
			{	
				System.out.println(i);
			}	
		}	
	}
		
}
