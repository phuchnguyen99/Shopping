package ws.services;

import user.User;
import ws.exception.UserException;
import ws.utils.UserUtil;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/user")
public class UserRestful
{
    @POST
    @Path("/getUser")
    @Produces({MediaType.APPLICATION_JSON})
    public void getUser(final User userInfo) throws UserException
    {
      UserUtil.verifyUserExistence(userInfo);
    }

    @POST
    @Path("/addUser")
    @Produces({MediaType.APPLICATION_JSON})
    public List<User> addUser(final User user) throws UserException
    {
       UserUtil.addUser(user);
       return UserUtil.getUsers();
    }

}
