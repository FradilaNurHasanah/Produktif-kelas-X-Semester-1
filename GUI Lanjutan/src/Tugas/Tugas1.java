/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author FRADILA
 */
public class Tugas1 extends javax.swing.JFrame {

    /**
     * Creates new form Tugas1
     */
    public Tugas1() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Tinggi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Berat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        RadioButton1 = new javax.swing.JRadioButton();
        RadioButton2 = new javax.swing.JRadioButton();
        h1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Ideal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Hasil = new javax.swing.JTextField();
        Saran = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cek Ideal Tubuh");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 0, 170, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 40, 80, 30);
        getContentPane().add(Nama);
        Nama.setBounds(170, 40, 350, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Tinggi");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 80, 80, 30);

        Tinggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TinggiActionPerformed(evt);
            }
        });
        getContentPane().add(Tinggi);
        Tinggi.setBounds(170, 80, 100, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("cm");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 80, 40, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Berat Badan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(90, 120, 80, 30);

        Berat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeratActionPerformed(evt);
            }
        });
        getContentPane().add(Berat);
        Berat.setBounds(170, 120, 100, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("kg");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(280, 120, 40, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Jenis Kelamin");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(90, 160, 100, 20);

        RadioButton1.setText("Perempuan");
        RadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(RadioButton1);
        RadioButton1.setBounds(210, 160, 90, 23);

        RadioButton2.setText("Laki-laki");
        RadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(RadioButton2);
        RadioButton2.setBounds(360, 160, 93, 23);

        h1.setBackground(new java.awt.Color(153, 255, 255));
        h1.setText("Hitung");
        h1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h1ActionPerformed(evt);
            }
        });
        getContentPane().add(h1);
        h1.setBounds(120, 190, 110, 30);

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setText("Coba Lagi");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(270, 190, 110, 30);

        jButton3.setBackground(new java.awt.Color(153, 255, 255));
        jButton3.setText("Keluar");
        getContentPane().add(jButton3);
        jButton3.setBounds(440, 190, 120, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Berat Badan Ideal Anda Adalah");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(130, 250, 240, 30);
        getContentPane().add(Ideal);
        Ideal.setBounds(370, 250, 80, 30);

        jLabel9.setText("Kg");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(460, 260, 12, 14);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Hasil Diagnosa Kesehatan ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(300, 290, 200, 30);
        getContentPane().add(Hasil);
        Hasil.setBounds(140, 330, 550, 40);
        getContentPane().add(Saran);
        Saran.setBounds(140, 380, 550, 40);

        jLabel11.setBackground(new java.awt.Color(51, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\FRADILA\\Pictures\\Background\\cute.jpg")); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(-10, 0, 840, 510);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(590, 220, 100, 100);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(550, 60, 80, 100);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(580, 20, 60, 60);

        setBounds(0, 0, 845, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void RadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButton1ActionPerformed

    private void TinggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TinggiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TinggiActionPerformed

    private void BeratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BeratActionPerformed

    private void h1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h1ActionPerformed
        Double h1 = null;
        Double ti = Double.valueOf(Tinggi.getText());
        Double bt = Double.valueOf(Berat.getText());
        
if (RadioButton1.isSelected()) {
    h1 = (ti - 100) * 1;
} else if (RadioButton2.isSelected()) {
    h1 = (ti - 104) * 1;
}
String temp = "";
temp = Double.toString(h1);
ti = Double.valueOf(Tinggi.getText());
bt = Double.valueOf(Berat.getText());

if (h1 < bt) {
    Ideal.setText(temp);
    Hasil.setText(" Maaf " + Nama.getText() + " , Sepertinya anda Overweight : ( ");
    Saran.setText("Banyaklah berolahraga dan hindari makanan berkolesterol");
} else if (h1 > bt) {
    Ideal.setText(temp);
    Hasil.setText(" Maaf " + Nama.getText() + " , Sepertinya anda Underweight : ( ");
    Saran.setText("Banyaklah mengkonsumsi makanan yang berkarbohidrat");
} else {
    Ideal.setText(temp);
    Hasil.setText("Hallo " + Nama.getText() + " ,Berat badan anda sudah ideal : ) ");
    Saran.setText("Lanjutkan pola makan teratur dan gaya hidup sehat : )");
}
// TODO add your handling code here:
    }//GEN-LAST:event_h1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Nama.setText("");
Tinggi.setText("");
Berat.setText("");
RadioButton1.isSelected();
RadioButton2.isSelected();




// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void RadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tugas1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tugas1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Berat;
    private javax.swing.JTextField Hasil;
    private javax.swing.JTextField Ideal;
    private javax.swing.JTextField Nama;
    private javax.swing.JRadioButton RadioButton1;
    private javax.swing.JRadioButton RadioButton2;
    private javax.swing.JTextField Saran;
    private javax.swing.JTextField Tinggi;
    private javax.swing.JButton h1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}