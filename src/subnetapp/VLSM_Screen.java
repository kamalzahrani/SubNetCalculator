/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subnetapp;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kamal
 */
public class VLSM_Screen extends javax.swing.JFrame {

    /**
     * Creates new form VLSM_Screen
     */
    
     public static boolean ASC = true;
    public static boolean DESC = false;
    public VLSM_Screen() {
        initComponents();
           this.imagePanel1.setImage(Toolkit.getDefaultToolkit().getImage("MainBackground5.jpg"));
      //  this.imagePanel1.setImage(new ImageIcon(this.getClass().getResource("MainBackground.jpg")).getImage());
      this.setLocationRelativeTo(null);
      
       Object[] tablesColumnNamesTable_1=new Object[2];
        
        tablesColumnNamesTable_1[0]="Subnet";
        tablesColumnNamesTable_1[1]="Nombre de machines";
        
        tbd.setColumnIdentifiers(tablesColumnNamesTable_1);
         this.jTable1.setModel(tbd);
         
         Object[] tablesColumnNamesTable_2=new Object[7];
        
        tablesColumnNamesTable_2[0]="Subnet";
        tablesColumnNamesTable_2[1]="SubnetAddress";
        tablesColumnNamesTable_2[2]="NewMask";
        tablesColumnNamesTable_2[3]="NbrOfUseAddr";
        tablesColumnNamesTable_2[4]="firstAddr";
        tablesColumnNamesTable_2[5]="lastAddr";
        tablesColumnNamesTable_2[6]="broadCast";
        
        DefaultTableModel tbd1=new DefaultTableModel();
        tbd1.setColumnIdentifiers(tablesColumnNamesTable_2);
        
         this.jTable2.setModel(tbd1);
         
        
    }
    
    DefaultTableModel tbd=new DefaultTableModel();
    DefaultTableModel tbd1=new DefaultTableModel();
   //  Object[] RowItem=new Object[2];
     
    ArrayList nbr_de_machines= new ArrayList();
    int nbrOfMachin;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagePanel1 = new subnetapp.ImagePanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Oct1 = new javax.swing.JTextField();
        txt_Oct2 = new javax.swing.JTextField();
        txt_Oct3 = new javax.swing.JTextField();
        txt_Oct4 = new javax.swing.JTextField();
        txt_mask1 = new javax.swing.JTextField();
        txt_mask3 = new javax.swing.JTextField();
        txt_mask4 = new javax.swing.JTextField();
        txt_mask2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNameSubnet = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNbrDeMachines = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VLSM");
        setResizable(false);

