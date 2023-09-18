package sistema_facturacion;

import java.util.Map;

public class FacturaSimplificada extends Factura implements OperacionesFacturas{
    public static final int RETENCION_FUENTE = 7;
    public FacturaSimplificada(int id,Map<String, String> productos) {
        super(id, productos);
    }

    @Override
    public void calcularValorTotalFactura() {
        for (Map.Entry<String, String> entry : getProductos().entrySet()) {
            String nombreProducto = entry.getKey();
            String valorProducto = entry.getValue();
            setValorTotal(getValorTotal() + Integer.parseInt(valorProducto));
            System.out.println("Producto a comprar: " + nombreProducto + "----"+ "Valor de producto: " +valorProducto);
        }
        setValorTotal(((getValorTotal() * RETENCION_FUENTE)/100) + getValorTotal());
        System.out.println("Total de la Factura es: " + getValorTotal());
    }
}
