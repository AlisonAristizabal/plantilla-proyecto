package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="minimo_reorden")
public class MinimoReorden {

    @EmbeddedId
    private MinimoReordenPK pk;

    public MinimoReorden(Bodega id_bodega, Producto id_producto, Integer nivelMinReorden) {
        this.pk = new MinimoReordenPK(id_bodega,id_producto,nivelMinReorden);
    }

    public MinimoReorden(){;}

    public MinimoReordenPK getPk() {
        return pk;
    }

    public void setPk(MinimoReordenPK pk) {
        this.pk = pk;
    }   

    
}
