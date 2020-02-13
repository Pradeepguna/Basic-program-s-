package basics;

public class noofdigits {
	public static void main(String args[])
	{
		int a=52579827;
		int b=0,n;
		while(a>0)
		{
			n=a%10;
			a=a/10;
			b++;
		}
		System.out.println(b);

	}

}
