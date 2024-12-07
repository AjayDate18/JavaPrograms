package javaprogram;

import java.util.Scanner;

public class LargestOfThree 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int a=sc.nextInt();
		
		System.out.println("Enter Second Number");
		int b=sc.nextInt();
		
		System.out.println("Enter Third Number");
		int c=sc.nextInt();
		
		//Approach -1
		if(a>b && a>c)
		{
			System.out.println(a+" is Greater Number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is Greater Number");
		}
		else
		{
			System.out.println(c+"is Greater Number");
		}
		
		//Approach Second
		
		//Using Ternary Operator
		
		int max;
		
		//max=a>b ?a:b; //true:false
		//max=max>c?max:c; 
		
		//or
		max=(a>b?a:b)>c?(a>b?a:b):c;
		
		System.out.println("Largest Number Is "+max);
		
		
			
	}
}
