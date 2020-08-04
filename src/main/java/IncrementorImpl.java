/**
 * <h1>Number incrementor</h1>
 * The Incrementor program implements an application that
 * simply increment integer number.
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 * @author  Anton Isaev
 * @version 1.0
 * @since   2020-08-02
 */

public class IncrementorImpl implements Incrementor {

    /** int number variable */
    private int number = 0;

    /** int maximum value */
    private int maximumValue = Integer.MAX_VALUE;

    /**
     * The main method.
     * @param args Unused.
     */
    public static void main(String[] args) {

    }

    /**
     * Return current {@link IncrementorImpl#number}.
     * @return int Returns current number variable.
     */

    public int getNumber() {
        return number;
    }

    /**
     * Increment {@link IncrementorImpl#number}.
     * <p>If {@link IncrementorImpl#number} reaches {@link IncrementorImpl#maximumValue}
     * then {@link IncrementorImpl#number} will be dropped to ZERO
     * </p>
     */

    public void incrementNumber() {
        number = ++number >= maximumValue ? 0 : number;
    }

    /**
     * Update {@link IncrementorImpl#maximumValue}.
     * <p>Should be positive
     * If {@link IncrementorImpl#maximumValue} less than {@link IncrementorImpl#number}
     * then current {@link IncrementorImpl#number} will be dropped to ZERO</p>
     * @param maximumValue The value for set to {@link IncrementorImpl#maximumValue}.
     * @see Integer
     */

    public void setMaximumValue(int maximumValue) {
        if (maximumValue >= 0) {
            this.maximumValue = maximumValue;
            if (maximumValue < number) {
                number = 0;
            }
        }
    }
}