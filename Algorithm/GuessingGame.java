package datastructures1;
import java.util.*;
public class GuessingGame {

	public static void main(String[] args) {
		Random r = new Random();
		int NoToGuess = r.nextInt(10);
		int tries = 0;
		
		Boolean win = false;
		while(win==false) {
			Scanner sc = new Scanner(System.in);
			int guess = sc.nextInt();
			tries++;
			if(guess==NoToGuess) {
				win =true;
			}
			else if(guess<NoToGuess){
				System.out.println("your guess is low");
			}
			else {
				System.out.println("your guess is high");
			}}
	System.out.println("you won the gamew");
	System.out.println("you took" +tries +"to win");
	
	}

	}


