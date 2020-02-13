package Superclass;

public class Demo {
	public static void main(String args[])
	{
		A a=new A(10);
		a.add();
		B b=new B(20);
		b.add();
		b.sub();
		C c=new C(30);
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(b.a);
		
		
	}

}
