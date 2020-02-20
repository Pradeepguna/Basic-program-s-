package Programs38;

public class reverseanumaandpalindrom {

	public static void main(String[] args) {

int a=1995;
int rev=0;
while(a>0)
{
	int rem=a%10;
	rev=(rev*10)+rem;
	a=a/10;
	
}
System.out.println(rev);
if(a==rev)
{
	System.out.println("Palindrom");
	
}else
{
	System.out.println("not a palindrom");
}
	}

}
