package warHomeworkWeek6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards = new ArrayList<>();
	private List<Integer> numbers = List.of(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
	private List <String> suits = List.of("Diamonds", "Clulbs", "Hearts", "Spades"); 
	
	public Deck() {
		for(Integer number : numbers ) {
			for(int index=0; index < suits.size(); index++) {
				String name = number + " of " + suits.get(index); 
			int value = number; 
			cards.add(new Card(name, value)); 
			}
		}
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() { 
		return cards.remove(0); 
	}
		
	@Override
	public String toString() {
		return "Deck card=" + cards;
	}
	
	public int size() {
		return cards.size(); 
	}



	
	
	
	
	
	
	
}
