/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package zavrsni.view;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import org.apache.commons.validator.routines.EmailValidator;
import zavrsni.controller.ObradaDjelatnik;
import zavrsni.model.Djelatnik;
import zavrsni.util.ZavrsniUtil;

/**
 *
 * @author Igor
 */
public class Autorizacija extends javax.swing.JFrame {

    /**
     * Creates new form Autorizacija
     */
    
    private ObradaDjelatnik obradaDjelatnik;
    public Autorizacija() {
        initComponents();
        postavke();
    }
    private void postavke(){
        obradaDjelatnik = new ObradaDjelatnik();
        txtEmail.setText("idavidovic@gmail.com");
        txtLozinka.setText("id");
        setTitle(ZavrsniUtil.getNaslov("Autorizacija"));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtLozinka = new javax.swing.JPasswordField();
        btnPrijava = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Email");

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Lozinka");

        txtLozinka.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLozinkaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLozinkaFocusLost(evt);
            }
        });
        txtLozinka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLozinkaKeyPressed(evt);
            }
        });

        btnPrijava.setText("PRIJAVA");
        btnPrijava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrijavaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnPrijava, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrijava, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLozinkaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLozinkaKeyPressed
        if(txtEmail.getText().trim().isEmpty()){
            txtEmail.requestFocus();
            return;
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            autorizacija();
        }
    }//GEN-LAST:event_txtLozinkaKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if(txtEmail.getText().trim().isEmpty()){
            return;
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            txtLozinka.requestFocus();
        }
        
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        txtEmail.setBackground(Color.GRAY);
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        txtEmail.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtLozinkaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLozinkaFocusGained
        txtLozinka.setBackground(Color.GRAY);
    }//GEN-LAST:event_txtLozinkaFocusGained

    private void txtLozinkaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLozinkaFocusLost
        txtLozinka.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtLozinkaFocusLost

    private void btnPrijavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrijavaActionPerformed
        autorizacija();
    }//GEN-LAST:event_btnPrijavaActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrijava;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtLozinka;
    // End of variables declaration//GEN-END:variables

    private void autorizacija() {
        if(txtEmail.getText().trim().isEmpty()){
            txtEmail.requestFocus();
            return;
        }
        if(txtLozinka.getPassword().length == 0){
            txtLozinka.requestFocus();
            return;
        }
        
        boolean b = EmailValidator.getInstance().isValid(txtEmail.getText());
        if(b == false){
            txtEmail.requestFocus();
            return;
        }
        Djelatnik djelatnik = obradaDjelatnik.autoriziraj(txtEmail.getText(), new String(txtLozinka.getPassword()));
        if(djelatnik == null){
            JOptionPane.showMessageDialog(getRootPane(), "Nevažeća kombinacija emaila i lozinke");
            return;
        }
        
        ZavrsniUtil.djelatnik = djelatnik;
        new Izbornik().setVisible(true);
        dispose();
    }
}
