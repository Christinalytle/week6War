package warHomeworkWeek6;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	private int score; 
	private List<Card> hand = new ArrayList<>(); 
	
	public Player(String name) {
		this.name = name; 
	}
	
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return  name; 
	}
	
	public String describe() {
		return toString();
	}

	public Card flip() {
		if(!hand.isEmpty()) {
			return hand.remove(0); 
		}
		throw new IllegalStateException("Out of Cards!"); 
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw()); 
	}
	
	public void incrementScore() {
		score += 1;
		
	}
	
	public int size() {
		return hand.size();
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", score=" + score + ", hand=" + hand + "]";
	}
	
	}
