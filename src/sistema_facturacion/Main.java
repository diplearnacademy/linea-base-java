package sistema_facturacion;

import geometria.Circulo;
import geometria.Rectangulo;
import geometria.Triangulo;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> productosComprar = new HashMap<>();
        productosComprar.put("Camisa", "60000");
        productosComprar.put("Jean", "210000");
        productosComprar.put("Medias", "15000");
        productosComprar.put("Boxer", "35000");

        FacturaElectronica facturaElectronica = new FacturaElectronica(1, productosComprar);
        FacturaOrdinaria facturaOrdinaria = new FacturaOrdinaria(2, productosComprar);
        FacturaSimplificada facturaSimplificada = new FacturaSimplificada(3, productosComprar);

        System.out.println("Sistema de Facturacion \n");
        System.out.println("Factura Electronica");
        facturaElectronica.calcularValorTotalFactura();
        System.out.println("\nFactura Ordinaria");
        facturaOrdinaria.calcularValorTotalFactura();
        System.out.println("\nFactura Simplificada");
        facturaSimplificada.calcularValorTotalFactura();

    }
}