import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    String str = sc.next();
		    int ans = 0;
		  
    		  for(int i = 0; i < n ; i++)
    		  {
    		      if(str.charAt(i) != '0')
    		      {
    		          ans++;
    		      }
    		      
    		      else
    		      {
    		          break;
    		      }
 
    		  }
    		    System.out.println(ans);
		}
	}
}
