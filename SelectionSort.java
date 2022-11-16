
public class SelectionSort {

	public static void main(String[] args) {
		int[] a= {8,7,5,11,6,2,3,4};
		
		for(int i=0;i<a.length;i++)
		{
			int smallest =i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[smallest] > a[j])
				{
					smallest = j;
				}
			}
			int temp = a[smallest];
			a[smallest] = a[i];
			a[i]=temp;
			System.out.print(" "+a[i]+" ");
		}
		
		}
		}

