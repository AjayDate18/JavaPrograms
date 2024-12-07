package javaprogram;

public class NumberOfDigit 
{
	public static void main(String[] args) 
	{
		int num=123456;
		int cntr=0;
		while(num!=0)
		
		{
			num=num/10;
			cntr++;
			
		}	
		System.out.println("Number of Digit is "+cntr);
	}
}
