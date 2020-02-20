package basics;

public class noofdigits {
	public static void main(String args[])
	{
		int a=52579827;
		int b=0,n;
		while(a>0)
		{
			n=a%10;
			System.out.print(n);
			a=a/10;
			b++;
			
		}
		System.out.println();
		System.out.println(b +" no of digit");

	}

}
