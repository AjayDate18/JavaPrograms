package logicalProgram;

public class LargestOfThree 
{
	public static void main(String args[])
	{
		int a=940;
		int b=750;
		int c=1550;
		if(a>b && a>c)
		{
			System.out.println(a+" a is Largest Number");
		}	
		else if(b>c && b>a)
		{
			System.out.println(b+" b is largest number");
		}	
		else
		{
			System.out.println(c+" c is largest number");
		}	
	}
}
