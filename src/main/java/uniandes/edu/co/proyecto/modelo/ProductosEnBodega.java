package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos_en_bodega")
public class ProductosEnBodega {

    @EmbeddedId
    private ProductosEnBodegaPK pk;

    public ProductosEnBodega(Bodega id_bodega, Producto id_producto, Integer cantidad, Integer costoPromedio) {
        this.pk = new ProductosEnBodegaPK(id_bodega,id_producto,cantidad,costoPromedio);
    }

    public ProductosEnBodega(){;}

    public ProductosEnBodegaPK getPk() {
        return pk;
    }

    public void setPk(ProductosEnBodegaPK pk) {
        this.pk = pk;
    }

    
}
