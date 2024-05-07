/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.dbcp2.BasicDataSource;
/**
 *
 * @author jonty
 */
public class DBManager {
    private static final BasicDataSource datasource;
    static{
        datasource=new BasicDataSource();
        datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        datasource.setUrl("jdbc:mysql://localhost:3306/portfolio?autoReconnect=true&useSSL=false");
        datasource.setUsername("root");
        datasource.setPassword("root");
        datasource.setMinIdle(10);
        datasource.setMaxIdle(10);
        datasource.setMaxOpenPreparedStatements(100);
    }
    public static Connection getConn() {
        try {
            return datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
      
        }return null;
    }
}
