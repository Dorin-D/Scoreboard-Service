import java.util.ArrayList;
import java.util.Iterator;

public class Scoreboard{
	private ArrayList<Entry> highscores = new ArrayList<Entry>();
	
	public Scoreboard() {
		System.out.println("Succesfully created a new scoreboard.");
	}
	
	public void addEntry(Entry newEntry) {
		highscores.add(newEntry);
	}
	
	public void addEntry(String username, int highscore) {
		Entry newEntry = new Entry(username, highscore);
		highscores.add(newEntry);
	}
	
	public void printEntries() {
		Iterator<Entry> scoreboardIT = highscores.iterator();
		while(scoreboardIT.hasNext()) {
			System.out.println(scoreboardIT.next());
		}
	}
	
	public ArrayList<Entry> getHighscores(){
		return this.highscores;
	}
}
