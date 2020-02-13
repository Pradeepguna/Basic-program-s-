package basics;
public class neonnumber 
{
public static void main(String arug[])
{
	int a=11,sum=0,n=0,c;
	c=a*a;
	while(a>0)
	{
		n=a%10;
		sum=sum+n;
		a=a/10;
	}
		
	if (sum==a)
	{
		System.out.println("Neon number");
	}
	else 
	{
		System.out.println("Not a neon numner");
		
			
	}
}
}
