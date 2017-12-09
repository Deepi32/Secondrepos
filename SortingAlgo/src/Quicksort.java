
public class Quicksort {
	public static int findpivot(int ar[],int st,int end)
	{
		int j=st-1,temp;
		int pivot=ar[end];
		for(int i=st;i<end;i++)
		{
			if(ar[i]<=pivot)
			{
				j++;
				temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
		temp=ar[j+1];
		ar[j+1]=ar[end];
		ar[end]=temp;
		return j+1;
	}
	public static void quicksort(int ar[],int st,int end)
	{
		if(st<end){
		int pi=findpivot(ar,st,end);
		System.out.println("pi==="+pi);
		quicksort(ar,st,pi-1);
		quicksort(ar,pi+1,end);
		}
	}
	public static void main(String args[])
	{
		int ar[]={10, 7, 8, 9, 1, 5};
		quicksort(ar,0,ar.length-1);
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");
	}
}
