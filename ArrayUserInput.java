package logicalProgram;

import java.util.Scanner;

public class ArrayUserInput 
{
	public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Element of Array ");
		num=sc.nextInt();
		int arr[]=new int[10];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Array Element Are");
		for(int i=0;i<num;i++)
		{
			System.out.print(+arr[i]+" ");
		}	
		
		
	}
}
