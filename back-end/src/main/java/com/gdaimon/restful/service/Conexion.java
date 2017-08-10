
package com.gdaimon.restful.service;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author darkklitos
 * conexion base de datos
 */
public class Conexion {

    protected static Connection cx;

    public static Connection conectar() {
        if (cx != null) {
            return cx;
        }

        try {

            String url = "XXXXXXXX";
            String user = "XXXXXXXX";
            String password = "XXXXXX";
            Class.forName("com.mysql.jdbc.Driver");
            cx = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cx;
    }

    public static void desconectar() {
        if (cx == null) {
            return;
        }
        try {
            cx.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
