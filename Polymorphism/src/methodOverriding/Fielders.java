package methodOverriding;

public class Fielders extends Player{

	private int catches;
	private int runouts;
	
	Fielders()
	{
		
	}
	
	Fielders(int jersey_no, String name, int catches, int runouts)
	{
		super(jersey_no, name);
		this.catches = catches;
		this.runouts = runouts;
	}

	public int getCatches() {
		return catches;
	}

	public void setCatches(int catches) {
		this.catches = catches;
	}

	public int getRunouts() {
		return runouts;
	}

	public void setRunouts(int runouts) {
		this.runouts = runouts;
	}

	@Override
	public String toString() {
		return super.toString()+"Fielders [catches=" + catches + ", runouts=" + runouts + "]";
	}
	
}
