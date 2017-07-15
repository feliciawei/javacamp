
public class DragonSlayer {

	public static void main(String[] args) {
		int playersStrength = 100;
		int dragonsHP = 200;
		boolean hasSword = false;
		boolean hasBow = true;
		if (playersStrength > dragonsHP) {
			System.out.println("You defeated the dragon!");
		}
		else if (hasSword) {
			System.out.println("You're not strong enough to defeat the dragon. "
					+ "However you remember your magic sword and use it to slay the beast.");
		}
		else if (hasBow) {
			System.out.println("You have a bow that shoots fire arrows and it kills the dragon with one shot even though you are not strong enough to defeat it");
		}
		else {
			System.out.println("The dragon defeated you!");
		}

	}

}
