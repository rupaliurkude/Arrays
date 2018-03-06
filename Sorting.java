package com.qa.Arrays;

public class Sorting 
{
	int a[]={1,-3,4,5,-20,21,100};
	int min=0;
	int minIndex;
	public void Sort()
	{
		for(int i=0;i<a.length;i++)
		{
					min=a[i];
					minIndex=i;
					for(int j =i;j<a.length;j++)
					{
						if(a[j]<min)
						{
							min =a[j];
							minIndex=j;
						}
					}
			int temp =a[i];
			a[i]=a[minIndex];
			a[minIndex]=temp;
				
			System.out.print(","+a[i]);
		}		
	}	
			
	
	public static void main(String[] args) 
	{
		Sorting s = new Sorting();
			s.Sort();
	}

}
