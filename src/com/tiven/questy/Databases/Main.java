package com.tiven.questy.Databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts " +
                            "(name VARCHAR(255),phone INT, email TEXT)");

            statement.close();
            connection.close();


        } catch (SQLException e) {
            System.out.println("Something went wrong " + e.getMessage());
        }

    }
}
