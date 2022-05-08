package src.pokemon;

public class MejoraAtk extends Mejora {

    @Override
    public void aplicarMovimiento(Pokemon pokemon) {
        if (pokemon.getTipo() = Efectividad.SUPER_EFECTIVO){
            pokemon.setAtaque((int)1.5*pokemon.getAtaque());

        }
        
    }
    
}
