package basics;

public class ReverseRecursive {

	public static void main(String[] args) {
	ReverseRecursive rev=new ReverseRecursive();
	rev.print();
	System.out.println(sum);
	}
static int a=743;
static int sum=0;
static int i;
	private static void print()
	{
		while(a>0)
		{
			i=a%10;
			sum=sum*10+i;
			a=a/10;
			print();
			
		}
	
	}

}
