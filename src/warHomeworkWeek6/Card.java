package warHomeworkWeek6;

public class Card {
	
	private int value; 
	private String name;
	
	public Card(String name, int value) {
		this.name = name; 
		this.value = value; 
	}
	

	public String describe() {
		return toString(); 
		
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	@Override
	public String toString() {
		return "Card [value=" + value + ", name=" + name + "]";
	}
	
}

	


