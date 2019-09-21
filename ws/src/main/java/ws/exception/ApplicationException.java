package ws.exception;

import javax.ws.rs.core.Response;
import java.io.Serializable;

/**
 * Custom super exception class handle all application exception
 * @author Phuc Nguyen
 */
public class ApplicationException extends Exception implements Serializable
{
    private Response.Status responseStatus;

    private String message;

    /**
     * Default Constructor
     */
    public ApplicationException()
    {

    }

    public ApplicationException(final Response.Status responseStatus, final String message)
    {
        this.responseStatus = responseStatus;
        this.message = message;
    }

    /**
     * get response status
     * @return response status
     */
    public  Response.Status getResponseStatus()
    {
        return responseStatus;
    }

    /**
     * get message
     * @return message
     */
    public String message()
    {
        return message;
    }
}
