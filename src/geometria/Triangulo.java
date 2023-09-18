package geometria;

public class Triangulo extends Figura{


    //Para el triangulo se asume que ladoUno es Base y ladoDos es Altura
    public Triangulo(double ladoUno, double ladoDos) {
        super(ladoUno, ladoDos);
    }

    @Override
    public double calcularArea() {
        return (getLadoUno() * getLadoDos())/2;
    }
}
