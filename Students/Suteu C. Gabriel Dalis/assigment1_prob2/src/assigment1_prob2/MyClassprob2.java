// suma termenilor pari a sirului lui fibonacci ce nu depasesc 4 milioane



package assigment1_prob2;

public class MyClassprob2 {

	public static void main(String[] args) 
		{
			int termen1=1, termen2=2, suma=0,sumapar=2;
			
			
			while(termen1+termen2 < 4000000)
				{
					suma=termen1+termen2;
					termen1=termen2;
					termen2=suma;
					
					if(suma %2==0)
						sumapar=sumapar+suma;
				}

			System.out.println("Suma elementelor pare < 4 milioane este "+sumapar);
		}

}
