package logicalProgram;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String args[])
	{
		System.out.println("Enter A number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i;  
		for(i=2;i<num;i++)
		{
			if(num%i==0)
				break;
		}	
		if(i==num)
		{	
			System.out.println("Prime Number");
		}	
		else
		{	
			System.out.println("Not Prime Number");
		}
		
	}
}
