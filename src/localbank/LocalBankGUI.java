/**Harman Singh and Ammar Akhtar
 * Ch 9, Review Exercise - LocalBank 
 * June 14, 2015
 *
 *  This is a bank application that stores the bank account information of different customers.
 *  Using a graphical user interface, this application can open new accounts, modify existing 
 *  accounts, and close accounts. Each account has a unique account ID which is required 
 *  for all transactions. Transactions include withdrawals and deposits. 
 */
package localbank;

public class LocalBankGUI extends javax.swing.JFrame {

    Bank easySave = new Bank(); 
    
     /**
     * Initializes the graphical user interface
     * pre: none 
     * post: The graphical user interface is initialized
     */
    public LocalBankGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Info = new javax.swing.JPanel();
        lblPromptInfoID = new javax.swing.JLabel();
        txtInfoAcntID = new javax.swing.JTextField();
        btnInfoEnter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();
        DepOrWith = new javax.swing.JPanel();
        btnDepOrWithEnter = new javax.swing.JButton();
        btnDepoOrWithClear = new javax.swing.JButton();
        radDepo = new javax.swing.JRadioButton();
        radWith = new javax.swing.JRadioButton();
        lblDepoOrWithActPrompt = new javax.swing.JLabel();
        txtDepOrWithActID = new javax.swing.JTextField();
        txtDepoOrWithAmount = new javax.swing.JTextField();
        lblDepoOrWithAmtPrompt = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtInfoDepoOrWith = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        lblModActIDPrompt = new javax.swing.JLabel();
        txtAcntIDModAcnt = new javax.swing.JTextField();
        btnEnterModAcnt = new javax.swing.JButton();
        lblModInfoPrompt = new javax.swing.JLabel();
        lblModActIDStreet = new javax.swing.JLabel();
        lblModActIDCity = new javax.swing.JLabel();
        lblModActIDState = new javax.swing.JLabel();
        lblModActIDPZip = new javax.swing.JLabel();
        txtNewStreet = new javax.swing.JTextField();
        txtNewCity = new javax.swing.JTextField();
        txtNewState = new javax.swing.JTextField();
        txtNewZipCode = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtModAct = new javax.swing.JTextArea();
        btnClearModAct = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnEnterNewAcnt = new javax.swing.JButton();
        lblNewActPromptWelcom = new javax.swing.JLabel();
        lblNewActPromptFN = new javax.swing.JLabel();
        lblNewActPromptLN = new javax.swing.JLabel();
        lblNewActPromptStreet = new javax.swing.JLabel();
        lblNewActPromptCity = new javax.swing.JLabel();
        lblNewActPromptState = new javax.swing.JLabel();
        lblNewActPromptZip = new javax.swing.JLabel();
        txtFN = new javax.swing.JTextField();
        txtLN = new javax.swing.JTextField();
        txtStreet = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        lblNewActPromptInitDepo = new javax.swing.JLabel();
        txtInitBal = new javax.swing.JTextField();
        btnClearNewAcnt = new javax.swing.JButton();
        lblAcntIDGive = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnDeleteEnter = new javax.swing.JButton();
        lblPromptDeleteID = new javax.swing.JLabel();
        txtAcntIDDelete = new javax.swing.JTextField();
        lblDelete = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPromptInfoID.setText("Please Type Your Account ID:");

