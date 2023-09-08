package interfaces;

public class Main {
    public static void main(String[] args) {
        String[] debilidadesCharmander = {"Agua", "Tierra", "Roca"};
        String[] debilidadesSquirtle = {"Planta", "Electrico"};

        PokemonFuego charmander = new PokemonFuego("clases_java.Charmander",0.6,5.6, "Macho", "MarLlamas",debilidadesCharmander);
        PokemonAgua squirtle = new PokemonAgua("Squirtle",0.8,8.6, "Hembra", "Torrente", debilidadesSquirtle);

        //INFORMACION POKEMON
        System.out.println("Charmander tiene " + charmander.getPuntosVida() + " puntos de vida");
        System.out.println("Squirtle tiene " + squirtle.getPuntosVida() + " puntos de vida");

        //INICIA LA BATALLA



        squirtle.atacar(charmander, 10);
        charmander.recibirDanoPorAtaque(squirtle.getTipo(), 10);
        charmander.curar();
        squirtle.curar();
        charmander.recuperar();
        squirtle.recuperar();
        charmander.volar();
        squirtle.volar();
    }
}
