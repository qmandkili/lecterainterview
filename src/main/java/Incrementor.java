/**
 * <h1>Number incrementor</h1>
 * The Incrementor program implements an application that
 * simply increment integer number.
 *
 * @author  Anton Isaev
 * @version 1.0
 * @since   2020-08-02
 */

public interface Incrementor {

    /**
     * Return current number.
     * @return int Returns current number variable.
     */
    int getNumber();



    /**
     * Increment number.
     */

    void incrementNumber();

    /**
     * Update maximum value variable. It should be positive.
     * @param maximumValue This is the value for set to maximumValue variable
     * @see Integer
     */

    void setMaximumValue(int maximumValue);

}