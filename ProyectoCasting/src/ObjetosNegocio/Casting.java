/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosNegocio;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "casting")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Casting.findAll", query = "SELECT c FROM Casting c")
    , @NamedQuery(name = "Casting.findByIdcasting", query = "SELECT c FROM Casting c WHERE c.idcasting = :idcasting")
    , @NamedQuery(name = "Casting.findByCosto", query = "SELECT c FROM Casting c WHERE c.costo = :costo")
    , @NamedQuery(name = "Casting.findByDescripcion", query = "SELECT c FROM Casting c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "Casting.findByFechacontratacion", query = "SELECT c FROM Casting c WHERE c.fechacontratacion = :fechacontratacion")
    , @NamedQuery(name = "Casting.findByNombre", query = "SELECT c FROM Casting c WHERE c.nombre = :nombre")})
public class Casting implements Serializable {

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "costo")
    private Float costo;
  

    private static final long serialVersionUID = 1L;
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcasting")
    private Integer idcasting;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "fechacontratacion")
    @Temporal(TemporalType.DATE)
    private Date fechacontratacion;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @JoinColumn(name = "idCliente", referencedColumnName = "idCliente")
    @ManyToOne(optional = false)
    private Cliente idCliente;
    @JoinColumn(name = "idPerfil", referencedColumnName = "idperfil")
    @ManyToOne(optional = false)
    private Perfil idPerfil;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCasting")
    private List<Presencial> presencialList;

    public Casting() {
    }

    public Casting(Integer idcasting) {
        this.idcasting = idcasting;
    }

    public Casting(Integer idcasting, float costo, String descripcion, Date fechacontratacion, String nombre) {
        this.idcasting = idcasting;
     
        this.costo = costo;
        this.descripcion = descripcion;
        this.fechacontratacion = fechacontratacion;
        this.nombre = nombre;
    }

    public Integer getIdcasting() {
        return idcasting;
    }

    public void setIdcasting(Integer idcasting) {
        this.idcasting = idcasting;
    }

   


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechacontratacion() {
        return fechacontratacion;
    }

    public void setFechacontratacion(Date fechacontratacion) {
        this.fechacontratacion = fechacontratacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Perfil getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Perfil idPerfil) {
        this.idPerfil = idPerfil;
    }

    @XmlTransient
    public List<Presencial> getPresencialList() {
        return presencialList;
    }

    public void setPresencialList(List<Presencial> presencialList) {
        this.presencialList = presencialList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcasting != null ? idcasting.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Casting)) {
            return false;
        }
        Casting other = (Casting) object;
        if ((this.idcasting == null && other.idcasting != null) || (this.idcasting != null && !this.idcasting.equals(other.idcasting))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ObjetosNegocio.Casting[ idcasting=" + idcasting + " ]";
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    
}
