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
@Table(name="orden_de_compra")
public class OrdenDeCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date fechaEsperadaEntrega;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "sucursal_id_sucursal", referencedColumnName = "id_sucursal")
    private Sucursal id_sucursal;

    @ManyToOne
    @JoinColumn(name = "proveedor_nit", referencedColumnName = "NIT")
    private Proveedor id_proveedor;

    @ManyToOne
    @JoinColumn(name = "producto_id_producto", referencedColumnName = "id_producto")
    private Producto id_producto;

    public OrdenDeCompra(Date fechaEsperadaEntrega, String estado, Sucursal id_sucursal, Proveedor id_proveedor,
            Producto id_producto) {
        this.fechaEsperadaEntrega = fechaEsperadaEntrega;
        this.estado = estado;
        this.id_sucursal = id_sucursal;
        this.id_proveedor = id_proveedor;
        this.id_producto = id_producto;
    }

    public OrdenDeCompra(){;}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaEsperadaEntrega() {
        return fechaEsperadaEntrega;
    }

    public void setFechaEsperadaEntrega(Date fechaEsperadaEntrega) {
        this.fechaEsperadaEntrega = fechaEsperadaEntrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Sucursal getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(Sucursal id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public Proveedor getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Proveedor id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public Producto getId_producto() {
        return id_producto;
    }

    public void setId_producto(Producto id_producto) {
        this.id_producto = id_producto;
    }

    
}
