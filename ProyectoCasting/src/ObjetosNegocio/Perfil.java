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
@Table(name = "perfil")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Perfil.findAll", query = "SELECT p FROM Perfil p")
    , @NamedQuery(name = "Perfil.findByIdperfil", query = "SELECT p FROM Perfil p WHERE p.idperfil = :idperfil")
    , @NamedQuery(name = "Perfil.findByColorcabello", query = "SELECT p FROM Perfil p WHERE p.colorcabello = :colorcabello")
    , @NamedQuery(name = "Perfil.findByColorojos", query = "SELECT p FROM Perfil p WHERE p.colorojos = :colorojos")
    , @NamedQuery(name = "Perfil.findByEspecialidad", query = "SELECT p FROM Perfil p WHERE p.especialidad = :especialidad")
    , @NamedQuery(name = "Perfil.findByEstado", query = "SELECT p FROM Perfil p WHERE p.estado = :estado")
    , @NamedQuery(name = "Perfil.findByRangoaltura", query = "SELECT p FROM Perfil p WHERE p.rangoaltura = :rangoaltura")
    , @NamedQuery(name = "Perfil.findByRangoedad", query = "SELECT p FROM Perfil p WHERE p.rangoedad = :rangoedad")
    , @NamedQuery(name = "Perfil.findBySexo", query = "SELECT p FROM Perfil p WHERE p.sexo = :sexo")})
public class Perfil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idperfil")
    private Integer idperfil;
    @Basic(optional = false)
    @Column(name = "colorcabello")
    private String colorcabello;
    @Basic(optional = false)
    @Column(name = "colorojos")
    private String colorojos;
    @Basic(optional = false)
    @Column(name = "especialidad")
    private String especialidad;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @Column(name = "rangoaltura")
    private String rangoaltura;
    @Basic(optional = false)
    @Column(name = "rangoedad")
    private String rangoedad;
    @Basic(optional = false)
    @Column(name = "sexo")
    private String sexo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPerfil")
    private List<Casting> castingList;
    

    public Perfil() {
    }

    public Perfil(Integer idperfil) {
        this.idperfil = idperfil;
    }

    public Perfil(Integer idperfil, String colorcabello, String colorojos, String especialidad, String estado, String rangoaltura, String rangoedad, String sexo) {
        this.idperfil = idperfil;
        this.colorcabello = colorcabello;
        this.colorojos = colorojos;
        this.especialidad = especialidad;
        this.estado = estado;
        this.rangoaltura = rangoaltura;
        this.rangoedad = rangoedad;
        this.sexo = sexo;
    }

    public Integer getIdperfil() {
        return idperfil;
    }

    public void setIdperfil(Integer idperfil) {
        this.idperfil = idperfil;
    }

    public String getColorcabello() {
        return colorcabello;
    }

    public void setColorcabello(String colorcabello) {
        this.colorcabello = colorcabello;
    }

    public String getColorojos() {
        return colorojos;
    }

    public void setColorojos(String colorojos) {
        this.colorojos = colorojos;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRangoaltura() {
        return rangoaltura;
    }

    public void setRangoaltura(String rangoaltura) {
        this.rangoaltura = rangoaltura;
    }

    public String getRangoedad() {
        return rangoedad;
    }

    public void setRangoedad(String rangoedad) {
        this.rangoedad = rangoedad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @XmlTransient
    public List<Casting> getCastingList() {
        return castingList;
    }

    public void setCastingList(List<Casting> castingList) {
        this.castingList = castingList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idperfil != null ? idperfil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Perfil)) {
            return false;
        }
        Perfil other = (Perfil) object;
        if ((this.idperfil == null && other.idperfil != null) || (this.idperfil != null && !this.idperfil.equals(other.idperfil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ObjetosNegocio.Perfil[ idperfil=" + idperfil + " ]";
    }
    
}
