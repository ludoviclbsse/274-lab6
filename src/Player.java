/** This class is a Player that uses a Die object */
public class Player {
	/** A die that the player may roll */
	private Die d;
	/** The number of points the player has */
	private int points;

	/** Constructor = create a new 6 sided die */
	public Player() {
		d = new Die(6);
		points = 0;
	}

	/**
	 * Player takes turn – if 1 is rolled then points reset to 0, otherwise add die
	 * value to points
	 */
	public void takeTurn() {
		int p = d.roll();
		if (p == 1) {
			points = 0;
		} else {
			points += p;
		}
	}

	/**
	 * Retreives the points value
	 * 
	 * @return player’s points
	 */
	public int getPoints() {
		return points;
	}
}