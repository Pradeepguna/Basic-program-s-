package basics;

public class fibbioncciseries {
	public static void main(String arug[])
	{
	int n1=0;
	int n2=1;
	int i=1;
	System.out.println(n1);
System.out.println(n2);
while(i<20)
{
	System.out.println(n1+n2);
	int n3=n1+n2;
	n1=n2;
	n2=n3;
	i++;
	}
}
}

