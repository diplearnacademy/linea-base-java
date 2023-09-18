package sistema_facturacion;

import java.util.Date;
import java.util.Map;

public class Factura {
    private Date fecha;
    private int id;
    private Map<String, String> productos;
    private int valorTotal;

    public Factura(int id, Map<String, String> productos) {
        this.id = id;
        this.productos = productos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<String, String> getProductos() {
        return productos;
    }

    public void setProductos(Map<String, String> productos) {
        this.productos = productos;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }
}
