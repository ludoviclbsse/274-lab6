/** This class is a Player that uses a Die object */
public class Player {
	/** an array of dices that the player may roll */
	private Die[] d;
	/** The number of points the player has */
	private int points;

	/** Constructor = create a new 6 sided die */
	public Player() {
		d = new Die[3];
		for (int i = 0; i < d.length; i++) {
			d[i] = new Die(6);
		}
		points = 0;
	}

	public void takeTurn() {
		if (pair() == true) {
			System.out.println("You got a pair!");
			points += 1;
		} else if (threeOfAKind() == true) {
			System.out.println("You got 3 of a kind!");
			points += 2;
		} else if (series() == true) {
			System.out.println("You got a series of 3!");
			points += 3;
		} else
			System.out.println("Awww. Too Bad.");
	}

	public Boolean pair() {
		if (d[0].equals(d[1]) || d[0].equals(d[2]) || d[1].equals(d[2]))
			return true;
		return false;
	}

	public Boolean threeOfAKind() {
		if (d[0].equals(d[1]) && d[1].equals(d[2]))
			return true;
		return false;
	}

	public void selectionSort() {
		for (int i = 0; i < d.length; i++) {
			int lowest = i;
			for (int j = i + 1; j < d.length; j++) {
				if (d[j].compareTo(d[lowest]) > 0) {
					lowest = j;
				}
			}
			Die swap = d[i];
			d[i] = d[lowest];
			d[lowest] = swap;
		}
	}

	public Boolean series() {
		if (d[0].compareTo(d[1]) == 1 && d[1].compareTo(d[2]) == 1)
			return true;
		return false;
	}

	/**
	 * Retreives the points value
	 * 
	 * @return player’s points
	 */
	public int getPoints() {
		return points;
	}

	@Override
	public String toString() {
		return "Rolling Dice... D1=" + d[0].getDieVal() + ",D2=" + d[1].getDieVal() + ",D3=" + d[2].getDieVal();
	}
}