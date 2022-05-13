package src;

import java.io.IOException;
import java.sql.*;
import javax.sql.*;

public class MySQLconnector {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/pok_mon";
        String login = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, login, password);

            System.out.println("Conexión establecida con éxito");

            /**
             * A partir de esta línea la conexión queda establecida, por lo que se puede hacer cualquier insert, select etc...
             */
            try {
                connection.close();
                System.out.println("Conexión cerrada");

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (SQLException sqle) {
            sqle.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
