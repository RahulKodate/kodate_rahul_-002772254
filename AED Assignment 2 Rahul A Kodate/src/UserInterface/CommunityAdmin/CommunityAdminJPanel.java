/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.CommunityAdmin;

import Business.Ecosystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author rahulkodate
 */
public class CommunityAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommunityAdminJPanel
     */
    JPanel WorkArea;
    UserAccount useraccount;
    Ecosystem business;
    public CommunityAdminJPanel(JPanel WorkArea, UserAccount useraccount, Ecosystem business) {
        initComponents();
        this.business = business;
        this.WorkArea=WorkArea;
        this.useraccount = useraccount;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        communityAdminSplitPane = new javax.swing.JSplitPane();
        leftJPanel = new javax.swing.JPanel();
        rightJPanel = new javax.swing.JPanel();
        btnCommunityAdmin = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        leftJPanel.setBackground(new java.awt.Color(0, 105, 255));

        javax.swing.GroupLayout leftJPanelLayout = new javax.swing.GroupLayout(leftJPanel);
        leftJPanel.setLayout(leftJPanelLayout);
        leftJPanelLayout.setHorizontalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        leftJPanelLayout.setVerticalGroup(
            leftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );

        communityAdminSplitPane.setRightComponent(leftJPanel);

        rightJPanel.setBackground(new java.awt.Color(51, 255, 102));
        rightJPanel.setPreferredSize(new java.awt.Dimension(145, 474));
        rightJPanel.setLayout(new java.awt.CardLayout());

        btnCommunityAdmin.setBackground(new java.awt.Color(0, 105, 255));
        btnCommunityAdmin.setFont(new java.awt.Font("AppleMyungjo", 1, 14)); // NOI18N
        btnCommunityAdmin.setText("Manage Community");
        btnCommunityAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunityAdminActionPerformed(evt);
            }
        });
        rightJPanel.add(btnCommunityAdmin, "card2");

        communityAdminSplitPane.setLeftComponent(rightJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(communityAdminSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(communityAdminSplitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCommunityAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityAdminActionPerformed
        // TODO add your handling code here:

        CreateCommunity createCommunity = new CreateCommunity(leftJPanel, business, useraccount);
        rightJPanel.add("CreateCommunity", createCommunity);
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_btnCommunityAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCommunityAdmin;
    private javax.swing.JSplitPane communityAdminSplitPane;
    private javax.swing.JPanel leftJPanel;
    private javax.swing.JPanel rightJPanel;
    // End of variables declaration//GEN-END:variables
}
