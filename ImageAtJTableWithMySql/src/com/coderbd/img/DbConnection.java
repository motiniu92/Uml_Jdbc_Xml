
package com.coderbd.img;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DbConnection {
     private static final String HOST = "jdbc:mysql://localhost:3306";
    private static final String DBNMAE = "ajax";
    private static final String URL = HOST + "/" + DBNMAE;
    private static Connection con = null;

    public static Connection getConnection() {
        try {
            con = DriverManager.getConnection(URL, "root", "1234");
            System.out.println("::Connected::");
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
