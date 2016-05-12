package math;

/**
 * Class for representing fractions that are not reduced automatically.
 */
public class Fraction extends Number implements Cloneable {

	/**
	 * The numerator of this fraction.
	 */
	protected long	numerator;

	/**
	 * The denominator of this fraction that is always positive.
	 */
	protected long	denominator;

	/**
	 * The {@code Fraction} object that represents the number zero.
	 */
	public static final Fraction ZERO = new Fraction(0);

	/**
	 * Constructor for creating a {@code Fraction} object.
	 *
	 * @param numerator the numerator of the fraction
	 * @param denominator the denominator of the fraction
	 * @throws ArithmeticException if the denominator is zero
	 */
	public Fraction(long numerator, long denominator) throws ArithmeticException {
                if (denominator == 0)
                    throw new ArithmeticException("Division by zero");
                if (denominator < 0) {
                    this.numerator = -numerator;
                    this.denominator = -denominator;
                } else {
                    this.numerator = numerator;
                    this.denominator = denominator;
                }
	}

	/**
	 * Constructor for creating a {@code Fraction} object that represents the {@code long} specified.
	 *
	 * @param n
	 */
	public Fraction(long n) {
		this(n, 1);
	}

	/**
	 * Returns the numerator of this fraction.
	 *
	 * @return the numerator of this fraction
	 */
	public long getNumerator() {
		return numerator;
	}

	/**
	 * Returns the denominator of this fraction.
	 *
	 * @return the denominator of this fraction
	 */
	public long getDenominator() {
		return denominator;
	}

	/**
	 * Adds a {@code long} to this fraction.
	 *
	 * @param n the {@code long} to add
	 * @return a fraction that represents the result
	 */
	public Fraction add(long n) {
		// TODO
		return null;
	}

	/**
	 * Substracts a {@code long} from this fraction.
	 *
	 * @param n the {@code long} to substract
	 * @return a fraction that represents the result
	 */
	public Fraction substract(long n) {
		// TODO
		return null;
	}

	/**
	 * Multiplies this fraction by a {@code long}.
	 *
	 * @param n the {@code long} to multiply by
	 * @return a fraction that represents the result
	 */
	public Fraction multiply(long n) {
		// TODO
		return null;
	}

	/**
	 * Divides this fraction by a {@code long}.
	 *
	 * @param n the {@code long} to divide by
	 * @return a fraction that represents the result
	 * @throws ArithmeticException if the parameter {@code n} is zero
	 */
	public Fraction divide(long n) throws ArithmeticException {
		// TODO
		return null;
	}

	/**
	 * Raises this fraction to the power specified.
	 *
	 * @param n the exponent
	 * @return a fraction that represents the result
	 */
	public Fraction pow(long n) {
		// TODO
		return null;
	}

	/**
	 * Adds a fraction to this fraction.
	 *
	 * @param fraction the fraction to add
	 * @return a fraction that represents the result
	 */
	public Fraction add(Fraction fraction) {
		// TODO
		return null;
	}

	/**
	 * Substracts a fraction from this fraction.
	 *
	 * @param fraction the fraction to subtract
	 * @return a fraction that represents the result
	 */
	public Fraction substract(Fraction fraction) {
		// TODO
		return null;
	}

	/**
	 * Divides this fraction by another.
	 *
	 * @param fraction the fraction to divide by
	 * @return a fraction that represents the result
	 * @throws ArithmeticException if the parameter {@code fraction} is zero
	 */
	public Fraction divide(Fraction fraction) throws ArithmeticException {
		// TODO
		return null;
	}

	/**
	 * Multiplies this fraction by another.
	 *
	 * @param fraction the fraction to multiply by
	 * @return a fraction that represents the result
	 */
	public Fraction multiply(Fraction fraction) {
		// TODO
		return null;
	}

	/**
	 * Returns the reciprocal of this fraction.
	 *
	 * @return a fraction that represents the reciprocal of this fraction
	 */
	public Fraction reciprocal() {
		// TODO
		return null;
	}

	/**
	 * Returns the absolute value of this fraction.
	 *
	 * @return the absolute value of this fraction
	 */
	public Fraction abs() {
		// TODO
		return null;
	}

	/**
	 * Returns the value of this fraction as a {@code long}.
	 *
	 * @return the value of this fraction as a {@code long}
	 */
	public int intValue() {
		// TODO
		return 0;
	}

	/**
	 * Returns the value of this fraction as a {@code double}.
	 *
	 * @return the value of this fraction as a {@code double}
	 */
	public double doubleValue() {
		// TODO
		return 0;
	}

	/**
	 * Returns the value of this fraction as a {@code float}.
	 *
	 * @return the value of this fraction as a {@code float}
	 */
	public float floatValue() {
		// TODO
		return 0;
	}

	/**
	 * Returns the value of this fraction as a {@code long}.
	 *
	 * @return the value of this fraction as a {@code long}
	 */
	public long longValue() {
		// TODO
		return 0;
	}

	/**
	 * Returns whether this fraction is equal to zero.
	 *
	 * @return {@code true} if this fraction is equal to zero, {@code false} otherwise
	 */
	public boolean isZero() {
		// TODO
		return false;
	}

	/**
	 * Reduces this fraction.
	 *
	 * @return the result of the reduction of this fraction
	 */
	public Fraction reduce() {
		// TODO
		return null;
	}

	/**
	 * Creates and returns a copy of this object.
	 *
	 * @return a clone of this object
	 */
	public Object clone() {
		// TODO
		return null;
	}

	/**
	 * Compares this fraction with the specified object for equality. Two {@code Fraction} objects
	 * are considered equal if and only if their numerators and denominators are equal.
	 *
	 * @param o the object to compare to
	 * @return <code>true</code> if the objects are equal, <code>false</code> otherwise
	 */
	public boolean equals(Object o) {
		// TODO
		return false;
	}

	/**
	 * Returns a hash code value for this object.
	 *
	 * @return a hash code value for this object
	 */
	public int hashCode() {
		// TODO
		return 0;
	}

	/**
	 * Returns the string representation of this object. The result is
	 * <ul>
	 *     <li>{@code "0"} if the numerator is 0;</li>
	 *     <li>{@code "}<em>numerator</em>{@code "} if the denominator is 1;</li>
	 *     <li>{@code "}<em>numerator</em>{@code /}<em>denominator</em>{@code "} otherwise.</li>
	 * </ul>
	 *
	 * @return the string representation of this fraction
	 */
	public String toString() {
		// TODO
		return null;
	}

}
