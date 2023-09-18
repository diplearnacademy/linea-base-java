package geometria;

public class Main {

    public static void main(String[] args) {
        //Creación de Objetos Rectangulo, Circulo y Triangulo
        Rectangulo cuadrado = new Rectangulo(5,5);
        Triangulo tringualoIsosceles = new Triangulo(3.5,8.2);
        Circulo circunferencia = new Circulo(4.5);

        //Imprimir por consola los calculos de area
        System.out.println("Programa para Calculo de Areas \n");
        System.out.println("El area del rectangulo es: " + cuadrado.calcularArea());
        System.out.println("El area del triangulo  es: " + tringualoIsosceles.calcularArea());
        System.out.println("El area del Circulo es: " + circunferencia.calcularArea());
    }
}