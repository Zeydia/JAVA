/*
	Pour ajouter le driver en compilant
	javac Main.java
	java -classpath ".:mysql-connector-java-8.0.30.jar" Main
	
	Ou ajouter dans les modules ou libraires sur d'qutres IDE


	statement.executeQuery(): pour recuperer des donnees
	statement.executeUpdate(): pour ajouter supprimer ou modifier


	ResultSet.getString(ColumnName);
	ResultSet.getInt(ColumnName or ColumnIndex);

	PrepareStatement st = co.preparedStatement("update employees set first_name = ? where first_name = ?;");

	st.setString(1, "Tom");
	st.setString(2, "Jean");
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main 
{
	public static void main(String[] args)
	{

		try
		{	
			String url = "jdbc:mysql://localhost:3306/exo_java";
			String username = "root";
			String password = "";


			Connection co = DriverManager.getConnection(url, username,password);
			Statement st = co.createStatement();

			ResultSet res = st.executeQuery("select * from employees;");

			while(res.next())
			{
				System.out.println(res.getString("id")+" "+res.getString("first_name")+" "+res.getString("last_name"));
				//recupere chaque colonne res.getString(columnIndex);
			}
	
			co.close();
		}
		catch(SQLException e)
		{
			System.out.println("Message d'erreur: "+e.getMessage());
		}
	}
}