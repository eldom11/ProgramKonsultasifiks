
package ProgramKonsultasi.Pasien;

import ProgramKonsultasi.LoginFiks;

public class MenuutamaPasienFiks extends javax.swing.JFrame {

    private String a, b, c, d;
    public void setA(String a) {
        this.a = a;
    }
    public void setB(String b) {
        this.b = b;
    }
    public void setC(String c) {
        this.c = c;
    }
    public MenuutamaPasienFiks() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DaftarDokter = new javax.swing.JButton();
        Riwayat = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DaftarDokter.setBorderPainted(false);
        DaftarDokter.setContentAreaFilled(false);
        DaftarDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaftarDokterActionPerformed(evt);
            }
        });
        getContentPane().add(DaftarDokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 400, 432, 83));

        Riwayat.setBorderPainted(false);
        Riwayat.setContentAreaFilled(false);
        Riwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RiwayatActionPerformed(evt);
            }
        });
        getContentPane().add(Riwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 400, 432, 83));

        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setHideActionText(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 620, 218, 60));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\EL\\Pictures\\Screenshots\\selamat datang dokter.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DaftarDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaftarDokterActionPerformed

        PasienListDokterFiks listDokter = new PasienListDokterFiks();
        listDokter.setA(a);
        listDokter.setB(b);
        listDokter.setC(c);
        listDokter.setVisible(true);
    }//GEN-LAST:event_DaftarDokterActionPerformed

    private void RiwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RiwayatActionPerformed
        new RiwayatKonsulFiks().setVisible(true);
        RiwayatKonsulFiks Riwayat = new RiwayatKonsulFiks();
        Riwayat.setA(a);
        Riwayat.setB(b);
        Riwayat.setC(c);
        Riwayat.setVisible(true);
    }//GEN-LAST:event_RiwayatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new LoginFiks().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuutamaPasienFiks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DaftarDokter;
    private javax.swing.JButton Riwayat;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
