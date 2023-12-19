package ProgramKonsultasi.Dokter;

import ProgramKonsultasi.LoginFiks;

public class MenuutamaDokterFiks extends javax.swing.JFrame {

    private String d, e, f, g;

    public void setD(String d) {
        this.d = d;
    }public void setE(String e) {
        this.e = e;
    }public void setF(String f) {
        this.f = f;
    }public void setG(String g) {
        this.g = g;
    }
    public MenuutamaDokterFiks() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        AturJadwal = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        DaftarPasien = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AturJadwal.setBorderPainted(false);
        AturJadwal.setContentAreaFilled(false);
        AturJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AturJadwalActionPerformed(evt);
            }
        });
        getContentPane().add(AturJadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 414, 290, 85));

        Logout.setBorderPainted(false);
        Logout.setContentAreaFilled(false);
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 640, 218, 61));

        DaftarPasien.setBorderPainted(false);
        DaftarPasien.setContentAreaFilled(false);
        DaftarPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaftarPasienActionPerformed(evt);
            }
        });
        getContentPane().add(DaftarPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 414, 290, 85));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\EL\\Pictures\\Screenshots\\Screenshot (290).png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AturJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AturJadwalActionPerformed

        DokterAturJadwalfiks AturJadwal = new DokterAturJadwalfiks();
        AturJadwal.setD(d);
        AturJadwal.setE(e);
        AturJadwal.setF(f);
        AturJadwal.setG(g);
        AturJadwal.setVisible(true);
        
    }//GEN-LAST:event_AturJadwalActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        setVisible(false);
        new LoginFiks().setVisible(true);
    }//GEN-LAST:event_LogoutActionPerformed

    private void DaftarPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaftarPasienActionPerformed
        setVisible(false);
        new DokterDaftarPasienFiks().setVisible(true);
    }//GEN-LAST:event_DaftarPasienActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuutamaDokterFiks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AturJadwal;
    private javax.swing.JButton DaftarPasien;
    private javax.swing.JButton Logout;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables

}
