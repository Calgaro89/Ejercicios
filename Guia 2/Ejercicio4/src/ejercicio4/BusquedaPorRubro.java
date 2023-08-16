/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author calga
 */
public class BusquedaPorRubro extends javax.swing.JInternalFrame {
    DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form BusquedaPorRubro
     */
    public BusquedaPorRubro() {
        initComponents();
        armarColumna();
        cargarCategorias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtResultado = new javax.swing.JTable();
        jCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jtResultado.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtResultado);

        jCombo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("BUSCAR POR RUBRO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(145, 145, 145))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboActionPerformed
        // TODO add your handling code here:
            borrarFila();
            for (Productos elProducto : Menu.listado) {
            if(elProducto.getRubro().equals(jCombo.getSelectedItem())){
                    modelo.addRow(new Object[]{
                elProducto.getCodigo(),elProducto.getRubro(),
                elProducto.getPrecio(),elProducto.getStock(),elProducto.getDescripcion()
            });
        }
        }
    }//GEN-LAST:event_jComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Categoria> jCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtResultado;
    // End of variables declaration//GEN-END:variables

private void armarColumna(){
    modelo.addColumn("Código");
    modelo.addColumn("Categoria");
    modelo.addColumn("Precio");
    modelo.addColumn("Stock");
    modelo.addColumn("Descripción");
    jtResultado.setModel(modelo);
}
private void borrarFila(){
int fila = jtResultado.getRowCount()-1;
    System.out.println("Valor de fila "+ fila);
    for (int i = fila; i >= 0; i--) {
        modelo.removeRow(i);
        System.out.println("Valor de fila al borrar: " + fila);
    }
   
}
private void cargarCategorias(){
    jCombo.addItem(Categoria.SELECCIONE);
jCombo.addItem(Categoria.COMESTIBLE);
jCombo.addItem(Categoria.LIMPIEZA);
jCombo.addItem(Categoria.PERFUMERIA);

}

}
