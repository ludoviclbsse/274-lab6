public class Game {
	public static void main(String[] args) {
		Player p1 = new Player();
		Player p2 = new Player();
		for (int i = 0; i < 3; i++) {
			p1.takeTurn();
			p2.takeTurn();
		}
		if (p1.getPoints() > p2.getPoints()) {
			System.out.println("Player 1 Wins");
		} else if (p2.getPoints() > p1.getPoints()) {
			System.out.println("Player 2 Wins");
		} else {
			System.out.println("Tied");
		}
	}
}
