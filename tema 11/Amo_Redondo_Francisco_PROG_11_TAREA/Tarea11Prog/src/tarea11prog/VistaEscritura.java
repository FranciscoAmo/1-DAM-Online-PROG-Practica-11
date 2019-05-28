/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea11prog;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public final class VistaEscritura extends javax.swing.JPanel {

    // inicializo el model de l aJTable
    private DefaultTableModel modelo = new DefaultTableModel();

    public VistaEscritura() {
        initComponents();
    // coloco los titulos de las tablas
        this.TablaEscritura.setModel(modelo);
        modelo.addColumn("Codigo");
        modelo.addColumn("tipo");
        modelo.addColumn("fichero");
        modelo.addColumn("numerointegrantes");

    // relleno la tabla    
        rellenarTabla();
 
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
        TablaEscritura = new javax.swing.JTable();
        btnBorrarRegistro = new javax.swing.JButton();
        btnModificarValor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtMostrarCodigo = new javax.swing.JTextField();
        TxtMostrarFichero = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox<>();
        sppersonas = new javax.swing.JSpinner();
        btnInsertarregistro = new javax.swing.JButton();
        btnExplorar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setPreferredSize(new java.awt.Dimension(500, 500));

        TablaEscritura.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaEscritura.setPreferredSize(new java.awt.Dimension(400, 400));
        TablaEscritura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaEscrituraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaEscritura);

        btnBorrarRegistro.setText("Borrar Registro ");
        btnBorrarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarRegistroActionPerformed(evt);
            }
        });

        btnModificarValor.setText("Modificar Registro ");
        btnModificarValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarValorActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo ");

        jLabel2.setText("Tiipo");

        jLabel3.setText("Fichero");

        jLabel4.setText("Intervinientes");

        btnInsertarregistro.setText("Insertar Registro");
        btnInsertarregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarregistroActionPerformed(evt);
            }
        });

        btnExplorar.setText("Explorar");
        btnExplorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExplorarActionPerformed(evt);
            }
        });

        jLabel5.setText("ESCRITURAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TxtMostrarFichero)
                                    .addComponent(sppersonas)
                                    .addComponent(TxtMostrarCodigo, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(jLabel5)
                                .addGap(95, 95, 95)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExplorar)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModificarValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInsertarregistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorrarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtMostrarFichero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(btnExplorar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(sppersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBorrarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(TxtMostrarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInsertarregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarValor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarRegistroActionPerformed
        
        // si no selecciono una fila no hago nada
        if (TablaEscritura.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar una fila", "Operacion abortada", JOptionPane.INFORMATION_MESSAGE);

        } else {
            //obtengo el valor del codigo en la Jtable
            String Codigo = (String) TablaEscritura.getValueAt(TablaEscritura.getSelectedRow(), 0);
            // borro el registro en la BD en funcion del codigo que es clave primaria
            metodo.borrarRegistro(Codigo, "Escrituras");

            // borro y relleno otra vez la tabla
            rellenarTabla();
        }
    }//GEN-LAST:event_btnBorrarRegistroActionPerformed

    private void btnModificarValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarValorActionPerformed

        // si no selecciono una fila no hago nada
        if (TablaEscritura.getSelectedRow() == -1) {

            JOptionPane.showMessageDialog(this, "Debes seleccionar una fila", "Operacion abortada", JOptionPane.INFORMATION_MESSAGE);

        // si el codigo en el textfield no es numerico  no hago nada   
        } else {
            if (!metodo.sonnumeros(TxtMostrarCodigo.getText())) {
                    JOptionPane.showMessageDialog(this, "El codigo debe ser numerico", "Operacion abortada", JOptionPane.INFORMATION_MESSAGE);
            } else {
                //cojo el codio de la Jtable
                    int Codigoinicial = Integer.parseInt((String) TablaEscritura.getValueAt(TablaEscritura.getSelectedRow(), 0));

                // cojo los valores que he cambiado en los campos    
                    int Codigo = Integer.parseInt(TxtMostrarCodigo.getText());
                    String tipo = cmbTipo.getSelectedItem().toString();
                    String fichero = TxtMostrarFichero.getText();
                    int intervinientes = (Integer) sppersonas.getValue();

                // modifico los valores en la BD    
                metodo.ModificarRegistro(Codigoinicial, Codigo, tipo, fichero, intervinientes);

                // borro la tabla y la relleno
                rellenarTabla();
            }
        }


    }//GEN-LAST:event_btnModificarValorActionPerformed

    private void btnInsertarregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarregistroActionPerformed

        // si no se introduce nada en ningun campo no hagonada
        if (TxtMostrarCodigo.getText().equalsIgnoreCase("") || cmbTipo.getSelectedIndex() == -1 || TxtMostrarFichero.getText().equalsIgnoreCase("")) {

            JOptionPane.showMessageDialog(this, "Debes seleccionar un valor", "Operacion abortada", JOptionPane.INFORMATION_MESSAGE);
        } else {

            // si el campo codigo no es numerico no hago nada
            if (!metodo.sonnumeros(TxtMostrarCodigo.getText())) {
                JOptionPane.showMessageDialog(this, "El codigo debe ser numerico", "Operacion abortada", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // cojo los valores de los campos
                int Codigo = Integer.parseInt(TxtMostrarCodigo.getText());
                String tipo = cmbTipo.getSelectedItem().toString();
                String fichero = TxtMostrarFichero.getText();
                int intervinientes = (Integer) sppersonas.getValue();

                // inserto el registro en la tabla Escrituras de la BD
                metodo.InsertarEscritura(Codigo, tipo, fichero, intervinientes);

                // borro y relleno la tabla
                rellenarTabla();
            }
        }
    }//GEN-LAST:event_btnInsertarregistroActionPerformed

    private void btnExplorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExplorarActionPerformed

        JFileChooser fc = new JFileChooser();
        //Creamos el filtro

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.doc", "doc");

        fc.setFileFilter(filtro);

        // abrimos la ventana y guardamos la opcion del ususario
        int seleccion = fc.showOpenDialog(this);

        // Si el usuario pincha en aceptar
        if (seleccion == JFileChooser.APPROVE_OPTION) {

            //seleccionamos el fichero
            File fichero = fc.getSelectedFile();
            // escribe la ruta del fichero seleccionado en el campo texto
            String Nomfich = fichero.getName();

            TxtMostrarFichero.setText(Nomfich);

        }


    }//GEN-LAST:event_btnExplorarActionPerformed

    private void TablaEscrituraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaEscrituraMouseClicked

        // caba vez que selecciono una fila esta mostrara los valores en los campos
        TxtMostrarCodigo.setText((String) TablaEscritura.getValueAt(TablaEscritura.getSelectedRow(), 0));
        TxtMostrarFichero.setText((String) TablaEscritura.getValueAt(TablaEscritura.getSelectedRow(), 2));
        sppersonas.setValue(Integer.parseInt((String) TablaEscritura.getValueAt(TablaEscritura.getSelectedRow(), 3)));
        cmbTipo.setSelectedIndex(obtenerindiceComboboxEscritura());

    }//GEN-LAST:event_TablaEscrituraMouseClicked

    Metodos metodo = new Metodos();


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaEscritura;
    private javax.swing.JTextField TxtMostrarCodigo;
    private javax.swing.JTextField TxtMostrarFichero;
    private javax.swing.JButton btnBorrarRegistro;
    private javax.swing.JButton btnExplorar;
    private javax.swing.JButton btnInsertarregistro;
    private javax.swing.JButton btnModificarValor;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner sppersonas;
    // End of variables declaration//GEN-END:variables

    public void rellenarTabla() {

        // vacio la Jtable
        modelo.setRowCount(0);

        ArrayList<Object[]> valores;

        int numeroregistros;
        Object j;

        // obtengo los valores de la tabla
        valores = metodo.obtenerFilasTabla("Escrituras");
        // obtengo el numero de filas de la tabla
        numeroregistros = metodo.contarvaloresTabla("Escrituras");

        // relleno la tabla con los valores de la BD
        for (int i = 0; i < numeroregistros; i++) {

            modelo.addRow(valores.get(i));

        }

    }

    // metodo que obtiene los valores del campo codigo codigo de la tabla
    public int obtenerindiceComboboxEscritura() {

        for (i = 0; i < tipos.length; i++) {
            String valor = (String) TablaEscritura.getValueAt(TablaEscritura.getSelectedRow(), 1);
            if (valor.equalsIgnoreCase(tipos[i])) {
                break;
            }
        }
        return i;
    }
 
    // inicializo valores y el array de tipos de Contratos
    int i;
    String[] tipos = {"Escritura", "Compraventa", "Herencia"};

}
