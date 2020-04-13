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
	@Override
	public String toString() {
		return(this.username + "," + this.highscore);
	}
	public int compareTo(Entry secondEntry) {          
		//if current highscore is lower then return -1
		//if equal return 0, otherwise return 1
	    return (this.getHighscore() < secondEntry.getHighscore() ? -1 : 
	            (this.getHighscore() == secondEntry.getHighscore() ? 0 : 1));     
	  }       
	
}
