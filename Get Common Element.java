/******************************************************************************

                       Get Common Element
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int arr[]=new int[n1];
		int arr2[]=new int[n1];
		for (int i=0;i<n1;i++)
		{
		    arr[i]=sc.nextInt();
		}
		for (int i=0;i<n1;i++)
		{
		    arr2[i]=sc.nextInt();
		}
		HashMap <Integer,Integer> hm=new HashMap<>();
		for (int i:arr)
		{
		    if (hm.containsKey(i))
		    {
		        int ov=hm.get(i);
		        int nw=ov+1;
		        hm.put(i,nw);
		    }
		    else {
		        hm.put(i,1);
		    }
		}
		for (int i:arr2)
		{
		    if (hm.containsKey(i))
		    {
		        System.out.println(i);
		        hm.remove(i);
		    }
		}
	}
}
