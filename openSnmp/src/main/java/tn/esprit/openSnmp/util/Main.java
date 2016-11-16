/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.openSnmp.util;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author alaa
 */
public class Main {
    public static void main(String[] argv) throws SQLException  {

Connection con = DataBase.getInstance().getConnections("jdbc:mysql://localhost:3306/db_monitoring", "root", "");
DataBase.getInstance().getConnections("jdbc:mysql://localhost:3306/db_monitoring", "root", "");



  }
}
