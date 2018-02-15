/** This class represents a single die */
public class Die {
	/** Represents the number of sides on the die */
	private int sides;
	/** Represents the value of the die */
	private int dieVal;

	/**
	 * Constructor
	 * 
	 * @param s
	 *            The number of sides this die has
	 */
	public Die(int s) {
		sides = s;
		dieVal = roll();
	}

	/**
	 * Rolls the die and returns the result
	 * 
	 * @return result of die roll
	 */
	public int roll() {
		dieVal = (int) (Math.random() * sides) + 1;
		return dieVal;
	}

	/**
	 * Retrieves the value of the die
	 * 
	 * @return value of the die
	 */
	public int getDieVal() {
		return dieVal;
	}

	/**
	 * Sets the die to the parameter value
	 * 
	 * @param value
	 *            value to set die to
	 * @return value of the die
	 */
	public boolean setDiceVal(int value) {
		if (value > 0 && value <= sides) {
			dieVal = value;
			return true; // successfully set the value
		}
		return false; // failed to set the value
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Die) {
			Die d = (Die) o;
			return this.sides == d.sides && this.dieVal == d.dieVal;
		}
		return false;
	}

	/**
	 * Compares two dices to determine order.
	 * 
	 * @param d
	 *            die to be compared
	 * @return 0 if equal, - if this < d, + if this > d
	 */
	public int compareTo(Die d) {
		int c1 = d.dieVal;
		int c2 = dieVal;
		return c1 - c2;
	}
}