/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea11prog;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class VistaEscrituraCliente extends javax.swing.JPanel {

    private DefaultTableModel modelo = new DefaultTableModel();

    public VistaEscrituraCliente() {
        initComponents();

        // los datos que de las claves de Clientes se cargan en el combobox
        while (i < numeroCli) {
            cmbCliente.addItem(valoresCli[i] + "");
            i++;

        }
        // los datos que de las claves de Escrituras se cargan en el combobox
        while (j < numeroEsc) {
            cmbEscritura.addItem(valoresEsc[j] + "");
            j++;
        }

        // creo el modelo para la tabla
        
        this.TablaEscrituraCliente.setModel(modelo);
        modelo.addColumn("CodigoCliente");
        modelo.addColumn("CodigoEscritura");

        // relleno la tabla
        rellenarTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEscrituraCliente = new javax.swing.JTable();
        BtnBorrarregistro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbCliente = new javax.swing.JComboBox<>();
        btnModificarRegistro = new javax.swing.JButton();
        btnInsertarRegistro = new javax.swing.JButton();
        cmbEscritura = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setPreferredSize(new java.awt.Dimension(500, 500));

        TablaEscrituraCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaEscrituraCliente.setPreferredSize(new java.awt.Dimension(400, 400));
        TablaEscrituraCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaEscrituraClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaEscrituraCliente);

        BtnBorrarregistro.setText("Borrar registro ");
        BtnBorrarregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarregistroActionPerformed(evt);
            }
        });

        jLabel2.setText("Codigo Cliente");

        jLabel3.setText("Codigo Escritura");

        btnModificarRegistro.setText("Modificar Registro");
        btnModificarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarRegistroActionPerformed(evt);
            }
        });

        btnInsertarRegistro.setText("Introducir Registro");
        btnInsertarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarRegistroActionPerformed(evt);
            }
        });

        jLabel1.setText("ESCRITURAS-CLIENTE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbEscritura, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModificarRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInsertarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(BtnBorrarregistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(BtnBorrarregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInsertarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbEscritura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBorrarregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarregistroActionPerformed
        if (TablaEscrituraCliente.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar una fila", "Operacion abortada", JOptionPane.INFORMATION_MESSAGE);

        } else {

            String Codigo = (String) TablaEscrituraCliente.getValueAt(TablaEscrituraCliente.getSelectedRow(), 0);

            metodo.borrarRegistro(Codigo, "escriturascliente");

            rellenarTabla();
        }
    }//GEN-LAST:event_BtnBorrarregistroActionPerformed

    private void TablaEscrituraClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaEscrituraClienteMouseClicked

        
        
        
        cmbCliente.setSelectedIndex(obtenerindiceComboboxCliente());
        cmbEscritura.setSelectedIndex(obtenerindiceComboboxEscritura());
     

    }//GEN-LAST:event_TablaEscrituraClienteMouseClicked

    private void btnInsertarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarRegistroActionPerformed

        if (cmbCliente.getSelectedIndex() == -1 || cmbEscritura.getSelectedIndex() == -1) {

            JOptionPane.showMessageDialog(this, "Debes seleccionar un valor", "Operacion abortada", JOptionPane.INFORMATION_MESSAGE);
        } else {

            int CodCliente = Integer.parseInt(cmbCliente.getSelectedItem().toString());
            int CodEscritura = Integer.parseInt(cmbEscritura.getSelectedItem().toString());

            metodo.InsertarEscrituraCliente(CodCliente, CodEscritura);

        }
        
           rellenarTabla();

    }//GEN-LAST:event_btnInsertarRegistroActionPerformed

    private void btnModificarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarRegistroActionPerformed
      
         if (TablaEscrituraCliente.getSelectedRow() == -1) {

            JOptionPane.showMessageDialog(null, "Debes seleccionar una fila", "Accion Cancelada", JOptionPane.INFORMATION_MESSAGE);

        } else {
        int valor1=Integer.parseInt((String) TablaEscrituraCliente.getValueAt(TablaEscrituraCliente.getSelectedRow(), 0));
        int valor2=Integer.parseInt((String) TablaEscrituraCliente.getValueAt(TablaEscrituraCliente.getSelectedRow(), 1));
        
        int CodCliente = Integer.parseInt(cmbCliente.getSelectedItem().toString());
        int CodEscritura = Integer.parseInt(cmbEscritura.getSelectedItem().toString());
        metodo.ModificarRegistro(valor1,valor2,CodCliente ,CodEscritura);
        
        
        rellenarTabla();
         }
    }//GEN-LAST:event_btnModificarRegistroActionPerformed

    Metodos metodo = new Metodos();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBorrarregistro;
    private javax.swing.JTable TablaEscrituraCliente;
    private javax.swing.JButton btnInsertarRegistro;
    private javax.swing.JButton btnModificarRegistro;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JComboBox<String> cmbEscritura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void rellenarTabla() {

        modelo.setRowCount(0);

        ArrayList<Object[]> valores;

        int numeroregistros;
        Object j;

        valores = metodo.obtenerFilasTabla("escriturascliente");
        numeroregistros = metodo.contarvaloresTabla("escriturascliente");

        for (int i = 0; i < numeroregistros; i++) {

            modelo.addRow(valores.get(i));
         
        }

    }

    public int obtenerindiceComboboxCliente() {
          

            for (i = 0; i < numeroCli; i++) {
                int valor=Integer.parseInt((String) TablaEscrituraCliente.getValueAt(TablaEscrituraCliente.getSelectedRow(), 0));
                if (valor==valoresCli[i]) {

                    
                    break;
                }
            }
            return i;
    } 
    
    public int obtenerindiceComboboxEscritura() {
       

             for (i = 0; i < numeroEsc; i++) {
                int valor=Integer.parseInt((String) TablaEscrituraCliente.getValueAt(TablaEscrituraCliente.getSelectedRow(), 1));
                if (valor==valoresEsc[i]) {

                    
                    break;
                }
            }
            return i;
    } 
    

    // obtengo los valores de las claves primaria de Clientes y escrituras
    
    int[] valoresCli = metodo.obtenerCodigoTabla("Codigo", "Clientes");
    int[] valoresEsc = metodo.obtenerCodigoTabla("Codigo", "Escrituras");
    
    // calculo el numero de registros en la tabla clientes y Escrituras
    int numeroCli = metodo.contarvaloresTabla("Clientes");
    int numeroEsc = metodo.contarvaloresTabla("Escrituras");
    // valores para los bucles
    int i = 0;
    int j = 0;

}
