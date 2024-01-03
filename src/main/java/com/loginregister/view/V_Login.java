package com.loginregister.view;

import com.loginregister.controller.ControllerLogin;

public class V_Login extends javax.swing.JFrame {
    
    private final ControllerLogin controllerLogin;
    
    public String getCorreo() {
        return txtCorreo.getText();
    }
    
    public String getPass() {
        return txtPass.getText();
    }
    
    public V_Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.controllerLogin = new ControllerLogin();
    }
    
    public void LimpiarCamposLogin() {
        txtCorreo.setText("");
        txtPass.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnValidar = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        btnRegistrarme = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(310, 231));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(310, 231));
        jPanel1.setPreferredSize(new java.awt.Dimension(310, 231));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnValidar.setBackground(new java.awt.Color(51, 51, 51));
        btnValidar.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        btnValidar.setForeground(new java.awt.Color(255, 255, 255));
        btnValidar.setText("Validar");
        btnValidar.setBorder(null);
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });
        jPanel1.add(btnValidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 90, 30));

        txtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder("Correo"));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 190, 50));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 210, 30));

        txtPass.setBorder(javax.swing.BorderFactory.createTitledBorder("Contraseña"));
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 190, 50));

        btnRegistrarme.setBackground(new java.awt.Color(51, 51, 51));
        btnRegistrarme.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        btnRegistrarme.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarme.setText("Registrarme");
        btnRegistrarme.setBorder(null);
        btnRegistrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarmeActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarme, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
        controllerLogin.ValidarUsuario(this);
    }//GEN-LAST:event_btnValidarActionPerformed

    private void btnRegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarmeActionPerformed
        dispose();
        V_Register register = new V_Register();
        register.setVisible(true);
    }//GEN-LAST:event_btnRegistrarmeActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarme;
    private javax.swing.JButton btnValidar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtPass;
    // End of variables declaration//GEN-END:variables
}
