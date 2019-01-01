import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Singleton class to update item list without initiating
 * new objects after each restful services call
 * @author Phuc Nguyen
 */
public class ItemListSingleton
{
    private static final List<Item> items = new ArrayList<>();

    /**
     * Constructor
     *
     */
    private ItemListSingleton()
    {
        //private constructor to prevent the class
        //being initiated
    }

    /**
     * add item
     * @param item item
     * @throws ItemException if the operation fails
     */
    public static void addItem(final Item item) throws ItemException
    {
      if(items.contains(item))
      {
          throw new ItemException("Item already exists");
      }
      items.add(item);
    }

    /**
     * remove item
     * @param item item
     * @throws ItemException if the operation fails
     */
    public static void removeItem(final Item item) throws ItemException
    {
        if(!items.contains(item))
        {
            throw new ItemException("Item does not exist");
        }
        items.remove(item);
    }

    /**
     * update item
     * @param item item
     * @throws ItemException if the operation fails
     */
    public static void updateItem(final Item item) throws ItemException
    {
        if(!items.contains(item))
        {
            throw new ItemException("Item does not exist");
        }
       //todo update existing item
    }

    /**
     * get all items
     * @return items
     */
    public static List<Item> getItems()
    {
        return items;
    }
}
