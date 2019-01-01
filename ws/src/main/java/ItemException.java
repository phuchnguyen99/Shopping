/**
 * Exception class handle exception if the operation fails
 * @author Phuc Nguyen
 */
public class ItemException extends Exception
{
    /**
     * Constructor
     * @param message message
     */
    public ItemException(final String message)
    {
        super(message);
    }
}
