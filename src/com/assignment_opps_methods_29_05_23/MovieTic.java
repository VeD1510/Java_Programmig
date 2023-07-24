package com.assignment_opps_methods_29_05_23;

public class MovieTic {
	
	int movieId;
	String movieName;
	int movieCost;
	int movieTickets;
	int totalCost;
	int totalTicket=10;
	int availableTicket;
	
	public void acceptDetails(int movieId,String movieName,int movieCost,int movieTickets) {
		this.movieId=movieId;
		this.movieName=movieName;
		this.movieCost=movieCost;
		this.movieTickets=movieCost;
		
	}
	public void bill() {
		totalCost=movieTickets*movieCost;
		availableTicket=totalTicket-movieTickets;
	}
	public void dislplay() {
		if(this.movieTickets<=10)
		{
		this.bill();
		System.out.println("MOvieID"+"  "+"MovieName"+"  "+"TotalCost"+"  "+"TicBooked"+"  "+"AvailableTic");
		System.out.println(movieId+" \t "+movieName+"\t\t"+totalCost+" \t "+movieTickets+"\t\t"+availableTicket);
		}
		else
			System.err.println("Error......");
		
	}
	
	
	

	public static void main(String[] args) {
		
		MovieTic m1=new MovieTic();
		m1.acceptDetails(101, "XYZ", 10, 100);
		m1.dislplay();
		

	}

}
