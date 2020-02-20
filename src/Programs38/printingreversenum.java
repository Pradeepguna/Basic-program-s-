package Programs38;

public class printingreversenum {

	public static void main(String[] args) {
int n=567890;
int rem;
while(n>0)
{
	rem=n%1000;
	System.out.println(rem);
	n=n/1000;
}
	}

}
