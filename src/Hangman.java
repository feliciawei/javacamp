import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Hangman {

	public static void main(String[] args) {
		String[] words = {"hangman", "crowbar", "sphynx", "rhythm", "kilogram", "beard", "deposit", "frosting", "underwire", "america", "marvel", "independence", "declaration", "liberty", "justice", "trump", "obama", "china", "ethernet", "Awesome"};
		Random generator = new Random();
		int wordsIndex = generator.nextInt(words.length);
		String word = words[wordsIndex];
		char[] wordChars = new char[word.length()];
		wordChars = word.toCharArray();
		Scanner userInput = new Scanner(System.in);
		char playerGuess;
		boolean guessed = false;
		boolean contains = false;
		int count;
		count = 0;
		
		char[] chars = new char[word.length()];
		
		char[] spaces = new char[chars.length];
		
		for(int i = 0; i<word.length(); i++){
			spaces[i] = '_';
		}
		chars = word.toCharArray();
		
		while(!guessed){
			for(int i = 0; i<word.length(); i++){
				System.out.print(spaces[i] + " ");
				
			}
			System.out.println(" Guess a letter: ");
			
			playerGuess = userInput.nextLine().charAt(0);
			
			if(word.indexOf(playerGuess) != -1){
				int i = word.indexOf(playerGuess);
				while (i != -1) {
					spaces[i] = playerGuess;
				    i = word.indexOf(playerGuess, i + 1);
				}
				
				
			}else{
				System.out.println("That letter is not in the word. ");
				count += 1;
				System.out.println("Guesses left: " + (8 - count));
			}
			
			if(Arrays.equals(spaces, wordChars)){
				guessed = true;
				System.out.println("You won!");
				System.err.println("                                                _ \n     /\\                                        | |\n    /  \\__      _____  ___  ___  _ __ ___   ___| |\n   / /\\ \\ \\ /\\ / / _ \\/ __|/ _ \\| '_ ` _ \\ / _ \\ |\n  / ____ \\ V  V /  __/\\__ \\ (_) | | | | | |  __/_|\n /_/    \\_\\_/\\_/ \\___||___/\\___/|_| |_| |_|\\___(_)");
				
				
				
			}
			if (count == 1){
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("___|___");
				System.out.println();
			}
			if (count == 2) {
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("___|___");
			}
			if (count == 3) {
				System.out.println("   ____________");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   | ");
				System.out.println("___|___");
			}
			if (count == 4) {
				System.out.println("   ____________");
				System.out.println("   |          _|_");
				System.out.println("   |         /   \\");
				System.out.println("   |        |     |");
				System.out.println("   |         \\_ _/");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("   |");
				System.out.println("___|___");
			}
			if (count == 5) {
				System.out.println("   ____________");
				System.out.println("   |          _|_");
				System.out.println("   |         /   \\");
				System.out.println("   |        |     |");
				System.out.println("   |         \\_ _/");
				System.out.println("   |           |");
				System.out.println("   |           |");
				System.out.println("   |");
				System.out.println("___|___");
			}
			if (count == 6) {
				System.out.println("   ____________");
				System.out.println("   |          _|_");
				System.out.println("   |         /   \\");
				System.out.println("   |        |     |");
				System.out.println("   |         \\_ _/");
				System.out.println("   |           |");
				System.out.println("   |           |");
				System.out.println("   |          / \\ ");
				System.out.println("___|___      /   \\");
			}
			if (count == 7){
				System.out.println("   ____________");
				System.out.println("   |          _|_");
				System.out.println("   |         /   \\");
				System.out.println("   |        |     |");
				System.out.println("   |         \\_ _/");
				System.out.println("   |          _|_");
				System.out.println("   |         / | \\");
				System.out.println("   |          / \\ ");
				System.out.println("___|___      /   \\");
				
			}
			if (count == 8){
				System.out.println("Game Over!");
				System.out.println("   ____________");
				System.out.println("   |          _|_");
				System.out.println("   |         /   \\");
				System.out.println("   |        | * * |");
				System.out.println("   |         \\_ _/");
				System.out.println("   |          _|_");
				System.out.println("   |         / | \\");
				System.out.println("   |          / \\ ");
				System.out.println("___|___      /   \\");
				System.out.println("GAME OVER! The word was " + word);
				break;
			}	
		}
	}
}
