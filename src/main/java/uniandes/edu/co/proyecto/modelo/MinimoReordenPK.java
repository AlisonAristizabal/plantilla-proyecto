package uniandes.edu.co.proyecto.modelo;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class MinimoReordenPK implements Serializable{

    @ManyToOne
    @JoinColumn(name = "bodega_id_bodega", referencedColumnName = "id_bodega")
    private Bodega id_bodega;

    @ManyToOne
    @JoinColumn(name = "producto_id_producto", referencedColumnName = "id_producto")
    private Producto id_producto;

    private Integer nivelMinReorden;

    public MinimoReordenPK(Bodega id_bodega, Producto id_producto, Integer nivelMinReorden) {
        super();
        this.id_bodega = id_bodega;
        this.id_producto = id_producto;
        this.nivelMinReorden = nivelMinReorden;
    }

    public MinimoReordenPK(){
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

    public Integer getNivelMinReorden() {
        return nivelMinReorden;
    }

    public void setNivelMinReorden(Integer nivelMinReorden) {
        this.nivelMinReorden = nivelMinReorden;
    }

    
}
