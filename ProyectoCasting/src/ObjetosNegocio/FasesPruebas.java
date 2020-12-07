/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosNegocio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "fases_pruebas", catalog = "castingpu", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FasesPruebas.findAll", query = "SELECT f FROM FasesPruebas f")
    , @NamedQuery(name = "FasesPruebas.findByIdfasesPruebas", query = "SELECT f FROM FasesPruebas f WHERE f.idfasesPruebas = :idfasesPruebas")})
public class FasesPruebas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfases_pruebas", nullable = false)
    private Integer idfasesPruebas;
    @JoinColumn(name = "idfase", referencedColumnName = "idfase", nullable = false)
    @ManyToOne(optional = false)
    private Fase idfase;
    @JoinColumn(name = "idprueba", referencedColumnName = "idPrueba", nullable = false)
    @ManyToOne(optional = false)
    private Prueba idprueba;

    public FasesPruebas() {
    }

    public FasesPruebas(Integer idfasesPruebas) {
        this.idfasesPruebas = idfasesPruebas;
    }

    public Integer getIdfasesPruebas() {
        return idfasesPruebas;
    }

    public void setIdfasesPruebas(Integer idfasesPruebas) {
        this.idfasesPruebas = idfasesPruebas;
    }

    public Fase getIdfase() {
        return idfase;
    }

    public void setIdfase(Fase idfase) {
        this.idfase = idfase;
    }

    public Prueba getIdprueba() {
        return idprueba;
    }

    public void setIdprueba(Prueba idprueba) {
        this.idprueba = idprueba;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfasesPruebas != null ? idfasesPruebas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FasesPruebas)) {
            return false;
        }
        FasesPruebas other = (FasesPruebas) object;
        if ((this.idfasesPruebas == null && other.idfasesPruebas != null) || (this.idfasesPruebas != null && !this.idfasesPruebas.equals(other.idfasesPruebas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ObjetosNegocio.FasesPruebas[ idfasesPruebas=" + idfasesPruebas + " ]";
    }
    
}
