package ProgramKonsultasi;

import ProgramKonsultasi.Dokter.*;
import ProgramKonsultasi.Pasien.*;
import java.sql.*;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginFiks extends javax.swing.JFrame {
    private Connection koneksi; 
    static Statement stmt;
    private String a ,b,c,d,e,f,g;
    public LoginFiks() {
        initComponents();
        KoneksiDatabase();
    }
    private void KoneksiDatabase() {
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException cnf) {
        }
         try {
             koneksi = DriverManager.getConnection("jdbc:mysql://localhost/konsultasi", "root", "");
        } catch (SQLException se) {
             JOptionPane.showMessageDialog(null, "Koneksi Database Tidak Berhasil");
        } catch (HeadlessException e) {
        } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Username = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        Login = new javax.swing.JButton();
        back = new javax.swing.JButton();
        DaftarAkun = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Username.setFont(new java.awt.Font("Modern No. 20", 0, 20)); // NOI18N
        Username.setActionCommand("<Not Set>");
        Username.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Username.setName(""); // NOI18N
        Username.setNextFocusableComponent(Password);
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 320, 480, 50));

        Password.setFont(new java.awt.Font("Modern No. 20", 0, 20)); // NOI18N
        Password.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 430, 480, 50));

        Login.setBackground(new java.awt.Color(153, 153, 153));
        Login.setText("LOGIN");
        Login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 550, 190, 40));

        back.setBackground(new java.awt.Color(153, 153, 153));
        back.setText("KELUAR");
        back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 610, 190, 40));

        DaftarAkun.setFont(new java.awt.Font("Serif", 2, 16)); // NOI18N
        DaftarAkun.setForeground(new java.awt.Color(102, 204, 255));
        DaftarAkun.setText("Daftar");
        DaftarAkun.setBorderPainted(false);
        DaftarAkun.setContentAreaFilled(false);
        DaftarAkun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DaftarAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaftarAkunActionPerformed(evt);
            }
        });
        getContentPane().add(DaftarAkun, new org.netbeans.lib.awtextra.AbsoluteConstraints(936, 488, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\EL\\Pictures\\Screenshots\\Screenshot (88).png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed

    }//GEN-LAST:event_UsernameActionPerformed
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
    }//GEN-LAST:event_backActionPerformed
    public static boolean isDoctorLoginSuccessful(Connection connection, String username2, String password2) throws SQLException {
        String sql = "SELECT * FROM dokter WHERE username_dokter = ? AND Password_dokter = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/konsultasi","root","");
            statement.setString(1, username2);
            statement.setString(2, password2);
            ResultSet resultSet = statement.executeQuery();
            return resultSet.next(); 
        }
    }

    public static boolean isPatientLoginSuccessful(Connection connection, String username2, String password2) throws SQLException {
        String sql = "SELECT * FROM pasien WHERE username = ? AND password = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/konsultasi","root","");
            statement.setString(1, username2);
            statement.setString(2, password2);
            ResultSet resultSet = statement.executeQuery();
            return resultSet.next(); 
        }
    }
    
                     
    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/konsultasi", "root", "")) {
            String username2 = Username.getText();
            String password2 = Password.getText();
            if (isDoctorLoginSuccessful(conn, username2, password2)) {
                PreparedStatement preparedStatement = conn.prepareStatement("SELECT ID_Doc, Nama_Doc, Jenis_Kelamin, Spesialis FROM Dokter WHERE username_dokter = ?");
                preparedStatement.setString(1, username2);
                ResultSet rs = preparedStatement.executeQuery();

                if (rs.next()) {
                    d = rs.getString("ID_Doc");
                    e = rs.getString("Nama_Doc");
                    f = rs.getString("Jenis_Kelamin");
                    g = rs.getString("Spesialis");
                    MenuutamaDokterFiks menuDokter = new MenuutamaDokterFiks();
                    menuDokter.setD(d);
                    menuDokter.setE(e);
                    menuDokter.setF(f);
                    menuDokter.setG(g);
                    menuDokter.setVisible(true);
                }
            } else if (isPatientLoginSuccessful(conn, username2, password2)) {
                PreparedStatement preparedStatement = conn.prepareStatement("SELECT Id_pasien, Nama_Pasien, No_Telpon FROM pasien WHERE username = ?");
                preparedStatement.setString(1, username2);
                ResultSet rs = preparedStatement.executeQuery();

                if (rs.next()) {
                    a = rs.getString("Id_pasien");
                    b = rs.getString("Nama_Pasien");
                    c = rs.getString("No_Telpon");
                    MenuutamaPasienFiks menuPasien = new MenuutamaPasienFiks();
                    menuPasien.setA(a);
                    menuPasien.setB(b);
                    menuPasien.setC(c);
                    menuPasien.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, username2 + ", password atau username anda salah",
                        "pesan Kesalahan", JOptionPane.ERROR_MESSAGE);
                Username.setText("");
                Password.setText("");
                Username.requestFocus();
            }
        } catch (Exception e) {
            e.printStackTrace();
            Username.requestFocus();
        }
    }//GEN-LAST:event_LoginActionPerformed

    private void DaftarAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaftarAkunActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new PilihanDaftarFiks().setVisible(true);
    }//GEN-LAST:event_DaftarAkunActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFiks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFiks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFiks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFiks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFiks().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DaftarAkun;
    private javax.swing.JButton Login;
    private javax.swing.JTextField Password;
    private javax.swing.JTextField Username;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
