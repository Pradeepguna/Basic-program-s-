package basics;

public class Tablesrecursive {

	public static void main(String[] args) {
		Tablesrecursive tables=new Tablesrecursive();
		tables.sixth();
		
 
}
	int i=1,m,n=6;
	private void sixth() {
	

		m=n*i;
		if(i<=10)
		{
			System.out.println(m);
			
			i++;
			sixth();
		}
		// TODO Auto-generated method stub
		
	}
}