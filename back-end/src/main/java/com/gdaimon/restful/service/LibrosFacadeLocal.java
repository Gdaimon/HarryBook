
package com.gdaimon.restful.service;

import com.gdaimon.restful.model.Libros;
import java.util.List;
import javax.ejb.Local;
import javax.ws.rs.PathParam;

/**
 *
 * @author darkklitos
 */
@Local
public interface LibrosFacadeLocal {

    void create(Libros libros);

    void edit(Libros libros);

    void remove(Libros libros);


    
}
