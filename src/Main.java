import java.io.*;
import java.util.ArrayList;

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
		quickSort(uniqueSC.getHighscores(), 0, uniqueSC.getHighscores().size()-1);
		uniqueSC.printEntries();
	}
	
	
	public static void quickSort(ArrayList<Entry> highscores, int low, int high) {
		if (highscores.size() == 0) {
			return;
		}
		if (low >= high) {
			return;
		}
		int middle = (high + low) / 2;
		Entry pivot = highscores.get(middle);
		
		int i = low;
		int j = high;
		
		while (i <= j) {
			while (highscores.get(i).compareTo(pivot) < 0) {
				i++;
			}
			
			while(highscores.get(j).compareTo(pivot) > 0) {
				j--;
			}
			if (i <= j) {
				Entry temp = highscores.get(i);
				highscores.set(i, highscores.get(j));
				highscores.set(j, temp);
				i++;
				j--;
			}
		}
		if (low < j) {
			quickSort(highscores, low, j);
		}
		if(high > i) {
			quickSort(highscores, i, high);
		}
	}
	
	
	
	
	
	
	
	
}

/* writing to file, if necessary
FileWriter fw = new FileWriter(highscores, true);
BufferedWriter bw = new BufferedWriter(fw);
bw.write("\nAlpha 50");

bw.close();
fw.close();
*/ 