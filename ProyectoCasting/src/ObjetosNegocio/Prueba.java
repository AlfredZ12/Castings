/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosNegocio;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "prueba")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prueba.findAll", query = "SELECT p FROM Prueba p")
    , @NamedQuery(name = "Prueba.findByIdPrueba", query = "SELECT p FROM Prueba p WHERE p.idPrueba = :idPrueba")
    , @NamedQuery(name = "Prueba.findByDescripcion", query = "SELECT p FROM Prueba p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Prueba.findByFecha", query = "SELECT p FROM Prueba p WHERE p.fecha = :fecha")
    , @NamedQuery(name = "Prueba.findBySala", query = "SELECT p FROM Prueba p WHERE p.sala = :sala")})
public class Prueba implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idprueba")
    private List<FasesPruebas> fasesPruebasList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPrueba")
    private Integer idPrueba;
    @Basic(optional = false)
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "sala")
    private String sala;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPrueba")
//    private List<Fase> faseList;
    
    public Prueba() {
    }

    public Prueba(Integer idPrueba) {
        this.idPrueba = idPrueba;
    }

    public Prueba(Integer idPrueba, String descripcion, Date fecha, String sala) {
        this.idPrueba = idPrueba;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.sala = sala;
    }

    public Integer getIdPrueba() {
        return idPrueba;
    }

    public void setIdPrueba(Integer idPrueba) {
        this.idPrueba = idPrueba;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

//    @XmlTransient
//    public List<Fase> getFaseList() {
//        return faseList;
//    }
//
//    public void setFaseList(List<Fase> faseList) {
//        this.faseList = faseList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrueba != null ? idPrueba.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prueba)) {
            return false;
        }
        Prueba other = (Prueba) object;
        if ((this.idPrueba == null && other.idPrueba != null) || (this.idPrueba != null && !this.idPrueba.equals(other.idPrueba))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ObjetosNegocio.Prueba[ idPrueba=" + idPrueba + " ]";
    }

    @XmlTransient
    public List<FasesPruebas> getFasesPruebasList() {
        return fasesPruebasList;
    }

    public void setFasesPruebasList(List<FasesPruebas> fasesPruebasList) {
        this.fasesPruebasList = fasesPruebasList;
    }
    
}
