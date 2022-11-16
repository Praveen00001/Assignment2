import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] ar = {1,2,3,4,5,6,7,8,9,10}; 
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the key to be searched");
		int key=scan.nextInt();
		int low=0;
		int high=ar.length-1;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==ar[mid])
			{
				System.out.println("key "+key+ " Found at index "+ mid);
				break;
			}
			else if(key <ar[mid])
			{
				high = mid-1;
			}
			else if(key >ar[mid])
			{
				low = mid+1;
			}
		}
		if(low>high)
		{
			System.out.println("key not found");
		}
	}
	}

