import java.util.ArrayList;
import java.util.Iterator;

public class Scoreboard extends ArrayList<Entry>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Scoreboard() {
		System.out.println("Succesfully created a new scoreboard.");
	}
	
	public void addEntry(Entry newEntry) {
		this.add(newEntry);
	}
	
	public void addEntry(String username, int highscore) {
		Entry newEntry = new Entry(username, highscore);
		this.add(newEntry);
	}
	
	public void printEntries() {
		Iterator<Entry> scoreboardIT = this.iterator();
		while(scoreboardIT.hasNext()) {
			System.out.println(scoreboardIT.next());
		}
	}
}

