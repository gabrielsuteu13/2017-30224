

public class Station 
	{
		public String name;
		public final int SLOTS=5;
		public Bike[] bikes= new Bike[SLOTS];
		private int index=0;
		
		
		
		public boolean addBike(Bike bike)
			{
				if(index<SLOTS)
					{
						bikes[index]=bike;
						index=index+1;
						bike.docked=true;
						return true;
					}
				else
					return false;
			}
		
		public boolean getBike(Bike bike)
			{
				if(index!=0)
					{
						
						index=index-1;
						bike.docked=false;
						return true;
					}
				else
					return false;
			}
	}
