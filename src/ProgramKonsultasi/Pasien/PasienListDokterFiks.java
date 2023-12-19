package ProgramKonsultasi.Pasien;

import ProgramKonsultasi.LoginFiks;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PasienListDokterFiks extends javax.swing.JFrame {
    private String a, b, c, d;
    public void setA(String a) {
        this.a = a;
    }public void setB(String b) {
        this.b = b;
    }public void setC(String c) {
        this.c = c;
    }
    private DefaultTableModel model;
    LoginFiks login = new LoginFiks();
    public PasienListDokterFiks() {
        initComponents();
        model = new DefaultTableModel();
        tabel.setModel(model);
        model.addColumn("ID Dokter");
        model.addColumn("Nama Dokter");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Spesialis");
        tabel();
    }
    private Connection con;
    private Statement stat;
    private ResultSet rs;
    private void Koneksi() {
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException cnf) {
        }
         try {
             con = DriverManager.getConnection("jdbc:mysql://localhost/konsultasi", "root", "");
        } catch (SQLException se) {
             JOptionPane.showMessageDialog(null, "Koneksi Database Tidak Berhasil");
        } catch (HeadlessException e) {
        } 
    }
    public void tabel() {

        model.getDataVector().removeAllElements( );
        model.fireTableDataChanged( );
        try{
            //membuat koneksi kedatabase
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/konsultasi","root","");
            stat = con.createStatement();
            String sql = "SELECT ID_Doc, Nama_Doc, Jenis_Kelamin, Spesialis FROM Dokter";
            rs = stat.executeQuery(sql);
            while(rs.next()){
                Object[] o = new Object[4];
                o[0]=rs.getString("ID_Doc");
                o[1]=rs.getString("Nama_Doc");
                o[2]=rs.getString("Jenis_Kelamin");
                o[3]=rs.getString("Spesialis");
                model.addRow(o);
            }
           rs.close();
           stat.close();
        }catch (Exception e){
            
        }
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        kembali = new javax.swing.JButton();
        IdDoc = new javax.swing.JTextField();
        konsultasi = new javax.swing.JButton();
        keluhan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 1150, 330));

        kembali.setBorderPainted(false);
        kembali.setContentAreaFilled(false);
        kembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 640, 140, 50));

        IdDoc.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        IdDoc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        IdDoc.setCaretPosition(0);
        IdDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdDocActionPerformed(evt);
            }
        });
        getContentPane().add(IdDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 497, 393, 32));

        konsultasi.setBorderPainted(false);
        konsultasi.setContentAreaFilled(false);
        konsultasi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        konsultasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konsultasiActionPerformed(evt);
            }
        });
        getContentPane().add(konsultasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 640, 150, 50));

        keluhan.setFont(new java.awt.Font("MingLiU-ExtB", 1, 24)); // NOI18N
        keluhan.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        keluhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluhanActionPerformed(evt);
            }
        });
        getContentPane().add(keluhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 565, 397, 32));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\EL\\Pictures\\Screenshots\\Screenshot (286).png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        setVisible(false);
        new MenuutamaPasienFiks().setVisible(true);
    }//GEN-LAST:event_kembaliActionPerformed

    private void IdDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdDocActionPerformed

    private void konsultasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konsultasiActionPerformed
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/konsultasi", "root", "")) {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/konsultasi", "root", "");
            stat = con.createStatement();
            String sql = "SELECT ID_Doc, Nama_Doc, Jenis_Kelamin, Spesialis FROM Dokter";
            rs = stat.executeQuery(sql);
            char karakterAcak;
            String deretKarakter1 = "", deretKarakter2 = ""; 
            for (int x = 1; x <= 3; x++) {
                karakterAcak = (char) ('0' + Math.random() * ('9' - '1' + 1));
                deretKarakter2 += karakterAcak + "";
            }
            for (int x = 1; x <= 2; x++) {
                karakterAcak = (char) ('A' + Math.random() * ('Z' - 'A' + 1));
                deretKarakter1 += karakterAcak + "";
            }
            String id_konsul = deretKarakter1 + deretKarakter2;
            while (rs.next()) {
                String i = rs.getString("ID_Doc");
                if (IdDoc.getText().equals(i)) {
                    String sql2 = "INSERT INTO pasienkonsul VALUES (?, ?, ?, ?, ?, ?)";
                    PreparedStatement preparedStatement = conn.prepareStatement(sql2);
                    preparedStatement.setString(1, id_konsul);
                    preparedStatement.setString(2, a);
                    preparedStatement.setString(3, b);
                    preparedStatement.setString(4, c);
                    preparedStatement.setString(5, i);
                    preparedStatement.setString(6, keluhan.getText());

                    preparedStatement.execute();
                    setVisible(false);
                    JOptionPane.showMessageDialog(null, ", Selamat Berkonsultas Keselamatan Pasien Adalah yang Utama(❁´◡`❁)");
                }
            }
            con.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_konsultasiActionPerformed

    private void keluhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keluhanActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasienListDokterFiks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdDoc;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField keluhan;
    private javax.swing.JButton kembali;
    private javax.swing.JButton konsultasi;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables

}
