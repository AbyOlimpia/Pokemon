package pokemon;

public class MejoraAtk extends Mejora{

    @Override
    public void aplicarMovimiento(Pokemon pokemon) {
        pokemon.setAtaque((int)1.5*pokemon.getAtaque());
        
    }
    
}
