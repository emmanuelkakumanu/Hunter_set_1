
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		
		List<Integer> b=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			if(i==a[i])
			{
				b.add(a[i]);
			}
		}
		Collections.sort(b);
		System.out.print(b.get(0));
		for(int i=1;i<b.size();i++)
		System.out.print(" "+b.get(i));
	}
}
