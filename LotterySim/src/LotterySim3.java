
public class LotterySim3 {
	
	public static void main(String args[]) {
		final int PRICE_PER_TICKET = 2;
		final int JACKPOT = 661800000;
		Ticket test = new Ticket();
		Ticket winner = new Ticket();
		int wins = 0; 
		
		int runsToWin = 0;

		while(!test.isWin(winner)) {
			runsToWin ++;
			test = new Ticket();
			winner = new Ticket();
			System.out.println(runsToWin);
		}
		wins ++;
		System.out.println("we did it!! it only took us: " + runsToWin + " tickets");
		System.out.println("it only took us: " + (runsToWin/52) + " years");
		int price = runsToWin * PRICE_PER_TICKET;
		System.out.println("this means we spend: $" + (price/1000000) + " mill" );
		System.out.println("we have made a profit of: " + (JACKPOT - price));
		System.out.println("number of runs " + wins);
		System.out.println("----------------------------------------------------");
		
		System.out.println("we are done!");
	}
}
