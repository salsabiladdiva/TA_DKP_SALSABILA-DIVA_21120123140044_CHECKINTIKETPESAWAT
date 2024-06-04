/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airlines2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TicketBoarding extends javax.swing.JFrame {

    public TicketBoarding() {
        initComponents();
    }

    Connection con;
    PreparedStatement pst;


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtbookingcode = new javax.swing.JLabel();
        txtname = new javax.swing.JLabel();
        txtnationality = new javax.swing.JLabel();
        txtfrom = new javax.swing.JLabel();
        txtto = new javax.swing.JLabel();
        txtseatclass = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtdeparturedate = new com.toedter.calendar.JDateChooser();
        txtcode = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jLabel15.setText("jLabel15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nationality");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 80, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Airline Booking Code");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Boarding Pass");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 170, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Dear, ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Departure Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("From");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("To");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Class Of Travel");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Gate");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Check Monitor");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 120, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Travel Information");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        txtbookingcode.setBackground(new java.awt.Color(255, 255, 255));
        txtbookingcode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbookingcode.setForeground(new java.awt.Color(255, 255, 255));
        txtbookingcode.setText("*kode booking");
        jPanel1.add(txtbookingcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtname.setText("jLabel13");
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        txtnationality.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtnationality.setForeground(new java.awt.Color(255, 255, 255));
        txtnationality.setText("jLabel13");
        jPanel1.add(txtnationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 70, -1));

        txtfrom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtfrom.setForeground(new java.awt.Color(255, 255, 255));
        txtfrom.setText("jLabel13");
        jPanel1.add(txtfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, -1));

        txtto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtto.setForeground(new java.awt.Color(255, 255, 255));
        txtto.setText("jLabel13");
        jPanel1.add(txtto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, -1, -1));

        txtseatclass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtseatclass.setForeground(new java.awt.Color(255, 255, 255));
        txtseatclass.setText("jLabel13");
        jPanel1.add(txtseatclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, -1, -1));

        jButton1.setText("get ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));
        jPanel1.add(txtdeparturedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 110, -1));
        jPanel1.add(txtcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 80, -1));

        jLabel13.setText("-------------------------------------------------------------------------------------------");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 440, -1));

        jLabel14.setText("*Checked baggage allowance 20 kg.");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 250, -1));

        jLabel17.setText("*Please Report at the boarding gate at latest 30 minutes before departure.");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, -1, -1));

        jLabel16.setText("*Carry-on baggage should be limited to one piece, must not weight more than 7kg.");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 480, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\H P\\Downloads\\500x700 fixxx.png")); // NOI18N
        jLabel12.setText("56");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 700));

        setSize(new java.awt.Dimension(514, 707));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String id = txtcode.getText();
        
        if(id.isEmpty()){
            
            JOptionPane.showMessageDialog(this, "masukkan kode");
        }else{
            try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines", "root", "");
            pst = con.prepareStatement("select * from customer where id = ?");
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next() == false){
                JOptionPane.showMessageDialog(this, "Masokkan kode yang betol");
                
            } else{
                String name = rs.getString("name");
                String nationality = rs.getString("nationality");
                String code = rs.getString("id");
                String from = rs.getString("keberangkatan");
                String to = rs.getString("kedatangan");
                String seatClass = rs.getString("seatclass");
                
                String date = rs.getString("departuredate");
                Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
                
                   txtname.setText(name);
            txtnationality.setText(nationality);
            txtbookingcode.setText(code.trim());
            txtfrom.setText(from.trim());
            txtto.setText(to.trim());
            txtseatclass.setText(seatClass.trim());
            txtdeparturedate.setDate(date1);
            
                
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TicketBoarding.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TicketBoarding.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(TicketBoarding.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TicketBoarding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketBoarding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketBoarding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketBoarding.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

           
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtbookingcode;
    private javax.swing.JTextField txtcode;
    private com.toedter.calendar.JDateChooser txtdeparturedate;
    private javax.swing.JLabel txtfrom;
    private javax.swing.JLabel txtname;
    private javax.swing.JLabel txtnationality;
    private javax.swing.JLabel txtseatclass;
    private javax.swing.JLabel txtto;
    // End of variables declaration//GEN-END:variables
}
