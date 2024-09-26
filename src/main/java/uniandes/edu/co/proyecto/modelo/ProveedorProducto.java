package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedor_producto")
public class ProveedorProducto {

    @EmbeddedId
    private ProveedorProductoPK pk;

    public ProveedorProducto(Producto id_producto, Proveedor id_proveedor) {
        this.pk = new ProveedorProductoPK(id_producto,id_proveedor);
    }

    public ProveedorProducto(){;}

    public ProveedorProductoPK getPk() {
        return pk;
    }

    public void setPk(ProveedorProductoPK pk) {
        this.pk = pk;
    }

    
}
