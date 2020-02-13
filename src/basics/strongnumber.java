package basics;

public class strongnumber {

	public static void main(String[] args) 
	{
		int a=145;
		int n;
		int sum=0;
		int b=a;
		while(a>0)
		{
			n=a%10;
			a=a/10;
			int fac=1;
			int i=1;
			while(i<=n)
			{
				fac *=i;
				i++;
			}
			sum=sum+fac;
			
		}
//		System.out.println(fac);
		if(b==sum)
		{
			System.out.println("strong");
		}
		else
		{
			System.out.println("not");
		}
		
	/*	int i=1;
		i=5;
		System.out.println(i);*/
	}
}
		


