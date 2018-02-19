import java.util.Scanner;

public class Game {
	public static char getLetter() {
		Scanner in = new Scanner(System.in);
		String input = "";
		boolean isInvalid = true;
		while (isInvalid) {
			System.out.println("Enter a Letter: ");
			if (in.hasNext()) {
				input = in.nextLine();
				if (input.matches("[YN]{1}"))
					isInvalid = false;
			} else {
				in.nextLine(); // clear out invalid input
				System.out.println("Invalid Input");
			}
		}
		return input.charAt(0);
	}
	
	public static void main(String[] args) {
		Player p1 = new Player();
		Boolean boucle = true;
		System.out.println("Yacht-z");
		while (boucle) {
			p1.toString();
			p1.takeTurn();
			System.out.println("Score = " + p1.getPoints() + " points.");
			System.out.println("Play Again? Y/N ");
			if (getLetter() == 'N')
				boucle = false;
		}
	}
}
