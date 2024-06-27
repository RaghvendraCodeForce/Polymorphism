package methodOverriding;

public class Bowler extends Player{

	private int no_of_wickets;
	private double economy;
	private int total_over;
	
	Bowler()
	{
		
	}
	
	Bowler(int jersey_no, String name, int no_of_wicket, int economy, int total_over)
	{
		super(jersey_no, name);
		this.no_of_wickets = no_of_wicket;
		this.economy = economy;
		this.total_over = total_over;
	}

	public int getNo_of_wickets() {
		return no_of_wickets;
	}

	public void setNo_of_wickets(int no_of_wickets) {
		this.no_of_wickets = no_of_wickets;
	}

	public double getEconomy() {
		return economy;
	}

	public void setEconomy(double economy) {
		this.economy = economy;
	}

	public int getTotal_over() {
		return total_over;
	}

	public void setTotal_over(int total_over) {
		this.total_over = total_over;
	}

	@Override
	public String toString() {
		return super.toString()+"Bowler [no_of_wickets=" + no_of_wickets + ", economy=" + economy + ", total_over=" + total_over + "]";
	}
	
	
}
