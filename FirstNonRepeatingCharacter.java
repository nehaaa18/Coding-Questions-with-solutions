/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java .util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		HashMap <Character,Integer> hm=new HashMap<>();
		for (char ch:str.toCharArray())
		{
		    hm.put(ch,hm.getOrDefault(ch,0)+1);
		}
		for (int i=0;i<str.length();i++)
		{
		    char ch=str.charAt(i);
		    if (hm.get(ch)==1)
		    {
		       System.out.println(ch);
		    }
		}
		
	}
}