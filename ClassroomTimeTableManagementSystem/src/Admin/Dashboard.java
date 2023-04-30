package Admin;


import classes.AdminUserAdd;
import classes.Classroom;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
          // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
          private void initComponents() {

                    jSignout = new javax.swing.JButton();
                    jButton5 = new javax.swing.JButton();
                    jLabel8 = new javax.swing.JLabel();
                    jLabel7 = new javax.swing.JLabel();
                    jLabel6 = new javax.swing.JLabel();
                    jLabel5 = new javax.swing.JLabel();
                    jLabel4 = new javax.swing.JLabel();
                    jLabel3 = new javax.swing.JLabel();
                    jLabel2 = new javax.swing.JLabel();
                    jSchedule = new javax.swing.JButton();
                    jClassroom = new javax.swing.JButton();
                    jResource = new javax.swing.JButton();
                    jReport = new javax.swing.JButton();
                    jLabel1 = new javax.swing.JLabel();

                    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                    setBackground(new java.awt.Color(255, 255, 255));
                    setMinimumSize(new java.awt.Dimension(750, 500));
                    setResizable(false);
                    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                    jSignout.setBackground(new java.awt.Color(237, 30, 121));
                    jSignout.setFont(new java.awt.Font("Poppins Medium", 0, 15)); // NOI18N
                    jSignout.setForeground(new java.awt.Color(255, 255, 255));
                    jSignout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
                    jSignout.setText("Sign Out");
                    jSignout.setBorder(null);
                    jSignout.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jSignoutActionPerformed(evt);
                              }
                    });
                    getContentPane().add(jSignout, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 110, 40));

                    jButton5.setBackground(new java.awt.Color(237, 30, 121));
                    jButton5.setFont(new java.awt.Font("Poppins Medium", 0, 15)); // NOI18N
                    jButton5.setForeground(new java.awt.Color(255, 255, 255));
                    jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user-profile.png"))); // NOI18N
                    jButton5.setText("User Settings");
                    jButton5.setAlignmentY(0.0F);
                    jButton5.setBorder(null);
                    jButton5.setHideActionText(true);
                    jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
                    jButton5.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButton5ActionPerformed(evt);
                              }
                    });
                    getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 140, 40));

                    jLabel8.setBackground(new java.awt.Color(255, 255, 255));
                    jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
                    jLabel8.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    jLabel8.setText("Now you are in Admin Account");
                    jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 200, -1));

                    jLabel7.setBackground(new java.awt.Color(255, 255, 255));
                    jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 22)); // NOI18N
                    jLabel7.setForeground(new java.awt.Color(237, 30, 121));
                    jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    jLabel7.setText("User");
                    jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 70, -1));

                    jLabel6.setBackground(new java.awt.Color(255, 255, 255));
                    jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 22)); // NOI18N
                    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                    jLabel6.setText("Hello");
                    jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 70, -1));

                    jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
                    jLabel5.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel5.setText("Reports");
                    getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 80, -1));

                    jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
                    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel4.setText("Resources");
                    getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 110, -1));

                    jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
                    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel3.setText("Classrooms");
                    getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

                    jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
                    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel2.setText("Schedules");
                    getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 110, -1));

                    jSchedule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/scheduling-05.png"))); // NOI18N
                    jSchedule.setAlignmentY(0.0F);
                    jSchedule.setBorder(null);
                    jSchedule.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    jSchedule.setMargin(new java.awt.Insets(0, 0, 0, 0));
                    jSchedule.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jScheduleActionPerformed(evt);
                              }
                    });
                    getContentPane().add(jSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 268, 165));

                    jClassroom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/classroom-05.png"))); // NOI18N
                    jClassroom.setAlignmentY(0.0F);
                    jClassroom.setBorder(null);
                    jClassroom.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    jClassroom.setMargin(new java.awt.Insets(0, 0, 0, 0));
                    jClassroom.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jClassroomActionPerformed(evt);
                              }
                    });
                    getContentPane().add(jClassroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 268, 165));

                    jResource.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/resources-05.png"))); // NOI18N
                    jResource.setAlignmentY(0.0F);
                    jResource.setBorder(null);
                    jResource.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    jResource.setMargin(new java.awt.Insets(0, 0, 0, 0));
                    jResource.addMouseListener(new java.awt.event.MouseAdapter() {
                              public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        jResourceMouseClicked(evt);
                              }
                    });
                    jResource.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jResourceActionPerformed(evt);
                              }
                    });
                    getContentPane().add(jResource, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 268, 165));

                    jReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reporting-05.png"))); // NOI18N
                    jReport.setAlignmentY(0.0F);
                    jReport.setBorder(null);
                    jReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    jReport.setMargin(new java.awt.Insets(0, 0, 0, 0));
                    jReport.addActionListener(new java.awt.event.ActionListener() {
                              public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jReportActionPerformed(evt);
                              }
                    });
                    getContentPane().add(jReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 268, 165));

                    jLabel1.setBackground(new java.awt.Color(64, 134, 200));
                    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Dashboard-04.png"))); // NOI18N
                    jLabel1.setAlignmentY(0.0F);
                    jLabel1.setAutoscrolls(true);
                    jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    jLabel1.setMaximumSize(new java.awt.Dimension(750, 500));
                    jLabel1.setMinimumSize(new java.awt.Dimension(750, 500));
                    jLabel1.setOpaque(true);
                    jLabel1.setPreferredSize(new java.awt.Dimension(750, 500));
                    getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 470));

                    pack();
          }// </editor-fold>//GEN-END:initComponents

    private void jScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jScheduleActionPerformed
        Schedules sch = new Schedules();
        sch.setVisible(true);
        //cls.toFront();
    }//GEN-LAST:event_jScheduleActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //close();
        this.toBack();
        UserSettings user = new UserSettings();
        user.setVisible (true);     
        user.toFront();
        
        AdminUserAdd obj = new AdminUserAdd();
        obj.showUser();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jResourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResourceActionPerformed
        Resources reso = new Resources();
        reso.setVisible(true);
        //reso.toFront();
    }//GEN-LAST:event_jResourceActionPerformed

    private void jResourceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jResourceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jResourceMouseClicked

    private void jClassroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClassroomActionPerformed
        Classrooms cls = new Classrooms();
        cls.setVisible(true);
        //cls.toFront();
        
        Classroom obj = new Classroom();
        obj.showClassroom();
    }//GEN-LAST:event_jClassroomActionPerformed

    private void jReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReportActionPerformed
        Reports cls = new Reports();
        cls.setVisible(true);
        //cls.toFront();
    }//GEN-LAST:event_jReportActionPerformed

          private void jSignoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSignoutActionPerformed
                    // TODO add your handling code here:
                    
                    
                    
          }//GEN-LAST:event_jSignoutActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

          // Variables declaration - do not modify//GEN-BEGIN:variables
          private javax.swing.JButton jButton5;
          private javax.swing.JButton jClassroom;
          private javax.swing.JLabel jLabel1;
          private javax.swing.JLabel jLabel2;
          private javax.swing.JLabel jLabel3;
          private javax.swing.JLabel jLabel4;
          private javax.swing.JLabel jLabel5;
          private javax.swing.JLabel jLabel6;
          private javax.swing.JLabel jLabel7;
          private javax.swing.JLabel jLabel8;
          private javax.swing.JButton jReport;
          private javax.swing.JButton jResource;
          private javax.swing.JButton jSchedule;
          private javax.swing.JButton jSignout;
          // End of variables declaration//GEN-END:variables
}
