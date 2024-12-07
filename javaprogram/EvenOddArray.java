package javaprogram;

public class EvenOddArray 
{
	public static void main(String[] args) 
	{
	   int a[]= {1,2,3,4,5,6,7};
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]%2==0)
			   System.out.print(a[i]+" ");
	   }
	   System.out.println();
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]%2!=0)
			   System.out.print(a[i]+" ");
	   }
	   System.out.println();
	   //By Using Enhanced For Loop
	   int b[]= {1,2,3,4,5,6,7,8,9,10};
	   for(int even:b)
	   {
		   if(even%2==0)
			   System.out.print(even+" ");
	   }	   
	}
}
