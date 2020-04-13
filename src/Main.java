import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		File highscores = new File(".\\Highscores.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(highscores));
		String inputString, splitter[];
		Scoreboard uniqueSC = new Scoreboard();
		while((inputString = br.readLine()) != null) {
			//split input by space and add them to the scoreboard
			splitter = inputString.split(" ");
			uniqueSC.addEntry(splitter[0], Integer.parseInt(splitter[1]));
		}
		br.close();
		
		uniqueSC.printEntries();
	}
}
