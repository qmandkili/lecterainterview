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
     * @return Nothing.
     */
    public static void main(String[] args) {

    }

    /**
     * Return current number variable {@link IncrementorImpl#number}.
     * @return int This returns current number variable.
     */

    public int getNumber() {
        return number;
    }

    /**
     * This method is used to increment number variable {@link IncrementorImpl#number}.
     */

    public void incrementNumber() {
        number = ++number >= maximumValue ? 0 : number;
    }

    /**
     * This method is used update maximum value variable {@link IncrementorImpl#maximumValue}.
     * It should be positive.
     * @param maximumValue This is the value for set to maximumValue variable
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