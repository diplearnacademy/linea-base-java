package herencia;

import utilidades.InfoPokemonEnum;

import static utilidades.TipoPokemonConstantes.AGUA;

public class PokemonAgua extends Pokemon{

    public PokemonAgua(String nombre, double altura, double peso, String sexo, String habilidad, String[] debilidades) {
        super(nombre, altura, peso, sexo, habilidad, AGUA, debilidades);
    }

    protected void recibirDanoPorAtaque(String tipoPokemonAtaca, int danoNormal) {
        int danoExtra;
        switch (tipoPokemonAtaca) {
            case "Planta":
                InfoPokemonEnum pokemonAgua = InfoPokemonEnum.PLANTA;
                danoExtra = pokemonAgua.getBonusDano();
                setPuntosVida(getPuntosVida() - danoExtra);
                break;
            case "Electrico":
                InfoPokemonEnum pokemonTierra = InfoPokemonEnum.ELECTRICO;
                danoExtra = pokemonTierra.getBonusDano();
                setPuntosVida(getPuntosVida() - danoExtra);
                break;
            default:
                setPuntosVida(getPuntosVida() - danoNormal);
        }
    }

    public void nadar(){
        System.out.println("El pokemon " + getNombre() + " esta nadando en agua muy fria");
    }
}
