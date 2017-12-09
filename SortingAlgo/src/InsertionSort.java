import java.util.Scanner;


public class InsertionSort {
	public void QSort(int ar[],int n)
	{
		int i,j,temp;
		for(i=1;i<n;i++)
		{
			j=i-1;
			int key=ar[i];
			while(j>=0 && ar[j]>key)
			{
				ar[j+1]=ar[j];
				j=j-1;
			}
			ar[j+1]=key;
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
		InsertionSort bs=new InsertionSort();
		bs.QSort(ar,n);
		long endmilli = System.nanoTime();
		System.out.println("time taken===="+(endmilli-milliscur));
		for(int i=0;i<n;i++)
			System.out.print(ar[i]+" ");
		
	}
}
