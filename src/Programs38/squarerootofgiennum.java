package Programs38;

public class squarerootofgiennum {

	public static void main(String[] args) {

		int n = 121;
		int div = 2;
		while (div < n) {
			if (n / div == div) {
				System.out.println(div + " sqr ");
				break;
			}
			div++;
		}
	}

}
