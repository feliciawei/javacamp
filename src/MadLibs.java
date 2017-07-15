import java.util.Scanner;
public class MadLibs {

	public static void main(String[] args) {
		intro();
		Scanner userInput = new Scanner(System.in);
        String name = getUserInput("Enter a name: ", userInput);
        String noun = getUserInput("Enter a plural noun: ", userInput);
        String emotion = getUserInput("Enter an emotion: ", userInput);
        String animal = getUserInput("Enter an animal plural: ", userInput);
        String gerund = getUserInput("Enter an -ing word: ", userInput);
        String plant = getUserInput("Enter a plant (plural): ", userInput);
        String verb = getUserInput("Enter a past tense verb: ", userInput);
        String adjective = getUserInput("Enter an adjective: ", userInput);
		printMadLib(name, noun, emotion, animal, gerund, verb, plant, adjective);
		
	}
	
	
	public static String getUserInput(String message, Scanner userInput){
        System.out.print(message);
        return userInput.nextLine();
    }
 
	public static void intro(){
		System.out.println("Welcome to MadLibs!");
	}
	
	public static void printMadLib(String name, String noun, String emotion, String animal, String gerund, String verb, String plant, String adjective){
		System.out.println("There was once a boy named " + name);
        System.out.println(name + " went on a hike");
        System.out.println(name + " saw two people holding " + noun);
        System.out.println(name + " ran away in " + emotion);
        System.out.println("Then there were five " + animal + " " + gerund + " " +  plant + "!");
        System.out.println(name + " " + verb + " away in " + emotion);
        System.out.println("This time, " + name + " went all they way to their" + " " + adjective + " house");
	}
}
