
package airlines2;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.UUID;

public class addcustomer extends javax.swing.JFrame {


    public addcustomer() {
        initComponents();
        generateBookingCode();
        jPanel1.setBackground(new Color(0,0,0,2));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtdeparturedate = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtnationality = new javax.swing.JTextField();
        txtcontact = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        txttitle = new javax.swing.JComboBox<>();
        txtfrom = new javax.swing.JTextField();
        txtseatclass = new javax.swing.JComboBox<>();
        txtto = new javax.swing.JTextField();
        buttoncancel = new javax.swing.JButton();
        buttonbook = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtid = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 70, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Title");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 50, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Nationality");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 110, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Contact");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 90, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Departure date");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 140, -1));
        jPanel1.add(txtdeparturedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 130, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("From");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 80, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("To");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 37, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Seat Class");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 265, 120, 40));

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 150, 30));

        txtnationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnationalityActionPerformed(evt);
            }
        });
        jPanel1.add(txtnationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 150, 30));
        jPanel1.add(txtcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 150, 30));

        jTextField5.setText("jTextField1");
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 553, 71, -1));

        txttitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txttitle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr.", "Mrs.", "Ms." }));
        jPanel1.add(txttitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 150, 30));

        txtfrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfromActionPerformed(evt);
            }
        });
        jPanel1.add(txtfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 130, 30));

        txtseatclass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtseatclass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Class", "Business Class", "Economy Class" }));
        jPanel1.add(txtseatclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 130, 30));
        jPanel1.add(txtto, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 130, 30));

        buttoncancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttoncancel.setText("Cancel");
        buttoncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoncancelActionPerformed(evt);
            }
        });
        jPanel1.add(buttoncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 100, 40));

        buttonbook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonbook.setText("Book");
        buttonbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonbookActionPerformed(evt);
            }
        });
        jPanel1.add(buttonbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 110, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Booking Code");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, -1, -1));

        txtid.setBackground(new java.awt.Color(204, 102, 0));
        txtid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtid.setForeground(new java.awt.Color(255, 153, 0));
        txtid.setText("jLabel11");
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 50, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 930, 470));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\H P\\Downloads\\plane-removebg-preview 1.png")); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 160, 140));

        jLabel12.setFont(new java.awt.Font("Segoe UI Emoji", 1, 48)); // NOI18N
        jLabel12.setText("BOOKKABIN");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\H P\\Downloads\\1200x700 fixx.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(1294, 727));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void generateBookingCode() {
    String bookingCode = UUID.randomUUID().toString().substring(0, 6); // Menghasilkan 6 karakter kode booking
    txtid.setText(bookingCode); 
}
    
    
    private void txtnationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnationalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnationalityActionPerformed

    private void txtfromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfromActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void buttoncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoncancelActionPerformed
        // TODO add your handling code here:
        beranda main = new beranda();
        main.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_buttoncancelActionPerformed

    private void buttonbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonbookActionPerformed
        // TODO add your handling code here:
        
        String id = txtid.getText();
       
      
        String name = txtname.getText();
        String title = txttitle.getSelectedItem().toString();
        String nationality = txtnationality.getText();
        String contact = txtcontact.getText();
        String from = txtfrom.getText();
        String to = txtto.getText();
        String seatClass = txtseatclass.getSelectedItem().toString();
        java.util.Date departureDate = txtdeparturedate.getDate();
        java.sql.Date sqlDepartureDate = departureDate != null ? new java.sql.Date(departureDate.getTime()): null;
        
        if(id.isEmpty()|| name.isEmpty()|| nationality.isEmpty() || contact.isEmpty() || from.isEmpty() || to.isEmpty() || departureDate == null){
            JOptionPane.showMessageDialog(this, "Please fill all fields", "Error", JOptionPane.ERROR_MESSAGE);  
        } else{
            try{
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlines", "root", "");
                String query = "INSERT INTO customer(id, name, title, nationality, contact, keberangkatan, kedatangan, seatclass, departuredate)VALUES (?,?,?,?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, id);
                pst.setString(2, name);
                pst.setString(3, title);
                pst.setString(4, nationality);
                pst.setString(5, contact);
                pst.setString(6, from);
                pst.setString(7, to);
                pst.setString(8, seatClass);
                pst.setDate(9, sqlDepartureDate);
                
                int rowsInserted = pst.executeUpdate();
                if (rowsInserted > 0){
                    JOptionPane.showMessageDialog(this, "Booking successfull");
                }
                con.close();
            }catch (SQLException e){
                JOptionPane.showMessageDialog(this, "Error connecting to database "+ e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    
        
        
        
        
    }//GEN-LAST:event_buttonbookActionPerformed

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
            java.util.logging.Logger.getLogger(addcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addcustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonbook;
    private javax.swing.JButton buttoncancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField txtcontact;
    private com.toedter.calendar.JDateChooser txtdeparturedate;
    private javax.swing.JTextField txtfrom;
    private javax.swing.JLabel txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnationality;
    private javax.swing.JComboBox<String> txtseatclass;
    private javax.swing.JComboBox<String> txttitle;
    private javax.swing.JTextField txtto;
    // End of variables declaration//GEN-END:variables
}
