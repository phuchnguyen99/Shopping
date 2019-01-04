package ws.services;

import entities.item.Item;
import ws.exception.ItemException;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton class to update item list without initiating
 * new objects after each restful services call
 * @author Phuc Nguyen
 */
public class ItemListSingleton
{
    private static List<Item> items = new ArrayList<>();

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
          throw new ItemException("Items already exists");
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
            throw new ItemException("Items does not exist");
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
            throw new ItemException("Items does not exist");
        }
       //todo update existing item
    }

    /**
     * get all items
     * @return items
     */
    public static List<Item> getItems()
    {
        items.add(new Item("01", "name 1", 2000));
        return items;
    }
}
