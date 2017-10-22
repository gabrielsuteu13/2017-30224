
public class Bike 

	{
		public String color;
		private int id;
		public boolean docked;
		
		
		public boolean isDocked()
			{
				return this.docked;
			}
		
		public Bike(int id)
			{
				this.id=id;
				this.color="blue";
				this.docked=false;
			}
	}
