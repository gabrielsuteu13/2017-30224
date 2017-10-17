/* suma numerelor naturale mai mici decat 1000
   divizibile cu 3 sau 5
 */



package assigment1_prob1;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args)
		{
			long s=0;
			int i;
			Scanner in= new Scanner(System.in);
			int n= in.nextInt();
			
			for(i=1;i<=n-1;i++)
				if(i%3==0 || i%5==0)  
					s=s+i;
			
			System.out.println("Suma este "+s);
		}

}
