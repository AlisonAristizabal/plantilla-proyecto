package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class RecepcionProductosPK {

    @ManyToOne
    @JoinColumn(name = "orden_de_compra_id_orden", referencedColumnName = "id_orden")
    private OrdenDeCompra id_orden_compra;

    @ManyToOne
    @JoinColumn(name = "bodega_id_bodega", referencedColumnName = "id_bodega")
    private Bodega id_bodega;

    private Integer costoPromedioProducto;
    private Integer cantidad;

    public RecepcionProductosPK(OrdenDeCompra id_orden_compra, Bodega id_bodega, Integer costoPromedioProducto,
            Integer cantidad) {
        super();
        this.id_orden_compra = id_orden_compra;
        this.id_bodega = id_bodega;
        this.costoPromedioProducto = costoPromedioProducto;
        this.cantidad = cantidad;
    }

    public RecepcionProductosPK(){
        super();
    }

    public OrdenDeCompra getId_orden_compra() {
        return id_orden_compra;
    }

    public void setId_orden_compra(OrdenDeCompra id_orden_compra) {
        this.id_orden_compra = id_orden_compra;
    }

    public Bodega getId_bodega() {
        return id_bodega;
    }

    public void setId_bodega(Bodega id_bodega) {
        this.id_bodega = id_bodega;
    }

    public Integer getCostoPromedioProducto() {
        return costoPromedioProducto;
    }

    public void setCostoPromedioProducto(Integer costoPromedioProducto) {
        this.costoPromedioProducto = costoPromedioProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    
}
