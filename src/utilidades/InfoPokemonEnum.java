package utilidades;

import javax.print.DocFlavor;

public enum InfoPokemonEnum {
    FUEGO("Fuego", 8),
    TIERRA("Tierra", 5),
    ROCA("Roca", 9),
    PLANTA("Planta", 5),
    ELECTRICO("Electrico", 10),
    AGUA("Agua", 6);

    private String tipoPokemon;
    private int bonusDano;

    private InfoPokemonEnum(String tipoPokemon, int bonusDano){
        this.tipoPokemon = tipoPokemon;
        this.bonusDano = bonusDano;
    }

    public String getTipoPokemon(){
        return tipoPokemon;
    }

    public int getBonusDano(){
        return bonusDano;
    }
}
