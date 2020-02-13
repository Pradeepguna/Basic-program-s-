package basics;

public class spynumber {

	public static void main(String[] args)
	{
		int a=1214;
		int sum=1,n;
		int c=0;
		while(a>0)
		{
			n=a%10;
			sum *=n;
			a=a/10;
			c=c+n;
		}
		if(sum==c)
		{
			System.out.println("Spy number");
		}
		else
		{
			System.out.println("Not a Spy number");
		}
	}

}
