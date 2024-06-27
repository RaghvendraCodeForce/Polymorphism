package methodOverriding;


public class Cricket {

	public static void main(String[] args) {
		
		Batsman rohit = new Batsman(45,"Rohit Sharma",163,25,45,101);
		Batsman virat = new Batsman(18,"Virat Kohli", 11384, 43, 62, 254);
		Batsman dhoni = new Batsman(07,"MS Dhoni", 10773, 10, 73, 350);
		Batsman sachin = new Batsman(10,"Sachin Tendulkar", 18426, 51, 68, 463);
		Batsman dravid = new Batsman(19,"Rahul Dravid", 10889, 12, 83, 344);
		Batsman ganguly = new Batsman(10,"Sourav Ganguly", 11363, 22, 72, 311);
		Batsman sehwag = new Batsman(37,"Virender Sehwag", 8273, 15, 38, 251);
		Batsman yuvraj = new Batsman(12,"Yuvraj Singh", 8701, 14, 52, 304);
		Batsman kumble = new Batsman(01,"Anil Kumble", 938, 0, 0, 271);
		Batsman kapil = new Batsman(06,"Kapil Dev", 3783, 1, 27, 225);
		
		
		
		System.out.println("Displaying the players details below :");
		
		System.out.println(rohit.toString());
		System.out.println(virat.toString());
		System.out.println(dhoni.toString());
		System.out.println(sachin.toString());
		System.out.println(dravid.toString());
		System.out.println(ganguly.toString());
		System.out.println(sehwag.toString());
		System.out.println(yuvraj.toString());
		System.out.println(kumble.toString());
		System.out.println(kapil.toString());
		
		System.out.println("************************************************");
		
		System.out.println("Displaying all the Bowlers detail : ");
		
		Bowler md_Shami = new Bowler(7,"Md Shami",354,5,300);
		Bowler a_Kumble = new Bowler(45,"A Kumble",500,4,454);
		Bowler r_Ashwin = new Bowler(78,"R Ashwin",400,5,360);
		Bowler harbhajan_Singh = new Bowler(05,"Harbhajan Singh",545,5,350);
		Bowler i_Sharma = new Bowler(8,"I Sharma",459,5,440);
		
		
		System.out.println(md_Shami.toString());
		System.out.println(a_Kumble.toString());
		System.out.println(r_Ashwin.toString());
		System.out.println(harbhajan_Singh.toString());
		System.out.println(i_Sharma.toString());
		
		System.out.println("************************************************");
		System.out.println("Displaying all the Fielders details : ");
		
		Fielders field1 = new Fielders(45,"Rohit Sharma",40,50);
		Fielders field2 = new Fielders(18,"Virat Kohli",100,101);
		Fielders field3 = new Fielders(07,"MS Dhoni", 120,45);
		Fielders field4 = new Fielders(10,"Sachin Tendulkar",122,23);
		Fielders field5 = new Fielders(19,"Rahul Dravid",150,50);
		Fielders field6 = new Fielders(10,"Sourav Ganguly",150,166);
		Fielders field7 = new Fielders(37,"Virender Sehwag",52,150);
		Fielders field8 = new Fielders(12,"Yuvraj Singh",32,45);
		Fielders field9 = new Fielders(01,"Anil Kumble",65,455);
		Fielders field10 = new Fielders(06,"Kapil Dev",56,56);
		
		System.out.println(field1.toString());
		System.out.println(field2.toString());
		System.out.println(field3.toString());
		System.out.println(field4.toString());
		System.out.println(field5.toString());
		System.out.println(field6.toString());
		System.out.println(field7.toString());
		System.out.println(field8.toString());
		System.out.println(field9.toString());
		System.out.println(field10.toString());
		
		System.out.println("************************************************");
		System.out.println("Displaying all the Keeper details : ");
		
		
		Keeper keep1 = new Keeper(45,"Ajay Ratra",13,2);
		Keeper keep2 = new Keeper(32,"Parthiv Patel",72,10);
		Keeper keep3 = new Keeper(49,"Dinesh Karthik",57,6);
		Keeper keep4 = new Keeper(07,"Mahendra Singh Dhoni",294,38);
		Keeper keep5 = new Keeper(55,"Wriddhiman Saha",104,12);
		Keeper keep6 = new Keeper(65,"Rishab Pant",118,11);
		Keeper keep7 = new Keeper(15,"Kona Srikar Bharat",5,1);
		Keeper keep8 = new Keeper(10,"kl Rahul",0,0);
		Keeper keep9 = new Keeper(19,"Ishan Kishan",0,0);
		Keeper keep10 = new Keeper(30,"Sanju Samson",0,0);
		
		System.out.println(keep1.toString());
		System.out.println(keep2.toString());
		System.out.println(keep3.toString());
		System.out.println(keep4.toString());
		System.out.println(keep5.toString());
		System.out.println(keep6.toString());
		System.out.println(keep7.toString());
		System.out.println(keep8.toString());
		System.out.println(keep9.toString());
		System.out.println(keep10.toString());
	}
}
