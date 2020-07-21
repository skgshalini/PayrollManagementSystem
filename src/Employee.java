
import java.io.FileNotFoundException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prerna sharma
 */
public class Employee extends javax.swing.JFrame {

    /**
     * Creates new form Employee
     */
   // public static String eid,name;
      String basic,hra1,da1,ca,perks,pf,emp_name,b,d,category,religion,acc_num,m_qual,f_qual,s_qual,dept,dob,gender,nation,jdate,rdate,mobile,email,cadd,fnm,mnm,spouse,child,qual,ada,pan,padd;
      int count=0;
    public Employee() {
        initComponents();
        
        cmbmonth.setVisible(false);
        txtemp_id.setText(project.eid);
         //txtemp_name.setText(project.name);
         
        
         d="";
         b="";
           try
         {
             
            conn c1 = new conn();
            ResultSet rs = c1.s.executeQuery("select * from update_employee where id='"+(String)txtemp_id.getText()+"'");
            
            if(rs.next()){
               //txtemp_name.setText();
              // txtemp_name.setText(project.name);
             //txtdesig.setText(rs.getString("desg"));
             // txtbranch.setText(rs.getString("branch"));
                
                emp_name=rs.getString("name");
            d=rs.getString("desg");
              b=rs.getString("branch");
              category=rs.getString("category");
              religion=rs.getString("religion");
              acc_num=rs.getString("acc_num");
               m_qual=rs.getString("m_qualification");
               f_qual=rs.getString("f_qualification");
               s_qual=rs.getString("s_qualification");
               dept=rs.getString("department");
               dob=rs.getString("dob");
               gender=rs.getString("gender");
               nation=rs.getString("nationality");
               jdate=rs.getString("jdate");
               rdate=rs.getString("rdate");
               mobile=rs.getString("mobile");
               email=rs.getString("email");
               cadd=rs.getString("caddress");
               fnm=rs.getString("fname");
               mnm=rs.getString("mname");
               spouse=rs.getString("spouse");
               child=rs.getString("children");
               qual=rs.getString("qualification");
               ada=rs.getString("adahr");
               pan=rs.getString("pan");
               padd=rs.getString("paddress");
               
            }
              rs = c1.s.executeQuery("select * from update_salary where desg='"+d+"' and branch='"+b+"'" );
             
              if(rs.next()){
                 basic=rs.getString("bs");
                 da1=(rs.getString("da"));
               perks=(rs.getString("perks"));
              // txtbasic.setText(rs.getString("bs"));
                pf=(rs.getString("pf"));
                 String xx=b;
                
                if(xx.equals("Bengaluru")||xx.equals("New Delhi")||xx.equals("Kolkata")||xx.equals("Mumbai"))
                hra1=(rs.getString("mhra"));
                else if(xx.equals("Lucknow")||xx.equals("Patna")||xx.equals("Raipur")||xx.equals("Ranchi"))
                hra1=(rs.getString("chra"));
                 else
                 hra1=(rs.getString("rhra"));   
             
               
            }
             
             
             
        }catch(Exception ee){
           ee.printStackTrace();
        }
          
           txtemp_name.setText(emp_name);
          // JOptionPane.showMessageDialog(this, hra);
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtemp_name = new javax.swing.JTextField();
        txtemp_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblpayslip_monthly = new javax.swing.JLabel();
        lblpayslip_yearly = new javax.swing.JLabel();
        lbltax = new javax.swing.JLabel();
        lblsavings = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cmbmonth = new javax.swing.JComboBox<String>();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblpersonal = new javax.swing.JLabel();
        lblfamily = new javax.swing.JLabel();
        lblofficial = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1300, 700));

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NAME    :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INSPIRATION NATIONAL BANK");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Inspiration is Respiration");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("EMP_ID :");

        txtemp_name.setBackground(new java.awt.Color(0, 0, 204));
        txtemp_name.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtemp_name.setForeground(new java.awt.Color(255, 255, 255));
        txtemp_name.setBorder(null);

        txtemp_id.setBackground(new java.awt.Color(0, 0, 204));
        txtemp_id.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtemp_id.setForeground(new java.awt.Color(255, 255, 255));
        txtemp_id.setBorder(null);
        txtemp_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemp_idActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user_icon_new.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtemp_name)
                    .addComponent(txtemp_id, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                .addGap(94, 94, 94)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtemp_name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtemp_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setForeground(new java.awt.Color(102, 102, 102));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MY STATEMENTS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(450, 450, 450))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        lblpayslip_monthly.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpayslip_monthly.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pdf.png"))); // NOI18N
        lblpayslip_monthly.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblpayslip_monthlyMouseClicked(evt);
            }
        });

        lblpayslip_yearly.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpayslip_yearly.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pdf.png"))); // NOI18N
        lblpayslip_yearly.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblpayslip_yearlyMouseClicked(evt);
            }
        });

        lbltax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/TAX.png"))); // NOI18N
        lbltax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbltaxMouseClicked(evt);
            }
        });

        lblsavings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsavings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/savings.png"))); // NOI18N
        lblsavings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsavingsMouseClicked(evt);
            }
        });

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("MOTHLY PAY SLIP");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("YEARLY PAY SLIP");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("TAX STATEMENT");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("SAVINGS SO FAR");

        cmbmonth.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cmbmonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECT MONTH", "Jan", "Feb", "Mar", "Aprl", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", " " }));
        cmbmonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbmonthActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblpayslip_monthly, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblpayslip_yearly, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(218, 218, 218))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(192, 192, 192)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(186, 186, 186)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblsavings, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltax, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblsavings, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblpayslip_monthly)
                            .addComponent(lblpayslip_yearly))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(jLabel17)
                        .addComponent(jLabel16)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MY PROFILE");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(442, 442, 442))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lblpersonal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/women-icon-22.jpg"))); // NOI18N
        lblpersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblpersonalMouseClicked(evt);
            }
        });

        lblfamily.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblfamily.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/family.jpg"))); // NOI18N
        lblfamily.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblfamilyMouseClicked(evt);
            }
        });

        lblofficial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblofficial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/money-icon-transparent-15.png"))); // NOI18N
        lblofficial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblofficialMouseClicked(evt);
            }
        });

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("PERSONAL DETAILS");

        jLabel20.setText("FAMILY DETAILS");

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("OFFICIAL DETAILS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblpersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lblfamily, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(300, 300, 300)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblofficial, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblpersonal)
                            .addComponent(lblfamily, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblofficial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void cmbmonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbmonthActionPerformed

    private void lblpayslip_monthlyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpayslip_monthlyMouseClicked
        // TODO add your handling code here:
          cmbmonth.setVisible(true);
          String path = "C:\\Users\\shalu\\Documents\\NetBeansProjects\\payroll_system\\pay_slip_emp"+project.eid+"_"+cmbmonth.getSelectedItem();

        if(cmbmonth.getSelectedIndex()==0)
        {
            JOptionPane.showMessageDialog(Employee.this,"Please select any month");
            return;
        }
        else
        {
            try{
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+path);
                }catch(Exception e)
                {
                    JOptionPane.showMessageDialog(Employee.this,"Pay slip of "+(String)cmbmonth.getSelectedItem()+" has not been generated");
                }
        } 
    }//GEN-LAST:event_lblpayslip_monthlyMouseClicked

    private void lbltaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltaxMouseClicked
        // TODO add your handling code here:
       
                try{
            conn c1 = new conn();
            ResultSet rs = c1.s.executeQuery("select * from emp_salary where id='"+project.eid+"' ");
            
            while(rs.next()){
                count++; 
            }
            count++;
        }catch(Exception ee){
           ee.printStackTrace();
        }
       Double gross=0.0,inc_tax,temp,hra,da;
       hra=Double.parseDouble(hra1);
       da=Double.parseDouble(da1);
       inc_tax=0.0;
       gross=Double.parseDouble(basic)+hra+da+Double.parseDouble(perks);
     temp=gross*12;
    if(temp>500000)
        {
        
        if(temp-1000000>=0)
        {
            inc_tax= 100000.0;
            if(temp-1000000>0)
            {
                inc_tax+=100000+((temp-1000000)/3);
            }
        }
        else
        inc_tax=(temp-500000)/5;
        }
     inc_tax=inc_tax*count;
        JOptionPane.showMessageDialog(this,"THE INCOME TAX DEDUCTED SO FAR IS = "+inc_tax);
    }//GEN-LAST:event_lbltaxMouseClicked

    private void lblpayslip_yearlyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpayslip_yearlyMouseClicked
        // TODO add your handling code here:
        
       String path= "C:\\Users\\shalu\\Documents\\NetBeansProjects\\payroll_system\\pay_slip_emp_yearly"+project.eid+"_"+cmbmonth.getSelectedItem();
         try{
            conn c1 = new conn();
            ResultSet rs = c1.s.executeQuery("select * from emp_salary where id='"+project.eid+"' ");
            
            while(rs.next()){
                count++; 
            }
            count++;
        }catch(Exception ee){
           ee.printStackTrace();
        }
        if(count>=12)
        {
             try{
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+path);
                }catch(Exception e)
                {
                    JOptionPane.showMessageDialog(Employee.this,"Yearly Pay slip of "+(String)cmbmonth.getSelectedItem()+" has not been generated yet");
                }
        
        }
        else
            System.out.println("YEARLY SLIP HAS NOT BEEN GENERATED YET\n");
           
    }//GEN-LAST:event_lblpayslip_yearlyMouseClicked

    private void txtemp_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemp_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemp_idActionPerformed

    private void lblsavingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsavingsMouseClicked
        // TODO add your handling code here:
         try{
            conn c1 = new conn();
            ResultSet rs = c1.s.executeQuery("select * from emp_salary where id='"+project.eid+"' ");
            
            while(rs.next()){
                count++; 
            }
            count++;
        }catch(Exception ee){
           ee.printStackTrace();
        }
        Double savings= 100*Double.parseDouble(pf);
        savings= savings*count*Double.parseDouble(basic);
        JOptionPane.showMessageDialog(this,"TOTAL SAVINGS SO FAR ="+pf);
    }//GEN-LAST:event_lblsavingsMouseClicked

    private void lblpersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpersonalMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        System.out.println("NAME="+emp_name);
        System.out.println("CATEGORY="+category);
        System.out.println("RELIGION="+religion);
        System.out.println("ACCOUNT NUMBER="+acc_num);
       
        System.out.println("D.O.B="+dob);
        System.out.println("GENDER="+gender);
        System.out.println("NATIONALITY="+nation);
       
                System.out.println("MOBILE NUMBER="+mobile);
                System.out.println("EMAIL="+email);
                        System.out.println("CURRENT ADDRESS="+cadd);
                        System.out.println("QUALIFICATION="+qual);
                        System.out.println("ADHAR="+ada);
                        System.out.println("PAN="+pan);
                        System.out.println("PERMANENT ADDRESS="+padd);
                        
                        
        
    }//GEN-LAST:event_lblpersonalMouseClicked

    private void lblfamilyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfamilyMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        System.out.println("MOTHER'S NAME="+mnm);
        System.out.println("FATHER'S NAME="+fnm);
        System.out.println("SPOUSE="+spouse);
        System.out.println("NO. OF CHILDREN="+child);
        System.out.println("MOTHER'S QUALIFICATION="+m_qual);
        System.out.println("FATHER'S QUALIFICATION="+f_qual);
        System.out.println("SPOUSE'S QUALIFICATION="+s_qual);
        
    }//GEN-LAST:event_lblfamilyMouseClicked

    private void lblofficialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblofficialMouseClicked
        // TODO add your handling code here:
         this.setVisible(false);
         System.out.println("BRANCH="+b);
        System.out.println("DEPARTMENT="+dept);
        System.out.println("DESIGNATION="+d);
         System.out.println("JOINING DATE="+jdate);
          System.out.println("RETIREMENT DATE="+rdate);
    }//GEN-LAST:event_lblofficialMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbmonth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblfamily;
    private javax.swing.JLabel lblofficial;
    private javax.swing.JLabel lblpayslip_monthly;
    private javax.swing.JLabel lblpayslip_yearly;
    private javax.swing.JLabel lblpersonal;
    private javax.swing.JLabel lblsavings;
    private javax.swing.JLabel lbltax;
    private javax.swing.JTextField txtemp_id;
    private javax.swing.JTextField txtemp_name;
    // End of variables declaration//GEN-END:variables
}
