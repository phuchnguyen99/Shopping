package ws.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import java.io.Serializable;

@Provider
public class ExceptionHandler implements ExceptionMapper<ApplicationException>, Serializable
{

    @Override
    public Response toResponse(final ApplicationException exception)
    {
        return Response.status(exception.getResponseStatus()).entity(exception.getMessage()).build();
    }
}
