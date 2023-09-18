package geometria;

public abstract class Figura {
    private double ladoUno;
    private double ladoDos;

    public Figura(double ladoUno, double ladoDos) {
        this.ladoUno = ladoUno;
        this.ladoDos = ladoDos;
    }

    public double getLadoUno() {
        return ladoUno;
    }

    public void setLadoUno(double ladoUno) {
        this.ladoUno = ladoUno;
    }

    public double getLadoDos() {
        return ladoDos;
    }

    public void setLadoDos(double ladoDos) {
        this.ladoDos = ladoDos;
    }

    //Metodo a sobreescribir
    public abstract double calcularArea();

}
