package com.asia;

import java.sql.*;

public class Main {

    public static final String DB_NAME = "testJava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\dev\\Java-Course\\TestDB\\" + DB_NAME;

    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection(CONNECTION_STRING);
            Statement statement = connection.createStatement();

           // statement.execute("DROP TABLE IF EXIST " + TABLE_CONTACTS);

            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                    "(" + COLUMN_NAME + " text, " +
                    COLUMN_PHONE + " integer, " +
                    COLUMN_EMAIL + " text" + ")");

            insertContact(statement, "Tim", 123456, "tim@email.com");
            insertContact(statement,"Joe", 654321, "joe@email.com");
            insertContact(statement, "Jane", 147963, "jane@email.com");
            insertContact(statement, "Fido", 159753, "dog@email.com");

            statement.execute("UPDATE " + TABLE_CONTACTS +
                    " SET " + COLUMN_PHONE + " = 112233" +
                    " WHERE " + COLUMN_NAME + " = 'Jane'");

            statement.execute("DELETE FROM " + TABLE_CONTACTS +
                    " WHERE " + COLUMN_NAME + " = 'Joe'");

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
            System.out.println("Something went wrong: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertContact(Statement statement, String name, int phone, String email)
        throws SQLException {
             statement.execute("INSERT INTO " + TABLE_CONTACTS +
                     " (" + COLUMN_NAME + ", " +
                     COLUMN_PHONE + ", " +
                     COLUMN_EMAIL + ") " +
                     "VALUES('" + name + "', " + phone + ", '" + email + "')");
    }
}
