public class Entry {
	private String username;
	private int highscore;
	
	public Entry(String username, int highscore) {
		this.setUsername(username);
		this.setHighscore(highscore);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getHighscore() {
		return highscore;
	}

	public void setHighscore(int highscore) {
		this.highscore = highscore;
	}
}
