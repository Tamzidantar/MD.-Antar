
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuhin
 */
public class CLS extends javax.swing.JFrame {

    /**
     * Creates new form CLS
     */
    public CLS() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        company = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        csize = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        number = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        country = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Back.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tuhin\\Desktop\\as\\previous icon.png")); // NOI18N
        Back.setText("Back");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel2.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 27)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Tuhin\\Desktop\\as\\Shiping cargo logo.png")); // NOI18N
        jLabel2.setText("Shipping Cargo");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 319, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 920, 80));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        jLabel3.setText("Container Load  in Ship (CLS) :-");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 390, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 920, 70));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Company Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Street Address / Number");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("City");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 60, 30));

        company.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyActionPerformed(evt);
            }
        });
        jPanel1.add(company, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 610, 60));

        address.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 610, 60));

        city.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel1.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 610, 60));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Container Size");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, -1, -1));

        csize.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(csize, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, 610, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Container Number ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 640, -1, -1));

        number.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        number.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " 1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 680, 610, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("In which Country");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 750, -1, -1));

        country.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        country.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Country", "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Brazil", "Cambodia", "Cameroon", "Canada", "China", "Colombia", "Denmark", "Eritrea", "Finland", "France", "Germany", "Ghana", "Honduras", "Hungary", "Iceland", "India", "Iran", "Iraq", "Ireland", "Italy", "Japan", "Jordan", "Kiribati", "Kuwait", "Laos", "Lebanon", "Liberia", "Libya", "Mexico", "Micronesia", "Myanmar", "Netherlands", "New Zealand", "North Korea", "Oman", "Pakistan", "Panama", "Poland", "Qatar", "Russia", "Saudi Arabia", "Somalia", "South Africa", "South Korea", "Spain", "Sri Lanka", "Sudan", "Switzerland", "Thailand", "Timor-Leste", "Togo", "United Arab Emirates", "United Kingdom", "United States of America", "Uzbekistan", "Vanuatu", "Venezuela", "Yemen", "Zambia" }));
        jPanel1.add(country, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 780, 610, 70));

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 870, 150, 60));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 1610, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        this.dispose();
        Home_Page H = new Home_Page();
        H.setVisible(true);
    }//GEN-LAST:event_BackMouseClicked

    private void companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String company1= company.getText();
        String address1=address.getText();
        String city1=city.getText();
        String csize1=csize.getText();
        String number1=(String)number.getSelectedItem();
        String counrty1=(String)country.getSelectedItem();
        
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shipping","root","");
            String query = "insert into cls (Company,Street_Address,City,Container_Size,Container_Number,Which_Country)values('"+company1+"','"+address1+"','"+city1+"','"+csize1+"','"+number1+"','"+counrty1+"')";
            Statement stmt1=con.createStatement();
            
                int success= stmt1.executeUpdate(query);
                  if (success==1)
                  {
                      JOptionPane.showMessageDialog(this, "Booking Successful");
                                 this.dispose();
                             new Home_Page().setVisible(true);
                  }
                  else
                  {
                      JOptionPane.showMessageDialog(this, "Bokking Not Successful");
                            
                  }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CLS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CLS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CLS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CLS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CLS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField address;
    private javax.swing.JTextField city;
    private javax.swing.JTextField company;
    private javax.swing.JComboBox<String> country;
    private javax.swing.JTextField csize;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> number;
    // End of variables declaration//GEN-END:variables
}
