package geometria;

import static geometria.Constantes.NUMERO_PI;

public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    //El numero PI esta definido como constante en Clase Constante.
    public double calcularArea() {
        return (NUMERO_PI) * (radio * radio);
    }

}
