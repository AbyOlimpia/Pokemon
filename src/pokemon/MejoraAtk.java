package src.pokemon;

public class MejoraAtk extends Mejora {

    @Override
    public void aplicarMovimiento(this) {
        //if (pokemon.getTipo() = Efectividad.SUPER_EFECTIVO){
            this.setAtaque((int)1.5*pokemon.getAtaque());

        }
        
    }
    

