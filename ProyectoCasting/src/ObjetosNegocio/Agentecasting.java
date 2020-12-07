/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosNegocio;

import java.io.Serializable;
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
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "agentecasting")
@XmlRootElement


    @NamedQueries({
    @NamedQuery(name = "BuscarAgenteByName", query = "SELECT a FROM Agentecasting a WHERE a.idPersona.nombre = :nombre")
    ,@NamedQuery(name = "BuscarAgente", query = "SELECT a FROM Agentecasting a WHERE a.idagenteCasting =  :id")
    ,@NamedQuery(name = "Agentecasting.findAll", query = "SELECT a FROM Agentecasting a ORDER BY  a.idagenteCasting ASC")
    , @NamedQuery(name = "Agentecasting.findByIdagenteCasting", query = "SELECT a FROM Agentecasting a WHERE a.idagenteCasting = :idagenteCasting")
    , @NamedQuery(name = "Agentecasting.findByNumeroEmpleado", query = "SELECT a FROM Agentecasting a WHERE a.numeroEmpleado = :numeroEmpleado")
//     , @NamedQuery(name = "updateDisponibilidad", query = "UPDATE Agentecasting SET a.disponible = ? WHERE a.idagenteCasting = :id ")     

})
public class Agentecasting implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idagenteCasting")
    private Integer idagenteCasting;
    @Basic(optional = false)
    @Column(name = "numeroEmpleado")
    private Integer numeroEmpleado;
    @Basic(optional = false)
    @Column(name = "disponible")
    private  Integer disponible = 1;
    @JoinColumn(name = "idPersona", referencedColumnName = "idPersona")
    @ManyToOne(optional = false)
    private Persona idPersona;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAgenteCasting")
    private List<Presencial> presencialList;

    public Agentecasting() {
    }

    public Agentecasting(Integer idagenteCasting) {
        this.idagenteCasting = idagenteCasting;
    }

    public Agentecasting(Integer idagenteCasting, Integer numeroEmpleado) {
        this.idagenteCasting = idagenteCasting;
        this.numeroEmpleado = numeroEmpleado;
    }

    public Integer getIdagenteCasting() {
        return idagenteCasting;
    }

    public void setIdagenteCasting(Integer idagenteCasting) {
        this.idagenteCasting = idagenteCasting;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(Integer numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    public Integer getDisponible() {
        return disponible;
    }
  
    public void setDisponible() {

        if (this.disponible == 1) {
            disponible = 0;
//            this.disponible = disponible;
        } else {
            disponible = 1;
//            this.disponible = disponible;
        }

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
        hash += (idagenteCasting != null ? idagenteCasting.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agentecasting)) {
            return false;
        }
        Agentecasting other = (Agentecasting) object;
        if ((this.idagenteCasting == null && other.idagenteCasting != null) || (this.idagenteCasting != null && !this.idagenteCasting.equals(other.idagenteCasting))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ObjetosNegocio.Agentecasting[ idagenteCasting=" + idagenteCasting + " ]";
    }
    
}
