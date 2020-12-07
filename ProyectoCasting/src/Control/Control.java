/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import ObjetosNegocio.Agentecasting;
import ObjetosNegocio.Casting;
import ObjetosNegocio.Cliente;
import ObjetosNegocio.Fase;
import ObjetosNegocio.Perfil;
import ObjetosNegocio.Presencial;
import Repository.IPersistenceRepository;
import Repository.PersistenceRepository;
import java.awt.Dimension;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import GUI_Castings.Inicio;
import GUI_Castings.RegistrarAgente;
import GUI_Castings.RegistrarCliente;

/**
 *
 * @author Admin
 */
public class Control {

    private final String[] CastingTitle = {"id", "Cliente", "Nombre", "Costo", "Descripcion", "Fecha"};
        private final String[] ClienteTitle = {"id", "Nombre", "Persona Contacto"};
        private final String[] AgenteTitle = {"id","Numero de Empleado","Nombre","Disponibilidad"};
        private final String[] FaseTitle ={"fecha inicio", "fecha fin"};
        private final String[] PerfilTitle={"Estado","Sexo","Especialidad","Altura","Edad","Cabello","Ojos"};
    public Control() {
        
    }  
    /**
     * Se crea un modelo de lista de perfil de un Casting
     * @param lista Representa la lista a agregar al JTABLE
     * @return 
     */
    public DefaultTableModel ModeloPerfil(List<Perfil> lista){
         Object tabla[][];
        if (lista != null) {
            tabla = new Object[lista.size()][7];
            for (int i = 0; i < lista.size(); i++) {
                Perfil presencial = lista.get(i);
                tabla[i][0] = presencial.getEstado();
                tabla[i][1] = presencial.getSexo();
                tabla[i][2] = presencial.getEspecialidad();
                tabla[i][3] = presencial.getRangoaltura();
                tabla[i][4] = presencial.getRangoedad();
                tabla[i][5] = presencial.getColorcabello();
                tabla[i][6] = presencial.getColorojos();
            }
            
            return new DefaultTableModel(tabla, PerfilTitle);
        }
        return null;
    }
    public DefaultTableModel ModeloFase(List<Fase> lista){
         Object tabla[][];
        if (lista != null) {
            tabla = new Object[lista.size()][2];
            for (int i = 0; i < lista.size(); i++) {
                Fase presencial = lista.get(i);
                tabla[i][0] = ConvertirDateToString(presencial.getFechainicio());
                tabla[i][1] = ConvertirDateToString(presencial.getFechafinal());
            }
            return new DefaultTableModel(tabla, FaseTitle);
        }
        return null;
    }
    
   
    /**
     * Se crea un modelo de tabla de Castings 
     * @param lista Representa la lista de Castings
     * @return regresa un Modelo tipo DefaultTableModel
     */
    public  DefaultTableModel ModeloCasting(List<Presencial> lista) {
        Object tabla[][];
        if (lista != null) {
            
           
            tabla = new Object[lista.size()][6];
            for (int i = 0; i < lista.size(); i++) {
                Presencial presencial = lista.get(i);
                tabla[i][0] = presencial.getIdCasting().getIdcasting();
                tabla[i][1] = presencial.getIdCasting().getIdCliente().getNombre();
                tabla[i][2] = presencial.getIdCasting().getNombre();
                tabla[i][3] = presencial.getIdCasting().getCosto();
                tabla[i][4] = presencial.getIdCasting().getDescripcion();
                tabla[i][5] = ConvertirDateToString(presencial.getIdCasting().getFechacontratacion());

            }
            return  new  DefaultTableModel(tabla, CastingTitle);
        }
        return null;
    }
    /**
     * Convierte una Fecha tipo Date a String de la forma d' de 'MMMM' de 'yyyy
     * @param date Representa la fecha
     * @return regresa en forma de string la fecha ingresada
     */
    public String ConvertirDateToString(Date date){
        DateFormat format = new SimpleDateFormat("d' de 'MMMM' de 'yyyy");
        return format.format(date);
    }/**
     * Convierte una Fecha tipo Date a String de la forma d/MM/yyy
     * @param date Representa la fecha
     * @return regresa en forma de string la fecha ingresada
     */
    
    public String ConvertirDateToString2(Date date){
        DateFormat format = new SimpleDateFormat("d/MM/yyy");
        return format.format(date);
    }
    /**
     * Convierte un String a date 
     * @param date Representa la cadena con la fecha
     * @return regresa la fecha como un DAte
     * @throws ParseException 
     */
    public Date ConvertirStringToDate(String date) throws ParseException{
        try {
            DateFormat format = new SimpleDateFormat("d/MM/yyyy");
            return format.parse(date);
        } catch (ParseException e) {
            e.getMessage();
        }
        return null;
    }
    /**
     * Crea un Modelo de tabla de de Agente de Casting
     * @param lista Representa la lista de Agente
     * @return  regresa un modelo DefaultTableModel
     */
    public DefaultTableModel ModeloAgente(List<Agentecasting> lista) {
        Object tabla[][];
        List<Agentecasting> listaaux = validarDisponibilidad(lista);
        if (listaaux != null) {
            tabla = new Object[listaaux.size()][4];
            for (int i = 0; i < listaaux.size(); i++) {

                Agentecasting agente = listaaux.get(i);
                if (agente.getDisponible() != 0) {
                    tabla[i][0] = agente.getIdagenteCasting();
                    tabla[i][1] = agente.getNumeroEmpleado();
                    tabla[i][2] = agente.getIdPersona().getNombre();
                    tabla[i][3] = agente.getDisponible();
                }
            }
            return new DefaultTableModel(tabla, AgenteTitle);
        }
        return null;
    }
    /**
     * Metodo que regresa un modelo de tabla con una lista de Clientes
     * @param lista Recibe una lista de cliente         
     * @return regresa un modelo tipo DefaultTableModel de tipo Cliente
     */
    public DefaultTableModel ModeloCliente(List<Cliente> lista) {
        Object tabla[][];
        if (lista != null) {
            tabla = new Object[lista.size()][3];
            for (int i = 0; i < lista.size(); i++) {
              Cliente presencial = lista.get(i);
                System.out.println(presencial.getNombre());
                tabla[i][0] = presencial.getIdCliente();
                tabla[i][1] = presencial.getNombre();
                tabla[i][2] = presencial.getIdPersonaContacto();
           
            }
            return new DefaultTableModel(tabla, ClienteTitle);
        }
        return null;
    }
    

