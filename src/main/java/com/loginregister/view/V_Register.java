package com.loginregister.view;

import com.loginregister.controller.ControllerRegister;
import java.util.Date;

public class V_Register extends javax.swing.JFrame {

    private final ControllerRegister controllerUser;

    public String getNombre() {
        return txtNombre.getText();
    }

    public String getApellido() {
        return txtApellido.getText();
    }

    public String getCorreo() {
        return txtCorreo.getText();
    }

    public String getPass() {
        return txtPassword.getText();
    }

    public Date getFecha() {
        return dateFechaReg.getDate();
    }

    public String getRol() {
        return cbxRol.getSelectedItem().toString();
    }

    public V_Register() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.controllerUser = new ControllerRegister();
    }
    
    public void LimpiarCamposRegister(){
        txtNombre.setText("");
        txtApellido.setText("");
        txtCorreo.setText("");
        txtPassword.setText("");
        dateFechaReg.setDate(null);
        cbxRol.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegistrarUsuario = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        cbxRol = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        dateFechaReg = new com.toedter.calendar.JDateChooser();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarUsuario.setBackground(new java.awt.Color(51, 51, 51));
        btnRegistrarUsuario.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        btnRegistrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarUsuario.setText("Registrar usuario");
        btnRegistrarUsuario.setBorder(null);
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 160, 40));

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 160, 60));

        txtPassword.setBorder(javax.swing.BorderFactory.createTitledBorder("Contraseña"));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 160, 60));

        txtApellido.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellido"));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 160, 60));

        txtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder("Correo"));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 160, 60));

        cbxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        cbxRol.setBorder(javax.swing.BorderFactory.createTitledBorder("Rol"));
        jPanel1.add(cbxRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 160, 60));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 220, 40));

        dateFechaReg.setBackground(new java.awt.Color(255, 255, 255));
        dateFechaReg.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));
        jPanel1.add(dateFechaReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 160, 50));

        btnVolver.setBackground(new java.awt.Color(51, 51, 51));
        btnVolver.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver a Login");
        btnVolver.setBorder(null);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed
        controllerUser.registrarUsuario(this);
    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
        V_Login login = new V_Login();
        login.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistrarUsuario;
    public javax.swing.JButton btnVolver;
    public javax.swing.JComboBox<String> cbxRol;
    public com.toedter.calendar.JDateChooser dateFechaReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
