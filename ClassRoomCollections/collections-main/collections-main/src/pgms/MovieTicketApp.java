package pgms;

import java.util.ArrayList;
import java.util.Vector;

class BookTicketSeats{
	int total_no_of_seats=10;
	 void bookTicket(int seats) {
//			Vector v=new Vector();
//			v.addElement("John");
//			v.addElement("xyz");
//			v.addElement(25);
//	
//			
//			ArrayList al=new ArrayList();
//			al.add("xyx");
//			al.add("ABC");
//			al.add(1);
//			al.add(2);
//			
//		 if(al.get(1)=="ABC") {
////			 v.removeElementAt(0);
////			 System.out.println(v);
//				al.remove("ABC");
//				System.out.println(al);
//					
//		 }
		if(total_no_of_seats>seats) {
			System.out.println("Seats Booked sucessfuly");
			total_no_of_seats=total_no_of_seats-seats;
			System.out.println("No seats Lefts:"+total_no_of_seats);
		}else {
			System.out.println("seats cannot be booked");
			System.out.println("No seats Lefts:"+total_no_of_seats);
		}
	}
}

public class MovieTicketApp extends Thread{

		static BookTicketSeats b;
		int seats;
	public void run() {
		b.bookTicket(seats);
//		Vector v=new Vector();
//		v.addElement("John");
//		v.addElement("xyz");
//		v.addElement(25);
//		v.removeElementAt(0);
//		System.out.println(v);
//		ArrayList al=new ArrayList();
//		al.add("xyx");
//		al.remove(0);
//		al.add("ABC");
//		al.add(1);
//		al.add(2);
//		System.out.println(al);
	}
	public static void main(String[] args) {
      b=new BookTicketSeats();
      MovieTicketApp movie=new MovieTicketApp();
      movie.seats=6;
      movie.start();
      
      MovieTicketApp m=new MovieTicketApp();
      m.seats=7;
      m.start();
      int a[]= {1,2,3,4};
  
      
	}

}
