package ru.gb.server;

import java.sql.*;

public class JDBCAuthorization {

    private static Connection connection;
    private static Statement statement;

    public static void connect() throws SQLException {
        connection = DriverManager.getConnection("jdbc:sqlite:javadb.db");
        statement = connection.createStatement();
    }

    public static void disconnect() {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createTable() throws SQLException {
        try {
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS accounts (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "login TEXT," +
                    "password TEXT" +
                    ");");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            connection.rollback();
        }
    }

    public void insert(final String login, final String password) throws SQLException {
        try (final PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO accounts (login, password) VALUES (?, ?)")) {
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);
            preparedStatement.executeUpdate();
        }
    }

    public boolean chekAccount(String log, String pass) throws SQLException {
        try (ResultSet rs = statement.executeQuery("SELECT * FROM accounts;")) {
            while (rs.next()) {
                if (rs.getString("login").equals(log) && rs.getString("password").equals(pass)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public void dropTable() throws SQLException {
        statement.executeUpdate("DROP TABLE IF EXISTS accounts");
    }

}
