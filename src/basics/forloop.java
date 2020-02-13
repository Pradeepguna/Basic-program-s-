package basics;

public class forloop 
    {

	public static void main(String[] args) 
	{
		
		int a=367,n;
		int sum=0;
		int b=a;
		while(a>0)
    {
			n=a%10;
			System.out.println(n);
			a=a/10;
			sum=sum*10+n;
		}
		System.out.println(sum);
	

      if(b==sum)
 {
	 System.out.println("palindrom");
 }
	 else 
	 {
		 System.out.println("nonpalindrom");
	}
            }
    
}