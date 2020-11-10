/******************************************************************************

                            Permutations of given string
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		String str="ABC";
		int l=str.length();
		permute(str," ");
	}
	public static void permute (String str, String ans)
	{
	    if (str.length()==0)
	    {
	        System.out.println(ans);
	        return;
	    }
	    for (int i=0;i<str.length();i++)
	    {
	        char ch=str.charAt(i);
	        String s=str.substring(0,i)+str.substring(i+1);
	        permute(s, ans+ch);
	    }
	}
}
