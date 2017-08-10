package com.gdaimon.restful;

import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author darkklitos
 * path de ingreso al API
 */
@ApplicationPath("api")
public class Aplicacion extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        return null;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
                
    }

}
