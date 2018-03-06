package com.qa.Arrays;

public class linearSearch 
{ // looking for linear search number of times and at what index?
	int a[] ={1,2,3,3,4,5,6};
	int count;
	boolean b= false;
	int position =-1;
	public void lSearch(int n)
	{
		for(int i =0;i<a.length;i++)
		{
			
			if(a[i]==n)
			{
				b=true;
				position =i;
				count = count +1;	
			}
		}
			if(b==true)
			{
				System.out.println("number:"+n+" was found"+ count+" time(s)"+"index position"+ position);

			}
			else
			{
				System.out.println("Number not present");
			}
		}

	
	public static void main(String[] args)
	{
		linearSearch ls = new linearSearch ();
				ls.lSearch(3);
	}

}
