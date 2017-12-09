import java.util.Scanner;


public class MergeSort {
	void Merge(int ar[],int st,int mid,int end)
	{
		System.out.println("st="+st+"mid=="+mid+"end="+end);
		int n=mid-st;
		int n1=end-mid+1;
		int left[]=new int[n];
		int right[]=new int[n1];
		for(int i=0;i<n;i++)
			left[i]=ar[st+i];
		for(int i=0;i<n1;i++)
		{
			right[i]=ar[i+mid];
		}
		int i=0,j=0,k=st;
		while(i<n &&j<n1)
		{
			if(left[i]<right[j])
			{	ar[k]=left[i];
				i++;
			}
			else if(left[i]>right[j])
			{	ar[k]=right[j];
				j++;
			}
			else
			{
				System.out.print("inside equals");
				ar[k]=right[j];
				i++;j++;
			}
			k++;
		}
		while(i<n)
			ar[k++]=left[i++];
		while(j<n1)
			ar[k++]=right[j++];
		
		for(int i1=0;i1<=end;i1++)
			System.out.print(ar[i1]+" ");
		System.out.println();
		
	}
	public void MSort(int ar[],int st,int end)
	{
		if(st<end)
		{
			int mid=(st+end)/2;
			MSort(ar,st,mid);
			MSort(ar,mid+1,end);
		//	System.out.println();
		//	System.out.println(st+" "+mid+" "+end);
			Merge(ar,st,mid+1,end);
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
		MergeSort bs=new MergeSort();
		
		bs.MSort(ar,0,n-1);
		long endmilli = System.nanoTime();
		System.out.println("time taken===="+(endmilli-milliscur));
		for(int i=0;i<n;i++)
			System.out.print(ar[i]+" ");
			
	}

}
