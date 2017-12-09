import java.util.Scanner;


public class BubbleSort {
	
	void BSort(int ar[],int n)
	{
		int i,j,temp;
		for(i=0;i<n;i++)
		{
			for(j=0;j<(n-i-1);j++)
			{
				if(ar[j]>ar[j+1])
				{
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
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
		BubbleSort bs=new BubbleSort();
		
		bs.BSort(ar,n);
		long endmilli = System.nanoTime();
		System.out.println("time taken===="+(endmilli-milliscur));
		for(int i=0;i<n;i++)
			System.out.print(ar[i]+" ");
			
	}
}
