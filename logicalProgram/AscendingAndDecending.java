package logicalProgram;

import java.util.Scanner;

public class AscendingAndDecending 
{
	public static void main(String args[])
	{
		int arr[]=new int[10];
		int num;
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter How Many Element :");
		num=sc.nextInt();
		
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
			
		}	
		System.out.println(" Intial Array Element Are ");
		for(int i=0;i<num;i++)
		{
			System.out.print(arr[i]+" ");
		}	
		//Sort Arry In Ascending Order
		for(int i=0;i<num;i++)
		{
				for(int j=i+1;j<num;j++)
				{
					if(arr[i]>arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}	
				}	
		}	
		System.out.println("Array After Sorting");
		for(int i=0;i<num;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("Array In Decending Order");
		for(int i=num-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}	
		
		
	}
}
