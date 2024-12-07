package javaprogram;

import java.util.Scanner;

public class EvenOddDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int num=sc.nextInt();
		int even_count=0,odd_count=0;
		
		while(num!=0)
		{
			if(num%2==0)
			{
				even_count++;
			}	
			else
			{
				odd_count++;
			}
			num=num/10;
		}
		System.out.println("Even Digits in a Number " +even_count);
		System.out.println("Even Digits in a Number " +odd_count);
			
	}
}
