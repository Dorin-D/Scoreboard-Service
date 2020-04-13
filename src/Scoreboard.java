import java.util.ArrayList;


public class Scoreboard {
	ArrayList<Entry> highscores = new ArrayList<Entry>();
	
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
}
