package Programs38;

public class Primenumber {

	public static void main(String[] args) {
		Primenumber prime = new Primenumber();
		prime.primenum();
	}

	private void primenum() {
		int no = 3;
		int div = 3;
		int count = 1;

		boolean check = true;
		while (count < 20) {
			if (no % 2 != 0) {
				while (div < no) {
					if (no % div == 0) {
						System.out.println("not prime");
						check = false;
						break;
					}
					div = div + 2;
				}
				
			}
			if (check == true) {
				System.out.println(no + "is a prime");
				count++;
			}
			no = no + 2;

			//else {
				//System.out.println("not prime");

		//	}
		}

	}
}

