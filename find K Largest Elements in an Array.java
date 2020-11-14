/******************************************************************************

                       find K Largest Elements in an Array
                       i/p: 2 10 5 17 4 10 45
                            k=2
                            
                        o/p:45 17
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
		for (int i=0;i<n1;i++)
		{
		    if (i<k)
		    {
		        pq.add(arr[i]);
		    }
		    else 
		    {
		        if (arr[i]>pq.peek())
		        {
		            pq.remove();
		            pq.add(arr[i]);
		        }
		    }
		}
		while (pq.size()>0)
		{
		    System.out.println(pq.remove());
		}
	}
}