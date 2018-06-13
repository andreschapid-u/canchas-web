/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

/**
 *
 * @author Carlos Andrés Chapid Inga
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private String username = "root";
    private String password = "";
    private String hostname = "localhost";
    private String port = "3306";
    private String database = "db_canchas";
    private String classname = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database;
    private Connection conn;

    public Conexion() {
        try {
            Class.forName(classname);
            this.conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.err.println("Error, " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return this.conn;
    }

    public void cerrarConnection() {
        if (this.conn != null) {
            try {
                this.conn.close();
            } catch (SQLException ex) {
                System.err.println("Error, " + ex.getMessage());
            }
        }
    }

//    public static void main(String[] args) {
//        Conexion c = new Conexion();
//        c.getConnection();
//    }
}
