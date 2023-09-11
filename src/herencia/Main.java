package herencia;

import utilidades.EnumEjemplo;
import utilidades.InfoPokemonEnum;

public class Main {
    public static void main(String[] args) {
        String[] debilidadesCharmander = {"Agua", "Tierra", "Roca"};
        String[] debilidadesSquirtle = {"Planta", "Electrico"};

        PokemonFuego charmander = new PokemonFuego("Charmander",0.6,5.6, "Macho", "MarLlamas",debilidadesCharmander);
        PokemonAgua squirtle = new PokemonAgua("Squirtle",0.8,8.6, "Hembra", "Torrente", debilidadesSquirtle);

        System.out.println("Charmander tiene " + charmander.getPuntosVida() + " puntos de vida");
        System.out.println("Squirtle tiene " + squirtle.getPuntosVida() + " puntos de vida");

        squirtle.atacar(charmander, 10);
        charmander.recibirDanoPorAtaque(squirtle.getTipo(), 10);

        System.out.println("Puntos de vida actuales:" + charmander.getPuntosVida());


    }
}
