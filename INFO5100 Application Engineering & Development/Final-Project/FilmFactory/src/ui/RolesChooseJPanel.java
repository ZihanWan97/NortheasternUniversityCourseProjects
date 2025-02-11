/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Ecosystem.FilmFactorySystem;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import ui.Login.LoginReviewRolesJPanel;
import ui.Login.LoginCinemaRolesJPanel;
import ui.Login.LoginCustomerJPanel;
import ui.Login.LoginFilmRolesJPanel;
import ui.Login.LoginSystemAdminJPanel;

/**
 *
 * @author Eva
 */
public class RolesChooseJPanel extends javax.swing.JPanel {

    JPanel WelcomeJPanel;
    JPanel menuJPanel;
    private FilmFactorySystem system;
    /**
     * Creates new form test
     */
    public RolesChooseJPanel(JPanel WelcomeJPanel, JPanel menuJPanel, FilmFactorySystem system) {
        this.WelcomeJPanel = WelcomeJPanel;
        this.system = system;
        this.menuJPanel = menuJPanel;
        menuJPanel.getComponent(0).setVisible(false);

        initComponents();
        sVGImage1.setSvgImage("UIDesign/undraw_movie_night_fldd.svg", 280,155);
        setSize(750, 530);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSystemAdmin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnFilmRoles = new javax.swing.JButton();
        btnReviewRoles = new javax.swing.JButton();
        btnCinemaRoles = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        sVGImage1 = new UIDesign.SVGImage();

        setBackground(new java.awt.Color(10, 10, 10));

        btnSystemAdmin.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnSystemAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnSystemAdmin.setText("SystemAdmin");
        btnSystemAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSystemAdminActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Please choose a login role:");

        btnFilmRoles.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnFilmRoles.setForeground(new java.awt.Color(255, 255, 255));
        btnFilmRoles.setText("FilmRoles");
        btnFilmRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmRolesActionPerformed(evt);
            }
        });

        btnReviewRoles.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnReviewRoles.setForeground(new java.awt.Color(255, 255, 255));
        btnReviewRoles.setText("ReviewRoles");
        btnReviewRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReviewRolesActionPerformed(evt);
            }
        });

        btnCinemaRoles.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnCinemaRoles.setForeground(new java.awt.Color(255, 255, 255));
        btnCinemaRoles.setText("PlatformRoles");
        btnCinemaRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCinemaRolesActionPerformed(evt);
            }
        });

        btnCustomer.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnCustomer.setText("Customer");
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReviewRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCinemaRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFilmRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSystemAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(sVGImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(sVGImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSystemAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnFilmRoles)
                .addGap(18, 18, 18)
                .addComponent(btnReviewRoles)
                .addGap(13, 13, 13)
                .addComponent(btnCinemaRoles)
                .addGap(18, 18, 18)
                .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCinemaRoles, btnCustomer, btnFilmRoles, btnReviewRoles, btnSystemAdmin});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSystemAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSystemAdminActionPerformed
        LoginSystemAdminJPanel lsajp = new LoginSystemAdminJPanel(WelcomeJPanel, menuJPanel, system);
        WelcomeJPanel.add("LoginSystemAdminJPanel", lsajp);
        CardLayout layout = (CardLayout)WelcomeJPanel.getLayout();
        layout.next(WelcomeJPanel);        

    }//GEN-LAST:event_btnSystemAdminActionPerformed

    private void btnFilmRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmRolesActionPerformed
        // TODO add your handling code here:
        LoginFilmRolesJPanel lfrjp = new LoginFilmRolesJPanel(WelcomeJPanel, menuJPanel, system);
        WelcomeJPanel.add("LoginFilmRolesJPanel", lfrjp);
        CardLayout layout = (CardLayout)WelcomeJPanel.getLayout();
        layout.next(WelcomeJPanel);   
    }//GEN-LAST:event_btnFilmRolesActionPerformed

    private void btnReviewRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReviewRolesActionPerformed
        // TODO add your handling code here:
        LoginReviewRolesJPanel lajp = new LoginReviewRolesJPanel(WelcomeJPanel, menuJPanel, system);
        WelcomeJPanel.add("LoginAuditorJPanel", lajp);
        CardLayout layout = (CardLayout)WelcomeJPanel.getLayout();
        layout.next(WelcomeJPanel); 
    }//GEN-LAST:event_btnReviewRolesActionPerformed

    private void btnCinemaRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCinemaRolesActionPerformed
        // TODO add your handling code here:
        LoginCinemaRolesJPanel lcrjp = new LoginCinemaRolesJPanel(WelcomeJPanel, menuJPanel, system);
        WelcomeJPanel.add("CinemaRoles", lcrjp);
        CardLayout layout = (CardLayout)WelcomeJPanel.getLayout();
        layout.next(WelcomeJPanel); 
    }//GEN-LAST:event_btnCinemaRolesActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        // TODO add your handling code here:
        LoginCustomerJPanel lcjp= new LoginCustomerJPanel(WelcomeJPanel, menuJPanel, system);
        WelcomeJPanel.add("LoginSystemAdminJPanel", lcjp);
        CardLayout layout = (CardLayout)WelcomeJPanel.getLayout();
        layout.next(WelcomeJPanel); 
    }//GEN-LAST:event_btnCustomerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCinemaRoles;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnFilmRoles;
    private javax.swing.JButton btnReviewRoles;
    private javax.swing.JButton btnSystemAdmin;
    private javax.swing.JLabel jLabel2;
    private UIDesign.SVGImage sVGImage1;
    // End of variables declaration//GEN-END:variables
}
