/**
 * Interface Clock gives methods for a basic clock
 *      (AM and PM are not distinguished)
 * May need to call normalizeTime() after some time
 *  changes/constructors if the data might result
 *  in times that are not "normal" for the clock type
 *
 * @author Stevie Lord
 * @version updated June 2012
 */
public interface Clock
{
    // Accessors
    public int getHour();
    public int getMinutes();

    // Modifiers/Mutators
    // Precondition: hr and min represent valid time
    public void setHour(int hr);
    public void setMinutes(int min);

    // Override Object's methods
    public String toString();
    public boolean equals (Object obj);

    // Other methods
    /**
     * "normalizes" time to proper hour & minutes values
     *  For example: 1<=hour<=12 and 0<=minutes<60
     *               AM and PM are not distinguished
     *  May be changed for each "clock style"
     */
    public void normalizeTime();

    // Adds a minute to time & calls normalizeTime()
    public void addOneMinute();

    // Adds some minutes to time & calls normalizeTime()
    public void addMinutes(int min);

    // Adds some hours & minutes to time
    //  & calls normalizeTime()
    public void addTime(int hr, int min);

    // Resets the time
    // Precondition: hr and min represent valid time
    public void resetTime(int hr, int min);
}
