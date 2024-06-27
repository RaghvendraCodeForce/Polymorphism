package methodOverriding;

import java.text.DecimalFormat;

public class Batsman extends Player{

	private int runsScored;
	private int centuries;
	private int halfCenturies;
	private int ballsFaced;
	
	public Batsman()
	{
		
	}
	
	public Batsman(int jersey_no, String name, int runsScored, int centuries, int halfCenturies, int ballsFaced)
	{
		//setjersey_no(jersey_no);
		//setName(name);
		super(jersey_no, name);
		this.runsScored = runsScored;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
		this.ballsFaced = ballsFaced;		
	}

	public int getRunsScored() {
		return runsScored;
	}

	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	public int getCenturies() {
		return centuries;
	}

	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}

	public int getHalfCenturies() {
		return halfCenturies;
	}

	public void setHalfCenturies(int halfCenturies) {
		this.halfCenturies = halfCenturies;
	}

	public int getBallsFaced() {
		return ballsFaced;
	}

	public void setBallsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
	}
	
	public double getStrikeRate()
	{
		DecimalFormat df = new DecimalFormat("#.##");
		
		double strikeRate = (double)(runsScored*100)/ballsFaced;
		
		String sr = df.format(strikeRate);
		
		return Double.parseDouble(sr);
		
	}

	@Override
	public String toString() {
		return super.toString()+"Batsman [runsScored=" + runsScored + ", centuries=" + centuries + ", halfCenturies=" + halfCenturies
				+ ", ballsFaced=" + ballsFaced + ", getStrikeRate()=" + getStrikeRate() + "]";
	}
	
	
	
}
