import java.util.Scanner;
public class CharacterCreator {

	public static void main(String[] args) {
		Scanner playerInput;
		playerInput = new Scanner(System.in);
		
		String playerName;
		System.out.println("What is your character's name?");
		playerName = playerInput.nextLine();
		System.out.println("Welcome " + playerName);
		
		String favoriteColor;
		System.out.println("What is your favorite color?");
		favoriteColor = playerInput.nextLine();
		System.out.println(favoriteColor + " is my favorite color too!");

	}

}
