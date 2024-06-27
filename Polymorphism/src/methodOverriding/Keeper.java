package methodOverriding;

public class Keeper extends Player{

	private int no_of_catches;
	private int no_of_stumps;
	
	Keeper()
	{
		
	}
	
	Keeper(int jersey_no, String name, int no_of_catches, int no_of_stumps)
	{
		super(jersey_no, name);
		this.no_of_catches = no_of_catches;
		this.no_of_stumps = no_of_stumps;
	}

	public int getNo_of_catches() {
		return no_of_catches;
	}

	public void setNo_of_catches(int no_of_catches) {
		this.no_of_catches = no_of_catches;
	}

	public int getNo_of_stumps() {
		return no_of_stumps;
	}

	public void setNo_of_stumps(int no_of_stumps) {
		this.no_of_stumps = no_of_stumps;
	}

	@Override
	public String toString() {
		return super.toString()+"Keeper [no_of_catches=" + no_of_catches + ", no_of_stumps=" + no_of_stumps + "]";
	}
	
	
	
}
