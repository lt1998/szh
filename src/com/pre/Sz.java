package com.pre;

public class Sz 
{
	  public static void main(String[] args)
	  {
          int []a= {1,2,3,4,-5,5,6,-5};
          maxSubArry(a);

     }
	  public static void maxSubArry(int []a )
	  {
		int start=0;//数组的起始下标
		int end=0;//数组的最后元素的下标
		int leng=0;//子数组的长度
		int add=0;
		Integer sum=null;
		while(leng<=a.length)
        {
	     for(int i=0;i<(a.length-leng);i++)
	     {
	    	for(int j=i;j<(i+leng-1);j++)
	    	{
	    		add+=a[j];
	    	}
	    	if(sum==null||sum<add)
	    	{
	    		sum=add;
	    		start=i;
	    		end=i+leng-1;
	    	}
	     }
	     leng++;
        }
		System.out.println("和为最大值的子数组的元素为：");
		for(int k=start;k<=end;k++)
		{
			System.out.println(a[k]+""+",");
		}
		System.out.println("和为"+sum);
	  }
}	  
	  
	  