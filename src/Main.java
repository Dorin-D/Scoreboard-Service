import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

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
		/*
		takes user input for 1 highscore and adds it to the 
		Scoreboard object and to Highscores.txt
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert username: ");
		String username = sc.nextLine();
		System.out.println("Insert highscore: ");
		int highscore = sc.nextInt();
		FileWriter fw = new FileWriter(highscores, true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("\n" + username + " " + highscore);
		uniqueSC.addEntry(username, highscore);
		bw.close();
		fw.close();
		sc.close();
		quickSort(uniqueSC, 0, uniqueSC.size()-1, 1);
		uniqueSC.printEntries();
	}
	
	
	/*
	how to use:
	quickSort(Scoreboard object, 0, object.length - 1, ascending)
	where:
		ascending 1 sorts low to high, 0 sorts high to low
	*/
	public static void quickSort(ArrayList<Entry> highscores, int low, int high, int ascending) {
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
			while (highscores.get(i).compareTo(pivot, ascending) < 0) {
				i++;
			}
			
			while(highscores.get(j).compareTo(pivot, ascending) > 0) {
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
			quickSort(highscores, low, j, ascending);
		}
		if(high > i) {
			quickSort(highscores, i, high, ascending);
		}
	}
}