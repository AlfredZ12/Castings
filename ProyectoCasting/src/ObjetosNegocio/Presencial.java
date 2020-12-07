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
@Table(name = "presencial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Presencial.BuscarByName", query = "Select p FROM Presencial p WHERE p.idCasting.nombre = :nombre"),
    @NamedQuery(name = "Presencial.findAll", query = "SELECT p FROM Presencial p")
    , @NamedQuery(name = "Presencial.findByIdpresencial", query = "SELECT p FROM Presencial p WHERE p.idpresencial = :idpresencial")
    , @NamedQuery(name = "Presencial.findByNumeroPersonas", query = "SELECT p FROM Presencial p WHERE p.numeroPersonas = :numeroPersonas")})
public class Presencial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpresencial")
    private Integer idpresencial;
    @Basic(optional = false)
    @Column(name = "numeroPersonas")
    private String numeroPersonas;
    @JoinColumn(name = "idAgenteCasting", referencedColumnName = "idagenteCasting")
    @ManyToOne(optional = false)
    private Agentecasting idAgenteCasting;
    @JoinColumn(name = "idCasting", referencedColumnName = "idcasting")
    @ManyToOne(optional = false)
    private Casting idCasting;
    @JoinColumn(name = "idfase", referencedColumnName = "idfase")
    @ManyToOne(optional = false)
    private Fase idfase;

    public Presencial() {
    }

    public Presencial(Integer idpresencial) {
        this.idpresencial = idpresencial;
    }

    public Presencial(Integer idpresencial, String numeroPersonas) {
        this.idpresencial = idpresencial;
        this.numeroPersonas = numeroPersonas;
    }

    public Integer getIdpresencial() {
        return idpresencial;
    }

    public void setIdpresencial(Integer idpresencial) {
        this.idpresencial = idpresencial;
    }

    public String getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(String numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public Agentecasting getIdAgenteCasting() {
        return idAgenteCasting;
    }

    public void setIdAgenteCasting(Agentecasting idAgenteCasting) {
        this.idAgenteCasting = idAgenteCasting;
    }

    public Casting getIdCasting() {
        return idCasting;
    }

    public void setIdCasting(Casting idCasting) {
        this.idCasting = idCasting;
    }

    public Fase getIdfase() {
        return idfase;
    }

    public void setIdfase(Fase idfase) {
        this.idfase = idfase;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpresencial != null ? idpresencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Presencial)) {
            return false;
        }
        Presencial other = (Presencial) object;
        if ((this.idpresencial == null && other.idpresencial != null) || (this.idpresencial != null && !this.idpresencial.equals(other.idpresencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ObjetosNegocio.Presencial[ idpresencial=" + idpresencial + " ]";
    }
    
}
