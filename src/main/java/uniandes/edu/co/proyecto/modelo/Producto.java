package uniandes.edu.co.proyecto.modelo;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private Integer costoBodega;
    private Integer precioUnidad;
    private String presentacion;
    private Float cantidadPresentacion;
    private Integer volumen;
    private Integer pesoEmpaque;
    private String unidadMedida;
    private String codigoBarras;
    private Date fechaExpiracion;

    @ManyToOne
    @JoinColumn(name = "categoria_codigo", referencedColumnName = "codigo")
    private Categoria id_categoria;

    public Producto(String nombre, Integer costoBodega, Integer precioUnidad, String presentacion,
            Float cantidadPresentacion, Integer volumen, Integer pesoEmpaque, String unidadMedida, String codigoBarras,
            Date fechaExpiracion, Categoria id_categoria) {
        this.nombre = nombre;
        this.costoBodega = costoBodega;
        this.precioUnidad = precioUnidad;
        this.presentacion = presentacion;
        this.cantidadPresentacion = cantidadPresentacion;
        this.volumen = volumen;
        this.pesoEmpaque = pesoEmpaque;
        this.unidadMedida = unidadMedida;
        this.codigoBarras = codigoBarras;
        this.fechaExpiracion = fechaExpiracion;
        this.id_categoria = id_categoria;
    }

    public Producto(){;}

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

    public Integer getCostoBodega() {
        return costoBodega;
    }

    public void setCostoBodega(Integer costoBodega) {
        this.costoBodega = costoBodega;
    }

    public Integer getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(Integer precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public Float getCantidadPresentacion() {
        return cantidadPresentacion;
    }

    public void setCantidadPresentacion(Float cantidadPresentacion) {
        this.cantidadPresentacion = cantidadPresentacion;
    }

    public Integer getVolumen() {
        return volumen;
    }

    public void setVolumen(Integer volumen) {
        this.volumen = volumen;
    }

    public Integer getPesoEmpaque() {
        return pesoEmpaque;
    }

    public void setPesoEmpaque(Integer pesoEmpaque) {
        this.pesoEmpaque = pesoEmpaque;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public Categoria getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Categoria id_categoria) {
        this.id_categoria = id_categoria;
    }

    
}
