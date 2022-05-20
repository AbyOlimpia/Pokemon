package src.pokemon;

import java.util.LinkedList;
import java.util.Random;

public class Pokedex {

    public static LinkedList<Pokemon> pokedex = new LinkedList<>();

    public static void inicializarPokedex() {
        pokedex.add(new Pokemon("Bulbasaur", 1, Tipo.PLANTA, 1, 0));
        pokedex.add(new Pokemon("Ivysaur", 1, Tipo.PLANTA, 2, 0));
        pokedex.add(new Pokemon("Venusaur", 1, Tipo.PLANTA, 3, 0));
        pokedex.add(new Pokemon("Charmander", 1, Tipo.FUEGO, 4, 0));
        pokedex.add(new Pokemon("Charmeleon", 1, Tipo.FUEGO, 5, 0));
        pokedex.add(new Pokemon("Charizard", 1, Tipo.FUEGO, 6, 0));
        pokedex.add(new Pokemon("Squirtle", 1, Tipo.AGUA, 7, 0));
        pokedex.add(new Pokemon("Wartortle", 1, Tipo.AGUA, 8, 0));
        pokedex.add(new Pokemon("Blastoise", 1, Tipo.AGUA, 9, 0));
        pokedex.add(new Pokemon("Pidgey", 1, Tipo.VOLADOR, 10, 0));
        pokedex.add(new Pokemon("Pidgeotto", 1, Tipo.VOLADOR, 11, 0));
        pokedex.add(new Pokemon("Pidgeot", 1, Tipo.VOLADOR, 12, 0));
        pokedex.add(new Pokemon("Pikachu", 1, Tipo.ELECTRICO, 13, 0));
        pokedex.add(new Pokemon("Raichu", 1, Tipo.ELECTRICO, 14, 0));
        pokedex.add(new Pokemon("Vulpix", 1, Tipo.FUEGO, 15, 0));
        pokedex.add(new Pokemon("Ninetales", 1, Tipo.FUEGO, 16, 0));
        pokedex.add(new Pokemon("Diglett", 1, Tipo.TIERRA, 17, 0));
        pokedex.add(new Pokemon("Dugtrio", 1, Tipo.TIERRA, 18, 0));
        pokedex.add(new Pokemon("Growlithe", 1, Tipo.FUEGO, 19, 0));
        pokedex.add(new Pokemon("Arcanine", 1, Tipo.FUEGO, 20, 0));
        pokedex.add(new Pokemon("Geodude", 1, Tipo.TIERRA, 21, 0));
        pokedex.add(new Pokemon("Graveler", 1, Tipo.TIERRA, 22, 0));
        pokedex.add(new Pokemon("Golem", 1, Tipo.TIERRA, 23, 0));
        pokedex.add(new Pokemon("Ponyta", 1, Tipo.FUEGO, 24, 0));
        pokedex.add(new Pokemon("Rapidash", 1, Tipo.FUEGO, 25, 0));
        pokedex.add(new Pokemon("Seel", 1, Tipo.AGUA, 26, 0));
        pokedex.add(new Pokemon("Dewgong", 1, Tipo.AGUA, 27, 0));
        pokedex.add(new Pokemon("Rhyhorn", 1, Tipo.TIERRA, 28, 0));
        pokedex.add(new Pokemon("Rhydon", 1, Tipo.TIERRA, 29, 0));
        pokedex.add(new Pokemon("Magikarp", 1, Tipo.AGUA, 30, 0));
        pokedex.add(new Pokemon("Gyarados", 1, Tipo.AGUA, 31, 0));
        pokedex.add(new Pokemon("Vaporeon", 1, Tipo.AGUA, 32, 0));
        pokedex.add(new Pokemon("Jolteon", 1, Tipo.ELECTRICO, 33, 0));
        pokedex.add(new Pokemon("Flareon", 1, Tipo.FUEGO, 34, 0));
        pokedex.add(new Pokemon("Articuno", 1, Tipo.AGUA, 35, 0));
        pokedex.add(new Pokemon("Zapdos", 1, Tipo.ELECTRICO, 36, 0));
        pokedex.add(new Pokemon("Moltres", 1, Tipo.FUEGO, 37, 0));
        pokedex.add(new Pokemon("Dragonite", 1, Tipo.VOLADOR, 38, 0));
        pokedex.add(new Pokemon("Shaymin", 1, Tipo.PLANTA, 39, 0));
        pokedex.add(new Pokemon("Rayquaza", 1, Tipo.VOLADOR, 40, 0));
    }

    public static Pokemon devolverPokemonRandom() {
        Random rnd = new Random();
        int indice = rnd.nextInt(pokedex.size());
        return pokedex.get(indice);
    }
}
