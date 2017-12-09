import java.util.Scanner;


public class SelectionSort {
	void SSort(int ar[],int n)
	{
		int i,j,temp;
		for(i=0;i<n;i++)
		{
			int min_index=i;
			for(j=i+1;j<n;j++)
				if(ar[min_index]>ar[j])
					min_index=j;
			
			temp=ar[min_index];
			ar[i]=ar[min_index];
			ar[min_index]=temp;
			
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
		long milliscur = System.nanoTime();
		SelectionSort bs=new SelectionSort();
		
		bs.SSort(ar,n);
		long endmilli = System.nanoTime();
		System.out.println("time taken===="+(endmilli-milliscur));
		for(int i=0;i<n;i++)
			System.out.print(ar[i]+" ");
			
	}

}
