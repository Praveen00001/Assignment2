
public class Subset {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8};
		int[] b = {3,6,8};
		int i,j;
		boolean flag=false;
		int m=a.length;
		int n=b.length;
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				if (b[i]==a[j]) 	
			    break;		
			}	
		if (j==m)
		{
		System.out.print("a[] is not subset of b[]");
		flag=true;
		}
		}
		if(flag==false)
		{
		System.out.print("a[] is subset of b[]");
	    }
 }
 }

