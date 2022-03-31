/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apartmani.sremac.hibernatesimpleapartmansmanage;

/**
 *
 * @author radoj
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
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

        jPanel1 = new javax.swing.JPanel();
        SearchButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        ImeTxt = new javax.swing.JTextField();
        Od = new javax.swing.JLabel();
        NazivTxt1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        P = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        ReserveButton = new javax.swing.JButton();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel3 = new javax.swing.JLabel();
        Od1 = new javax.swing.JLabel();
        ImeTxt1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        SearchButton.setText("Pretrazi");
        SearchButton.setToolTipText("");

        jTextField1.setToolTipText("Pretrazi po apartmanu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(SearchButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(387, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchButton)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 60));

        ImeTxt.setToolTipText("Pretrazi po apartmanu");
        getContentPane().add(ImeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 140, -1));

        Od.setText("Do");
        getContentPane().add(Od, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        NazivTxt1.setToolTipText("Pretrazi po apartmanu");
        getContentPane().add(NazivTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 105, -1));

        jLabel2.setText("Prezime");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        P.setText("Pol");
        getContentPane().add(P, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Musko", "Zensko", "Drugo" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 100, -1));

        ReserveButton.setText("Rezervisi");
        ReserveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReserveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ReserveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));
        getContentPane().add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));
        getContentPane().add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jLabel3.setText("Apartman");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        Od1.setText("Od");
        getContentPane().add(Od1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 20, -1));

        ImeTxt1.setToolTipText("Pretrazi po apartmanu");
        getContentPane().add(ImeTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 105, -1));

        jLabel4.setText("Ime");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReserveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReserveButtonActionPerformed
      
        
    }//GEN-LAST:event_ReserveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ImeTxt;
    private javax.swing.JTextField ImeTxt1;
    private javax.swing.JTextField NazivTxt1;
    private javax.swing.JLabel Od;
    private javax.swing.JLabel Od1;
    private javax.swing.JLabel P;
    private javax.swing.JButton ReserveButton;
    private javax.swing.JButton SearchButton;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
