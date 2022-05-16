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


public static void mostrarPokemon (Connection con) throws SQLException {
    String consulta = "SELECT * FROM POKEDEX";
    Statement statement = com.createStatement();
    ResultSet rs = statement.executeQuery(consulta);


    Pokemon e = null;
    while (rs.next()) {
        e = new Pokemon();
        e.setNumPokedex(rs.getInt("num_pokedex"));
        e.setNomPokemon(rs.getString("nom_pokemon"));
        e.tipo(rs.getString("tipo"));

        System.out.println(e.toString());
        
    }
    statement.close();

}


public static void insertarPokemon(Connection con, Pokemon p) throws SQLException {
    String sentencia ="INSERT INTO POKEDEX(NUM_POKEDEX,NOM_POKEMON, TIPO) VALUES("+ p.getnum_Pokedex()
                                                   +",'"+p.getnom_Pokemon()
                                                   +"','"+p.gettipo()
                                                   +"')";
    Statement stmt = null;
    try {
        stmt = con.createStatement();
        stmt.executeUpdate(sentencia);
        
        System.out.println("Nuevo pokemon insertado. "+p.getNomPokemon());
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        stmt.close(); // Puede lanzar SQLExceptions, por eso he puesto el
        // throws en la cabecera del método
    }
                                                   
}


}