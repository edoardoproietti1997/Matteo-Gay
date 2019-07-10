package it.corsojava.dstech.soluzioneFrancesco.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConnessioneDB {
	private String indirizzo;
	private String password;
	private String username;
	private Connection connection;

	public ConnessioneDB(String address, String user, String pass) throws ClassNotFoundException, SQLException {
		this.indirizzo = address;
		this.username = user;
		this.password = pass;
		Class.forName("com.mysql.jdbc.Driver");
		this.connection = DriverManager.getConnection(this.indirizzo, this.username, this.password);
	}
	
	public ResultSet select(String querySelect) throws SQLException {
		PreparedStatement statement = this.connection.prepareStatement(querySelect);
		ResultSet risultato = statement.executeQuery();
		return risultato;

	}
	
	public void insert (String queryInsert) throws SQLException {
		PreparedStatement preparedStatement = this.connection.prepareStatement(queryInsert);
		preparedStatement.execute();
	}

}
