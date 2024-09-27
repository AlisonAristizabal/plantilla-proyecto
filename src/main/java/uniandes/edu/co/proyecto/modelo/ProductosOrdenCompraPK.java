package uniandes.edu.co.proyecto.modelo;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ProductosOrdenCompraPK implements Serializable{

    @ManyToOne
    @JoinColumn(name = "producto_id_producto", referencedColumnName = "id_producto")
    private Producto id_producto;

    @ManyToOne
    @JoinColumn(name = "orden_de_compra_id_orden", referencedColumnName = "id_orden")
    private OrdenDeCompra id_orden;

    private Integer cantidad;
    private Integer precio;

    public ProductosOrdenCompraPK(Producto id_producto, OrdenDeCompra id_orden, Integer cantidad, Integer precio) {
        super();
        this.id_producto = id_producto;
        this.id_orden = id_orden;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public ProductosOrdenCompraPK(){
        super();
    }

    public Producto getId_producto() {
        return id_producto;
    }

    public void setId_producto(Producto id_producto) {
        this.id_producto = id_producto;
    }

    public OrdenDeCompra getId_orden() {
        return id_orden;
    }

    public void setId_orden(OrdenDeCompra id_orden) {
        this.id_orden = id_orden;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    
}
