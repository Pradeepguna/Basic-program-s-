package Programs38;

public class sumofdigits {

	public static void main(String[] args) {
int a=1234;
int b=0;
while(a>0)
{
	int rem=a%10;
	b=b+rem;
	a=a/10;
}
System.out.println(b);
	}

}
