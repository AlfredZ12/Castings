/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Control.*;
import ObjetosNegocio.*;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface IPersistenceRepository {
    public boolean Autenticar(String usuario, String contrasena);
    public Casting Agregar(Casting casting);

    public void Agregar(Presencial presencial);

    public Persona Agregar(Persona persona);

    public void Agregar(Perfil perfil);
    public void Actualizar(Presencial presencial);
    public Fase Agregar(Fase fase);


    public void Agregar(Agentecasting agenteCasting);

    public Prueba Agregar(Prueba prueba);

    public void Agregar(Cliente cliente);

   public void Actualizar(Fase fase);

    public void Actualizar(Casting casting);


    public void Actualizar(Integer id,Presencial agenteCasting);

    public Cliente BuscarCliente(Integer id);
    public Casting BuscarCasting(Integer id);

    public Agentecasting BuscarAgente(Integer id);

    public Presencial BuscarPresencial(Integer id);

    public Presencial BuscarPresencial(String nombre);

    public List<Cliente> ListCliente();

    public List<Agentecasting> ListAgente();

    public List<Presencial> ListPresencial();
    
   public List<Fase> ListFasePresencial(Integer id);
   
   public List<Perfil> ListPerfil(Integer id);

}
