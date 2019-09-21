package ws;

import ws.exception.ExceptionHandler;
import ws.exception.UserException;
import ws.services.ItemRestful;
import ws.services.UserRestful;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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

    @Override
    public Map<String, Object> getProperties()
    {
        final Map<String, Object> properties = new HashMap<>();
        properties.put("jersey.config.server.provider.packages", "ws.exception");
        return properties;
    }

    /**
     * add service classes to resource
     * @param resources resources
     */
    private void addRestResourcesClasses(Set<Class<?>> resources)
    {
       resources.add(ItemRestful.class);
       resources.add(UserRestful.class);
       resources.add(ExceptionHandler.class);
    }

}
