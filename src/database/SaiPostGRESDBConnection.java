package database;

import java.sql.*;

public class SaiPostGRESDBConnection {
    public static void connectToDB(){
        String dburl = "jdbc:postgresql://localhost:5432/ipl";
        String userName = "postgres";
        String password = "postgres";

        try{
            Class<?> aClass = Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(dburl, userName, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT city FROM matches WHERE team1='Chennai Super Kings'");

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            System.out.println("columnCount = " + columnCount);

            System.out.println("Result: \n ");
            while(resultSet.next()){
                System.out.println("City: " + resultSet.getString(1));
            }

        } catch (Exception e){
            System.out.println("Failed to connect to DB: \n " + e);
        }

    }
}
