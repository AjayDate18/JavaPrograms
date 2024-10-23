package logicalProgram;

import java.util.Scanner;

public class DuplicateElement 
{
	public static void main(String args[])
	{
		int arr[]=new int[10];
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Array Want To Enter :");
		num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}	
		System.out.println("Array Element Are ");
		for(int i=0;i<num;i++)
		{
			System.out.println(arr[i]+" ");
		}	
		
		System.out.println("Printing Duplicate Element in Array");
		for(int i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]+" ");
				}	
			}	
			
		}	
        
		
	}
}
