/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subnetapp;

import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kamal
 */
public class Machines_Option extends javax.swing.JFrame {

    /**
     * Creates new form Machines_Option
     */
    public Machines_Option() {
        initComponents();
           this.imagePanel1.setImage(Toolkit.getDefaultToolkit().getImage("MainBackground3.jpg"));
      //  this.imagePanel1.setImage(new ImageIcon(this.getClass().getResource("MainBackground.jpg")).getImage());
      this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagePanel1 = new subnetapp.ImagePanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtOct1 = new javax.swing.JTextField();
        txtOct2 = new javax.swing.JTextField();
        txtOct3 = new javax.swing.JTextField();
        txtOct4 = new javax.swing.JTextField();
        mask1 = new javax.swing.JTextField();
        mask2 = new javax.swing.JTextField();
        mask3 = new javax.swing.JTextField();
        mask4 = new javax.swing.JTextField();
        txtNbrPcInSubnet = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SubNetApp");
        setResizable(false);

        javax.swing.GroupLayout imagePanel1Layout = new javax.swing.GroupLayout(imagePanel1);
        imagePanel1.setLayout(imagePanel1Layout);
        imagePanel1Layout.setHorizontalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 681, Short.MAX_VALUE)
        );
        imagePanel1Layout.setVerticalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
        );

        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Adresse IP               :");

        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Masque de sous reseau :");

        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Nombre de machines par sous reseau :");

        txtOct3.setText(" ");

        txtNbrPcInSubnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNbrPcInSubnetActionPerformed(evt);
            }
        });

        jButton1.setText("Voir    ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Effacer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(121, 121, 121))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mask1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mask2, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mask3, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mask4, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNbrPcInSubnet, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(88, 88, 88)
                        .addComponent(txtOct1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtOct2, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOct3, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOct4, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))
                .addGap(73, 73, 73))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(imagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOct1)
                    .addComponent(txtOct2)
                    .addComponent(txtOct3)
                    .addComponent(txtOct4))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mask1)
                    .addComponent(mask2)
                    .addComponent(mask3)
                    .addComponent(mask4))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                        .addGap(120, 120, 120))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNbrPcInSubnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jButton3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(imagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int oct1 = Integer.parseInt(this.txtOct1.getText().trim());
        int oct2 = Integer.parseInt(this.txtOct2.getText().trim());
        int oct3 = Integer.parseInt(this.txtOct3.getText().trim());
        int oct4 = Integer.parseInt(this.txtOct4.getText().trim());

        int msk1 = Integer.parseInt(this.mask1.getText().trim());
        int msk2 = Integer.parseInt(this.mask2.getText().trim());
        int msk3 = Integer.parseInt(this.mask3.getText().trim());
        int msk4 = Integer.parseInt(this.mask4.getText().trim());
        
        int nbr_de_mach = Integer.parseInt(this.txtNbrPcInSubnet.getText().trim());
        
        int[] ip_saisi = {oct1, oct2, oct3, oct4};
        int[] msk_saisi = {msk1, msk2, msk3, msk4};
        
      //  MyException.checkIp(ip_saisi);
       // MyException.checkMask(msk_saisi);
        
        if(MyException.checkIp(ip_saisi).matches("") & MyException.checkMask(msk_saisi).matches("") & MyException.chekSubNetScope(ip_saisi, msk_saisi, nbr_de_mach).matches("")){
            
             IP ip = new IP();
        ip.setIP_DEC(ip_saisi);
        ip.setMASK_DEC(msk_saisi);
        
        System.out.println(nbr_de_mach);
        System.out.println(Calculer.getNbrBitEmpruntInUserId(nbr_de_mach));
        
        System.out.println(ip.getNbrOfSubnet(msk_saisi, nbr_de_mach));
        
         int[] newMask = ip.getNewMask(ip_saisi, msk_saisi, ip.getNbrOfSubnet(msk_saisi, nbr_de_mach));
        int nbrOfSubnet = Calculer.puissance(2, Calculer.getNbrBitEmprunt(ip.getNbrOfSubnet(msk_saisi, nbr_de_mach)));

        int[] firstSubnet = ip.getNetId(ip_saisi, msk_saisi);
        int[] firstSubnet32bit = ip.concat(ip.convertToIpBin(firstSubnet));
        int[] hopeBin32bit = ip.getHopeBin32bit(ip.getNbrBitInUserId(newMask));
        int NbrBitInUserId=ip.getNbrBitInUserId(newMask);
        
        ArrayList<int[]> allSubnet=ip.getAllSubnet(ip_saisi, msk_saisi, ip.getNbrOfSubnet(msk_saisi, nbr_de_mach));
        
        Object[] tablesColumnNames=new Object[6];
        
        tablesColumnNames[0]="SubnetId";
        tablesColumnNames[1]="SubnetAddress";
        tablesColumnNames[2]="NewMask";
        tablesColumnNames[3]="NbrOfUseAddr";
        tablesColumnNames[4]="firstAddr";
        tablesColumnNames[5]="lastAddr";
        
        DefaultTableModel tbd=new DefaultTableModel();
        tbd.setColumnIdentifiers(tablesColumnNames);
        
          Object[] RowItem=new Object[6];
        
           for(int i=0;i<allSubnet.size();i++){
            RowItem[0] = i;
            RowItem[1] = ip.getIptoString(allSubnet.get(i));
            RowItem[2] = ip.getIptoString(ip.getNewMask(ip_saisi, msk_saisi, ip.getNbrOfSubnet(msk_saisi, nbr_de_mach)));
            RowItem[3] = ip.getNbrOfUseAddr(ip.getNewMask(ip_saisi, msk_saisi, ip.getNbrOfSubnet(msk_saisi, nbr_de_mach)));
            RowItem[4] = ip.getIptoString(ip.getFirstAddress(allSubnet.get(i), ip.getNewMask(ip_saisi, msk_saisi, ip.getNbrOfSubnet(msk_saisi, nbr_de_mach))));
            RowItem[5] = ip.getIptoString(ip.getLastAddress(allSubnet.get(i), ip.getNewMask(ip_saisi, msk_saisi, ip.getNbrOfSubnet(msk_saisi, nbr_de_mach))));
            
            tbd.addRow(RowItem);
        }
           
           Resultats result=new Resultats();
           
            result.setIconImage(new ImageIcon("subnetIcon.png").getImage());
        
        result.setVisible(true);
        result.pack();
        result.setLocationRelativeTo(null);
        //cidr.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //this.setVisible(false);
        
        result.getjTable1().setModel(tbd);
       
            
            
        }else {
//        this.txtOct1.setText("");
//        this.txtOct2.setText("");
//        this.txtOct3.setText("");
//        this.txtOct4.setText("");
//        
//        this.mask1.setText("");
//        this.mask2.setText("");
//        this.mask3.setText("");
//        this.mask4.setText("");
//        
//        this.txtNbrPcInSubnet.setText("");
            MyException.setMsgErrors("");
        
        }

        
       

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         this.txtOct1.setText("");
        this.txtOct2.setText("");
        this.txtOct3.setText("");
        this.txtOct4.setText("");

        this.mask1.setText("");
        this.mask2.setText("");
        this.mask3.setText("");
        this.mask4.setText("");

        this.txtNbrPcInSubnet.setText("");
        
        MyException.setMsgErrors("");
        
        this.txtOct1.requestFocusInWindow();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtNbrPcInSubnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNbrPcInSubnetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNbrPcInSubnetActionPerformed

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
            java.util.logging.Logger.getLogger(Machines_Option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Machines_Option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Machines_Option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Machines_Option.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Machines_Option().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private subnetapp.ImagePanel imagePanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField mask1;
    private javax.swing.JTextField mask2;
    private javax.swing.JTextField mask3;
    private javax.swing.JTextField mask4;
    private javax.swing.JTextField txtNbrPcInSubnet;
    private javax.swing.JTextField txtOct1;
    private javax.swing.JTextField txtOct2;
    private javax.swing.JTextField txtOct3;
    private javax.swing.JTextField txtOct4;
    // End of variables declaration//GEN-END:variables

    public JTextField getTxtOct1() {
        return txtOct1;
    }

    public void setTxtOct1(JTextField txtOct1) {
        this.txtOct1 = txtOct1;
    }
}
