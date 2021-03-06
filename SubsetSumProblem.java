/* Program to print subset sum*/

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int arr[]={2,3,7,8,10};
		int n=arr.length;
		int sum=11;
		boolean res=sumExists(arr,sum,n);
		if (res)
		{
		    System.out.println("Sum Exists");
		}
		else {
		    System.out.println("Sum Does Not Exists");
		}
		
	}
	static boolean sumExists(int arr[], int sum,int n)
	{
	    if (n==0)
	    {
	        return false;
	    }
	    boolean mat[][]=new boolean[n+1][sum+1];
	    for (int i=0;i<n;i++)
	    {
	        mat[i][0]=true;
	    }
	    for (int j=0;j<=sum;j++)
	    {
	        if (j==arr[0])
	        {
	            mat[0][j]=false;
	        }
	    }
	    for (int i=1;i<=n;i++)
	    {
	        for (int j=1;j<=sum;j++)
	        {
	            if (arr[i-1]<=j)
	            {
	                mat[i][j]=mat[i-1][j] || mat[i-1][j-arr[i-1]];
	            }
	            else 
	            {
	                mat[i][j]=mat[i-1][j];
	            }
	        }
	    }
	    return mat[n-1][sum];
	}
}
