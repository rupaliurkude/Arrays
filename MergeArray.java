package com.qa.Arrays;

public class MergeArray 
{
	int a []={1,2,3,4,5,6};
	int b []= {2,4,5,6,7,8,10};
	int c [] = new int [a.length+b.length];
	int k =0;
	public void Merging()
	{
		for(int i=0,j=0;(i<a.length||j<b.length);)
		{
			if((i>=a.length)&&(j<b.length))
			{
				c[k++]=b[j++];
				continue;
			}	
			if((j>=b.length)&&(i<a.length))
			{
				c[k++]=a[i++];
				continue;
			}
			if(a[i]<b[j])
			{
				c[k++]=a[i++];
			} else {
				c[k++]=b[j++];
			}
		}
		for(k=1;k<c.length;k++)
		{
			System.out.print(c[k]);
		}
	}
	public static void main(String[] args) 
	{
		 MergeArray m = new  MergeArray ();
		 m.Merging();
	}

}
