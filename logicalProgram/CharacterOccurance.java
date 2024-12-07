package logicalProgram;

public class CharacterOccurance 
{
	public static void main(String args[])
	{
		String name="Ranjeete";
		char ch='e';
		int count =0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)==ch)
			{
				count++;
			}	
		}	
		System.out.println("Char Occurance of "+ch+" is-->"+count);
	}
}
