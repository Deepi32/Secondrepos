import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class BucketSort {
	public void BSort(int ar[],int n)
	{
		int code[]=hash(ar);
		List buckets[]=new List[code[1]];
		for(int i=0;i<buckets.length;i++)
		{
			buckets[i]=new ArrayList();
		}
		for(int i=0;i<ar.length;i++)
		buckets[hash(code,ar[i])].add(Integer.valueOf(ar[i]));
		for(int i=0;i<buckets.length;i++)
			Collections.sort(buckets[i]);
		int k=0;
		for(int i=0;i<buckets.length;i++)
		{
			Iterator itr=buckets[i].iterator();
			while(itr.hasNext())
			{
				Integer a=(Integer) itr.next();
				ar[k++]=a.intValue();
			}
		}
		
	}
	int hash(int code[],int number)
	{
		return (number/code[0]*(code[1]-1));
	}
	int[] hash(int ar[])
	{
		int largest=ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(largest<ar[i])
				largest=ar[i];
		}
		return (new int[]{largest,(int) Math.sqrt(ar.length)});
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=sc.nextInt();
		long milliscur = System.nanoTime();
		BucketSort bs=new BucketSort();
		
		bs.BSort(ar,n);
		long endmilli = System.nanoTime();
		System.out.println("time taken===="+(endmilli-milliscur));
		for(int i=0;i<n;i++)
			System.out.print(ar[i]+" ");
			
	}

}
