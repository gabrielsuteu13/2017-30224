/* cel mai mare palindrom care este produs a 2 numere de 3 cifre
 */

public class MyClassprob3 
	{

	public static int palindrom(long n)
		{
			long oglindit=0;
			long ultimacifra;
			long copie=n;
			while(n!=0)
				{	
					ultimacifra=n%10;
					oglindit=oglindit*10+ultimacifra;
					n=n/10;
				}
			if(copie==oglindit)
				return 1;
			return 0;
		}



	public static void main(String[] args)
		{
			long i,j;
			long max=0,memorare1=0,memorare2=0;
			
			for(i=999; i>=100; i--)
				for(j=i; j>=100; j--)
					if(palindrom(i*j)==1)
						{
							
							if(i*j>=max)
								{
									max=i*j;
									memorare1=i;
									memorare2=j;
								}
						
						}
					
			System.out.println(max+"="+memorare1+"*"+memorare2);	
		}
	}
