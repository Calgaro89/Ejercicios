
package ejercicio4;

import java.util.TreeSet;

/**
 *
 * @author calga
 */
public class Menu extends javax.swing.JFrame {
public static TreeSet<Productos> listado=new TreeSet<>();

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jItemProductos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jitemRobro = new javax.swing.JMenuItem();
        jitemNombre = new javax.swing.JMenuItem();
        jitemPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );

        jMenu1.setText("Administración");

        jItemProductos.setText("Productos");
        jItemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemProductosActionPerformed(evt);
            }
        });
        jMenu1.add(jItemProductos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        jitemRobro.setText("Por rubro");
        jitemRobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jitemRobroActionPerformed(evt);
            }
        });
        jMenu2.add(jitemRobro);

        jitemNombre.setText("Por nombre");
        jitemNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jitemNombreActionPerformed(evt);
            }
        });
        jMenu2.add(jitemNombre);

        jitemPrecio.setText("Por precio");
        jitemPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jitemPrecioActionPerformed(evt);
            }
        });
        jMenu2.add(jitemPrecio);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jitemNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jitemNombreActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        BusquedaPorNombre busco=new BusquedaPorNombre();
        busco.setVisible(true);
        escritorio.add(busco);
        escritorio.moveToFront(busco);
    }//GEN-LAST:event_jitemNombreActionPerformed

    private void jitemPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jitemPrecioActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        BusquedaPorPrecio busco =new BusquedaPorPrecio();
        busco.setVisible(true);
        escritorio.add(busco);
        escritorio.moveToFront(busco);
    }//GEN-LAST:event_jitemPrecioActionPerformed

    private void jitemRobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jitemRobroActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        BusquedaPorRubro busco =new BusquedaPorRubro();
        busco.setVisible(true);
        escritorio.add(busco);
        escritorio.moveToFront(busco);
    }//GEN-LAST:event_jitemRobroActionPerformed

    private void jItemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemProductosActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        GestionProductos busco =new GestionProductos();
        busco.setVisible(true);
        escritorio.add(busco);
        escritorio.moveToFront(busco);
    }//GEN-LAST:event_jItemProductosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jItemProductos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jitemNombre;
    private javax.swing.JMenuItem jitemPrecio;
    private javax.swing.JMenuItem jitemRobro;
    // End of variables declaration//GEN-END:variables

public static void cargoProductos(int codigo,String descripcion, int stock, double precio,Categoria categoria){
     listado.add(new Productos (codigo,descripcion,stock,precio,categoria));

}
}
