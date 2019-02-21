/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abcbankpack.view;


import abcbankpack.controller.CustomersController;
import abcbankpack.controller.StaffController;
import abcbankpack.controller.TransactionsController;
import abcbankpack.entity.StaffDetails;
import abcbankpack.model.Customers;
import abcbankpack.model.Deposit;
import abcbankpack.model.MyIconImage;
import abcbankpack.model.Transactions;
import abcbankpack.model.Withdrawals;
import java.math.BigDecimal;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author NEWHORIZONS
 */
public class EntryForm extends javax.swing.JFrame {

    /**
     * Creates new form EntryForm
     */
    public EntryForm() {
        initComponents();
        
          MyIconImage mii = new MyIconImage(); 
          setIconImage(mii.getIconImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ABCBankPUEntityManager0 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ABCBankPU").createEntityManager();
        staffDetailsQuery = java.beans.Beans.isDesignTime() ? null : ABCBankPUEntityManager0.createQuery("SELECT s FROM StaffDetails s");
        staffDetailsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : staffDetailsQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        depAcctNoField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        depAntInWordsField = new javax.swing.JTextArea();
        depAmtField = new javax.swing.JTextField();
        depBtn = new javax.swing.JButton();
        depClearBtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        witAcctNoField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        witAmtInWordsField = new javax.swing.JTextArea();
        witAmtWitField = new javax.swing.JTextField();
        witWithdrawBtn = new javax.swing.JButton();
        witClearBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        accnoField = new javax.swing.JTextField();
        chkBtn = new javax.swing.JButton();
        chkClearBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        accNoLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        surnameLabel = new javax.swing.JLabel();
        balanceLabel = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        TacctNo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TtransType = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        tAmt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tAmtInWords = new javax.swing.JTextArea();
        tsumbtn = new javax.swing.JButton();
        tClearBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        surnameField = new javax.swing.JTextField();
        genderField = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        homeField = new javax.swing.JTextArea();
        phoneField = new javax.swing.JTextField();
        balanceField = new javax.swing.JTextField();
        officerField = new javax.swing.JTextField();
        regBtn = new javax.swing.JButton();
        regResetBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ABC Entry Form");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abcbankpack/imgFol/zoneTech2.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Account Number");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Amount in words");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Deposit Amount");

        depAcctNoField.setBackground(new java.awt.Color(255, 255, 204));
        depAcctNoField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        depAntInWordsField.setBackground(new java.awt.Color(255, 255, 204));
        depAntInWordsField.setColumns(20);
        depAntInWordsField.setRows(5);
        jScrollPane2.setViewportView(depAntInWordsField);

