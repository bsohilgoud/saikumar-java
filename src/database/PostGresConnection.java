package database;

import java.sql.*;

public class PostGresConnection {

    public static void connectToDB(){
        String url = "jdbc:postgresql://localhost:5432/ipl";
        String user = "postgres";
        String password = "postgres";


        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM matches WHERE team1= 'Chennai Super Kings'");
            ResultSetMetaData rsmd = resultSet.getMetaData();
            int columnCount = rsmd.getColumnCount();
            System.out.println("columnCount = " + columnCount);

            System.out.println("Result is : \n ");
            // Print rows
            while (resultSet.next()) {
                StringBuilder row = new StringBuilder();
                for (int i = 1; i <= columnCount; i++) {
                    if (i > 1) row.append(", "); // Add a comma between values
                    row.append(rsmd.getColumnName(i)).append(": ").append(resultSet.getString(i)); // Append column name and value
                }
                System.out.println(row.toString()); // Print the entire row at once
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
