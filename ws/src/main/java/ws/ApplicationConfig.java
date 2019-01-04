package ws;

import ws.services.ItemRestful;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * The class configures all restFul service classes
 * @author Phuc Nguyen
 */
@ApplicationPath("rest")
public class ApplicationConfig extends Application
{
    @Override
    public Set<Class<?>> getClasses()
    {
        final Set<Class<?>> resources = new HashSet<>();
        addRestResourcesClasses(resources);
        return resources;
    }

    /**
     * add service classes to resource
     * @param resources resources
     */
    private void addRestResourcesClasses(Set<Class<?>> resources)
    {
       resources.add(ItemRestful.class);
    }

}
