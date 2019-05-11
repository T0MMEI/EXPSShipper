package com.vilniuscoding.shippingapp;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBoperations {

    public static void createNewDatabase(String fileName) {
    	 
        String url = "jdbc:sqlite:C:/Users/Tom/eclipse-workspace/DataBases/" + fileName;
 
        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public static void createNewTable() {
        // SQLite connection string
        String url = "jdbc:sqlite:C:/Users/Tom/eclipse-workspace/DataBases/shipments.db";
        
        // SQL statement for creating a new table
        String sql = "CREATE TABLE EXPORT (\n"
                + " AWBno STRING PRIMARY KEY,\n"
                + "	Shipper VARCHAR(30),\n"
                + "	CollectionAddress VARCHAR(50),\n"
                + "	Receiver VARCHAR(30),\n"
                + "	DeliveryAddress VARCHAR(50),\n"
                + "	NumbOfPieces INT NOT NULL,\n"
                + "	TotalWeight DOUBLE NOT NULL,\n"
                + " Volume DOUBLE NOT NULL,\n"
                + ");";
        
        
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
 
    
    
    
    
    /// MAIN ---!

    public static void main(String[] args) {
		
    	//createNewDatabase("shipments.db");
    	createNewTable();
	}
	
	
}
