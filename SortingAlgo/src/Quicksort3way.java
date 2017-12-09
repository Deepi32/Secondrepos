
public class Quicksort3way {
	static int i,j;
	public static void partition(int ar[],int st,int end)
	{
		
		
		if(end-st<=1)
		{
			if(ar[st]>ar[end])
			{
				int temp=ar[st];
				ar[st]=ar[end];
				ar[end]=temp;
				
			}
			i=st;
			j=end;
			return;
		}
		int pivot=ar[end];
		int i1=st;
		while(i1<=end)
		{
	//		System.out.println("i1=="+i1+"end==="+end);
			if(ar[i1]<pivot)
			{//swaping
				int temp=ar[st];
				ar[st++]=ar[i1];
				ar[i1++]=temp;
			}
			else if(ar[i1]==pivot)
			i1++;
			else if(ar[i1]>pivot)
			{//swap end with i1
				int temp=ar[i1];
				ar[i1]=ar[end];
				ar[end--]=temp;
			}
		}
		i=st-1;
		j=i1;
	}
	public static void quicksort1(int ar[],int st,int end)
	{
		if(st>=end)
		 return;
		i=0;j=0;
			partition(ar,st,end);
			System.out.println("in quicksort st="+st+" i="+i+"j=="+j+"end=="+end);
			quicksort1(ar,st,i);
			quicksort1(ar,j,end);
		
	}
	public static void main(String args[])
	{
		int ar[] = {4, 9, 4, 4, 1, 9, 4, 4, 9, 4, 4, 1, 4};
		quicksort1(ar,0,ar.length-1);
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");
	}
}
