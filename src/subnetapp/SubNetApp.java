/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subnetapp;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author kamal
 */
public class SubNetApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Starting star = new Starting();
         star.setIconImage(new ImageIcon("subnetIcon.png").getImage());
        
        star.setVisible(true);
        star.pack();
        star.setLocationRelativeTo(null);
        star.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
    
}