        jButton3.setText("Effacer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout imagePanel1Layout = new javax.swing.GroupLayout(imagePanel1);
        imagePanel1.setLayout(imagePanel1Layout);
        imagePanel1Layout.setHorizontalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagePanel1Layout.createSequentialGroup()
                .addContainerGap(487, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(217, 217, 217))
        );
        imagePanel1Layout.setVerticalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagePanel1Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jButton3)
                .addContainerGap(289, Short.MAX_VALUE))
        );

        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Addresse IP             :");

        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("Masque de reseau :");

        txt_Oct2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Oct2ActionPerformed(evt);
            }
        });

        txt_Oct3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Oct3ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("Name_Subnet :");

        txtNameSubnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameSubnetActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("Nombre de machines : ");

        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("VOIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_Oct1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                    .addComponent(txt_mask1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_Oct2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                    .addComponent(txt_mask2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_mask3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_mask4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_Oct3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_Oct4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNameSubnet, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNbrDeMachines, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1))
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(imagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_Oct1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Oct2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Oct3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Oct4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_mask1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_mask3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_mask4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_mask2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNameSubnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNbrDeMachines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(imagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Oct2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Oct2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Oct2ActionPerformed

    private void txt_Oct3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Oct3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Oct3ActionPerformed

    private void txtNameSubnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameSubnetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameSubnetActionPerformed

    @SuppressWarnings("empty-statement")
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int oct1 = Integer.parseInt(this.txt_Oct1.getText());
        int oct2 = Integer.parseInt(this.txt_Oct2.getText());
        int oct3 = Integer.parseInt(this.txt_Oct3.getText());
        int oct4 = Integer.parseInt(this.txt_Oct4.getText());

        int msk1 = Integer.parseInt(this.txt_mask1.getText());
        int msk2 = Integer.parseInt(this.txt_mask2.getText());
        int msk3 = Integer.parseInt(this.txt_mask3.getText());
        int msk4 = Integer.parseInt(this.txt_mask4.getText());

     //   int nbr_de_machines = Integer.parseInt(this.txtNbrDeMachines.getText());

        int[] ip_saisi = {oct1, oct2, oct3, oct4};
        int[] msk_saisi = {msk1, msk2, msk3, msk4};
        
        
       // MyException.checkIp(ip_saisi);
      //  MyException.checkMask(msk_saisi);
        
         int k=this.jTable1.getRowCount();
            int[] val_col=new int[k];
            Map<String, Integer> unsortMap = new HashMap<String, Integer>();
//            for(int i=0;i<k;i++){
//                val_col[i]=Integer.parseInt(this.jTable1.getValueAt(i, 1).toString().trim());
//                }
            for(int i=0;i<k;i++){
                unsortMap.put(this.jTable1.getValueAt(i, 0).toString().trim(), Integer.parseInt(this.jTable1.getValueAt(i, 1).toString().trim()));
                }
          //SortMapByValue.printMap(unsortMap);
            Map<String, Integer> sortedMapDesc = Calculer.sortByComparator(unsortMap, DESC);
        Calculer.printMap(sortedMapDesc);
        
          ArrayList nameOfSubnets= new ArrayList();
          ArrayList sizeOfSubnets= new ArrayList();
          
           for (Map.Entry<String, Integer> entry : sortedMapDesc.entrySet())
        {
            nameOfSubnets.add(entry.getKey());
        }
           
           for (Map.Entry<String, Integer> entry : sortedMapDesc.entrySet())
        {
            sizeOfSubnets.add(entry.getValue());
        }
          
           //   val_col = Calculer.getOrderlyTab(val_col);
              for(int i=0;i<sizeOfSubnets.size();i++){
                  System.out.println(sizeOfSubnets.get(i));
              }
              
              for(int i=0;i<val_col.length;i++){
                  val_col[i] = (int) sizeOfSubnets.get(i);
              }
         IP ip = new IP();
        ip.setIP_DEC(ip_saisi);
        ip.setMASK_DEC(msk_saisi);
        
    
         if(MyException.checkIp(ip_saisi).matches("") & MyException.checkMask(msk_saisi).matches("") & MyException.chekVlsmSupported(ip_saisi, msk_saisi, val_col).matches("")){
             
             
      
    //    ArrayList<ArrayList<int[]>> allNetAndMask=ip.getAllVlsmSubnet(ip_saisi, msk_saisi, val_col);
            ArrayList<int[]> allVlsmMask=ip.getAllVlsmSubnetMask(val_col);
           ArrayList<int[]> VlsmSubNet=ip.getAllVlsmSubNet(ip_saisi, msk_saisi, val_col);
        
          Object[] tablesColumnNames=new Object[7];
        
        tablesColumnNames[0]="Subnet";
        tablesColumnNames[1]="SubnetAddress";
        tablesColumnNames[2]="NewMask";
        tablesColumnNames[3]="NbrOfUseAddr";
        tablesColumnNames[4]="firstAddr";
        tablesColumnNames[5]="lastAddr";
        tablesColumnNames[6]="broadCast";
        
//        DefaultTableModel tbd1=new DefaultTableModel();
        tbd1.setColumnIdentifiers(tablesColumnNames);
        
         Object[] RowItem=new Object[7];
         
         for(int i=0;i<VlsmSubNet.size();i++){
           //  RowItem[0]=this.jTable1.getValueAt(i, 0);
             RowItem[0]= nameOfSubnets.get(i);
            RowItem[1]=ip.getIptoString(VlsmSubNet.get(i));
            RowItem[2]=ip.getIptoString(allVlsmMask.get(i));
            RowItem[3]=ip.getNbrOfUseAddr(allVlsmMask.get(i));
            RowItem[4]=ip.getIptoString(ip.getFirstAddress(VlsmSubNet.get(i), allVlsmMask.get(i)));
            RowItem[5]=ip.getIptoString(ip.getLastAddress(VlsmSubNet.get(i),allVlsmMask.get(i)));
            RowItem[6]=ip.getIptoString(ip.getBroadCastAddress(VlsmSubNet.get(i),allVlsmMask.get(i)));
             
              tbd1.addRow(RowItem);
        
             }
         
        
       
        this.jTable2.setModel(tbd1);
      
         }else{
//             this.txt_Oct1.setText("");
//             this.txt_Oct2.setText("");
//             this.txt_Oct3.setText("");
//             this.txt_Oct4.setText("");
//             
//             this.txt_mask1.setText("");
//             this.txt_mask2.setText("");
//             this.txt_mask3.setText("");
//             this.txt_mask4.setText("");
             
              MyException.setMsgErrors("");
             
             //tbd.setRowCount(0);
             
             
         }

       
      
//            for(int i=0;i<val_col.length;i++){
//                System.out.println(val_col[i]);
//            }
//           System.out.println(VlsmSubNet.size());
            
           
        
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    //    String SubnetName=this.txtNameSubnet.getText();
       //   nbrOfMachin=Integer.parseInt(this.txtNbrDeMachines.getText());
    
      
     //   nbr_de_machines.add(nbrOfMachin);
    
        
         Object[] tablesColumnNames=new Object[2];
        
        tablesColumnNames[0]="Subnet";
        tablesColumnNames[1]="Nombre de machines";
        
     //    DefaultTableModel tbd=new DefaultTableModel();
        tbd.setColumnIdentifiers(tablesColumnNames);
        
        Object[] RowItem=new Object[2];
        
            RowItem[0]=this.txtNameSubnet.getText();
           // RowItem[1]=nbrOfMachin;
           RowItem[1]=this.txtNbrDeMachines.getText();
            
            tbd.addRow(RowItem);
            
        
        this.jTable1.setModel(tbd);
        this.txtNameSubnet.setText(" ");
        this.txtNbrDeMachines.setText(" ");
        this.txtNameSubnet.requestFocusInWindow();

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.txt_Oct1.setText("");
        this.txt_Oct2.setText("");
        this.txt_Oct3.setText("");
        this.txt_Oct4.setText("");
        
        this.txt_mask1.setText("");
        this.txt_mask2.setText("");
        this.txt_mask3.setText("");
        this.txt_mask4.setText("");
        
        tbd.setRowCount(0);
        tbd1.setRowCount(0);
        
        MyException.setMsgErrors("");
        this.txt_Oct1.requestFocusInWindow();
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(VLSM_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VLSM_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VLSM_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VLSM_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VLSM_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private subnetapp.ImagePanel imagePanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtNameSubnet;
    private javax.swing.JTextField txtNbrDeMachines;
    private javax.swing.JTextField txt_Oct1;
    private javax.swing.JTextField txt_Oct2;
    private javax.swing.JTextField txt_Oct3;
    private javax.swing.JTextField txt_Oct4;
    private javax.swing.JTextField txt_mask1;
    private javax.swing.JTextField txt_mask2;
    private javax.swing.JTextField txt_mask3;
    private javax.swing.JTextField txt_mask4;
    // End of variables declaration//GEN-END:variables

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    public JTable getjTable2() {
        return jTable2;
    }

    public void setjTable2(JTable jTable2) {
        this.jTable2 = jTable2;
    }

    public JTextField getTxtNameSubnet() {
        return txtNameSubnet;
    }

    public void setTxtNameSubnet(JTextField txtNameSubnet) {
        this.txtNameSubnet = txtNameSubnet;
    }

    public JTextField getTxtNbrDeMachines() {
        return txtNbrDeMachines;
    }

    public void setTxtNbrDeMachines(JTextField txtNbrDeMachines) {
        this.txtNbrDeMachines = txtNbrDeMachines;
    }

    public JTextField getTxt_Oct1() {
        return txt_Oct1;
    }

    public void setTxt_Oct1(JTextField txt_Oct1) {
        this.txt_Oct1 = txt_Oct1;
    }

    public JTextField getTxt_Oct2() {
        return txt_Oct2;
    }

    public void setTxt_Oct2(JTextField txt_Oct2) {
        this.txt_Oct2 = txt_Oct2;
    }

    public JTextField getTxt_Oct3() {
        return txt_Oct3;
    }

    public void setTxt_Oct3(JTextField txt_Oct3) {
        this.txt_Oct3 = txt_Oct3;
    }

    public JTextField getTxt_Oct4() {
        return txt_Oct4;
    }

    public void setTxt_Oct4(JTextField txt_Oct4) {
        this.txt_Oct4 = txt_Oct4;
    }

    public JTextField getTxt_mask1() {
        return txt_mask1;
    }

    public void setTxt_mask1(JTextField txt_mask1) {
        this.txt_mask1 = txt_mask1;
    }

    public JTextField getTxt_mask2() {
        return txt_mask2;
    }

    public void setTxt_mask2(JTextField txt_mask2) {
        this.txt_mask2 = txt_mask2;
    }

    public JTextField getTxt_mask3() {
        return txt_mask3;
    }

    public void setTxt_mask3(JTextField txt_mask3) {
        this.txt_mask3 = txt_mask3;
    }

    public JTextField getTxt_mask4() {
        return txt_mask4;
    }

    public void setTxt_mask4(JTextField txt_mask4) {
        this.txt_mask4 = txt_mask4;
    }
}
