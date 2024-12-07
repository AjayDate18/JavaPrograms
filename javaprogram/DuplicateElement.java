package javaprogram;

public class DuplicateElement 
{
	public static void main(String[] args) 
	{
	  String arr[]= {"Java","C","C++","Python","JAva",".NET","Ruby"};
	  boolean flag=false;
	  for(int i=0;i<arr.length;i++)
	  {
		  for(int j=i+1;j<arr.length;j++)
		  {
			  if(arr[i]==arr[j])
			  {	  
				  flag=true;
				  System.out.println("Find Duplicate Element");
			  }	  
			  
		  }	
		  
			  
	    }
	    if(flag==false)
	    	System.out.println("No Duplicate Found");
	}
}
