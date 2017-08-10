package com.gdaimon.restful.service;

import com.gdaimon.restful.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import java.sql.Statement;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author darkklitos
 */
@Stateless
@Path("/usuarios")
@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
public class UsuarioFacade {

    private Connection cx;

    public UsuarioFacade() {
        cx = Conexion.conectar();
    }

    
    
    
    /**
     * Metodo que crea en la db un usuario
     *
     * @param usuario
     */
    @POST
    public void create(Usuario usuario) {
        try {
            String sql = "INSERT INTO USUARIO(nombres, apellidos) VALUES (?,?)";
            PreparedStatement preparedStatement = cx.prepareStatement(sql);
            preparedStatement.setString(1, usuario.getUsuario());
            preparedStatement.setString(2, usuario.getClave());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
        @GET
        @Path("login")
    public Usuario login(@QueryParam("usuario") String nombre, @QueryParam("clave") String clave  ) {
        Usuario user = new Usuario();
        try {
            String query = "SELECT * FROM usuario WHERE usuario =? and clave =?";
            PreparedStatement preparedStatement = cx.prepareStatement(query);
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, clave);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user.setCodigo(resultSet.getInt("codigo"));
                user.setUsuario(resultSet.getString("usuario"));
                user.setClave(resultSet.getString("clave"));
                user.setTipo(resultSet.getString("tipo"));
            }
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;        
    }
    

    public void edit(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public void remove(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @GET
    @Path("{id}")
    public Usuario find(@PathParam("id") int id) {
        Usuario usuario = new Usuario();
        try {
            String query = "SELECT * FROM usuario WHERE codigo =?";
            PreparedStatement preparedStatement = cx.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                usuario.setCodigo(resultSet.getInt("codigo"));
                usuario.setUsuario(resultSet.getString("usuario"));
            }
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }

    @GET
    public List<Usuario> findAll() {

        List<Usuario> usuarios = new ArrayList<>();
        try {
            Statement statement = cx.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT  * FROM usuario ");
            while (resultSet.next()) {
                Usuario usuario = new Usuario();
                usuario.setCodigo(resultSet.getInt("codigo"));
                usuario.setUsuario(resultSet.getString("usuario"));
                usuarios.add(usuario);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //Conexion.desconectar();
        }
        return usuarios;

    }

}
