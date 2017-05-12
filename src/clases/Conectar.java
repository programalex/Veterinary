/*
 * conexion a mysql
 */
package clases;
import java.sql.PreparedStatement;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alexander
 */
public class Conectar {
    
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    
    private static final String user = "root";
    private static final String passwore = "artealex123";
    private static final String url = "jdbc:mysql://localhost:3306/alex";

    public static PreparedStatement PreparedStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Conectar(){
    conn = null;
    try {
        Class.forName (driver);
        conn = (Connection) DriverManager.getConnection(url, user, passwore);
        if (conn != null){
            System.out.println("Conexion establecida...");
        }
    }catch (ClassNotFoundException | SQLException e){
      System.out.println("error al conectar" + e);
    }
    }
    // metodo que retorna conexion
    public Connection getConnection(){
        return conn;
    }
    // metodo que desconecta db
     public void desconectar (){
    conn = null;
    if (conn == null){
        System.out.println("Conexion terminada");
    }
}

    
}
