/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subnetapp;

import javax.swing.JOptionPane;

/**
 *
 * @author kamal
 */
public class MyException extends Exception {
    
    private static String msgErrors = "";

    public static String getMsgErrors() {
        return msgErrors;
    }

    public static void setMsgErrors(String msgErrors) {
        MyException.msgErrors = msgErrors;
    }
    
    

    public MyException(String msg) {
        super(msg);
    }

    public static String checkIp(int[] ip) {
        
        try {
            //code de verification
            if (ip[0] > 255 || ip[1] > 255 || ip[2] > 255 || ip[3] > 255) {
                throw new MyException("ip number error !! ");
            }
            if (ip[0] == 0 & ip[1] == 0 & ip[2] == 0 & ip[3] == 0) {
                throw new MyException("ip number error !! ");
            }
            if (ip[0] >= 224 & ip[0] < 240) {
                throw new MyException("multicast ip number !! ");
            }
            if (ip[0] >= 240) {
                throw new MyException("reserved ip number !! ");
            }

        } catch (MyException e) {
            //message ....
            // System.out.println(e.getMessage());
            // JOptionPane.showMessageDialog(null, e.getMessage());
            msgErrors = e.getMessage();
            
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        
       return msgErrors; 
    }

    public static String checkMask(int[] mask) {

        try {
            IP ip = new IP();
            ip.setMASK_DEC(mask);
          //  int[] mask_Zero = {0,0,0,0};
            int[] mask_255 = {255,255,255,255};
            int[][] maskBin = ip.convertToIpBin(mask);
            int[] maskBin32bit = ip.concat(maskBin);
            //code de verification
            if (mask[0] > 255 || mask[1] > 255 || mask[2] > 255 || mask[3] > 255) {
                throw new MyException("ip mask error 3 ");
            }
            if (mask[0] == 255 & mask[1] == 255 & mask[2] == 255 & mask[3] == 255){
                throw new MyException("ip mask error 4 ");
            }
            
            if (maskBin32bit[0] == 0) {
                throw new MyException("ip mask error 1");
            } else {
                for (int i = 1; i < maskBin32bit.length - 1; i++) {
                    if (maskBin32bit[i] == 0) {
                        // k=i;
                        for (int j = i + 1; j < maskBin32bit.length - 1; j++) {
                            if (maskBin32bit[j] == 1) {
                                throw new MyException("ip mask error 2");
                            
                            }
                          //  break;
                        }
                    }
                  //  break;

                }

            }

        } catch (MyException e) {
            //message ....
             msgErrors = e.getMessage();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);

        }
        
         return msgErrors; 
    }

//    public static void chekIpAndMask(int[] ip, int[] mask) {
//
//        try {
//            //code de verification
//
//            throw new MyException("ip number error !! ");
//
//        } catch (MyException e) {
//            //message ....
//            // System.out.println(e.getMessage());
//            // JOptionPane.showMessageDialog(null, e.getMessage());
//            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
//        }
//
//    }
    
    public static String chekSubNetSize(int[] ip,int[] mask,int nbrOfSubNet){
        try {
            //code de verification
            IP ip1 = new IP();
//            int nbrBitEmprunt = Calculer.getNbrBitEmprunt(nbrOfSubNet);
//            int NbrBitInUserId = ip1.getNbrBitInUserId(mask);
            if(Calculer.getNbrBitEmprunt(nbrOfSubNet) >= ip1.getNbrBitInUserId(mask)){
                throw new MyException("Network Size Limited !! ");
            }
        } catch (MyException e) {
            //message ....
             msgErrors = e.getMessage();
            // System.out.println(e.getMessage());
            // JOptionPane.showMessageDialog(null, e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        
        
        return msgErrors; 
    }
    
    public static String chekSubNetScope(int[] ip,int[] mask,int nbrOfMachines){
        try {
            //code de verification
            IP ip1 = new IP();
//           int nbrBitEmprunt = Calculer.getNbrBitEmpruntInUserId(nbrOfMachines);
//           int NbrBitInUserId = ip1.getNbrBitInUserId(mask);
            if(Calculer.getNbrBitEmpruntInUserId(nbrOfMachines) >= ip1.getNbrBitInUserId(mask)){
                throw new MyException("Network Size Limited !! ");
            }
        } catch (MyException e) {
            //message ....
             msgErrors = e.getMessage();
            // System.out.println(e.getMessage());
            // JOptionPane.showMessageDialog(null, e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        
        
        return msgErrors; 
    }
    
    public static String chekVlsmSupported(int[] ip,int[] mask,int[] MachinesInSubNets){
        try {
            //code de verification
            IP ip1 = new IP();
          //  int totalOfMachinesInSubNets = Calculer.sumItemsInTab(MachinesInSubNets);
            //ip1.getSizeOfMainSubnet(mask) < ip1.getSizeOfAllSubnets(MachinesInSubNets)
            if(ip1.getSizeOfMainSubnet(mask) < ip1.getSizeOfAllSubnets(MachinesInSubNets)){
                throw new MyException("Network Size Limited !! ");
            }
            
        } catch (MyException e) {
            //message ....
             msgErrors = e.getMessage();
            // System.out.println(e.getMessage());
            // JOptionPane.showMessageDialog(null, e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        
        
        return msgErrors; 
    }

}
