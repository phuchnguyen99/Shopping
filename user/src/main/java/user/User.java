package user;

import javax.xml.bind.annotation.XmlElement;
import java.util.Objects;

/**
 * User class holds user variables
 * @author Phuc Nguyen
 */
public class User
{
    /**
     * username
     */
    private final String username;
    /**
     * password
     */
    private final String password;
    /**
     * user type
     */
    private final UserType userType;

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
     * get username
     * @return username
     */
    @XmlElement
    public String getUsername()
    {
        return username;
    }

    /**
     * get password
     * @return password
     */
    @XmlElement
    public String getPassword()
    {
        return password;
    }

    /**
     * get user type
     * @return userType
     */
    @XmlElement
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
