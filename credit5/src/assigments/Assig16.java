package assigments;
import java.util.Random;
import java.util.Scanner;

public class Assig16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random number = new Random();
	   	int secret = number.nextInt(20) +1;
	   	Scanner userinput = new Scanner(System.in);
	   	System.out.println("Choose a number from one to twenty: ");
	   	int player = userinput.nextInt();
	   	System.out.println("Computer's number is: "+secret);
	   	System.out.println("Player's number is: "+player);
	   	if (secret==player)
	       	System.out.println("You won!");
	   	else
	       	System.out.println("Better luck next time.");


	}

}
/* Screen Dump

Choose a number from one to twenty: 
7
Computer's number is: 7
Player's number is: 7
You won!
 
 */