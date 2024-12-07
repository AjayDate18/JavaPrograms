package javaprogram;

public class RemoveJunk 
{
	public static void main(String[] args)
	{
		String s="Java?#$7876@@@%%Program#&";
		String s1=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println("String is : "+s1);
	}
}
