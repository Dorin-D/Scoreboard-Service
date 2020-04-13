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
	/*
	function is only used for sorting
	argument ascending decides whether sort happens ascendingly (1) or descendingly (0)
	if any other value is given then we reserve the right to refuse cooperation
	*/
	public int compareTo(Entry secondEntry, int ascending) {          
		//if current highscore is lower then return -1
		//if equal return 0, otherwise return 1
		if (ascending == 1) {
		    return (this.getHighscore() < secondEntry.getHighscore() ? -1 : 
		            (this.getHighscore() == secondEntry.getHighscore() ? 0 : 1));
		} else if (ascending == 0) {
			return (this.getHighscore() < secondEntry.getHighscore() ? 1 :
				(this.getHighscore() == secondEntry.getHighscore() ? 0 : -1));
		}
		else
			return 0;
		}
}
