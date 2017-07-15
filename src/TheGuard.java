// Expand this code box and copy
import java.util.Scanner;
 
public class TheGuard {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose a class:\n1 - Warrior\n2 - Thief\n3 - Mage");
        int playerClass = userInput.nextInt();
        System.out.println("There is a guard here, what do you do?\n1 - Fight him\n2 - Steal his wallet\n3 - Throw a fireball\n4 - Talk the guard into leaving\n5 - Intimidate the guard\n6 - Bond with the guard over your shared disdain for magic");
        int playerChoice = userInput.nextInt();
         
       if(playerClass == 1 && playerChoice == 1){
    	   System.out.println("The warrior has trained their entire life to fight, so the player easily defeats the guard.");
       }
         
       else if (playerClass == 2 && playerChoice == 2){
    	   System.out.println("Since you are a thief you steal the guard's wallet no problem.");
       }else if(playerClass == 3 && playerChoice == 3){
    	   System.out.println("A mage has the ablity to lob a fireball at the guard and you do just that. The guard gets burned alive and dies."); 
       }else if((playerClass == 2 || playerClass == 3) && playerChoice == 4){
           System.out.println("You're so charming! He is convinced to wander off for a bit.");
       }else if((playerClass == 1 || playerClass == 3) && playerChoice == 5){
    	   System.out.println("You scare the guard away.");
       }else if (!(playerClass == 3) && playerChoice == 6){
    	   System.out.println("You find out that you both hate magic and start talking.");
       }else {
    	   System.out.println("That did not work and the guard punches you in the face.");
       }
       
       
        userInput.close();
    }
 
}
