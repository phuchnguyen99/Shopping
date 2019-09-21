package ws.utils;

import user.User;
import ws.exception.UserException;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * UserUtil handle user restful services
 * @author Phuc Nguyen
 */

public class UserUtil
{
    /**
     * users list
     */
    private final static List<User> users = new ArrayList<>();

    /**
     * Constructor
     */
    private UserUtil()
    {

    }

    /**
     * get user
     * @param user user
     * @throws UserException if operation fails
     * @return whether user exist or not
     */
    public static void verifyUserExistence(final User user) throws UserException
    {
        if(!users.contains(user));
        {
            throw new UserException("User does not exist", Response.Status.NOT_FOUND);
        }
    }

    /**
     * add user
     * @param user user
     * @throws UserException if operation fails
     */
    public static void addUser(final User user) throws UserException
    {
        if(users.contains(user))
        {
            throw new UserException("User already exists", Response.Status.BAD_REQUEST);
        }
        users.add(user);
    }

    public static List<User> getUsers()
    {
        return users;
    }
}
