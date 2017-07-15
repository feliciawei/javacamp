import java.util.Random;
public class Treasure {

	public static void main(String[] args) {
		Random generator = new Random();
		int gold;
		gold = generator.nextInt(9);
		
		// number will be set to a number from 0 to 9
		int number =generator.nextInt(10);
		 
		// number will be set to a number from 5 to 15
		number = generator.nextInt(11) + 5;
		 
		// decimal will be set to a decimal between 0 and 5
		double decimal= generator.nextDouble() * 5;
		 
		// var will be set to either true or false
		boolean var = generator.nextBoolean();
		
		System.out.println("You open the chest to find " + gold + " gold pieces!");
		
		
	}
}