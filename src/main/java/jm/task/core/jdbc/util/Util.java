package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public  class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/newtest?serverTimezone=Europe/Moscow&useSSL=false";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() throws ClassNotFoundException {

        Connection connection = null;
        try {
            Class.forName(DRIVER).newInstance();
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }

}
