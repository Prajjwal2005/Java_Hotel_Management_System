package java_hotel_system;

import javax.swing.*;
import java.awt.*;


/**
 *
 * @author prajj
 */
public class MainForm extends javax.swing.JFrame {

    public MainForm() {
        initComponents();
        setSize(778, 670);
        setResizable(true);
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jButtonClients = new javax.swing.JButton();
        jButtonRooms = new javax.swing.JButton();
        jButtonReservations = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jButtonClients.setBackground(new java.awt.Color(204, 204, 204));
        jButtonClients.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonClients.setText("CLIENTS");
        jButtonClients.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 51)));
        jButtonClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClientsActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonClients);
        jButtonClients.setBounds(60, 250, 200, 130);

        jButtonRooms.setBackground(new java.awt.Color(204, 204, 204));
        jButtonRooms.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonRooms.setText("ROOMS");
        jButtonRooms.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 102)));
        jButtonRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRoomsActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRooms);
        jButtonRooms.setBounds(60, 100, 200, 130);
        setResizable(true);

        jButtonReservations.setBackground(new java.awt.Color(204, 204, 204));
        jButtonReservations.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonReservations.setText("RESERVATIONS");
        jButtonReservations.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 51)));
        jButtonReservations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservationsActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonReservations);
        jButtonReservations.setBounds(60, 400, 200, 130);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_hotel_system/download (1).jpeg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 780, 580);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 778, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonReservationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReservationsActionPerformed
        ManageReservationsForm reservationsform = new ManageReservationsForm();
        reservationsform.setVisible(true);
        reservationsform.pack();
        reservationsform.setLocationRelativeTo(null);
        reservationsform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonReservationsActionPerformed

    private void jButtonRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRoomsActionPerformed
        ManageRoomsForm roomsform = new ManageRoomsForm();
        roomsform.setVisible(true);
        roomsform.pack();
        roomsform.setLocationRelativeTo(null);
        roomsform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonRoomsActionPerformed

    private void jButtonClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClientsActionPerformed
        ManageClientsForm clientsform = new ManageClientsForm();
        clientsform.setVisible(true);
        clientsform.pack();
        clientsform.setLocationRelativeTo(null);
        clientsform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonClientsActionPerformed

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
    private javax.swing.JButton jButtonClients;
    private javax.swing.JButton jButtonReservations;
    public javax.swing.JButton jButtonRooms;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
