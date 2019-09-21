package ws.exception;

import javax.inject.Singleton;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.*;
import java.io.Serializable;

/**
 * User Exception handles exception from user services
 * @author Phuc Nguyen
 */

public class UserException extends ApplicationException
{
    /**
     * message
     */
    private String message;
    /**
     * Constructor
     * @param message message
     * @param responseStatus responseStatus
     */
    public UserException(final String message, final Response.Status responseStatus)
    {
       super(responseStatus, message);
    }

    /**
     * Constructor
     */
    public UserException()
    {

    }

    /**
     * getMessage
     * @return message
     */
    public String getMessage()
    {
        return message;
    }

}
