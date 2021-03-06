/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_Castings;

import Control.Control;
import ObjetosNegocio.Agentecasting;
import ObjetosNegocio.Casting;

import ObjetosNegocio.Cliente;
import ObjetosNegocio.Fase;
import ObjetosNegocio.Presencial;
import Repository.BaseRepository;
import Repository.IPersistenceRepository;
import Repository.PersistenceRepository;
import java.awt.Dimension;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Persistence;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class GUIPrincipal extends javax.swing.JDialog {

    IPersistenceRepository persistencia;
    Control control = new Control();
    List<Cliente> listaClientes = new ArrayList<>();
    DefaultComboBoxModel<Cliente> ComboCliente = new DefaultComboBoxModel<>();
    List<Fase> fases = new ArrayList<>();

    /**
     * Creates new form GUIPrincipal
     */
    public GUIPrincipal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        persistencia = new PersistenceRepository();
        initComponents();
        setSize(new Dimension(550, 550));
        this.jPanel1.setVisible(false);
        this.jPanel2.setVisible(false);
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnResgistrarCasting = new javax.swing.JButton();
        btnBuscarCasting = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        txtCosto = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblCosto = new javax.swing.JLabel();
        txtNumPersona = new javax.swing.JTextField();
        AreaDescripcion = new javax.swing.JTextField();
        lblNumPersonas = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        FormatedFechaInicio = new javax.swing.JFormattedTextField();
        FormatedFechaFin = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        lbldesde = new javax.swing.JLabel();
        lblhasta = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblFases = new javax.swing.JTable();
        lblCrearFases = new javax.swing.JLabel();
        btnRegistrarCliente = new javax.swing.JButton();
        btnRegistrarAgente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblCliente = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTblAgente = new javax.swing.JTable();
        lblCliente = new javax.swing.JLabel();
        lblAgentes = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        btnRegistrarPerfil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Principal");

        btnResgistrarCasting.setText("Registrar Casting");
        btnResgistrarCasting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResgistrarCastingActionPerformed(evt);
            }
        });

        btnBuscarCasting.setText("Buscar Casting");
        btnBuscarCasting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCastingActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar Casting"));

        lblNombre.setText("Nombre");

        lblDescripcion.setText("Descripcion");

        jButton5.setText("Guardar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoActionPerformed(evt);
            }
        });

        lblCosto.setText("Costo");

        lblNumPersonas.setText("Num Personas");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        FormatedFechaInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        FormatedFechaFin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jButton1.setText("AgregarFase");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbldesde.setText("desde:");

        lblhasta.setText("hasta:");

        tblFases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblFases);

        lblCrearFases.setText("CrearFases:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDescripcion)
                            .addComponent(lblNombre))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(AreaDescripcion))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNumPersonas)
                            .addComponent(lblCosto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumPersona, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(txtCosto)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar)
                                .addGap(49, 49, 49))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCrearFases)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbldesde)
                                .addGap(10, 10, 10)
                                .addComponent(FormatedFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(lblhasta)))
                        .addGap(10, 10, 10)
                        .addComponent(FormatedFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumPersonas)
                    .addComponent(txtNumPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcion)
                    .addComponent(AreaDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCosto)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCrearFases, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lbldesde))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(FormatedFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lblhasta))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(FormatedFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))))
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(btnCancelar))
                        .addContainerGap())))
        );

        btnRegistrarCliente.setText("Registrar Cliente");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });

        btnRegistrarAgente.setText("Registrar Agente");
        btnRegistrarAgente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAgenteActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista De Clientes/Agentes"));

        jTblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTblCliente);

        jTblAgente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTblAgente);

        lblCliente.setText("Clientes");

        lblAgentes.setText("Agentes");

        jButton7.setText("Recargar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCliente)
                        .addGap(195, 195, 195)
                        .addComponent(jButton7)
                        .addGap(25, 25, 25))
                    .addComponent(jScrollPane3))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(lblAgentes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(lblCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAgentes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        btnRegistrarPerfil.setText("Registrar Perfil");
        btnRegistrarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(btnRegistrarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnResgistrarCasting, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRegistrarCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarCasting, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRegistrarAgente)))))
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnResgistrarCasting, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarCasting, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrarAgente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistrarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResgistrarCastingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResgistrarCastingActionPerformed
       //Valida si existen Clientes o Si existen Agentes disponibles. 1 representa que esta disponible 
       //0 que no, por lo tanto solo se mostraran los que tengan el atributo disponibilidad = 1
        if (!control.validarListaClientes(persistencia.ListCliente(), persistencia)) {
            if (!control.validarListaAgentes(control.validarDisponibilidad(persistencia.ListAgente()), persistencia)) {
                jTblCliente.setModel(control.ModeloCliente(persistencia.ListCliente()));
                jTblAgente.setModel(control.ModeloAgente(control.validarDisponibilidad(persistencia.ListAgente())));
                this.FormatedFechaInicio.setText(control.ConvertirDateToString2(new Date()));
               this.FormatedFechaFin.setText(control.ConvertirDateToString2(new Date()));
                setSize(new Dimension(1135, 530));
                this.setLocationRelativeTo(null);
                this.jPanel1.setVisible(true);
                this.jPanel2.setVisible(true);
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_btnResgistrarCastingActionPerformed

    private void txtCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoActionPerformed
    public void vaciar() {
        this.txtCosto.setText("");
        this.txtNumPersona.setText("");
        this.txtNombre.setText("");
        this.AreaDescripcion.setText("");
        this.FormatedFechaInicio.setText(control.ConvertirDateToString2(new Date()));
        this.FormatedFechaFin.setText(control.ConvertirDateToString2(new Date()));
        this.setLocationRelativeTo(null);
        tblFases.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new Object[]{}));
    }
    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        RegistrarCliente registro = new RegistrarCliente(null, true, persistencia);
        registro.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void btnRegistrarAgenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAgenteActionPerformed
        RegistrarAgente agente = new RegistrarAgente(null, true, persistencia);
        agente.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarAgenteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Se crea una instancia de Casting y Casting presencial
        this.setTitle("Registro Casting");
        Casting casting = new Casting();
        Presencial presencial = new Presencial();
        //de la seleccion de la tabla se obtienen los objetos Cliente y Agente con los Metodos buscar por id
        //del la interfaz 
        int selelccionC = jTblCliente.getSelectedRow();
        int SeleccionA = jTblAgente.getSelectedRow();
        
        //si hay seleccion entra en la condicion Si no manda un mensaje que se debe seleccionar un Cliente y un Agente
        if (selelccionC != -1 && SeleccionA != -1) {
            Integer idCliente = (Integer) jTblCliente.getValueAt(selelccionC, 0);
            Integer idAgente = (Integer) jTblAgente.getValueAt(SeleccionA, 0);
            casting.setNombre(txtNombre.getText());

            casting.setCosto(Float.valueOf(txtCosto.getText()));
            casting.setDescripcion(AreaDescripcion.getText());
            casting.setFechacontratacion(new Date());
            casting.setIdCliente(persistencia.BuscarCliente(idCliente));

            presencial.setIdAgenteCasting(persistencia.BuscarAgente(idAgente));
            Agentecasting aux = persistencia.BuscarAgente(idAgente);
//           Si no registra 2 o mas fases no entra ala condicion y manda mensaje
            if (fases.size() > 1) {
                casting = persistencia.Agregar(casting);
                presencial.setIdCasting(casting);
                presencial.setNumeroPersonas(txtNumPersona.getText());

                persistencia.Agregar(presencial);
                persistencia.Actualizar(aux.getIdagenteCasting(), presencial);
                for (Fase f : fases) {
                    f.setIdPresencial(presencial.getIdpresencial());
                    persistencia.Agregar(f);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Se deben Registrar al menos 2 fases", "Error fases", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            //Valida si desea agregar un nuevo Casting y actualiza las tablas
            if (control.MensajeNuevoCasting(this, jPanel1, jPanel2, "Desea Agregar Otro Casting?", "Advertencia!!")) {
                jTblCliente.setModel(control.ModeloCliente(persistencia.ListCliente()));
                jTblAgente.setModel(control.ModeloAgente(persistencia.ListAgente()));
                JOptionPane.showMessageDialog(null, "Se agrego Correctamente el casting con id: " + casting.getIdcasting(), "Mensaje", JOptionPane.INFORMATION_MESSAGE);

            }
            JOptionPane.showMessageDialog(null, "Se agrego Correctamente el casting con id: " + casting.getIdcasting(), "Mensaje", JOptionPane.INFORMATION_MESSAGE);

            vaciar();
            this.setLocationRelativeTo(null);
        } else {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar un Agente y un Cliente", "Advertencia", JOptionPane.INFORMATION_MESSAGE);

        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnBuscarCastingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCastingActionPerformed
        BuscarCasting buscar = new BuscarCasting(null, true, persistencia);
        buscar.setVisible(true);
    }//GEN-LAST:event_btnBuscarCastingActionPerformed

    private void btnRegistrarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPerfilActionPerformed
        RegistrarPerfil regPerfil = new RegistrarPerfil(null, true, persistencia, control);
        regPerfil.setVisible(true);
    }//GEN-LAST:event_btnRegistrarPerfilActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jTblCliente.setModel(control.ModeloCliente(persistencia.ListCliente()));
        jTblAgente.setModel(control.ModeloAgente(persistencia.ListAgente())); // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        vaciar();        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //se crea un alista de fases para posteriormente agregarlas al base de datos 
        // de acuerdo al casting que se agregara
        Fase auxFase = new Fase();
        try {

            if (control.validarFecha(FormatedFechaInicio.getText(), FormatedFechaFin.getText())) {

                auxFase.setFechainicio(control.ConvertirStringToDate(FormatedFechaInicio.getText()));
                auxFase.setFechafinal(control.ConvertirStringToDate(FormatedFechaFin.getText()));

                fases.add(auxFase);

                tblFases.setModel(control.ModeloFase(fases));
            } else {
                JOptionPane.showMessageDialog(this, "la fecha: " + FormatedFechaFin.getText() + " debe ser mayor a: " + FormatedFechaInicio.getText());
            }

        } catch (ParseException ex) {
            Logger.getLogger(GUIPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AreaDescripcion;
    private javax.swing.JFormattedTextField FormatedFechaFin;
    private javax.swing.JFormattedTextField FormatedFechaInicio;
    private javax.swing.JButton btnBuscarCasting;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrarAgente;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegistrarPerfil;
    private javax.swing.JButton btnResgistrarCasting;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTblAgente;
    private javax.swing.JTable jTblCliente;
    private javax.swing.JLabel lblAgentes;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblCrearFases;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumPersonas;
    private javax.swing.JLabel lbldesde;
    private javax.swing.JLabel lblhasta;
    private javax.swing.JTable tblFases;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumPersona;
    // End of variables declaration//GEN-END:variables

}
