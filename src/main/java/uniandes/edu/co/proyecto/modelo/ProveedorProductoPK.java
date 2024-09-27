package uniandes.edu.co.proyecto.modelo;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ProveedorProductoPK implements Serializable{

    @ManyToOne
    @JoinColumn(name = "producto_id_producto", referencedColumnName = "id_producto")
    private Producto id_producto;

    @ManyToOne
    @JoinColumn(name = "proveedor_nit", referencedColumnName = "NIT")
    private Proveedor id_proveedor;

    public ProveedorProductoPK(Producto id_producto, Proveedor id_proveedor) {
        super();
        this.id_producto = id_producto;
        this.id_proveedor = id_proveedor;
    }

    public ProveedorProductoPK(){
        super();
    }

    public Producto getId_producto() {
        return id_producto;
    }

    public void setId_producto(Producto id_producto) {
        this.id_producto = id_producto;
    }

    public Proveedor getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Proveedor id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    
}
