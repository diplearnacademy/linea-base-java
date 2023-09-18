package geometria;

public class Rectangulo extends Figura{

    public Rectangulo(double ladoUno, double ladoDos) {
        super(ladoUno, ladoDos);
    }

    @Override
    public double calcularArea() {
        return getLadoUno() * getLadoDos();
    }
}
