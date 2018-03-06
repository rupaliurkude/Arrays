package com.qa.Arrays;

public class CommanNumber 
{   int a[]={1,2,3,4,5,6,7,8};
	int b[]={2,5,8,4,13};
	int common_num;
	public void common_num()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j =0;j<b.length;j++)
			{
					if(a[i]==b[j])
					{
					common_num =a[i];
					System.out.print(common_num);
					}
			}
	
	
	}	}
	
public static void main(String[] args) {
	CommanNumber cn = new CommanNumber();
			cn.common_num();
	}

}