        btnInfoEnter.setText("Enter");
        btnInfoEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoEnterActionPerformed(evt);
            }
        });

        txtInfo.setColumns(20);
        txtInfo.setRows(5);
        jScrollPane1.setViewportView(txtInfo);

        javax.swing.GroupLayout InfoLayout = new javax.swing.GroupLayout(Info);
        Info.setLayout(InfoLayout);
        InfoLayout.setHorizontalGroup(
            InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InfoLayout.createSequentialGroup()
                        .addComponent(btnInfoEnter)
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InfoLayout.createSequentialGroup()
                        .addComponent(lblPromptInfoID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInfoAcntID, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        InfoLayout.setVerticalGroup(
            InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InfoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPromptInfoID)
                    .addComponent(txtInfoAcntID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInfoEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(243, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Information", Info);

        btnDepOrWithEnter.setText("Enter");
        btnDepOrWithEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepOrWithEnterActionPerformed(evt);
            }
        });

        btnDepoOrWithClear.setText("Clear");
        btnDepoOrWithClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepoOrWithClearActionPerformed(evt);
            }
        });

        radDepo.setSelected(true);
        radDepo.setText("Deposit");
        radDepo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radDepoActionPerformed(evt);
            }
        });

        radWith.setText("Withdraw");
        radWith.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radWithActionPerformed(evt);
            }
        });

        lblDepoOrWithActPrompt.setText("Please type your account ID:");

        lblDepoOrWithAmtPrompt.setText("Amount:");

        txtInfoDepoOrWith.setColumns(20);
        txtInfoDepoOrWith.setRows(5);
        jScrollPane3.setViewportView(txtInfoDepoOrWith);

        javax.swing.GroupLayout DepOrWithLayout = new javax.swing.GroupLayout(DepOrWith);
        DepOrWith.setLayout(DepOrWithLayout);
        DepOrWithLayout.setHorizontalGroup(
            DepOrWithLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepOrWithLayout.createSequentialGroup()
                .addGroup(DepOrWithLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DepOrWithLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(DepOrWithLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DepOrWithLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(DepOrWithLayout.createSequentialGroup()
                                    .addGap(108, 108, 108)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(DepOrWithLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(DepOrWithLayout.createSequentialGroup()
                                        .addComponent(lblDepoOrWithAmtPrompt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDepoOrWithAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(DepOrWithLayout.createSequentialGroup()
                                        .addComponent(lblDepoOrWithActPrompt)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDepOrWithActID, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(DepOrWithLayout.createSequentialGroup()
                                .addGroup(DepOrWithLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radWith)
                                    .addComponent(radDepo))
                                .addGap(230, 230, 230))))
                    .addGroup(DepOrWithLayout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addGroup(DepOrWithLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDepOrWithEnter)
                            .addComponent(btnDepoOrWithClear))))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        DepOrWithLayout.setVerticalGroup(
            DepOrWithLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DepOrWithLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(radDepo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radWith)
                .addGap(27, 27, 27)
                .addGroup(DepOrWithLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepoOrWithActPrompt)
                    .addComponent(txtDepOrWithActID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DepOrWithLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDepoOrWithAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDepoOrWithAmtPrompt))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnDepOrWithEnter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDepoOrWithClear)
                .addGap(36, 36, 36))
        );

        jTabbedPane1.addTab("Deposit/Withdraw", DepOrWith);

        lblModActIDPrompt.setText("Please type your Account ID: ");

        btnEnterModAcnt.setText("Enter");
        btnEnterModAcnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterModAcntActionPerformed(evt);
            }
        });

        lblModInfoPrompt.setText("Please type the new street, city, state, and zip code:");

        lblModActIDStreet.setText("Street:");

        lblModActIDCity.setText("City:");

        lblModActIDState.setText("State:");

        lblModActIDPZip.setText("Zip Code:");

        txtModAct.setColumns(20);
        txtModAct.setRows(5);
        jScrollPane2.setViewportView(txtModAct);

        btnClearModAct.setText("Clear");
        btnClearModAct.setFocusable(false);
        btnClearModAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearModActActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblModActIDPrompt)
                        .addGap(18, 18, 18)
                        .addComponent(txtAcntIDModAcnt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(lblModInfoPrompt)))
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblModActIDState)
                    .addComponent(lblModActIDCity)
                    .addComponent(lblModActIDPZip)
                    .addComponent(lblModActIDStreet))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNewZipCode, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(txtNewState)
                    .addComponent(txtNewCity)
                    .addComponent(txtNewStreet))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnClearModAct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEnterModAcnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModActIDPrompt)
                            .addComponent(txtAcntIDModAcnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(lblModInfoPrompt)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModActIDStreet)
                            .addComponent(txtNewStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModActIDCity)
                            .addComponent(txtNewCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModActIDState)
                            .addComponent(txtNewState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModActIDPZip)
                    .addComponent(txtNewZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(btnEnterModAcnt)
                .addGap(13, 13, 13)
                .addComponent(btnClearModAct)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Modify Account", jPanel4);

        btnEnterNewAcnt.setText("Enter");
        btnEnterNewAcnt.setFocusable(false);
        btnEnterNewAcnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterNewAcntActionPerformed(evt);
            }
        });

        lblNewActPromptWelcom.setText("Welcome! Create a new Account here.");

        lblNewActPromptFN.setText("First Name: ");

        lblNewActPromptLN.setText("Last Name:");

        lblNewActPromptStreet.setText("Street: ");

        lblNewActPromptCity.setText("City: ");

        lblNewActPromptState.setText("State: ");

        lblNewActPromptZip.setText("Zip Code:");

        lblNewActPromptInitDepo.setText("Initial Deposit: ");

        btnClearNewAcnt.setText("Clear");
        btnClearNewAcnt.setFocusable(false);
        btnClearNewAcnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearNewAcntActionPerformed(evt);
            }
        });

        lblAcntIDGive.setText(".");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNewActPromptFN)
                            .addComponent(lblNewActPromptStreet)
                            .addComponent(lblNewActPromptCity)
                            .addComponent(lblNewActPromptState)
                            .addComponent(lblNewActPromptInitDepo)
                            .addComponent(lblNewActPromptLN)
                            .addComponent(lblNewActPromptZip))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNewActPromptWelcom, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtZipCode, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(txtState, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCity, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStreet)
                                    .addComponent(txtInitBal))
                                .addGap(74, 74, 74)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEnterNewAcnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnClearNewAcnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtLN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                .addComponent(txtFN, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblAcntIDGive, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNewActPromptWelcom)
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewActPromptFN)
                    .addComponent(txtFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewActPromptLN)
                    .addComponent(txtLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNewActPromptStreet)
                            .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNewActPromptCity)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnEnterNewAcnt)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNewActPromptState)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNewActPromptZip)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnClearNewAcnt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNewActPromptInitDepo)
                    .addComponent(txtInitBal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(lblAcntIDGive)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Create New Account", jPanel5);

        btnDeleteEnter.setText("Enter");
        btnDeleteEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEnterActionPerformed(evt);
            }
        });

        lblPromptDeleteID.setText("Please type your Account ID:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnDeleteEnter)
                        .addGap(27, 27, 27)
                        .addComponent(lblDelete))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblPromptDeleteID)
                        .addGap(18, 18, 18)
                        .addComponent(txtAcntIDDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(270, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPromptDeleteID)
                    .addComponent(txtAcntIDDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnDeleteEnter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDelete)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Delete Account", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     /**
     * Deletes a bank account given its account ID
     * pre: The enter button in the Delete panel was clicked
     * post: The account corresponding to the account ID is deleted
     */
    private void btnDeleteEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEnterActionPerformed
        String acctID = txtAcntIDDelete.getText();
        easySave.deleteAccount(acctID, lblDelete);
    }//GEN-LAST:event_btnDeleteEnterActionPerformed

     /**
     * Clears typed information from graphical user interface on Create New Account panel
     * pre: The clear button on the Create New Account panel was clicked
     * post: The typed information from graphical user interface on Create New Account panel is cleared
     */
    private void btnClearNewAcntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearNewAcntActionPerformed
        txtFN.setText("");
        txtLN.setText("");
        txtStreet.setText("");
        txtCity.setText("");
        txtState.setText("");
        txtZipCode.setText("");
        txtInitBal.setText("");
        lblAcntIDGive.setText("");
    }//GEN-LAST:event_btnClearNewAcntActionPerformed

    /**
     * Creates a bank account and gives account ID
     * pre: User fills in their name, initial deposit, and other address details 
     * and clicks enter on Create New Account panel
     * post: An account for the user is created and their Account ID is given 
     */
    private void btnEnterNewAcntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterNewAcntActionPerformed
        boolean parsable = true;
        Double initialBal;
        try {
            initialBal = Double.parseDouble(txtInitBal.getText());
        } catch (NumberFormatException e) {
            parsable = false;
            lblAcntIDGive.setText("Incorrect Input");
        }
        if (parsable = true) {
            initialBal = Double.parseDouble(txtInitBal.getText());
            String firstName = txtFN.getText();
            String lastName = txtLN.getText();
            String street = txtStreet.getText();
            String city = txtCity.getText();
            String state = txtState.getText();
            String zip = txtZipCode.getText();
            easySave.addAccount(initialBal, firstName, lastName, street, city, state, zip, lblAcntIDGive);
        }
    }//GEN-LAST:event_btnEnterNewAcntActionPerformed
    
    /**
     * Clears typed information from graphical user interface on Modify account panel
     * pre: The clear button on the Modify Account panel was clicked
     * post: The typed information from graphical user interface on Modify Account panel is cleared
     */
    private void btnClearModActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearModActActionPerformed
        txtAcntIDModAcnt.setText("");
        txtNewStreet.setText("");
        txtNewCity.setText("");
        txtNewState.setText("");
        txtNewZipCode.setText("");
        txtModAct.setText("");
    }//GEN-LAST:event_btnClearModActActionPerformed

    /**
     * Modifies address of an account
     * pre: User fills in details for new address and their account ID and clicks 
     * enter button on modify account panel
     * post: The user's account address is modified
     */
    private void btnEnterModAcntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterModAcntActionPerformed
        String acctID = txtAcntIDModAcnt.getText();
        String street = txtNewStreet.getText();
        String city = txtNewCity.getText();
        String state = txtNewState.getText();
        String zip = txtNewZipCode.getText();
        easySave.modifyAccount(acctID, street, city, state, zip, txtModAct);
    }//GEN-LAST:event_btnEnterModAcntActionPerformed

    /**
     * Returns information for an account in the bank
     * pre: User types in account ID and clicks enter button on Information panel
     * post: The user's account details are returned
     */
    private void btnInfoEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoEnterActionPerformed
        String acctID = txtInfoAcntID.getText();
        easySave.checkBalance(acctID, txtInfo);
    }//GEN-LAST:event_btnInfoEnterActionPerformed

    /**
     * When deposit radio button is clicked on Deposit/Withdraw panel, the withdraw radio button is unselected
     * pre: Deposit radio button is clicked
     * post: The deposit radio button is selected. Only one radio button is selected at one time. 
     */
    private void radDepoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radDepoActionPerformed
        radWith.setSelected(false);
        if (radDepo.isSelected() == false) {
            radDepo.setSelected(true);
        }
    }//GEN-LAST:event_radDepoActionPerformed
    
    /**
     * When withdraw radio button is clicked on Deposit/Withdraw panel, the deposit radio button is unselected
     * pre: Withdraw radio button is clicked
     * post: The withdraw radio button is selected. Only one radio button is selected at one time. 
     */
    private void radWithActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radWithActionPerformed
        radDepo.setSelected(false);
        if (radWith.isSelected() == false) {
            radWith.setSelected(true);
        }
    }//GEN-LAST:event_radWithActionPerformed

    /**
     * Deposits or withdraw money in one of the accounts
     * pre: One of withdraw or deposit radio buttons is selected.
     * AccountID and amount of money to add or take out is inputted. The enter button
     * in the Deposit/Withdraw panel panel is clicked
     * post: Money is deposited or withdrawn from one of the accounts 
     */
    private void btnDepOrWithEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepOrWithEnterActionPerformed
        double amt;
        String acctID = txtDepOrWithActID.getText();;
        Boolean parsable = true;
        try {
            amt = Double.parseDouble(txtDepoOrWithAmount.getText());
        } catch (NumberFormatException e) {
            parsable = false;
            txtInfoDepoOrWith.setText("Incorrect Input");
        }
        if (parsable = true) {
            amt = Double.parseDouble(txtDepoOrWithAmount.getText());
            if (radDepo.isSelected() == true) {
                easySave.transaction(1, acctID, amt, txtInfoDepoOrWith);
            } else if (radWith.isSelected() == true) {
                easySave.transaction(2, acctID, amt, txtInfoDepoOrWith);
            }
        }
    }//GEN-LAST:event_btnDepOrWithEnterActionPerformed

    /**
     * Clears information from graphical user interface on withdraw or deposit panel
     * pre: The clear button on the withdraw or deposit panel was clicked
     * post: The information from graphical user interface on withdraw or deposit panel is cleared
     */
    private void btnDepoOrWithClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepoOrWithClearActionPerformed
        txtInfoDepoOrWith.setText("");
        txtDepoOrWithAmount.setText("");
        txtDepOrWithActID.setText("");
    }//GEN-LAST:event_btnDepoOrWithClearActionPerformed
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LocalBankGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DepOrWith;
    private javax.swing.JPanel Info;
    private javax.swing.JButton btnClearModAct;
    private javax.swing.JButton btnClearNewAcnt;
    private javax.swing.JButton btnDeleteEnter;
    private javax.swing.JButton btnDepOrWithEnter;
    private javax.swing.JButton btnDepoOrWithClear;
    private javax.swing.JButton btnEnterModAcnt;
    private javax.swing.JButton btnEnterNewAcnt;
    private javax.swing.JButton btnInfoEnter;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAcntIDGive;
    private javax.swing.JLabel lblDelete;
    private javax.swing.JLabel lblDepoOrWithActPrompt;
    private javax.swing.JLabel lblDepoOrWithAmtPrompt;
    private javax.swing.JLabel lblModActIDCity;
    private javax.swing.JLabel lblModActIDPZip;
    private javax.swing.JLabel lblModActIDPrompt;
    private javax.swing.JLabel lblModActIDState;
    private javax.swing.JLabel lblModActIDStreet;
    private javax.swing.JLabel lblModInfoPrompt;
    private javax.swing.JLabel lblNewActPromptCity;
    private javax.swing.JLabel lblNewActPromptFN;
    private javax.swing.JLabel lblNewActPromptInitDepo;
    private javax.swing.JLabel lblNewActPromptLN;
    private javax.swing.JLabel lblNewActPromptState;
    private javax.swing.JLabel lblNewActPromptStreet;
    private javax.swing.JLabel lblNewActPromptWelcom;
    private javax.swing.JLabel lblNewActPromptZip;
    private javax.swing.JLabel lblPromptDeleteID;
    private javax.swing.JLabel lblPromptInfoID;
    private javax.swing.JRadioButton radDepo;
    private javax.swing.JRadioButton radWith;
    private javax.swing.JTextField txtAcntIDDelete;
    private javax.swing.JTextField txtAcntIDModAcnt;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDepOrWithActID;
    private javax.swing.JTextField txtDepoOrWithAmount;
    private javax.swing.JTextField txtFN;
    private javax.swing.JTextArea txtInfo;
    private javax.swing.JTextField txtInfoAcntID;
    private javax.swing.JTextArea txtInfoDepoOrWith;
    private javax.swing.JTextField txtInitBal;
    private javax.swing.JTextField txtLN;
    private javax.swing.JTextArea txtModAct;
    private javax.swing.JTextField txtNewCity;
    private javax.swing.JTextField txtNewState;
    private javax.swing.JTextField txtNewStreet;
    private javax.swing.JTextField txtNewZipCode;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}
