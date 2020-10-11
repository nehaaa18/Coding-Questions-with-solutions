/* to find minimum number of platforms required at any given time */




import java.util.Scanner;
import java .util.Arrays;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int dep[]=new int[n];
		for (int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		//int dep[]new int[n];
		for (int i=0;i<n;i++)
		{
		    dep[i]=sc.nextInt();
		}
		Arrays.sort(dep);
		int a=1,b=0;
		int result=1,plat=1;
		while (a<n && b<n)
		{
		    if (arr[a]<=dep[b])
		    {
		        plat++;
		        a++;
		        if (plat>result)
		        {
		            result=plat;
		        }
		    }
		    else {
		        plat--;
		        b++;
		    }
		}
		System.out.println(result);
		
	}
}

