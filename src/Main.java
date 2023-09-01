public class Main {

    public static void main(String[] args) {
        Charmander charmanderUno = new Charmander(0.6, 8.5, "Macho", "Mar Llamas");
        Bulbasaur bulbasaurUno = new Bulbasaur();

        bulbasaurUno.setAltura(0.7);
        bulbasaurUno.setPeso(6.9);
        bulbasaurUno.setSexo("Macho");
        bulbasaurUno.setHabilidad("Espesura");
        bulbasaurUno.setDebilidades();

        charmanderUno.ataqueMarLlamas(bulbasaurUno, 23);

        System.out.println("Los puntos de vida restantes son: ");
        System.out.println(bulbasaurUno.getPuntosVida());

    }
}