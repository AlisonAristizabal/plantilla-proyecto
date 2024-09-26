package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "recepcion_productos")
public class RecepcionProductos {

    @EmbeddedId
    private RecepcionProductosPK pk;

    public RecepcionProductos(OrdenDeCompra id_orden_compra, Bodega id_bodega, Integer costoPromedioProducto,
                        Integer cantidad) {
        this.pk = new RecepcionProductosPK(id_orden_compra, id_bodega, costoPromedioProducto, cantidad);
    }

    public RecepcionProductos(){;}

    public RecepcionProductosPK getPk() {
        return pk;
    }

    public void setPk(RecepcionProductosPK pk) {
        this.pk = pk;
    }

}
