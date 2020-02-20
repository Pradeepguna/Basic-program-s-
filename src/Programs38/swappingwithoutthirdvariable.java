package Programs38;

public class swappingwithoutthirdvariable {
	public static void main(String args[])
	{
		swappingwithoutthirdvariable pb=new swappingwithoutthirdvariable();
		pb.excersice();
	}

	private void excersice() {
	int a=5;
	int b=10;
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
	}

}
