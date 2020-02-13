package basics;

public class fibbinoloop {
	public static void main(String arug[])
	{
		
		int i=0;
		int a=0;
		int b=1;
		int sum=0;
		while(i<=10)
		{
			
	   int c=a+b;
	  
	  a=b;
	  b=c;
	  i++;
	 sum=sum+c;
		}
		System.out.println(sum);
		
	}
}

