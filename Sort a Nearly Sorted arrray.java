/******************************************************************************

                       Sort a Nearly Sorted arrray
                       i/p: 9
                            2 3 1 4 7 5 8 9
                            k=2
                            
                        o/p:1 2 3 4 5 7 8 9
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int arr[]=new int[n1];
		for (int i=0;i<n1;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		PriorityQueue <Integer> pq=new PriorityQueue <>();
		for (int i=0;i<=k;i++)
		    {    pq.add(arr[i]);
		    }
		    for (int i=k+1;i<n1;i++)
		    {
		        System.out.println(pq.remove());
		        pq.add(arr[i]);
		    }
		    while (pq.size()>0)
		    {
		        System.out.println(pq.remove());
		    }
	}
}
		    