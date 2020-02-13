package basics;

public class Reversrevur {

	public static void main(String[] args) {

		
	Reversrevur num=new Reversrevur();
	num.number(5);
		}

		private int number(int i) {
			if(i<1)
			{
				return 1;
				
			}
			System.out.println(i);
			int k=number(i-1);
			return k;
			}
		
		

	}


