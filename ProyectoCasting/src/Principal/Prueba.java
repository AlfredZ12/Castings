package Principal;


import Control.Control;
import GUI_Castings.Inicio;
import Repository.AgenteCastingRepository;
import Repository.PersonaRepository;
import ObjetosNegocio.Agentecasting;
import ObjetosNegocio.Persona;
import java.text.ParseException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Prueba {

    public static void main(String[] args) throws ParseException {
//        PersonaRepository p = new PersonaRepository();
//        AgenteCastingRepository a = new AgenteCastingRepository();
//        Agentecasting agente = new Agentecasting();
//        
//        Control control = new Control();
//        System.out.println(control.validarFecha("5/12/2020", "7/12/2020"));
          Inicio inicio = new Inicio();
   
          inicio.iniciar();
          
        
//        agente.setNumeroEmpleado(100);
//        agente.setIdagenteCasting(2);
//
//        Persona persona = new Persona();
////
//        persona.setCurp("NUOAOAO");
//        persona.setDireccion("-calle calle calle");
//        persona.setNombre("asdea asde asde asde");
//        persona.setRfc("DDDDdasad");
//        System.out.println(p.agregar(persona).getIdPersona());
//        agente.setIdPersona(p.agregar(persona));
        
//
//           MySQL workbench 
//           wampserver
//                   
//
//        persona = p.BuscarId(1);
//        System.out.println("persona: " + persona.getNombre());
//        agente.setIdPersona(persona);
//        a.Agregar(agente);
//        System.out.println("Prueba BuscarId de REgistro Agente: " + a.BuscarId(1).getIdPersona().getNombre());
//        List<Agentecasting> agentes = a.Lista();
//        for (Agentecasting agente1 : agentes) {
//
//            System.out.println("agentes: " + agente1.getIdPersona().getNombre());
//        }
//        Agentecasting agentsse = a.Buscar("Jose alfredo");
//        System.out.println(agentsse.getDisponible()
//        );
//        a.setDisponibilidad(agentsse.getIdagenteCasting());
//        agentsse = a.Buscar("Jose alfredo");
//        System.out.println(agentsse.getDisponible());
//
//        Persona p = new Persona();
//        p.setNombre("FFFFFFFFFFFFFFFf");
//        p.setCurp("adssa");
//        p.setRfc("adssa");
//        p.setDireccion("adssa");
//      p.setDireccion("adssa");
//        control.Agregar(p);

    }

}
