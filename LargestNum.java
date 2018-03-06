package com.qa.Arrays;

public class LargestNum 
{
	int []a ={1,30,40,100,400};
	int max =a[0];
	public  void Max_nub()
	{
		for(int i =0;i< a.length;i++)
		{
			if(i<a[i])
			{
				max=a[i];
			}
		}
	System.out.println("Max Number:"+max);
	}
public static void main(String[]arg)
{
	LargestNum ln = new LargestNum ();
	ln.Max_nub();
}

}
