
package ProgramKonsultasi;

public class PilihanDaftarFiks extends javax.swing.JFrame {
    public PilihanDaftarFiks() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DaftarSPasien = new javax.swing.JButton();
        DaftarSDokter = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DaftarSPasien.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DaftarSPasien.setBorderPainted(false);
        DaftarSPasien.setContentAreaFilled(false);
        DaftarSPasien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DaftarSPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaftarSPasienActionPerformed(evt);
            }
        });
        getContentPane().add(DaftarSPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 250, 80));

        DaftarSDokter.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        DaftarSDokter.setBorderPainted(false);
        DaftarSDokter.setContentAreaFilled(false);
        DaftarSDokter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DaftarSDokter.setFocusCycleRoot(true);
        DaftarSDokter.setFocusPainted(false);
        DaftarSDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaftarSDokterActionPerformed(evt);
            }
        });
        getContentPane().add(DaftarSDokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 250, 80));

        Back.setBorderPainted(false);
        Back.setContentAreaFilled(false);
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(827, 410, 240, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\EL\\Pictures\\Screenshots\\Screenshot (154).png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DaftarSPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaftarSPasienActionPerformed
        setVisible(false);
        new DaftarAkunPasienFiks().setVisible(true);
    }//GEN-LAST:event_DaftarSPasienActionPerformed

    private void DaftarSDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaftarSDokterActionPerformed
        setVisible(false);
        new DaftarAkunDokterFIks().setVisible(true);
    }//GEN-LAST:event_DaftarSDokterActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        setVisible(false);
        new LoginFiks().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihanDaftarFiks().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton DaftarSDokter;
    private javax.swing.JButton DaftarSPasien;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
