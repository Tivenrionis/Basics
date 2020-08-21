package com.tiven.questy.Databases;

import java.sql.*;

//2 ways to get connection
// DriverManager or DataSource objects -> more flexible and used in EE apps
public class Main {
    public static void main(String[] args) {

/*        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\tiven\\DATABASES\\testjava.db");
             Statement statement = connection.createStatement()) {

            statement.execute("CREATE TABLE contacts (name VARCHAR(255),phone INT, email TEXT)");


        } catch (SQLException e) {
            System.out.println("Something went wrong " + e.getMessage());
        }*/
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\tiven\\DATABASES\\testjava.db");
            //connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts " +
                    "(name VARCHAR(255),phone INT, email TEXT)");

//            statement.execute("INSERT INTO contacts VALUES ('Julia','4252222','vdd@mail.com')");
//            statement.execute("INSERT INTO contacts VALUES ('Michal','256662','tiv@mail.com')");
//            statement.execute("INSERT INTO contacts VALUES ('Pola','6321222','polpol@mail.com')");
//            statement.execute("INSERT INTO contacts VALUES ('Rozalia','9726465','rozbloz@mail.com')");
//
//            statement.execute("UPDATE contacts SET name='TIVEN' WHERE name='Rozalia'");
//            statement.execute("DELETE FROM contacts WHERE name = 'TIVEN'");

            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();
            while (results.next()) {
                System.out.println(results.getString("name") + " " +
                        results.getInt("phone") + " " +
                        results.getString("email"));
            }

            results.close();
            statement.close();
            connection.close();


        } catch (SQLException e) {
            System.out.println("Something went wrong " + e.getMessage());
        }

    }
}
