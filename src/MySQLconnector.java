package src;

import java.sql.*;

import src.pokemon.Movimiento;
import src.pokemon.MovimientoAtaque;
import src.pokemon.Pokemon;
import src.pokemon.Tipo;



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



public static void mostrarPokemon (Connection con) throws SQLException {
    String consulta = "SELECT * FROM POKEDEX";
    Statement statement = con.createStatement();
    ResultSet rs = statement.executeQuery(consulta);


    Pokemon pokemon = new Pokemon();
    
    while (rs.next()) {
        pokemon.setNumPokedex(rs.getInt("num_pokedex"));
        pokemon.setNomPokemon(rs.getString("nom_pokemon"));
        pokemon.setTipo(Tipo.valueOf(rs.getString("tipo")));

        System.out.println(pokemon.toString());
        
    }
    statement.close();

}
/**
 * "INSERT INTO POKEDEX(NUM_POKEDEX,NOM_POKEMON, TIPO) VALUES(6,'Charizard','FUEGO')"
 */

public static void insertarPokemon(Connection con, Pokemon p) throws SQLException {
    String sentencia ="INSERT INTO POKEDEX(NUM_POKEDEX,NOM_POKEMON, TIPO) VALUES("+ p.getNumPokedex()
                                                   +",'"+p.getNombre()
                                                   +"','"+p.getTipo().toString()
                                                   +"')";
    Statement stmt = null;
    try {
        stmt = con.createStatement();
        stmt.executeUpdate(sentencia);
        
        System.out.println("Nuevo pokemon insertado. "+p.getNombre());
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        stmt.close(); // Puede lanzar SQLExceptions, por eso he puesto el
        // throws en la cabecera del método
    }
                                                   
}


}