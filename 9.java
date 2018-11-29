
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
		int ml=0,mr=1,ms=a[0]+a[1],sum=0;;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				sum=a[i]+a[j];
				if(Math.abs(ms)>Math.abs(sum))
				{
					ms=sum;
					ml=i;mr=j;
				}
			}
		}
		System.out.print(a[ml]+" "+a[mr]);
	}
}
