package com.vilniuscoding.shippingapp;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;

public class DBoperations extends Controller {

	public static void createNewDatabase(String fileName) {

		String url = "jdbc:sqlite:C:/Users/Tom/eclipse-workspace/DataBases/" + fileName;

		try (Connection conn = DriverManager.getConnection(url)) {
			if (conn != null) {
				DatabaseMetaData meta = conn.getMetaData();
				System.out.println("The driver name is " + meta.getDriverName());
				System.out.println("A new database named - shipments has been created.");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void createNewTable() {
		// SQLite connection string
		String url = "jdbc:sqlite:C:/Users/Tom/eclipse-workspace/DataBases/shipments.db";
		System.out.println("Connected!");

		// SQL statement for creating a new table
		String sql = "CREATE TABLE export (" + " AWBno STRING PRIMARY KEY," + " DocumentDate VARCHAAR (10),"
				+ " CustomerReference VARCHAR(10)," + " ReceiversName VARCHAR(30)," + " Packages INT NOT NULL,"
				+ "	TotalWeight DOUBLE NOT NULL," + " ReceiversCountry VARCHAR(30)" + ");";
		System.out.println(sql);

		try (Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement()) {
			// create a new table
			stmt.execute(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	private Connection connect() {
		// SQLite connection string
		String url = "jdbc:sqlite:C:/Users/Tom/eclipse-workspace/DataBases/shipments.db";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}

	public void insertToDatabase(String awbNo, Object docDate, String custRef, String receiversName, int totalUnits,
			Double shipmentWeight, String receiversCountry) {
		String sql = "INSERT INTO export (AWBno, DocumentDate, CustomerReference, ReceiversName, Packages, TotalWeight, ReceiversCountry) VALUES(?,?,?,?,?,?,?)";

		try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, awbNo);
			pstmt.setObject(2, docDate);
			pstmt.setString(3, custRef);
			pstmt.setString(4, receiversName);
			pstmt.setInt(5, totalUnits); 
			pstmt.setDouble(6, shipmentWeight);
			pstmt.setString(7, receiversCountry);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	//nepanaudotas
	public void selectAll() {
		String sql = "SELECT AWBno, DocumentDate, CustomerReference, ReceiversName, Packages, TotalWeight, ReceiversCountry FROM export";

		try (Connection conn = this.connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			// loop through the result set
			System.out.println("    AWBno    | DocumentDate | CustomerReference | ReceiversName | Packages | TotalWeight | ReceiversCountry");
			while (rs.next()) {
			System.out.println(rs.getString(1) + "\t" + rs.getObject(2) + "\t"
			+ rs.getString(3) + "\t" + rs.getString(4) + "\t"
			+ rs.getInt(5) + "\t" + rs.getDouble(6) + "\t"
			+ rs.getString(7));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