        depAmtField.setBackground(new java.awt.Color(255, 255, 204));
        depAmtField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        depBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        depBtn.setForeground(new java.awt.Color(255, 0, 51));
        depBtn.setText("Deposit");
        depBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depBtnActionPerformed(evt);
            }
        });

        depClearBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        depClearBtn.setForeground(new java.awt.Color(255, 0, 51));
        depClearBtn.setText("Clear");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18))
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(depBtn)
                        .addGap(18, 18, 18)
                        .addComponent(depClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(depAcctNoField)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                        .addComponent(depAmtField, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(depAcctNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(depAmtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depBtn)
                    .addComponent(depClearBtn))
                .addContainerGap(241, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Deposit", new javax.swing.ImageIcon(getClass().getResource("/abcbankpack/imgFol/card_front.png")), jPanel5); // NOI18N

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Account Number");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Amount in words");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Amount Withdrawn");

        witAcctNoField.setBackground(new java.awt.Color(255, 255, 204));
        witAcctNoField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        witAmtInWordsField.setBackground(new java.awt.Color(255, 255, 204));
        witAmtInWordsField.setColumns(20);
        witAmtInWordsField.setRows(5);
        jScrollPane3.setViewportView(witAmtInWordsField);

        witAmtWitField.setBackground(new java.awt.Color(255, 255, 204));
        witAmtWitField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        witWithdrawBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        witWithdrawBtn.setForeground(new java.awt.Color(204, 0, 51));
        witWithdrawBtn.setText("Withdraw");
        witWithdrawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                witWithdrawBtnActionPerformed(evt);
            }
        });

        witClearBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        witClearBtn.setForeground(new java.awt.Color(204, 0, 51));
        witClearBtn.setText("Clear");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(witAcctNoField)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(witWithdrawBtn)
                                .addGap(18, 18, 18)
                                .addComponent(witClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 78, Short.MAX_VALUE))
                            .addComponent(witAmtWitField))))
                .addContainerGap(243, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(witAcctNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(witAmtWitField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(61, 61, 61)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(witWithdrawBtn)
                    .addComponent(witClearBtn))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Withdrawls", new javax.swing.ImageIcon(getClass().getResource("/abcbankpack/imgFol/card_front.png")), jPanel6); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Account Number");

        accnoField.setBackground(new java.awt.Color(255, 255, 204));
        accnoField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        chkBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkBtn.setForeground(new java.awt.Color(204, 0, 51));
        chkBtn.setText("Check");
        chkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBtnActionPerformed(evt);
            }
        });

        chkClearBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkClearBtn.setForeground(new java.awt.Color(204, 0, 51));
        chkClearBtn.setText("Clear");
        chkClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkClearBtnActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Account Number");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Name");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Surname");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Balance");

        accNoLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        accNoLabel.setText("account Number");

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nameLabel.setText("Name");

        surnameLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        surnameLabel.setText("Surname");

        balanceLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        balanceLabel.setText("Balance");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10)
                        .addComponent(jLabel9)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(balanceLabel)
                    .addComponent(surnameLabel)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(chkBtn)
                        .addGap(18, 18, 18)
                        .addComponent(chkClearBtn))
                    .addComponent(accnoField, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accNoLabel)
                    .addComponent(nameLabel))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(accnoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkBtn)
                    .addComponent(chkClearBtn))
                .addGap(63, 63, 63)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(accNoLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(nameLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(surnameLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(balanceLabel))
                .addContainerGap(230, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Check Account Balance", new javax.swing.ImageIcon(getClass().getResource("/abcbankpack/imgFol/CARD TYPE.png")), jPanel4); // NOI18N

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Account number");

        TacctNo.setBackground(new java.awt.Color(255, 255, 153));
        TacctNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Transaction type");

        TtransType.setBackground(new java.awt.Color(255, 255, 153));
        TtransType.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TtransType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "Deposit", "Withdrawals" }));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Amount");

        tAmt.setBackground(new java.awt.Color(255, 255, 153));
        tAmt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Amount in words");

        tAmtInWords.setBackground(new java.awt.Color(255, 255, 153));
        tAmtInWords.setColumns(20);
        tAmtInWords.setRows(5);
        jScrollPane4.setViewportView(tAmtInWords);

        tsumbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tsumbtn.setForeground(new java.awt.Color(153, 0, 0));
        tsumbtn.setText("Sumbit");
        tsumbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsumbtnActionPerformed(evt);
            }
        });

        tClearBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tClearBtn.setForeground(new java.awt.Color(153, 0, 0));
        tClearBtn.setText("Clear");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(65, 65, 65)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(tsumbtn)
                        .addGap(18, 18, 18)
                        .addComponent(tClearBtn))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TacctNo)
                        .addComponent(TtransType, 0, 279, Short.MAX_VALUE)
                        .addComponent(tAmt))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(TacctNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(TtransType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tsumbtn)
                    .addComponent(tClearBtn))
                .addContainerGap(182, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Transactions", jPanel7);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Surname");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Gender");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Home Address");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Phone Number");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Opening Balance");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Account Officer");

        nameField.setBackground(new java.awt.Color(255, 255, 204));
        nameField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        surnameField.setBackground(new java.awt.Color(255, 255, 204));
        surnameField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        genderField.setBackground(new java.awt.Color(255, 255, 204));
        genderField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        genderField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        homeField.setBackground(new java.awt.Color(255, 255, 204));
        homeField.setColumns(20);
        homeField.setRows(5);
        jScrollPane1.setViewportView(homeField);

        phoneField.setBackground(new java.awt.Color(255, 255, 204));
        phoneField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        balanceField.setBackground(new java.awt.Color(255, 255, 204));
        balanceField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        officerField.setBackground(new java.awt.Color(255, 255, 204));
        officerField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        regBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        regBtn.setForeground(new java.awt.Color(255, 0, 51));
        regBtn.setText("Register");
        regBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regBtnActionPerformed(evt);
            }
        });

        regResetBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        regResetBtn.setForeground(new java.awt.Color(255, 0, 51));
        regResetBtn.setText("Reset");
        regResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regResetBtnActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new DefaultComboBoxModel(StaffController.getAllStaffId().toArray())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(regBtn)
                        .addGap(18, 18, 18)
                        .addComponent(regResetBtn))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(balanceField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(surnameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genderField, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(officerField))
                        .addGap(57, 57, 57)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(balanceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(officerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regBtn)
                    .addComponent(regResetBtn))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Register Customer", new javax.swing.ImageIcon(getClass().getResource("/abcbankpack/imgFol/disk.png")), jPanel3); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regBtnActionPerformed
    if(nameField.getText().isEmpty() || surnameField.getText().isEmpty()
       || homeField.getText().isEmpty() || phoneField.getText().isEmpty()
       || balanceField.getText().isEmpty())
    {
         JOptionPane.showMessageDialog(null,"Please enter all fields",
                "whenever",JOptionPane.WARNING_MESSAGE);
    }
    else if(!balanceField.getText().matches("\\d+"))
    {
        JOptionPane.showMessageDialog(null,"Balance must be digits",
                  "Invaid",JOptionPane.INFORMATION_MESSAGE);
    }
    else
    { 
       
      // Customers customer = new Customers();
       String selectedItem = (String)genderField.getSelectedItem();
       double newBal = Double.parseDouble(balanceField.getText());
       
       BigDecimal bd = BigDecimal.valueOf(newBal);
       
//       customer.setName(nameField.getText());
//       customer.setSurname(surnameField.getText());
//       customer.setGender(selectedItem);
//       customer.setHomeAddress(homeField.getText());
//       customer.setPhoneNumber(phoneField.getText());
//       customer.setBalance(newBal);
//       customer.setOfficerId(officerField.getText());
//       
//  boolean register = CustomersController.isRegister(customer);
//  
         StaffDetails st = (StaffDetails)jComboBox1.getSelectedItem();
       //StaffDetails staff = StaffController.findStaff(st.getStaffId());
       
      boolean register =  CustomersController.isRegister(nameField.getText(), surnameField.getText(), selectedItem, homeField.getText(), phoneField.getText(), bd, st);
        
        if(register)
        {
            JOptionPane.showMessageDialog(null, "Registration was successful!!", 
                        "Fine", JOptionPane.INFORMATION_MESSAGE);
            nameField.setText("");
            surnameField.setText("");
            homeField.setText(""); 
            phoneField.setText("");
            balanceField.setText(""); 
            officerField.setText("");
        }
         else
            {
                JOptionPane.showMessageDialog(null, "Something went wrong", 
                        "Failed", JOptionPane.ERROR_MESSAGE);
            }
    }      
    }//GEN-LAST:event_regBtnActionPerformed

    private void regResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regResetBtnActionPerformed
          
            nameField.setText("");
            surnameField.setText("");
            homeField.setText(""); 
            phoneField.setText("");
            balanceField.setText(""); 
            officerField.setText("");
    }//GEN-LAST:event_regResetBtnActionPerformed

    private void chkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBtnActionPerformed
     if(accnoField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please Enter an account No.");
        }
     
     else if(!accnoField.getText().matches("\\d+"))
        {
            JOptionPane.showMessageDialog(this,"Account Number must be in digit.");
        }
     
     else if(accnoField.getText().length() != 10)
        {
            JOptionPane.showMessageDialog(this,"Invalid account number");
        }
     else
     {
         int acctNo = Integer.parseInt(accnoField.getText());
         Customers customer = CustomersController.checkAccountBal(acctNo);
        
         if(customer == null)
         {
             JOptionPane.showMessageDialog(this,"Invalid account number");
         }
         else
         {
         accNoLabel.setText(String.valueOf(customer.getAccountNo()));
         nameLabel.setText(customer.getName());
         surnameLabel.setText(customer.getSurname());
         balanceLabel.setText(String.format("$%,.2f", customer.getBalance()));
         }
         
             
     }      
    }//GEN-LAST:event_chkBtnActionPerformed

    private void depBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depBtnActionPerformed
            
      if(depAcctNoField.getText().equals("") || depAmtField.getText().equals("") 
       || depAntInWordsField.getText().equals(""))
    {
         JOptionPane.showMessageDialog(null,"Please enter all fields",
                "whenever",JOptionPane.WARNING_MESSAGE);
    }
    else if(!depAcctNoField.getText().matches("\\d+"))
    {
        JOptionPane.showMessageDialog(null,"Account Number must be digits",
                  "Invaid",JOptionPane.INFORMATION_MESSAGE);
    }
    else if(!depAmtField.getText().matches("\\d+"))
    {
        JOptionPane.showMessageDialog(null,"Amount must be digits",
                  "Invaid",JOptionPane.INFORMATION_MESSAGE);
    }
    else if(depAcctNoField.getText().length() != 10)
        {
            JOptionPane.showMessageDialog(this,"Invalid account number");
        }
    else
    {
        Deposit deposit = new Deposit();
       int newAccountNo = Integer.parseInt(depAcctNoField.getText());
       double newAmtDep = Double.parseDouble(depAmtField.getText());
       
  boolean isDep = deposit.isDeposit(newAccountNo, newAmtDep, 
                                                depAntInWordsField.getText());
               
        
        if(isDep)
        {
            JOptionPane.showMessageDialog(null, "Deposit was successful!!", 
                        "Fine", JOptionPane.INFORMATION_MESSAGE);
            depAcctNoField.setText("");
            depAmtField.setText("");
            depAntInWordsField.setText(""); 
           
        }
         else
            {
                JOptionPane.showMessageDialog(null, "Something went wrong", 
                        "Failed", JOptionPane.ERROR_MESSAGE);
            }
    }
    }//GEN-LAST:event_depBtnActionPerformed

    private void witWithdrawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_witWithdrawBtnActionPerformed
        
        if(witAcctNoField.getText().equals("") || witAmtWitField.getText().equals("") 
       || witAmtInWordsField.getText().equals(""))
    {
         JOptionPane.showMessageDialog(null,"Please enter all fields",
                "whenever",JOptionPane.WARNING_MESSAGE);
    }
    else if(!witAcctNoField.getText().matches("\\d+"))
    {
        JOptionPane.showMessageDialog(null,"Account Number must be digits",
                  "Invaid",JOptionPane.INFORMATION_MESSAGE);
    }
    else if(!witAmtWitField.getText().matches("\\d+"))
    {
        JOptionPane.showMessageDialog(null,"Amount must be digits",
                  "Invaid",JOptionPane.INFORMATION_MESSAGE);
    }
    else if(witAcctNoField.getText().length() != 10)
        {
            JOptionPane.showMessageDialog(this,"Invalid account number");
        }
    else
    {
        Withdrawals withdrawals = new Withdrawals();
       int newAccountNo = Integer.parseInt(witAcctNoField.getText());
       double newAmtWit = Double.parseDouble(witAmtWitField.getText());
       
  boolean isWit = withdrawals.isWithdraw(newAccountNo, newAmtWit, witAmtInWordsField.getText());
               
        
        if(isWit)
        {
            JOptionPane.showMessageDialog(null, "Withdrawals was successful!!", 
                        "Fine", JOptionPane.INFORMATION_MESSAGE);
            witAcctNoField.setText("");
            witAmtWitField.setText("");
            witAmtInWordsField.setText(""); 
           
        }
         else
            {
                JOptionPane.showMessageDialog(null, "Something went wrong", 
                        "Failed", JOptionPane.ERROR_MESSAGE);
            }
    }
    }//GEN-LAST:event_witWithdrawBtnActionPerformed

    private void tsumbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsumbtnActionPerformed
        if(TacctNo.getText().equals("")|| tAmt.getText().equals("")||
                tAmtInWords.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter all fields",
            "whenever",JOptionPane.WARNING_MESSAGE);
        }
        else if(!TacctNo.getText().matches("\\d+") || !tAmt.getText().matches("\\d+"))
        {       
  JOptionPane.showMessageDialog(null,"Account Number or Amount must be in digit.");
        }
        else if(TacctNo.getText().length() != 10)
        {
            JOptionPane.showMessageDialog(null,"Invalid account number");
        }
        else
        {
            Transactions transactions = new Transactions();
            int transAccountNo = Integer.parseInt(TacctNo.getText());
            double transAmt  = Double.parseDouble(tAmt.getText());
            String selectedItem = (String)TtransType.getSelectedItem();
            
            transactions.setAccountNo(transAccountNo);
            transactions.setAmount(transAmt);
            transactions.setTransType(selectedItem);
            transactions.setAmtInWords(tAmtInWords.getText());
       
       boolean isTrans = TransactionsController.doTransaction(transactions);
               
            if(isTrans)
            {
                JOptionPane.showMessageDialog(null, "Transaction was successful!!", 
                            "Fine", JOptionPane.INFORMATION_MESSAGE);
                TacctNo.setText("");
                tAmt.setText("");
                tAmtInWords.setText("");          
            }
         else
            {
                JOptionPane.showMessageDialog(null, "Something went wrong", 
                        "Failed", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_tsumbtnActionPerformed

    private void chkClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkClearBtnActionPerformed
      nameLabel.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_chkClearBtnActionPerformed

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
            java.util.logging.Logger.getLogger(EntryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntryForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager ABCBankPUEntityManager0;
    private javax.swing.JTextField TacctNo;
    private javax.swing.JComboBox TtransType;
    private javax.swing.JLabel accNoLabel;
    private javax.swing.JTextField accnoField;
    private javax.swing.JTextField balanceField;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JButton chkBtn;
    private javax.swing.JButton chkClearBtn;
    private javax.swing.JTextField depAcctNoField;
    private javax.swing.JTextField depAmtField;
    private javax.swing.JTextArea depAntInWordsField;
    private javax.swing.JButton depBtn;
    private javax.swing.JButton depClearBtn;
    private javax.swing.JComboBox genderField;
    private javax.swing.JTextArea homeField;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField officerField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JButton regBtn;
    private javax.swing.JButton regResetBtn;
    private java.util.List<abcbankpack.entity.StaffDetails> staffDetailsList;
    private javax.persistence.Query staffDetailsQuery;
    private javax.swing.JTextField surnameField;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JTextField tAmt;
    private javax.swing.JTextArea tAmtInWords;
    private javax.swing.JButton tClearBtn;
    private javax.swing.JButton tsumbtn;
    private javax.swing.JTextField witAcctNoField;
    private javax.swing.JTextArea witAmtInWordsField;
    private javax.swing.JTextField witAmtWitField;
    private javax.swing.JButton witClearBtn;
    private javax.swing.JButton witWithdrawBtn;
    // End of variables declaration//GEN-END:variables
}
