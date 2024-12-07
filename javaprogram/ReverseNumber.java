package javaprogram;

import java.util.Scanner;

public class ReverseNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//Accept value form user at runtime.
		System.out.println("Enter A Number :");
		int Number=sc.nextInt();  //1234
		
		//Using Algorithm
		
		int rev=0;
		while(Number!=0)
		{
			rev=rev*10+Number%10;
			Number=Number/10;
			
		}	
		System.out.println("Reverse Number is :"+rev);
		
		//Logic-2
		//Using StringBuffer Class
		
//		StringBuffer sb=new StringBuffer(String.valueOf(Number));
//		StringBuffer rev=sb.reverse();
//		System.out.println("Reverse Number is: "+rev);
//		
		
		//Logic-3
		//Using StringBuilder Class
//		StringBuilder sbl=new StringBuilder();
//		sbl.append(Number);
//		StringBuilder rev=sbl.reverse();
//		
//		System.out.println("Reverse Number is: "+rev);
		
		
		
	}
	
}
