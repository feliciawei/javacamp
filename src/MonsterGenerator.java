import java.util.Random;
public class MonsterGenerator {

	public static void main(String[] args) {
		String[] monsters = { "Ghost", "Goblin", "Ghoul", "Zombie", "Basilisk", "Skelebone", "Dragon" };
		Random generator = new Random();
		int monsterIndex = generator.nextInt(monsters.length);
		String monster;
		monster = monsters[monsterIndex];
		System.out.println("A " + monster + " appears!");
	
		
		
	}
}
