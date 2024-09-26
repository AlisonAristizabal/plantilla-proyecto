package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos_orden_compra")
public class ProductosOrdenCompra {

    @EmbeddedId
    private ProductosOrdenCompraPK pk;

    public ProductosOrdenCompra(Producto id_producto, OrdenDeCompra id_orden, Integer cantidad, Integer precio) {
        this.pk = new ProductosOrdenCompraPK(id_producto,id_orden,cantidad,precio);
    }

    public ProductosOrdenCompra(){;}

    public ProductosOrdenCompraPK getPk() {
        return pk;
    }

    public void setPk(ProductosOrdenCompraPK pk) {
        this.pk = pk;
    }

}
