package com.gdaimon.restful.service;

import com.gdaimon.restful.model.Usuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author darkklitos
 */
@Local
public interface UsuarioFacadeLocal {

    void create(Usuario usuario);

    void edit(Usuario usuario);

    void remove(Usuario usuario);

    
}
