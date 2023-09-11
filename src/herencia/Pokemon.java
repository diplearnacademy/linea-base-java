package herencia;

public class Pokemon {
<<<<<<< HEAD
=======
    private String nombre;
    private double altura;
    private double peso;
    private String sexo;
    private String habilidad;
    private String tipo;
    private String[] debilidades = new String[4];
    private int puntosVida = 100;
    private boolean estaDisponible = true;

    public Pokemon(String nombre, double altura, double peso, String sexo, String habilidad, String tipo, String[] debilidades) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        this.habilidad = habilidad;
        this.tipo = tipo;
        this.debilidades = debilidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getTipo() {
        return tipo;
    }

    public String[] getDebilidades() {
        return debilidades;
    }

    public void setDebilidades(String[] debilidades) {
        this.debilidades = debilidades;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    public void atacar(Pokemon rival, int dano){
        System.out.println(nombre + " ataca al pokemon " + rival.getNombre());
    }
>>>>>>> 300a5055ef7627efe04bda189084b60ee854c58c
}
