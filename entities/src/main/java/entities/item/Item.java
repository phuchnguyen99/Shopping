package entities.item;

import java.util.Objects;

/**
 *  Item class holds item variables
 * @author Phuc Nguyen
 */
public class Item
{
    /**
     * item id
     */
    private String itemId;
    /**
     * item name
     */
    private String itemName;
    /**
     * item price
     */
    private double itemPrice;

    /**
     * Constructor
     * @param itemId item id
     * @param itemName item name
     * @param itemPrice item price
     */
    public Item(final String itemId, final String itemName, final double itemPrice)
    {
        super();
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    /**
     * set item id
     * @param itemId itemId
     */
    public void setItemId(final String itemId)
    {
        this.itemId = itemId;
    }

    /**
     * set item name
     * @param itemName itemName
     */
    public void setItemName(final String itemName)
    {
        this.itemName = itemName;
    }

    /**
     * set item price
     * @param itemPrice itemPrice
     */
    public void setItemPrice(final double itemPrice)
    {
        this.itemPrice = itemPrice;
    }

    /**
     * get item id
     * @return itemId
     */
    public String getItemId()
    {
        return itemId;
    }

    /**
     * get item name
     * @return itemName
     */
    public String getItemName()
    {
        return itemName;
    }

    /**
     * get item price
     * @return itemPrice
     */
    public double getItemPrice()
    {
        return itemPrice;
    }

    @Override
    public boolean equals(final Object o)
    {
        if(o == null)
        {
            return false;
        }
        if(getClass() != o.getClass())
        {
            return false;
        }
        final Item that = (Item) o;
        return  that.getItemId().equals(getItemId()) &&
                that.getItemName().equals(getItemName());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getItemId().hashCode(), getItemName().hashCode());
    }
}
