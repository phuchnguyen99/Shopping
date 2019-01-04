package ws.services;

import entities.item.Item;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


/**
 * The class provides services for item restful api
 * @author Phuc Nguyen
 */
@Path("/item")
public class ItemRestful
{
    @GET
    @Path("/getAllItems")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Item> obtainAllItems()
    {
        return ItemListSingleton.getItems();
    }

}
