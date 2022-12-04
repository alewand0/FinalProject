import java.util.Scanner;
import java.util.Random;
/**
* Elements Game by Aiden Lewandowski.
*/
public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        //List of Characters
        Character[] playerlist = new Character[5];
        Character player0 = new Character("a non character", 0, "temp", 0);
        Character player1 = new Character("Zuko", 19, "Fire", 100);
        Character player2 = new Character("Ang", 21, "Air",150);
        Character player3 = new Character("Katara", 15, "Water", 100);
        Character player4 = new Character("Toph", 18, "Earth",120);
        
        playerlist[0] = player0;
        playerlist[1] = player1;
        playerlist[2] = player2;
        playerlist[3] = player3;
        playerlist[4] = player4;
        
        //Game Intro and Instructions
        System.out.println("\nWelcome to the battle of the elements, you will be matched up against one of the four characters below.");
        System.out.println("The button to attack is X once you press it the battle will commence automatically.");
        System.out.println("You and your opponents health will be displayed until the battle is over.");
        System.out.println("Goodluck!");
        //Character Stats
        System.out.println("\nPlayer1's name is: "+player1.getName());
        System.out.println("Player1's element is: "+player1.getElement());
        System.out.println("Player1's damage is: "+player1.getDamage());
        System.out.println("Player1's health is: "+player1.getHealth());
        
        System.out.println("\nPlayer2's name is: "+player2.getName());
        System.out.println("Player2's element is: "+player2.getElement());
        System.out.println("Player2's damage is: "+player2.getDamage());
        System.out.println("Player2's health is: "+player2.getHealth());
        
        System.out.println("\nPlayer3's name is: "+player3.getName());
        System.out.println("Player3's element is: "+player3.getElement());
        System.out.println("Player3's damage is: "+player3.getDamage());
        System.out.println("Player3's health is: "+player3.getHealth());
        
        System.out.println("\nPlayer4's name is: "+player4.getName());
        System.out.println("Player4's element is: "+player4.getElement());
        System.out.println("Player4's damage is: "+player4.getDamage());
        System.out.println("Player4's health is: "+player4.getHealth());
        //When Users Pick Characters / picking a random opponent
        System.out.println("\nType in the number of the player you wish to choose. | Example: Type in 1 for Player1");
        int x = input.nextInt();
        Character primeplayer = playerlist[x];

        if (x == 0 || x > 4){
            System.out.println("Please try again and pick a player from the list.");
        }
        System.out.println("You chose: "+primeplayer.getName());
        Character oppplayer = playerlist[rand.nextInt(playerlist.length)];
        if (oppplayer == playerlist[0]){
            oppplayer = playerlist[1];
        }else if (oppplayer.getName() == primeplayer.getName()) {
            oppplayer = playerlist[rand.nextInt(playerlist.length)];
        }
        System.out.println("Your opponent will be: "+oppplayer.getName());
        System.out.println(primeplayer.elementorder());
        //increasing damage for different matchups
        int oppHP = oppplayer.getHealth();
        int primeHP = primeplayer.getHealth();
        int oppDAM = oppplayer.getDamage();
        int primeDAM = primeplayer.getDamage();
        if(primeplayer.getElement() == "Fire" && oppplayer.getElement() == "Air"){
            primeDAM = primeDAM + 5;
        }else if (primeplayer.getElement() == "Water" && oppplayer.getElement() == "Fire") {
            primeDAM = primeDAM + 5;
        }else if (primeplayer.getElement() == "Earth" && oppplayer.getElement() == "Water") {
            primeDAM = primeDAM + 5;
        }else if (primeplayer.getElement() == "Air" && oppplayer.getElement() == "Earth") {
            primeDAM = primeDAM + 5;
        }
        
        if(oppplayer.getElement() == "Fire" && primeplayer.getElement() == "Air"){
            oppDAM = oppDAM + 5;
        }else if (oppplayer.getElement() == "Water" && primeplayer.getElement() == "Fire") {
            oppDAM = oppDAM + 5;
        }else if (oppplayer.getElement() == "Earth" && primeplayer.getElement() == "Water") {
            oppDAM = oppDAM + 5;
        }else if (oppplayer.getElement() == "Air" && primeplayer.getElement() == "Earth") {
            oppDAM = oppDAM + 5;
        }
        System.out.println("\nGET READY FOR BATTLE");
        System.out.println("\n"+primeplayer.getName()+" VS "+oppplayer.getName());
        System.out.println("\nPress X then enter to attack");
        String attackCheck = input.nextLine();
        //the battle
        
        while (oppHP > 0 && primeHP > 0) {
            oppHP = oppHP - primeDAM;
            primeHP = primeHP - oppDAM;
            System.out.print("\n\nYour Health: "+primeHP);
            System.out.print("\nOpponents Health: "+oppHP);
            
        }   
        if (oppHP > primeHP) {
            System.out.print("\nYour opponent "+oppplayer.getName()+ " won the battle!");
            System.out.print("\nYou lose :(");
        }else {
            System.out.print("\nYou, "+primeplayer.getName()+ " won the battle!");
            System.out.print("\nYou Win!");
        }
    }
}

