package logicalProgram;

public class MultiplyNumber 
{
	public static void main(String args[])
	{
		int num1=80;
		int num2=500;
		int multiply=0;
		
		for(int i=0;i<num2;i++)
		{
			multiply=multiply+num1;
		}	
		System.out.println("Multiplication Is "+multiply);
	}
}
