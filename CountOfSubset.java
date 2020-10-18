/*CountOfSubset*/
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int arr[]={2,3,5,6,8,10};
		int n=arr.length;
		int sum=10;
		int res=sumExists(arr,sum,n);
		System.out.println("Count of subsets which will give the given sum= "+res);
		
	}
	static int sumExists(int arr[], int sum,int n)
	{
	    if (n==0)
	    {
	        return 0;
	    }
	    int mat[][]=new int[n+1][sum+1];
	    for (int i=0;i<n;i++)
	    {
	        mat[i][0]=1;
	    }
	    for (int j=0;j<=sum;j++)
	    {
	        if (j==arr[0])
	        {
	            mat[0][j]=0;
	        }
	    }
	    for (int i=1;i<=n;i++)
	    {
	        for (int j=1;j<=sum;j++)
	        {
	            if (arr[i-1]<=j)
	            {
	                mat[i][j]=(mat[i-1][j] + mat[i-1][j-arr[i-1]]);
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
