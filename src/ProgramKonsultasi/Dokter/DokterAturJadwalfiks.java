package ProgramKonsultasi.Dokter;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DokterAturJadwalfiks extends javax.swing.JFrame {
    private String d, e, f, g;
    public void setD(String d) {
        this.d = d;
    } public void setE(String e) {
        this.e = e;
    } public void setF(String f) {
        this.f = f;
    }public void setG(String g) {
        this.g = g;
    
    }
    private DefaultTableModel model;
    public DokterAturJadwalfiks() {
        initComponents();
        model = new DefaultTableModel();
        tabel.setModel(model);
        model.addColumn("ID Konsul");
        model.addColumn("ID Pasien");
        model.addColumn("Nama Pasien");
        model.addColumn("No Telpon");
        model.addColumn("Keluhan");
        tabel();
    }
    
    private Connection koneksi;
    private Statement stat;
    private ResultSet res;
    private void Koneksi() {
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
    public void tabel() {
        model.getDataVector().removeAllElements( );
        model.fireTableDataChanged( );
        try{ Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/konsultasi","root","");
            Statement statement = con.createStatement();
            String sql = "SELECT id_konsul, id_pasien, Nama_Pasien, No_Telpon, keluhan FROM pasienkonsul";
            ResultSet rs = statement.executeQuery(sql);
            
            while(rs.next()){
                Object[] o = new Object[5];
                o[0]=rs.getString("Id_konsul");
                o[1]=rs.getString("Id_pasien");
                o[2]=rs.getString("Nama_Pasien");
                o[3]=rs.getString("No_Telpon");
                o[4]=rs.getString("keluhan");
                model.addRow(o);
            }
           rs.close();
           statement.close();
        }catch (Exception e){
            e.printStackTrace(); 
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IdPasien = new javax.swing.JTextField();
        Tanggal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        Submit = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IdPasien.setFont(new java.awt.Font("NSimSun", 1, 24)); // NOI18N
        IdPasien.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        IdPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdPasienActionPerformed(evt);
            }
        });
        getContentPane().add(IdPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 394, 35));

        Tanggal.setFont(new java.awt.Font("NSimSun", 1, 24)); // NOI18N
        Tanggal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 557, 394, 35));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tabel.setPreferredSize(new java.awt.Dimension(360, 80));
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 1150, 340));

        Submit.setBorderPainted(false);
        Submit.setContentAreaFilled(false);
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(772, 638, 140, 40));

        Back.setBorderPainted(false);
        Back.setContentAreaFilled(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 638, 140, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\EL\\Pictures\\Screenshots\\Screenshot (284).png")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IdPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdPasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdPasienActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/konsultasi", "root", ""); ){
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/konsultasi","root","");
            Statement statement = koneksi.createStatement();
            String sql = "SELECT id_konsul, id_pasien, Nama_Pasien, keluhan FROM pasienkonsul ";
            ResultSet rs = statement.executeQuery(sql);            
            while (rs.next()) {
                String a = rs.getString("Id_konsul");
                String b = rs.getString("Id_Pasien");
                String c = rs.getString("Nama_Pasien");
                String h = rs.getString("keluhan");
                if (IdPasien.getText().equals(b)) {
                    String sql2 = "INSERT INTO riwayatkonsul VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement preparedStatement = conn.prepareStatement(sql2);
                    preparedStatement.setString(1, a);
                    preparedStatement.setString(2, b);
                    preparedStatement.setString(3, d);
                    preparedStatement.setString(4, h);
                    preparedStatement.setString(5, Tanggal.getText());
                    preparedStatement.execute();
                    setVisible(false);
                    JOptionPane.showMessageDialog(null, ", Selamat Berkonsultas, Keselamatan Pasien Adalah yang Utama(❁´◡`❁)");
                }
            }          
            koneksi.close();
        }catch(HeadlessException|SQLException e){
           JOptionPane.showMessageDialog(this, e.getMessage());  
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        setVisible(false);
        new MenuutamaDokterFiks().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DokterAturJadwalfiks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField IdPasien;
    private javax.swing.JButton Submit;
    private javax.swing.JTextField Tanggal;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
