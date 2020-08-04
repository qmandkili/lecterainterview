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
     * This method is used to get current number variable.
     * @return int This returns current number variable.
     */
    int getNumber();



    /**
     * This method is used to increment number variable.
     */

    void incrementNumber();

    /**
     * This method is used update maximum value variable. It has constrains.
     * It should be positive and less than Integer.MAX_VALUE
     * @param maximumValue This is the value for set to maximumValue variable
     * @see Integer
     */

    void setMaximumValue(int maximumValue);

}