
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);boolean st=true;
		int n=s.nextInt();
		int m=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[m];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		
		for(int i=0;i<m;i++)
		b[i]=s.nextInt();
		
		
		HashSet<Integer> hset= new HashSet<>(); 
		for(int i = 0; i < n; i++) 
        { 
            if(!hset.contains(a[i])) 
                hset.add(a[i]); 
        } 
        
        for(int i = 0; i < m; i++) 
        { 
            if(!hset.contains(b[i])) 
            {
                st=false; break;
            }
        } 
        if(st)
        System.out.print("YES");
        else
        System.out.print("NO");
        
	}
}
