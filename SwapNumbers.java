package com.qa.Arrays;

public class SwapNumbers 
{	
	int a[] = {1,2,5,4,6};
	int index1=1;
	int index2=2;
	int pre_num =a[0];
public void Swap(){
		for(int i=0;i<a.length;i++){
			if(a[i]<pre_num){
				pre_num=a[i];
				index1=i;
				break;
			}
			pre_num =a[i];
		}
		for(int j =0;j<a.length;j++){
		
			if(index1<a[j]){
				index2=j;
				break;
			}
			
		}
		int temp = a[index1];
		a[index1]=a[index2];
		a[index2]=temp;
		for(int i=0;i<a.length;i++){
		System.out.print(a[i]);
	}
		
}	
	public static void main(String[] args) 
	{
		SwapNumbers s = new SwapNumbers ();
		s.Swap();
	}

}
