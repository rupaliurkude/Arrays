package com.qa.Arrays;

public class Missing_num 
{		
		int a[] ={1,4,20};
		int pre_num =a[0];
		public void missing_Num()
		{
			for(int i=1;i<a.length;i++)
			{
				while((pre_num+1)!= a[i])
				{
					System.out.print(pre_num+1);
					pre_num = pre_num+1;
				}
				pre_num =a[i];
			}		
		}
	public static void main(String[] args) 
	{
		Missing_num m = new Missing_num();
			m.missing_Num();
	}

}
