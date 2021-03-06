
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author chandrimaghosh/Nishant Shetty
 */
public class PatientHomePageJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PatientHomePageJFrame
     */
    Patient patient=new Patient();
    public PatientHomePageJFrame(String puname) {
        initComponents();
         this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
        try{
        PreparedStatement p_Details =login.con.prepareStatement
            
        ("select Pname,Pid,Pemail ,Pconsults from Patient where Puname=?;");
            	  p_Details.setString(1, puname);
            	  ResultSet rs = p_Details.executeQuery();
            	   while(rs.next()){
                       patient.setPatient_name(rs.getString(1));
                       patient.setPatient_email(rs.getString(3));
                       patient.setPid(rs.getInt(2));
                       
                      }  
                   patientName.setText(patient.getPatient_name());
                   PatientId.setText(Integer.toString(patient.getPid()));
                   patientEmail.setText(patient.getPatient_email());
                   
                   
                   
     PreparedStatement doc_details = login.con.prepareStatement("select Dname,Did,Demail "
                                                               + "from Doctor,Patient "
                                                               + "where Doctor.Did=Patient.Pconsults "
                                                               + "and Puname=?;");
      Doctor d=new Doctor();
      doc_details.setString(1, puname);
      ResultSet rd = doc_details.executeQuery();
      while(rd.next())
      {
      d.setDoctorname(rd.getString(1));
      d.setDocID(rd.getInt(2));
      d.setDoctoremail(rd.getString(3));      
      }
                   
                  
                   dochesees.setText(d.getDoctorname());
                   jLabel6.setText(d.getDoctoremail());
                    }
          catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
                    
        
        
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
        PatientId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        patientName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        patientEmail = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dochesees = new javax.swing.JLabel();
        ViewProducts = new javax.swing.JButton();
        viewOrder = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id:");

        PatientId.setText("jLabel2");

        jLabel3.setText("Name:");

        patientName.setText("jLabel4");

        jLabel5.setText("Email:");

        patientEmail.setText("jLabel6");

        jLabel2.setText("Consulting:");

        dochesees.setText("jLabel4");

        ViewProducts.setText("View Products");
        ViewProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewProductsActionPerformed(evt);
            }
        });

        viewOrder.setText("View Order");
        viewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderActionPerformed(evt);
            }
        });

        jLabel4.setText("Doctor Email:");

        jLabel6.setText("jLabel6");

        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientEmail)
                            .addComponent(patientName)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PatientId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 486, Short.MAX_VALUE)
                                .addComponent(Logout))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ViewProducts)
                                .addGap(55, 55, 55)
                                .addComponent(viewOrder))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(dochesees))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)))))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(PatientId)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Logout)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(patientName))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(patientEmail))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dochesees))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewProducts)
                    .addComponent(viewOrder))
                .addContainerGap(237, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderActionPerformed
       
        
           DoctorOrderManagerJframe view_cancel_order=new DoctorOrderManagerJframe(patient.getPid(),"Patient");
    view_cancel_order.setVisible(true);
    }//GEN-LAST:event_viewOrderActionPerformed

    private void ViewProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewProductsActionPerformed
     PlaceOrderJFrame pojf=new PlaceOrderJFrame(patient.getPid(),"Patient");
        pojf.setVisible(true);
    }//GEN-LAST:event_ViewProductsActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
     this.setVisible(false);
         try {
             login.con.close();
         } catch (SQLException ex) {
             Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_LogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Logout;
    private javax.swing.JLabel PatientId;
    private javax.swing.JButton ViewProducts;
    private javax.swing.JLabel dochesees;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel patientEmail;
    private javax.swing.JLabel patientName;
    private javax.swing.JButton viewOrder;
    // End of variables declaration//GEN-END:variables
}
