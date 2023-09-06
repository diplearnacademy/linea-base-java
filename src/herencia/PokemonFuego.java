package herencia;

import utilidades.InfoPokemonEnum;

import static utilidades.TipoPokemonConstantes.FUEGO;

public class PokemonFuego extends Pokemon{
    public PokemonFuego(String nombre, double altura, double peso, String sexo, String habilidad, String[] debilidades){
        super(nombre, altura, peso, sexo, habilidad, "FUEGO", debilidades);
    }

    protected void recibirDanoPorAtaque(String tipoPokemonAtaca, int danoAtaque) {
        int danoExtra;
        switch (tipoPokemonAtaca) {
            case "Agua":
                InfoPokemonEnum pokemonAgua = InfoPokemonEnum.AGUA;
                danoExtra = pokemonAgua.getBonusDano();
                setPuntosVida(getPuntosVida() - danoExtra - danoAtaque);
                break;
            case "Tierra":
                InfoPokemonEnum pokemonTierra = InfoPokemonEnum.TIERRA;
                danoExtra = pokemonTierra.getBonusDano();
                setPuntosVida(getPuntosVida() - danoExtra - danoAtaque);
                break;
            case "Roca":
                InfoPokemonEnum pokemonRoca = InfoPokemonEnum.ROCA;
                danoExtra = pokemonRoca.getBonusDano();
                setPuntosVida(getPuntosVida() - danoExtra - danoAtaque);
                break;
            default:
                setPuntosVida(getPuntosVida() - danoAtaque);
        }
    }





        /*IF ANIDADO
        *         if ("Agua".equals(getTipo())){
            System.out.println("Afectado");
        }else if ("Tierra".equals(getTipo())){
            System.out.println("Afectado");
        }else if ("Roca".equals(getTipo())){
            System.out.println("Afectado");
        }else{
            System.out.println("No Afectado");
        }
        *
        *
        * */


        /*IF INDEPENDIENTES

        if ("Agua".equals(getTipo())){
            System.out.println("Afectado");
        }else{
            System.out.println("No Afectado");
        }


        if ("Tierra".equals(getTipo())){
            System.out.println("Afectado");
        }else{
            System.out.println("No Afectado");
        }


        if ("Agua".equals(getTipo())){
            System.out.println("Afectado");
        }else{
            System.out.println("No Afectado");
        }*/

}
