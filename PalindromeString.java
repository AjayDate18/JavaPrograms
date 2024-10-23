package logicalProgram;

public class PalindromeString 
{
	public static void main(String args[])
	{
		
		String str="TsT";
		int len=str.length();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}	
		System.out.println(rev);
		
		if(str.equals(rev))
		{
			System.out.println("Palindrome String");
		}	
		else
		{
			System.out.println("Not Palindrome String");
		}	
		
		StringBuffer sb=new StringBuffer("Welcome");
		System.out.println("Reverse Of String is "+sb.reverse());
		
		StringBuilder sbd=new StringBuilder("WelcomeTo");
		System.out.println("Reverse Of String is "+sbd.reverse());
				
	}
	
}
