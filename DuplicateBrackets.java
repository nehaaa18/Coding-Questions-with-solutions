import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int l =s.length();
		Stack <Character> st=new Stack<>();
		for (int i=0;i<l;i++)
		{
		    char ch=s.charAt(i);
		    if (ch==')')
		    {
		        if (st.peek()=='(')
		        {
		            System.out.println(true);
		            return;
		        }
		        else 
		        {
		            while (st.peek()!='(')
		            {
		                st.pop();
		                
		            }
		            st.pop();
		            
		        }
		        
		    }
		    else 
		    {
		        st.push(ch);
		    }
		}
		System.out.println(false);
	}
}
