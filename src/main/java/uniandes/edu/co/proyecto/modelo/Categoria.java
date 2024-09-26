package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private String descripcion;
    private String caracteristicaAlmacenamineto;

    public Categoria(String nombre, String descripcion, String caracteristicaAlmacenamineto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.caracteristicaAlmacenamineto = caracteristicaAlmacenamineto;
    }

    public Categoria(){;}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCaracteristicaAlmacenamineto() {
        return caracteristicaAlmacenamineto;
    }

    public void setCaracteristicaAlmacenamineto(String caracteristicaAlmacenamineto) {
        this.caracteristicaAlmacenamineto = caracteristicaAlmacenamineto;
    }
    
    
}
