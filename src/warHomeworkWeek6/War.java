package warHomeworkWeek6;

public class War {

	public static void main(String[] args) {
		Player p1 = new Player("Player One"); 
		Player p2 = new Player("Player Two"); 
		
		Deck deck = new Deck(); 
		deck.shuffle();	
	
		
		dealCards(p1, p2, deck);
		
		gamePlay(p1, p2);
		
		printScore(p1, p2);
		

	}

	private static void printScore(Player p1, Player p2) {
		if(p1.getScore() > p2.getScore()) {
			declareWinner (p1, p2) ;
		} 
		else if (p2.getScore() > p1.getScore()) {
			declareWinner (p2, p1); 
		} else {
			System.out.println("Player " + p1.getName() + " and player " + p2.getName() + " tie");
		}
	}

	private static void gamePlay(Player p1, Player p2) {
		for(int turn = 0; turn < 26; turn++) {
			Card c1 = p1.flip(); 
			Card c2 = p2.flip(); 
			
			
			if (c1.getValue()>c2.getValue()) {
				p1.incrementScore();
			} else if (c2.getValue() > c1.getValue()){
				p2.incrementScore();
			} 
		}
	}

	private static void dealCards(Player p1, Player p2, Deck deck) {
		int deckSize = deck.size(); 
		
		for(int index=0; index< deckSize; index++) {
			if(index % 2 ==0) {
				p1.draw(deck);
			}
			else {
				p2.draw(deck);
			}
		}
	}

	private static void declareWinner (Player winner, Player loser) {
		System.out.println(winner.getName() + " is the winner with a score of " + winner.getScore() + "!" + " The loser is " + 
	loser.getName() + " with a score of " + loser.getScore());
	}
		
	
	
	

}
