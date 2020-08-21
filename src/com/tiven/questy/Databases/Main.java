package com.tiven.questy.Databases;

import java.sql.*;

//2 ways to get connection
// DriverManager or DataSource objects -> more flexible and used in EE apps
public class Main {
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\tiven\\DATABASES\\" + DB_NAME;

    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {

/*        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\tiven\\DATABASES\\testjava.db");
             Statement statement = connection.createStatement()) {

            statement.execute("CREATE TABLE contacts (name VARCHAR(255),phone INT, email TEXT)");


        } catch (SQLException e) {
            System.out.println("Something went wrong " + e.getMessage());
        }*/
        try {
            Connection connection = DriverManager.getConnection(CONNECTION_STRING);
            //connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                    "(" + COLUMN_NAME + " VARCHAR(255)," +
                    COLUMN_PHONE + " INT," +
                    COLUMN_EMAIL + " TEXT)");

            statement.execute("INSERT INTO " + TABLE_CONTACTS + " VALUES ('Julia','4252222','vdd@mail.com')");
            statement.execute("INSERT INTO " + TABLE_CONTACTS + " VALUES ('Michal','256662','tiv@mail.com')");
            statement.execute("INSERT INTO " + TABLE_CONTACTS + " VALUES ('Pola','6321222','polpol@mail.com')");
            statement.execute("INSERT INTO " + TABLE_CONTACTS + " VALUES ('ROZ','733552','rrr@mail.com')");
            statement.execute("INSERT INTO " + TABLE_CONTACTS + " VALUES ('Kristen','4264215','kky@mail.com')");

//            statement.execute("INSERT INTO contacts VALUES ('Rozalia','9726465','rozbloz@mail.com')");
//
            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " + COLUMN_NAME + "='TIVEN' WHERE " + COLUMN_NAME + "='ROZ'");
            statement.execute("DELETE FROM " + TABLE_CONTACTS + " WHERE " + COLUMN_NAME + " = 'TIVEN'");

//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();

            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
            while (results.next()) {
                System.out.println(results.getString(COLUMN_NAME) + " " +
                        results.getInt(COLUMN_PHONE) + " " +
                        results.getString(COLUMN_EMAIL));
            }

            results.close();
            statement.close();
            connection.close();


        } catch (SQLException e) {
            System.out.println("Something went wrong " + e.getMessage());
        }

    }
}
