package user;

import java.io.Serializable;
import java.util.Objects;

/**
 * User class holds user variables
 * @author Phuc Nguyen
 */
public class User implements Serializable
{
    /**
     * username
     */
    private String username;
    /**
     * password
     */
    private String password;
    /**
     * user type
     */
    private UserType userType;

    /**
     * Constructor
     * @param username username
     * @param password password
     * @param userType user type
     */
    public User(final String username, final String password, final UserType userType)
    {
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    /**
     * Default constructor
     */
    public User()
    {

    }
    /**
     * get username
     * @return username
     */
    public String getUsername()
    {
        return username;
    }

    /**
     * get password
     * @return password
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * get user type
     * @return userType
     */
    public UserType getUserType()
    {
        return userType;
    }

    @Override
    public boolean equals(final Object o)
    {
        if(o == null)
        {
            return false;
        }
        if(o.getClass() != getClass())
        {
            return false;
        }
        final User that = (User) o;
        return  getUsername().equals(that.getUsername()) &&
                getPassword().equals(that.getPassword()) &&
                getUserType().equals(that.getUserType());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getUsername(), getPassword(), getUserType());
    }
}
