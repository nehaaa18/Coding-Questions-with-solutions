/******************************************************************************

                            Graph Implementation

*******************************************************************************/
import java.util.*;
public class Main
{
    	private LinkedList <Integer> adj[];
		Main(int v)
		{
		    adj=new LinkedList[v];
		    for (int i=0;i<n;i++)
		    {
		        adj[i]=new LinkedList<Integer>();
		    }
		}
		public static void addEdge(int source,int destination)
		{
		    adj[source].add[destination];
		    adj[destination].add[source];
		    
		}
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		System.out.prinln("Enter Number of Vertices");
		int v=sc.nextInt();
		System.out.prinln("Enter Number of Edges");
		int e=sc.nextInt();
		Graph obj=new Graph(v);
		for (int i=0;i<e;i++)
		{
		    int src=sc.nextInt();
		    int des=sc.nextInt();
		    obj.addEdge(src,des);
		}
		
	
	}
}
