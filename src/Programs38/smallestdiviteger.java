package Programs38;

public class smallestdiviteger {

	public static void main(String[] args) {

int no=1997;
int div=2;
while(div<=no)
{
	if(no%div==0)
	{
		System.out.println(div);
		break;
	}
	div++;
}
	}

}
