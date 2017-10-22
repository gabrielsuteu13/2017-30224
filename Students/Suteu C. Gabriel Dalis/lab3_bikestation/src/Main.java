
public class Main 
	{
	
	public static int clients=1;
	
	public static int nrclienti()
		{
			return clients++;
		}

	public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
			
			Bike bike0=new Bike(0);
			Bike bike1=new Bike(1);
			
			Station station1=new Station();
			
			
			if(station1.addBike(bike0)==true)
				{
					System.out.println("bicicleta a fost introdusa in statie");
					System.out.println("Nr. curent de clienti pe ziua de azi: "+nrclienti());
				}
			else
				System.out.println("bicicleta nu mai poate fi introdusa in statie");
			
			
			
			if(station1.getBike(bike0)==true)
				{
				 System.out.println("bicicleta a fost preluata");
				 System.out.println("Nr. curent de clienti pe ziua de azi: "+nrclienti());
				}
			else
				System.out.println("bicicleta nu se afla in statie");
		}
	
	}
