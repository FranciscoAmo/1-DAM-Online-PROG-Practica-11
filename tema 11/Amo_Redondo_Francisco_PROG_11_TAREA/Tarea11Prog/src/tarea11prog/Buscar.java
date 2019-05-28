package tarea11prog;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Buscar extends javax.swing.JPanel {

    DefaultTableModel modelo = new DefaultTableModel();

    public Buscar() {
        initComponents();

        // inicializo el modelo
        this.TablaBuscar.setModel(modelo);
        modelo.addColumn("CodigoCli");
        modelo.addColumn("Nombre");
        modelo.addColumn("fichero");
        modelo.addColumn("tipo");

        // añado los valores de tipos de contratos en el combobox    
        while (i < tipos.length) {
            cmbTipo.addItem(tipos[i] + "");
            i++;

        }

       

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaBuscar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxtMostrarCodigo = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        checkcodigo = new javax.swing.JCheckBox();
        checktipo = new javax.swing.JCheckBox();
        labelRegistros = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));

        TablaBuscar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaBuscar);

        jLabel1.setText("BUSCAR");

        jLabel2.setText("CodigoCli");

        jLabel3.setText("Tipo");

        TxtMostrarCodigo.setEnabled(false);

        cmbTipo.setEnabled(false);
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        checkcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkcodigoActionPerformed(evt);
            }
        });
        checkcodigo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                checkcodigoPropertyChange(evt);
            }
        });

        checktipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checktipoActionPerformed(evt);
            }
        });

        labelRegistros.setText("campos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(labelRegistros)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtMostrarCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkcodigo)
                            .addComponent(checktipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtMostrarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checktipo)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))
                        .addGap(29, 29, 29)
                        .addComponent(labelRegistros)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(checkcodigo)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed


    }//GEN-LAST:event_cmbTipoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      // realizo una consulta con el codigo del cliente , el tipo de contrato o ambos
      // esto lo eligo con los checkbox
        int Codigo; 
        String Tipo; 
        ArrayList<Object[]> valores=null;
        int numeroregistros=0;
        String Codigotext="";
        
        if (checkcodigo.isSelected() && checktipo.isSelected()) {
            Codigotext=TxtMostrarCodigo.getText();
            if(!metodo.sonnumeros(Codigotext)){
            
            JOptionPane.showMessageDialog(this, "Debes Introducir Numeros", "Operacion abortada", JOptionPane.INFORMATION_MESSAGE);
            }else{
            Codigo= Integer.parseInt(TxtMostrarCodigo.getText());
            Tipo = cmbTipo.getSelectedItem().toString();
            
            
            modelo.setNumRows(0);
            valores = metodo.buscarConsulta(Codigo, Tipo);
            numeroregistros = valores.size();
            }
        } else {
            if (checkcodigo.isSelected()) {

                Codigotext=TxtMostrarCodigo.getText();
                if(!metodo.sonnumeros(Codigotext)){
            
                    JOptionPane.showMessageDialog(this, "Debes Introducir Numeros", "Operacion abortada", JOptionPane.INFORMATION_MESSAGE);
            
                }else{
                Codigo= Integer.parseInt(TxtMostrarCodigo.getText());
                
                 modelo.setNumRows(0);
                valores = metodo.buscarConsulta(Codigo);
                numeroregistros = valores.size();
                }
            }
            if (checktipo.isSelected()) {

                Tipo = cmbTipo.getSelectedItem().toString();
                
                 modelo.setNumRows(0);
                valores = metodo.buscarConsulta(Tipo);
                numeroregistros = valores.size();
            }

        }
        int contador=0;
        for (int i = 0; i < numeroregistros; i++) {

            // coloco los valores en el modelo de tabla
            modelo.addRow(valores.get(i));
            contador++;

        }
       labelRegistros.setText( "("+contador+") registros encontrados");
        


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void checkcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkcodigoActionPerformed
        // habilito los campo codigo  con los checkbox
        if (checkcodigo.isSelected()) {

            TxtMostrarCodigo.setEnabled(true);

        }
        if (!checkcodigo.isSelected()) {
            TxtMostrarCodigo.setEnabled(false);
        }
    }//GEN-LAST:event_checkcodigoActionPerformed

    private void checktipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checktipoActionPerformed
        // habilito el campo tipo con el checkbox
        if (checktipo.isSelected()) {

            cmbTipo.setEnabled(true);

        }
        if (!checktipo.isSelected()) {
            cmbTipo.setEnabled(false);
        }
    }//GEN-LAST:event_checktipoActionPerformed

    private void checkcodigoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_checkcodigoPropertyChange


    }//GEN-LAST:event_checkcodigoPropertyChange

    Metodos metodo = new Metodos();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaBuscar;
    private javax.swing.JTextField TxtMostrarCodigo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JCheckBox checkcodigo;
    private javax.swing.JCheckBox checktipo;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelRegistros;
    // End of variables declaration//GEN-END:variables

   

// inicializo valores y el array de tipos de Contratos
    int i;
    String[] tipos = {"Escritura", "Compraventa", "Herencia"};

}
