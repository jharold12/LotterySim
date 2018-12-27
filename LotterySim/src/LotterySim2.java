/**
 * 
 * @author Gregroy Evevsky	
 *
 */



public class LotterySim2 {
	
	public static void main(String args[]) {
		final int PRICE_PER_TICKET = 2;
		final int JACKPOT = 300000000;
		final int RUNS_TO_WIN = 100;
		Ticket test = new Ticket();
		int wins = 0; 
		
		do {
	
			Ticket winner = new Ticket();
			int runsToWin = 0;
	
			while(!test.isWin(winner)) {
				runsToWin ++;
				test = new Ticket();
			}
			wins ++;
			System.out.println("we did it!! it only took us: " + runsToWin + " tickets");
			int price = runsToWin * PRICE_PER_TICKET;
			System.out.println("this means we spend: $" + (price/1000000) + " mill" );
			System.out.println("we have made a profit of: " + (JACKPOT - price));
			System.out.println("number of runs " + wins);
			System.out.println("----------------------------------------------------");
			
		}while(wins < RUNS_TO_WIN);
		
		System.out.println("we are done!");
	}
}
