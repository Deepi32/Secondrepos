import java.util.Scanner;


public class KLargestElement {
	public void Heapsort(int ar[],int n,int k)
	{
		for(int i=n/2-1;i>=0;i--)
			heapifyK(ar,n,i);
		//removal of elements
		for(int i=0;i<n;i++)
			System.out.print(ar[i]+" ");
		System.out.println();
		for(int i=n-1;i>=n-k;i--)
		{
			int temp=ar[0];
			ar[0]=ar[i];
			ar[i]=temp;
			heapifyK(ar,i,0);
		}
	}
	public void heapifyK(int ar[],int n,int i)
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
			heapifyK(ar,n,largest);
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
		int k=sc.nextInt();
		long milliscur = System.nanoTime();
		KLargestElement bs=new KLargestElement();
		
		bs.Heapsort(ar,n,k);
		long endmilli = System.nanoTime();
		System.out.println("time taken===="+(endmilli-milliscur));
		System.out.println(ar[n-k]);
			
	}

}
