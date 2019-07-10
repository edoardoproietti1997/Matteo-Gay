package punto2;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

// sto creando un oggetto che ha 3 metodi : quello per fare la connessione al database
//quello per fare una query e quello per fare l'inserimento di una nuova tupla (riga) nel db
public class DatabaseConnection
{	
	//mettiamo come variabili private il path (il percorso al db), la connessione al db,
	//il prepared statement e il resultSet (il risultato della query)
	private static final String pathDbase = "jdbc:mysql://localhost/world?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private Connection conn;
	private PreparedStatement statement;
	private ResultSet result ;
	//getter e setter
	public Connection getConn()
	{
		return conn;
	}
	public void setConn(Connection conn)
	{
		this.conn = conn;
	}
	public PreparedStatement getStatement()
	{
		return statement;
	}
	public void setStatement(PreparedStatement statement)
	{
		this.statement = statement;
	}
	public ResultSet getResult()
	{
		return result;
	}
	public void setResult(ResultSet result)
	{
		this.result = result;
	}

	//metodo per la connessione, questo metodo vorrà il passaggio delle string
	//username e passworld perchè appunto sono necessarie al fine della connessione
	public void dbConnection (String username , String passworld) 
	{
		try
		{
			this.conn = DriverManager.getConnection(pathDbase , username , passworld);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//metodo per la query di selezione, questo richiederà appunto il passaggio della query
	//di selezione e restituirà il ResultSet appunto perchè non sappiamo cosa l'utente
	//vorrà visualizzare e cosa no , quindi poi l'utente decideràà cosa fare col resultset
	public ResultSet querySelezione (String query)
	{
		try 
		{
			this.statement = this.conn.prepareStatement(query);
			this.result = statement.executeQuery(query);
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	//metodo per l'inserimento, questo metodo non restituirà nulla perchè
	//una volta completato l'inserimento non ci serve nient'altro
	public void queryInserimento ()
	{
		
	}
}