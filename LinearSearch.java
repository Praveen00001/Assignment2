import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] ar= {20,30,50,10,60,90,100}; 
	    int x=10;
		Scanner a=new Scanner(System.in);
		System.out.println("Select the number to be searched");
		int key= a.nextInt();
		
		for (int i=0;i<ar.length-1;i++)
		{
			if (key==ar[i])
			{
				System.out.print("Key "+ key + " found at index "+ i);
				 x=11;
				break;
			}	
		}
		if (x==10)
		{
			System.out.print("Key not found");
		}

	}
}


