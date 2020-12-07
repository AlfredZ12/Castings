/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;


import ObjetosNegocio.*;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PersistenceRepository implements IPersistenceRepository{
    AgenteCastingRepository agenteCastingRepository = new AgenteCastingRepository();
    CastingRepository castingRepository = new CastingRepository();
    ClienteRepository clienteRepository = new ClienteRepository();
    FaseRepository faseRepository = new FaseRepository();
    PerfilRepository perfilRepository = new PerfilRepository();
    PersonaRepository personaCastingRespository = new PersonaRepository();
    PresencialRepository presencialRepository = new PresencialRepository();
    PruebaRepository pruebaRepository = new PruebaRepository();
    AdministradorRepository administradorRepository = new AdministradorRepository();
    
    public PersistenceRepository() {
    }



    @Override
    public Casting Agregar(Casting casting) {
        if (casting != null) {
           return this.castingRepository.Agregar(casting);
        }return null;
    }

    @Override
    public void Agregar(Presencial presencial) {
        if (presencial != null) {
            this.presencialRepository.Agregar(presencial);
        }
    }

    @Override
    public Persona Agregar(Persona persona) {
        if (persona != null) {
            return this.personaCastingRespository.agregar(persona);
        }
        return null;
    }

    @Override
    public void Agregar(Perfil perfil) {
         if (perfil != null) {
            this.perfilRepository.Agregar(perfil);
        }
    }

    @Override
    public Fase Agregar(Fase fase) {
         if (fase != null) {
            return this.faseRepository.Agregar(fase);
        }return null;
    }


    @Override
    public void Agregar(Agentecasting agenteCasting) {
         if (agenteCasting != null) {
            this.agenteCastingRepository.Agregar(agenteCasting);
        }
    }

    @Override
    public Prueba Agregar(Prueba prueba) {
        if (prueba != null) {
            return this.pruebaRepository.Agregar(prueba);
        }
        return null;
    }

    @Override
    public void Agregar(Cliente cliente) {
         if (cliente != null) {
            this.clienteRepository.Agregar(cliente);
        }
    }

    @Override
    public void Actualizar(Casting casting) {
           this.castingRepository.Actualizar(casting);
    }

    @Override
    public void Actualizar(Presencial presencial) {
        this.presencialRepository.Actualizar(presencial);
    }

    @Override
    public void Actualizar(Integer id,Presencial agenteCasting) {
         this.agenteCastingRepository.actualizar(id,agenteCasting);
    }

   

    @Override
    public Cliente BuscarCliente(Integer id) {
        return clienteRepository.BuscarId(id);
    }

    

    @Override
    public Agentecasting BuscarAgente(Integer id) {
        return this.agenteCastingRepository.BuscarId(id);
    }

    

    @Override
    public Presencial BuscarPresencial(Integer id) {
        return this.presencialRepository.BuscarID(id);
    }

    @Override
    public Presencial BuscarPresencial(String nombre) {
        return presencialRepository.BuscarNombre(nombre);
    }

    @Override
    public List<Cliente> ListCliente() {
        return this.clienteRepository.Lista();
    }

    @Override
    public List<Agentecasting> ListAgente() {
         return this.agenteCastingRepository.Lista();
    }

    @Override
    public List<Presencial> ListPresencial() {
        return this.presencialRepository.Lista();
    }

    @Override
    public boolean Autenticar(String usuario, String contrasena) {
        return this.administradorRepository.Autenticacion(usuario, contrasena);
    }

  

    @Override
    public Casting BuscarCasting(Integer id) {
        return this.castingRepository.BuscarporID(id);
    }

    @Override
    public void Actualizar(Fase fase) {
        this.faseRepository.Actualizar(fase);
    }

    @Override
    public List<Fase> ListFasePresencial(Integer id) {
        return this.faseRepository.ListaFaseCasting(id);
    }

    @Override
    public List<Perfil> ListPerfil(Integer id) {
        return perfilRepository.Lista(id);
    }

}
