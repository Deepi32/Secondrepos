import java.util.Scanner;


public class HeapSort {
	public void HSort(int ar[],int n)
	{
		for(int i=n/2-1;i>=0;i--)
			heapify(ar,n,i);
		//removal of elements
		for(int i=0;i<n;i++)
			System.out.print(ar[i]+" ");
		System.out.println();
		for(int i=n-1;i>=0;i--)
		{
			int temp=ar[0];
			ar[0]=ar[i];
			ar[i]=temp;
			heapify(ar,i,0);
		}
	}
	public void heapify(int ar[],int n,int i)
	{
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		if(left<n && ar[left]>ar[largest])
			largest=left;
		if(right<n && ar[right]>ar[largest])
			largest=right;
		if(largest!=i)
		{
			int temp=ar[largest];
			ar[largest]=ar[i];
			ar[i]=temp;
			heapify(ar,n,largest);
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
		HeapSort bs=new HeapSort();
		
		bs.HSort(ar,n);
		long endmilli = System.nanoTime();
		System.out.println("time taken===="+(endmilli-milliscur));
		for(int i=0;i<n;i++)
			System.out.print(ar[i]+" ");
			
	}

}
