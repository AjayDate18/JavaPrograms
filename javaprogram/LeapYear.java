package javaprogram;

public class LeapYear 
{
	public static void main(String[] args) 
	{
		int year=2004;
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
			System.out.println("Year is Leap Yaer");
		else
			System.out.println("Year is Not Leap Year");
		
	}
}
