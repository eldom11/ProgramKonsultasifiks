package ProgramKonsultasi;
import java.sql.*;
import java.awt.HeadlessException;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DaftarAkunPasienFiks extends javax.swing.JFrame {
    private Connection koneksi; 
    static Statement stmt;
    static ResultSet rs;
    public DaftarAkunPasienFiks() {
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

        buttonGroup2 = new javax.swing.ButtonGroup();
        insertnama = new javax.swing.JTextField();
        insertumur = new javax.swing.JTextField();
        InNoTelp = new javax.swing.JTextField();
        InUsername = new javax.swing.JTextField();
        Daftar = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        JBPria = new javax.swing.JRadioButton();
        JBWanita = new javax.swing.JRadioButton();
        InPass = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        insertnama.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        insertnama.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        insertnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertnamaActionPerformed(evt);
            }
        });
        getContentPane().add(insertnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 148, 600, 54));

        insertumur.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        insertumur.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(insertumur, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 231, 600, 54));

        InNoTelp.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        InNoTelp.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(InNoTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 394, 600, 54));
        InNoTelp.getAccessibleContext().setAccessibleName("");

        InUsername.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        InUsername.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(InUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 476, 600, 54));

        Daftar.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        Daftar.setText("Daftar");
        Daftar.setBorder(new javax.swing.border.MatteBorder(null));
        Daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaftarActionPerformed(evt);
            }
        });
        getContentPane().add(Daftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 650, 312, 60));

        Back.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        Back.setText("KEMBALI");
        Back.setBorder(new javax.swing.border.MatteBorder(null));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 650, 310, 60));

        buttonGroup2.add(JBPria);
        JBPria.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        JBPria.setText("Pria");
        JBPria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPriaActionPerformed(evt);
            }
        });
        getContentPane().add(JBPria, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 322, -1, -1));

        buttonGroup2.add(JBWanita);
        JBWanita.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        JBWanita.setText("Wanita");
        getContentPane().add(JBWanita, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 322, -1, -1));

        InPass.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        InPass.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(InPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 558, 600, 54));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\EL\\Pictures\\Screenshots\\Screenshot (94).png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertnamaActionPerformed

    private void DaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaftarActionPerformed
        char karakterAcak;
        String deretKarakter1 = "", deretKarakter2 = "";
        String JK;
        String username2 = InUsername.getText();
        if (JBPria.isSelected()){
            JK = "Pria";
        } else {
            JK =  "Wanita";
        }
        for (int x = 1; x <= 3; x++) {
         karakterAcak = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
         deretKarakter2 += karakterAcak + "";
        } 
        for (int x = 1; x <= 2; x++) {
         karakterAcak = (char) ('0' + Math.random() * ('9' - '1' + 1));
         deretKarakter1 += karakterAcak + "";
        } 
        String id_Pasien = deretKarakter1 + deretKarakter2;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/konsultasi", "root", ""); ){
            if (usernamesama(conn, username2)) {
                JOptionPane.showMessageDialog(null,InUsername.getText()+", Username Telah Digunakan",  "pesan Kesalahan",JOptionPane.ERROR_MESSAGE); 
                InUsername.setText(""); 
                InPass.setText("");
                InUsername.requestFocus(); 
            } else {
                String sql = "INSERT INTO pasien VALUES ('"+id_Pasien+"','"+insertnama.getText()+"','"+insertumur.getText()+"','"+JK+
                        "','"+InNoTelp.getText()+"','"+InUsername.getText()+"','"+InPass.getText()+"')";
                java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.execute();
                setVisible(false);
                new LoginFiks().setVisible(true);
                koneksi.close();
            }
        }catch(HeadlessException|SQLException e){
           JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_DaftarActionPerformed
    private static boolean usernamesama(Connection connection, String username2) throws SQLException {
        String sql = "SELECT * FROM pasien WHERE username = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, username2);
            ResultSet resultSet = statement.executeQuery();
            return resultSet.next(); 
        }
    }
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        setVisible(false);
        new PilihanDaftarFiks().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void JBPriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBPriaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarAkunPasienFiks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Daftar;
    private javax.swing.JTextField InNoTelp;
    private javax.swing.JTextField InPass;
    private javax.swing.JTextField InUsername;
    private javax.swing.JRadioButton JBPria;
    private javax.swing.JRadioButton JBWanita;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField insertnama;
    private javax.swing.JTextField insertumur;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