    /**
     * Metodo que envia un Mensaje con opciones al dialogo recibido como parametro 
     * @param frame Representa el cuadro de dialogo donde se mostrara el mensaje
     * @param jPanel1 Representa un panel que se hara visible o no visible
     * @param jPanel2 Representa un panel que se hara visible o no visible
     * @param msj1 Representa el mensaje a mostrar en el cuadro de dialogo
     * @param msj2 Representa el mensaje a mostrar en el titulo del cuadro de dialogo
     * @return regresa verdadero si se selecciona yes y falso si se seleccion No
     */
    public boolean MensajeNuevoCasting(JDialog frame, JPanel jPanel1, JPanel jPanel2, String msj1,String msj2) {
        int seleccion = JOptionPane.showOptionDialog(frame,
                msj1,
                msj2,
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono por defecto.
                new Object[]{"Yes", "No", "Cancel"}, // null para YES, NO y CANCEL
                "opcion 1");
        System.out.println(seleccion);
        if (seleccion != -1) {
            if (seleccion == 0) {
                
                return true;
            }
        }
        jPanel1.setVisible(true);
        jPanel2.setVisible(true);
        if (seleccion == 1) {
            frame.setSize(new Dimension(540, 540));

            jPanel1.setVisible(false);
            jPanel2.setVisible(false);
            return false;
        }
        return false;
    }
    /**
     * Metodo que envia un mensaje a un dialogo
     * @param frame Representa un cuadro de dialogo
     * @param msj1 Representa el mensaje a mostrar 
     * @param msj2 Representa el mensaje a mostrar en el titulo
     * @return 
     */
    public boolean MensajeNuevo(JDialog frame, String msj1, String msj2) {
        int seleccion = JOptionPane.showOptionDialog(frame,
                msj1,
                msj2,
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono por defecto.
                new Object[]{"Yes", "No", "Cancel"}, // null para YES, NO y CANCEL
                "opcion 1");
        
        if (seleccion != -1) {
            if (seleccion == 0) {

                return true;
            }
        }

        return false;
    }

    
    /**
     * Metodo que valida si la lista de clientes no esta vacia
     * @param lista Representa la lista
     * @param persistencia Representa el metodo para obtener la lista desde la base de datos
     * @return regresa verdaro si la lista esta vacia para mostrar un formulario
     */
    public boolean validarListaClientes(List<Cliente> lista, IPersistenceRepository persistencia) {
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe Registrar Clientes", "Advertencia!!", JOptionPane.INFORMATION_MESSAGE);
            RegistrarCliente reg = new RegistrarCliente(null, true, persistencia);
            reg.setVisible(true);
          return true;}
        return false;
    }
    /**
     * Metodo que valida si la lista de clientes no esta vacia
     * @param lista Representa la lista
     * @param persistencia Representa el metodo para obtener la lista desde la base de datos
     * @return regresa verdaro si la lista esta vacia para mostrar un formulario
     */
    public boolean validarListaAgentes(List<Agentecasting> lista, IPersistenceRepository persistencia) {
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe Registrar Agentes", "Advertencia!!", JOptionPane.INFORMATION_MESSAGE);

            RegistrarAgente reg = new RegistrarAgente(null, true, persistencia);
            reg.setVisible(true);
            return true;
        }
        return false;
    }
    /**
     * Metodo que valida la disponibilidad los Agentes de CAsting 1 = Disponible,  0 = No disponible
     * @param listaDisponibles Representa la lista a iterar 
     * @return regresa una nueva lista con los agentes con Disponibilidad = 1
     */
    public List<Agentecasting> validarDisponibilidad(List<Agentecasting> listaDisponibles){
        List<Agentecasting> aux = new ArrayList<>();
        if (aux != null) {
            for (Agentecasting listaDisponible : listaDisponibles) {
                if (listaDisponible.getDisponible() == 1) {
                    aux.add(listaDisponible);
                }
            }
        }
        return aux;
    }
    
    /**
     * Metodo que valida si una fecha esta despues que otra 
     * @param fechainicio la fecha anterior a comparar
     * @param fechaFin la fecha posterior a comparar
     * @return regresa verdadero si la fecha posterior es mayor ala anterior y falso en caso contrario o que sea igual
     * @throws ParseException 
     */
    
    public boolean validarFecha(String fechainicio, String fechaFin) throws ParseException{
       return ConvertirStringToDate(fechaFin).after(ConvertirStringToDate(fechainicio));
//        return true;
    }
   
    


    

}
