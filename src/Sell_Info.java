
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Sell_Info extends javax.swing.JFrame {
    
    PreparedStatement pst;
    Connection cn;
    ResultSet rs;
    
    public Sell_Info() {
        initComponents();
        cn = database.ConnectDB();
    }
    public void entry(){
    
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\icon\\bar-code.png")); // NOI18N
        jLabel1.setText("Product ID:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 150, 90, 17);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\icon\\box.png")); // NOI18N
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 190, 120, 24);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Downloads\\coin.png")); // NOI18N
        jLabel3.setText("Price:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 250, 60, 17);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Downloads\\icons8-decline-14.png")); // NOI18N
        jLabel4.setText("Quantity:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 300, 75, 17);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Downloads\\money-bag.png")); // NOI18N
        jLabel5.setText("Amount:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 350, 80, 17);

        jTextField1.setBackground(new java.awt.Color(52, 135, 255));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(170, 140, 163, 28);

        jTextField2.setBackground(new java.awt.Color(52, 135, 255));
        jTextField2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(170, 190, 163, 28);

        jTextField3.setBackground(new java.awt.Color(52, 135, 255));
        jTextField3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(170, 240, 163, 28);

        jTextField4.setBackground(new java.awt.Color(52, 135, 255));
        getContentPane().add(jTextField4);
        jTextField4.setBounds(170, 290, 163, 28);

        jTextField5.setBackground(new java.awt.Color(52, 135, 255));
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(170, 340, 163, 28);

        jButton1.setBackground(new java.awt.Color(52, 135, 255));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Downloads\\save-icon-silhouette.png")); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 420, 84, 31);

        jButton2.setBackground(new java.awt.Color(52, 135, 255));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Downloads\\cart.png")); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(130, 420, 83, 31);

        jButton3.setBackground(new java.awt.Color(52, 135, 255));
        jButton3.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon("E:\\icon\\magnifying-glass.png")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(340, 140, 50, 28);

        jDateChooser1.setBackground(new java.awt.Color(52, 135, 255));
        jDateChooser1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(60, 20, 163, 28);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Date:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(18, 22, 40, 23);

        jButton4.setBackground(new java.awt.Color(52, 135, 255));
        jButton4.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Downloads\\new-products-label (1).png")); // NOI18N
        jButton4.setText("Add  Product");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(250, 20, 140, 30);

        jButton5.setBackground(new java.awt.Color(52, 135, 255));
        jButton5.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon("E:\\icon\\magnifying-glass.png")); // NOI18N
        jButton5.setText("Search Sell  ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(250, 60, 140, 30);

        setSize(new java.awt.Dimension(430, 522));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String sql ="insert into sell_entry(P_ID, P_Name, Price, Quantity, Amount,Date)value(?,?,?,?,?,?)";
      try{
      pst=cn.prepareStatement(sql);
      pst.setString(1, jTextField1.getText());
      pst.setString(2, jTextField2.getText());
      pst.setString(3, jTextField3.getText());
      pst.setString(4, jTextField4.getText());
      pst.setString(5, jTextField5.getText());
      pst.setString(6,((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());
      pst.execute();
      JOptionPane.showMessageDialog(null, "Sell Data Stored");
      
      }catch(Exception e){
      JOptionPane.showMessageDialog(null, e);
      }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String s1 = jTextField1.getText();
        String sql = "select * from entry_product where P_ID='"+s1+"'";
        try{
            pst= cn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
            jTextField2.setText(rs.getString(2));
            jTextField3.setText(rs.getString(3));
            rs.close();
            pst.close();
            }
            else{
            JOptionPane.showMessageDialog(null, "No match found");
            }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        int a1 = Integer.parseInt(jTextField3.getText());
        int a2 = Integer.parseInt(jTextField4.getText());
        int a3 = a1*a2;
        String m = String.valueOf(a3);
        
        jTextField5.setText(m);
        
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setVisible(false);
        Entry_Product e = new Entry_Product();
        e.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       jTextField1.setText(null);
       jTextField2.setText(null);
       jTextField3.setText(null);
       jTextField4.setText(null);
       jTextField5.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        SearchBox s =new SearchBox();
        s.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Sell_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sell_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sell_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sell_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sell_Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
