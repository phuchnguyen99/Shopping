import javax.xml.bind.annotation.XmlElement;
import java.util.Objects;

/**
 * Item class holds item variables
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
    private Double itemPrice;

    /**
     * Constructor
     * @param itemId item id
     * @param itemName item name
     * @param itemPrice item price
     */
    public Item(final String itemId, final String itemName, final Double itemPrice)
    {
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
    public void setItemPrice(final Double itemPrice)
    {
        this.itemPrice = itemPrice;
    }

    /**
     * get item id
     * @return itemId
     */
    @XmlElement
    public String getItemId()
    {
        return itemId;
    }

    /**
     * get item name
     * @return itemName
     */
    @XmlElement
    public String getItemName()
    {
        return itemName;
    }

    /**
     * get item price
     * @return itemPrice
     */
    @XmlElement
    public Double getItemPrice()
    {
        return itemPrice;
    }

    @Override
    public boolean equals(final Object o)
    {
        if(o == null || getClass() != o.getClass())
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
        return Objects.hash(itemId.hashCode(), itemName.hashCode());
    }
}
