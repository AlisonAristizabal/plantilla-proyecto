package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedor")
public class Proveedor {

    @Id
    private Integer NIT;

    private String nombre;
    private String direccion;
    private String nombrePersonaContacto;
    private Integer telefonoPersonaContacto;

    public Proveedor(Integer nIT, String nombre, String direccion, String nombrePersonaContacto,
            Integer telefonoPersonaContacto) {
        NIT = nIT;
        this.nombre = nombre;
        this.direccion = direccion;
        this.nombrePersonaContacto = nombrePersonaContacto;
        this.telefonoPersonaContacto = telefonoPersonaContacto;
    }

    public Proveedor(){;}

    public Integer getNIT() {
        return NIT;
    }

    public void setNIT(Integer nIT) {
        NIT = nIT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombrePersonaContacto() {
        return nombrePersonaContacto;
    }

    public void setNombrePersonaContacto(String nombrePersonaContacto) {
        this.nombrePersonaContacto = nombrePersonaContacto;
    }

    public Integer getTelefonoPersonaContacto() {
        return telefonoPersonaContacto;
    }

    public void setTelefonoPersonaContacto(Integer telefonoPersonaContacto) {
        this.telefonoPersonaContacto = telefonoPersonaContacto;
    }

    
}
