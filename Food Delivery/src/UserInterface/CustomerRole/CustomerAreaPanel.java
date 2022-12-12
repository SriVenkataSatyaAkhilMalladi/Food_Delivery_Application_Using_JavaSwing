/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.CustomerRole;

import Business.Customer.Customer;
import Business.Database.DatabaseConnection;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author srikr
 */
public class CustomerAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerAreaPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private UserAccount account;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public CustomerAreaPanel(JPanel userProcessContainer, UserAccount account,EcoSystem ecosystem) {
        initComponents();
        con = DatabaseConnection.getCon();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.account = account;
        populateRequestTable();
        populatePreviousOrderTable();
        //populateTable();
        lblCustomerID.setText(account.getUsername());
    }

    public void populateTable()
    {
        try{
            String sql = "select name,address,phoneno from fooddeliver.Restaurant";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            tblRestaurant.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
     public void populateRequestTable(){
         DefaultTableModel tablemodel = (DefaultTableModel) tblRestaurant.getModel();
        
         tablemodel.setRowCount(0);
         
       
                Object[] row = new Object[3];
                //System.out.println();
                for(Restaurant restro:ecosystem.getRestaurantDirectory().getRestaurantDirectory()){
                     row[0] = restro;
                     //System.out.println(restro.getAdminUName());
                     row[1] = restro.getAddress();
                     row[2] = restro.getNumber();
                     tablemodel.addRow(row);
                }
    }

    public void populatePreviousOrderTable(){
        DefaultTableModel tablemodel = (DefaultTableModel) tblPreviousOrders.getModel();
        tablemodel.setRowCount(0);
         
        for (Customer cust:ecosystem.getCustomerDirectory().getCustomerDirectory()) {
           if (cust.getUserName().equals(account.getUsername())) {
               // System.out.println(restro.getOrderList());
               for(Order menu:cust.getOrderList()){
                Object[] row = new Object[4];
                row[0] = menu;
                row[1] = menu.getRestaurantName();
                row[2] = menu.getPrice();
                row[3] = menu.getStatus();
                tablemodel.addRow(row);
               }
                
            }
            
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tblPreviousOrders = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblCustomerID = new javax.swing.JLabel();
        btnOrder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        refreshTestJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestaurant = new javax.swing.JTable();
        Updatebtn = new javax.swing.JButton();
        txtSearchRes = new javax.swing.JTextField();
        SearchResbtn = new javax.swing.JButton();
        txtSearchOrd = new javax.swing.JTextField();
        SearchOrdbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 153));

        tblPreviousOrders.setBackground(new java.awt.Color(255, 255, 153));
        tblPreviousOrders.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tblPreviousOrders.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblPreviousOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "Restaurant Name", "Amount", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPreviousOrders.setRowHeight(26);
        tblPreviousOrders.setRowMargin(1);
        tblPreviousOrders.setShowHorizontalLines(true);
        tblPreviousOrders.setShowVerticalLines(true);
        jScrollPane2.setViewportView(tblPreviousOrders);
        if (tblPreviousOrders.getColumnModel().getColumnCount() > 0) {
            tblPreviousOrders.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblPreviousOrders.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblPreviousOrders.getColumnModel().getColumn(2).setPreferredWidth(5);
        }

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Previous Orders");

        lblCustomerID.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblCustomerID.setText("<value>,");

        btnOrder.setBackground(new java.awt.Color(0, 0, 0));
        btnOrder.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnOrder.setText("Place Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Restaurant");

        enterpriseLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        enterpriseLabel.setText("Hi");

        refreshTestJButton.setBackground(new java.awt.Color(0, 0, 0));
        refreshTestJButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        refreshTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        tblRestaurant.setBackground(new java.awt.Color(255, 255, 153));
        tblRestaurant.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tblRestaurant.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblRestaurant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurant Name", "Location/Address", "Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRestaurant.setRowHeight(26);
        tblRestaurant.setRowMargin(1);
        tblRestaurant.setShowHorizontalLines(true);
        tblRestaurant.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tblRestaurant);

        Updatebtn.setBackground(new java.awt.Color(0, 0, 0));
        Updatebtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        Updatebtn.setText("Update Profile");
        Updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatebtnActionPerformed(evt);
            }
        });

        SearchResbtn.setBackground(new java.awt.Color(0, 0, 0));
        SearchResbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SearchResbtn.setForeground(new java.awt.Color(255, 255, 255));
        SearchResbtn.setText("Search");
        SearchResbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchResbtnActionPerformed(evt);
            }
        });

        SearchOrdbtn.setBackground(new java.awt.Color(0, 0, 0));
        SearchOrdbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SearchOrdbtn.setForeground(new java.awt.Color(255, 255, 255));
        SearchOrdbtn.setText("Search");
        SearchOrdbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchOrdbtnActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/burgerking.jpg"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mcd.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/starbucks.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wendys.jpg"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/subway.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(enterpriseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Updatebtn)
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtSearchOrd, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(SearchOrdbtn))
                                .addComponent(jLabel2)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtSearchRes, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(SearchResbtn))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(refreshTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {SearchOrdbtn, SearchResbtn, refreshTestJButton});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtSearchOrd, txtSearchRes});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(refreshTestJButton))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSearchRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SearchResbtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnOrder)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel2)))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSearchOrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SearchOrdbtn))
                                .addGap(25, 25, 25)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Updatebtn)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {SearchOrdbtn, SearchResbtn, btnOrder, refreshTestJButton});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtSearchOrd, txtSearchRes});

    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        int selectedRow = tblRestaurant.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Restaurant restaurant = (Restaurant)tblRestaurant.getValueAt(selectedRow, 0);

            MenuPanel manageMenuPanel=new MenuPanel(userProcessContainer,account,ecosystem,restaurant);
            userProcessContainer.add("MenuPanel",manageMenuPanel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

    }//GEN-LAST:event_btnOrderActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
        populatePreviousOrderTable();
        //populateTable();
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void UpdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatebtnActionPerformed
        // TODO add your handling code here:
        CustomerUpdatePanel cup = new CustomerUpdatePanel(userProcessContainer, account, ecosystem);
        userProcessContainer.add("CustomerUpdatePanel", cup);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_UpdatebtnActionPerformed

    private void SearchResbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchResbtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblRestaurant.getModel();
        TableRowSorter<DefaultTableModel> tm = new TableRowSorter<>(model);
        tblRestaurant.setRowSorter(tm);
        tm.setRowFilter(RowFilter.regexFilter(txtSearchRes.getText().trim()));
    }//GEN-LAST:event_SearchResbtnActionPerformed

    private void SearchOrdbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchOrdbtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblPreviousOrders.getModel();
        TableRowSorter<DefaultTableModel> tm = new TableRowSorter<>(model);
        tblPreviousOrders.setRowSorter(tm);
        tm.setRowFilter(RowFilter.regexFilter(txtSearchOrd.getText().trim()));
    }//GEN-LAST:event_SearchOrdbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchOrdbtn;
    private javax.swing.JButton SearchResbtn;
    private javax.swing.JButton Updatebtn;
    private javax.swing.JButton btnOrder;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCustomerID;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JTable tblPreviousOrders;
    private javax.swing.JTable tblRestaurant;
    private javax.swing.JTextField txtSearchOrd;
    private javax.swing.JTextField txtSearchRes;
    // End of variables declaration//GEN-END:variables
}
