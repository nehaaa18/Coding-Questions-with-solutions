/******************************************************************************

                           word break problem
                          
                           

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		//System.out.println("Hello World");
		int n=sc.nextInt();
		HashSet <String> dict=new HashSet <>();
		for (int i=0;i<n;i++)
		{
		    dict.add(sc.next());
		}
		String sentence= sc.next();
		wordBreak(sentence," ",dict);
		
	}
	public static void wordBreak(String sentence,String ans,HashSet <String> dict)
	{
	    if (sentence.length()==0)
	    {
	        System.out.println(ans);
	        return;
	    }
	    for (int i=0;i<sentence.length();i++)
	    {
	        String left=sentence.substring(0,i+1);
	        if (dict.contains (left))
	        {
	            String right=sentence.substring(i+1);
	            wordBreak(right,ans+left+" ",dict);
	        }
	    }
	}
}
