import java.util.Arrays;

/**
 * 
 * @author Greg Evevsky	
 * 
 */

public class Ticket{ 
	
		public int[] picks;
		private final int TICKET_SIZE = 6;
		private final int MAX = 70;
		private final int MIN = 1;
		
		public Ticket(){
			picks = new int[TICKET_SIZE];
			for (int i = 0; i < picks.length; i++ ) {
				picks[i] = pick();
				for(int x = i-1; x >= 0; x--) {
					//check if picks[i] is the same as another number we picked.
					if(picks[i] == picks[x]) {
						// re-roll the number we just placed
						picks[i] = pick();
						//check all numbers again
						x =i-1;
					}
				}
			}
			Arrays.sort(picks);
		}
		/**
		 * pick a number between max and min
		 * @return
		 */
		public int pick() { 
			return ((int)(Math.random() * MAX ) + MIN) ;
		}
		/**
		 * checks if all numbers match the winning ticket
		 * @param winner
		 * @return
		 */
		public boolean isWin( Ticket winner){
			// all arrays will be sorted. 
			// check if any number dosn't match
			for(int i =0; i < winner.picks.length; i++) {
				if(winner.picks[i] != this.picks[i])
					return false;
			}
			return true;
		}
		/**
		 *@Override
		 */
		public String toString() {
			String give =""; 
			for(int i = 0; i < picks.length; i++) {
				give += picks[i];
				give += ", ";
			}
			return give;
		}
		
	}