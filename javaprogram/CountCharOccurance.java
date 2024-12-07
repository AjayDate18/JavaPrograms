package javaprogram;

public class CountCharOccurance 
{
	public static void main(String[] args) 
	{
		String s="Java Programming";
		int total_count=s.length();
		int total_count_after_remove=s.replaceAll("a", "").length();
		int count=total_count-total_count_after_remove;
		
		System.out.println("Number of Occurance of a is "+count);
	}
}
