package logicalProgram;

import java.util.Scanner;

public class FibonacciSeriesWithUserInput 
{
	public static void main(String[] args) 
	{
		int a=-1,b=1,c; //important
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int num=sc.nextInt();
		// 0,1,1,2,3,5,8,13
		for(int i=1;i<=num;i++)
		{
			c=a+b; //c=-1+1=0
			System.out.println("  "+c);  //0
			
			a=b;  //a=1
			b=c;  // b=0
		}	
	}
}
