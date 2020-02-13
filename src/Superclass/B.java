package Superclass;

public class B extends A
{
int b=20;
void sub()
{
	a++;
	b++;
	
}
  B(int a)
  {
	super(a++);
	b=a;// TODO Auto-generated constructor stub
	}

}
