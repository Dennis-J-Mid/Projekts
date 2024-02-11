import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {
	public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	while (true) {
			String playerMove = "";
			String []rps={"ROCK","PAPER","SCISSORS"};
			String computerMove= rps[new Random().nextInt(rps.length)];
		  do {
			System.out.println(" Choose Rock Paper or Scissors");
			 playerMove =scanner.nextLine().toUpperCase();
		    } while( playerMove == "" );
			if (playerMove.equalsIgnoreCase(computerMove)) {
				System.out.println("Its a draw ");
				System.out.println( "Computer move: " + computerMove);
				System.out.println("Player Move: " + playerMove.toUpperCase());
			}
	else if (playerMove.equalsIgnoreCase("rock")){
				if (computerMove.equalsIgnoreCase("scissors")){
				   System.out.println(" The Player Wins ");
				   System.out.println( "Computer move: " + computerMove);
					System.out.println("Player Move: " + playerMove.toUpperCase());
				}
			    else {
			    	System.out.println("The Player loses");
			    	System.out.println( "Computer move: " + computerMove);
					System.out.println("Player Move: " + playerMove.toUpperCase());
			    }
			}
			else if (playerMove.equalsIgnoreCase("paper")){
				if (computerMove.equalsIgnoreCase("rock")){
				   System.out.println(" The Player Wins ");
				   System.out.println( "Computer move: " + computerMove);
					System.out.println("Player Move: " + playerMove.toUpperCase());
				}
			    else {
			    	System.out.println("The Player loses");
			    	System.out.println( "Computer move: " + computerMove);
					System.out.println("Player Move: " + playerMove.toUpperCase());
			    }
			}
			else if (playerMove.equalsIgnoreCase("scissors")){
				if (computerMove.equalsIgnoreCase("paper")){
				   System.out.println(" The Player Wins ");
				   
				   System.out.println( "Computer move: " + computerMove);
					System.out.println("Player Move: " + playerMove.toUpperCase());
				}
			    else {
			    	System.out.println("The Player loses");
			    	System.out.println( "Computer move: " + computerMove);
					System.out.println("Player Move: " + playerMove.toUpperCase());
			    }
			}
				
			else {
				System.out.println("This Move is Not allowed ");
			 }
			  
		    System.out.println("Do you want to play again ?  (yes or no)");
		    String playAgain = scanner.nextLine();
		    if (!playAgain.equalsIgnoreCase("yes")) {
		    	break;
		    }
	}
	}
	
}