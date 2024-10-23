package logicalProgram;

public class PerfectNumber 
{
	public static void main(String args[])
	{
		int number=6;
		int sum=0;
		
//Perfect number-->6= 1,2,3,4,5---->1,2,3 Divisible-->sum--->1+2+3=6
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
			{
				sum=sum+i;
			}	
		}	
		System.out.println(sum);
		if(sum==number)
		{
			System.out.println("Perfect Number");
		}	
		else
		{
			System.out.println("Not Perfect Number");
		}	
	}
}
