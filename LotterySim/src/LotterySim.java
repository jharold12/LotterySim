import java.util.ArrayList;

/**
 * 
 * @author Jim Harold	
 * 
 */

public class LotterySim {
	
	public static void main(String args[]) {
		final int TOTAL_TICKET_POOL = 280217678; //http://www.lottoreport.com/ticketcomparison.htm - 10/19/18
		//final int TOTAL_TICKET_POOL = 10; //test code
		int duplicates = 0;
		ArrayList<Ticket> drawnTickets = new ArrayList<Ticket>(TOTAL_TICKET_POOL);
		
		for (int i = 0; i < TOTAL_TICKET_POOL; i++) {
			//draw a new ticket
			Ticket temp = new Ticket();
			//if ticket is a duplicate, count it as such
			if (drawnTickets.contains(temp)) {
				duplicates++;
			}
			//add to arrayList
			drawnTickets.add(temp);
			//show loop progress
			System.out.println(i + " out of " + TOTAL_TICKET_POOL);
		}
		
		//Output results
		System.out.println("Total drawn tickets: " + drawnTickets.size());
		System.out.println("Total duplicate tickets: " + duplicates);
		System.out.println();	

		System.out.println("End program.");
	}
}
