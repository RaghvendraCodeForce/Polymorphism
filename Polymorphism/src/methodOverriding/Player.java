package methodOverriding;

public class Player {

	private int jersey_no;
	private String name;
	
	
	public Player()
	{
		
	}
	
	public Player(int jersey_no, String name)
	{
		this.jersey_no = jersey_no;
		this.name = name;
	}
	
	public void setjersey_no(int jersey_no)
	{
		this.jersey_no = jersey_no;
	}
	
	public int getjersey_no()
	{
		return jersey_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [jersey_no=" + jersey_no + ", name=" + name + "]";
	}	
}
