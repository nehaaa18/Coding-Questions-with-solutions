/******************************************************************************

                           Count the number of subset with a given difference

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		int arr[]={1,1,2,3};
		int diff=1;
		int sum=0;
		for (int i=0;i<arr.length;i++)
		{
		    sum+=arr[i];
		}
		int sum1= ((diff+sum)/2);
		if (sum1%2==0)
		{
		    int r=sum1/2;
		    
		    	System.out.println("The Count of Number Of Subset with a given Difference is : "+ (sumExists(arr,r,arr.length)+1));
		    
		}
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
