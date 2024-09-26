package uniandes.edu.co.proyecto.modelo;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ProductosEnBodegaPK implements Serializable{

    @ManyToOne
    @JoinColumn(name = "id_bodega", referencedColumnName = "id_bodega")
    private Bodega id_bodega;

    @ManyToOne
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    private Producto id_producto;

    private Integer cantidad;
    private Integer costoPromedio;

    public ProductosEnBodegaPK(Bodega id_bodega, Producto id_producto, Integer cantidad, Integer costoPromedio) {
        super();
        this.id_bodega = id_bodega;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.costoPromedio = costoPromedio;
    }

    public ProductosEnBodegaPK(){
        super();
    }

    public Bodega getId_bodega() {
        return id_bodega;
    }

    public void setId_bodega(Bodega id_bodega) {
        this.id_bodega = id_bodega;
    }

    public Producto getId_producto() {
        return id_producto;
    }

    public void setId_producto(Producto id_producto) {
        this.id_producto = id_producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getCostoPromedio() {
        return costoPromedio;
    }

    public void setCostoPromedio(Integer costoPromedio) {
        this.costoPromedio = costoPromedio;
    }

    
}
