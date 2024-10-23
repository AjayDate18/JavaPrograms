package logicalProgram;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		//In Fibonaci Series next number is sum of previous two numbers
		//Ex-0,1,1,2,3,5,8,13,21,34,55,89
		int a=-1;
		int b=1;
		int c;
		for(int i=1;i<=10;i++)
		{
			c=a+b;
			System.out.println(" "+c);  //0,1,1,2,3,5,8,13,21,34
			a=b;  //1,0,1,1,2,3,5,8,13
			b=c;  //0,1,1,2,3,5,8,13,21
			
			
			
		}
		
	}
}
