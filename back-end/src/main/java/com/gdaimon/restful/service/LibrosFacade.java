package com.gdaimon.restful.service;

import com.gdaimon.restful.model.Libros;
import com.gdaimon.restful.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author darkklitos
 */
@Stateless
@Path("/libros")
@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
public class LibrosFacade  {

    private Connection cx;
    public LibrosFacade() {
        cx = Conexion.conectar();
    }

    
    public void create(Libros libro) {
        
    }

    
    public void edit(Libros libro) {
        
    }

    
    public void remove(Libros libro) {
        
    }

    
    
        @GET
    @Path("{id}")
    public Libros find(@PathParam("id") int id) {
        Libros libro = new Libros();
        try {
            String query = "SELECT * FROM libros WHERE codigo =?";
            PreparedStatement preparedStatement = cx.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                libro.setCodigo(resultSet.getInt("codigo"));
                libro.setNombre(resultSet.getString("nombre"));
                libro.setImg(resultSet.getString("img"));
                libro.setCantidad(resultSet.getInt("cantidad"));
                libro.setPrecio(resultSet.getInt("precio"));
            }
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return libro;
    }
    
    @GET
    public List<Libros> findAll() {

        List<Libros> libros = new ArrayList<>();
        try {
            Statement statement = cx.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT  * FROM libros ");
            while (resultSet.next()) {
                Libros libro = new Libros();
                libro.setCodigo(resultSet.getInt("codigo"));
                libro.setNombre(resultSet.getString("nombre"));
                libro.setImg(resultSet.getString("img"));
                libro.setCantidad(resultSet.getInt("cantidad"));
                libro.setPrecio(resultSet.getInt("precio"));
                libros.add(libro);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //Conexion.desconectar();
        }
        return libros;

    }
    
    
}
