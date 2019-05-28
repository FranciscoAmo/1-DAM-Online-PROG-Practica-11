/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea11prog;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FRANCISCO
 */
public class VistaCliente extends javax.swing.JPanel {
    private DefaultTableModel modelo;
    
    public VistaCliente() {
        this.modelo = new DefaultTableModel();
        initComponents();
        // creo los campos
        this.TablaClientes.setModel(modelo);
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("telefono");
       

        // relleno la tabla con los datos

        rellenarTabla();
        
        
        
    }

   
// inicio el model de la JTable
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtMostrarCodigo = new javax.swing.JTextField();
        TxtMostrarNombre = new javax.swing.JTextField();
        TxtMostrarTelefono = new javax.swing.JTextField();
        btnBorrarRegistro = new javax.swing.JButton();
        btnInsertarRegistro = new javax.swing.JButton();
        btnModificarRegistro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaClientes = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 255, 204));
        setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel1.setText("Codigo");

        jLabel2.setText("Nombre");

        jLabel3.setText("Telefono");

        jLabel4.setText("CLIENTES");

        btnBorrarRegistro.setText("Borrar Registro");
        btnBorrarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarRegistroActionPerformed(evt);
            }
        });

        btnInsertarRegistro.setText("Insertar  Registro");
        btnInsertarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarRegistroActionPerformed(evt);
            }
        });

        btnModificarRegistro.setText("Modificar Registro");
        btnModificarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarRegistroActionPerformed(evt);
            }
        });

        TablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtMostrarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TxtMostrarCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                        .addComponent(TxtMostrarNombre))))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBorrarRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInsertarRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificarRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TxtMostrarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(TxtMostrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TxtMostrarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBorrarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInsertarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarRegistroActionPerformed
        
        
        // si no esta seleccionada nada en la tabal aqueavise y no haganada
         if (TablaClientes.getSelectedRow() == -1) {

            JOptionPane.showMessageDialog(this, "Debes seleccionar una fila", "Operacion abortada", JOptionPane.INFORMATION_MESSAGE);

        } else {
             // compruebo que son numeros
            if (!metodo.sonnumeros(TxtMostrarCodigo.getText())) {
                    JOptionPane.showMessageDialog(this, "El codigo debe ser numerico", "Operacion abortada", JOptionPane.INFORMATION_MESSAGE);
            } else {
                
                    // cojo el codigo de la tabla
                    int Codigoinicial = Integer.parseInt((String) TablaClientes.getValueAt(TablaClientes.getSelectedRow(), 0));
                    
                    // cojo los valres de los campos por si habria que modificarles
                    
                    int Codigo = Integer.parseInt(TxtMostrarCodigo.getText());
                     String Nombre = TxtMostrarNombre.getText();
                    String telefono = TxtMostrarTelefono.getText();
                    

                metodo.ModificarRegistro(Codigoinicial,Codigo, Nombre, telefono);

                rellenarTabla();
            }
        }

        
        
        
        
        
        
    }//GEN-LAST:event_btnModificarRegistroActionPerformed

    private void btnBorrarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarRegistroActionPerformed
        
        // si no esta seleccionado un campo no hago nada
        if (TablaClientes.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar una fila", "Operacion abortada", JOptionPane.INFORMATION_MESSAGE);

        } else {
            // cojo el valores del codigo de la linea seleccionada
            String Codigo = (String) TablaClientes.getValueAt(TablaClientes.getSelectedRow(), 0);

            // borro el registro segun el codigo y la tabla en la que estoy
            metodo.borrarRegistro(Codigo, "Clientes");
            
            // relleno la tabla
            rellenarTabla();
        }
       
        
        
        
    }//GEN-LAST:event_btnBorrarRegistroActionPerformed

    private void TablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaClientesMouseClicked
       
        // hago que cuando marco una fila de la tabla se coloce en los campos 
        TxtMostrarCodigo.setText((String) TablaClientes.getValueAt(TablaClientes.getSelectedRow(), 0));
        TxtMostrarNombre.setText((String) TablaClientes.getValueAt(TablaClientes.getSelectedRow(), 1));
        TxtMostrarTelefono.setText((String) TablaClientes.getValueAt(TablaClientes.getSelectedRow(), 2));

        
        
    }//GEN-LAST:event_TablaClientesMouseClicked

    private void btnInsertarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarRegistroActionPerformed
       
        // si no inserto nada no dejo introducirlo
        if (TxtMostrarCodigo.getText().equalsIgnoreCase("") || TxtMostrarNombre.getText().equalsIgnoreCase("")|| TxtMostrarTelefono.getText().equalsIgnoreCase("")) {

            JOptionPane.showMessageDialog(this, "Debes seleccionar un valor", "Operacion abortada", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // si el campo de codigo no es un numero no dejo insertar nada
            if (!metodo.sonnumeros(TxtMostrarCodigo.getText())) {
                
                JOptionPane.showMessageDialog(this, "El codigo debe ser numerico", "Operacion abortada", JOptionPane.INFORMATION_MESSAGE);
           
            } else {
                
                // cojo los datos de los campos
                int Codigo = Integer.parseInt(TxtMostrarCodigo.getText());
                String Nombre = TxtMostrarNombre.getText();
                String telefono = TxtMostrarTelefono.getText();
                
                // inserto los datos en la Bd
                metodo.InsertarCliente(Codigo, Nombre, telefono);
                
                //relleno la tabla
                rellenarTabla();
            }
        }
        
        
        
        
        
        
    }//GEN-LAST:event_btnInsertarRegistroActionPerformed

    Metodos metodo =new Metodos();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaClientes;
    private javax.swing.JTextField TxtMostrarCodigo;
    private javax.swing.JTextField TxtMostrarNombre;
    private javax.swing.JTextField TxtMostrarTelefono;
    private javax.swing.JButton btnBorrarRegistro;
    private javax.swing.JButton btnInsertarRegistro;
    private javax.swing.JButton btnModificarRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


public void rellenarTabla() {
        // metodo rellenar tabla
        // borro todos los valores
        modelo.setRowCount(0);

        // como las filas son objetos utilizo un objeto neutro para guardar las filas 
        // y las guardo en un arraylist
        ArrayList<Object[]> valores;

        int numeroregistros;
        Object j;
        
        // obtengo el numero de filas de la tabla y los valores de la tabla 
        valores = metodo.obtenerFilasTabla("Clientes");
        numeroregistros = metodo.contarvaloresTabla("Clientes");

        for (int i = 0; i < numeroregistros; i++) {
            
            // coloco los valores en el modelo de tabla
            modelo.addRow(valores.get(i));

        }

    }


}
