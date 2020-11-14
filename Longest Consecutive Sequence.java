/******************************************************************************

                       Longest Consecutive Sequence
                       i/p: 5
                            1 2 3 7 8
                            
                        o/p:1 1 2 3
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
		
		HashMap <Integer,Boolean> hm=new HashMap<>();
		for (int i:arr)
		{
		    hm.put(i,true);
		}
		for (int i:arr)
		{
		    if (hm.containsKey(i-1))
		    {
		        hm.put(i,false);
		    }
		    
		}
		int mst=0;
		int ml=0;
		for (int i:arr)
		{
		    if (hm.get(i)==true)
		    {
		        int t1=1;
		        int tsp=i;
		        while (hm.containsKey(tsp+t1))
		        {
		            t1++;
		        }
		        if (t1>ml)
		        {
		            mst=tsp;
		            ml=t1;
		        }
		    }
		}
		for (int i=0;i<ml;i++)
		{
		    System.out.println(mst+i);
		}
		
	}
}