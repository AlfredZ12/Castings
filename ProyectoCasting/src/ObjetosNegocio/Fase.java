/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosNegocio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "fase", catalog = "castingpu", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fase.findAll", query = "SELECT f FROM Fase f")
    , @NamedQuery(name = "Fase.findByIdfase", query = "SELECT f FROM Fase f WHERE f.idfase = :idfase")
    , @NamedQuery(name = "Fase.findByFechafinal", query = "SELECT f FROM Fase f WHERE f.fechafinal = :fechafinal")
    , @NamedQuery(name = "Fase.findByFechainicio", query = "SELECT f FROM Fase f WHERE f.fechainicio = :fechainicio")
    , @NamedQuery(name = "Fase.findByIdPresencial", query = "SELECT f FROM Fase f WHERE f.idPresencial = :idPresencial")})
public class Fase implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfase", nullable = false)
    private Integer idfase;
    @Column(name = "fechafinal")
    @Temporal(TemporalType.DATE)
    private Date fechafinal;
    @Column(name = "fechainicio")
    @Temporal(TemporalType.DATE)
    private Date fechainicio;
    @Basic(optional = false)
    @Column(name = "idPresencial", nullable = false)
    private Integer idPresencial;

    public Fase() {
    }

    public Fase(Integer idfase) {
        this.idfase = idfase;
    }

    public Fase(Integer idfase, Integer idPresencial) {
        this.idfase = idfase;
        this.idPresencial = idPresencial;
    }

    public Integer getIdfase() {
        return idfase;
    }

    public void setIdfase(Integer idfase) {
        this.idfase = idfase;
    }

    public Date getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(Date fechafinal) {
        this.fechafinal = fechafinal;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public int getIdPresencial() {
        return idPresencial;
    }

    public void setIdPresencial(Integer idPresencial) {
        this.idPresencial = idPresencial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfase != null ? idfase.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fase)) {
            return false;
        }
        Fase other = (Fase) object;
        if ((this.idfase == null && other.idfase != null) || (this.idfase != null && !this.idfase.equals(other.idfase))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ObjetosNegocio.Fase[ idfase=" + idfase + " ]";
    }
    
}
