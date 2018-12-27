
public class LotterySim4 {
	public static void main(String args[]) {
		final int PRICE_PER_TICKET = 2;
		Ticket test = new Ticket();
		Ticket winner = new Ticket();
		int flag = 0;
		int price;
		
		int runsToWin = 0;

		do {
			runsToWin ++; 
			test = new Ticket();
			winner = new Ticket();
			if (test.equals(winner)) {
				flag = 1;
			};
			System.out.println(runsToWin);
		} while(runsToWin < 10400 && flag == 0);

		price = runsToWin * PRICE_PER_TICKET;

		if (flag == 1) {
			System.out.println("we did it!! it only took us: " + runsToWin + " tickets");
			System.out.println("it only took us: " + (runsToWin/52) + " years");
		} else {
			System.out.println("YOU DIED");
		}
		System.out.println("You spend: $" + (price/1000000) + " mill" );
		System.out.println("this means we spend: $" + (price/1000000) + " mill" );
		System.out.println("we are done!");
	}
}
