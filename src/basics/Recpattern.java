package basics;

public class Recpattern {

	public static void main(String[] args) {
Recpattern pat=new Recpattern();
pat.numbers(1);
	}

	private int numbers(int i) {
		if(i>9)
		{
		return 1;	
		}
		if(i%3==1)
		{
		System.out.println();
		}
		System.out.print(i);
		int b=numbers(i+1);
		return b;
	
	}
}
