/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Order.Order;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author srikr
 */
public class ManageOrders extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrders
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem ecosystem;
    
    public ManageOrders(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecosystem = ecosystem;
        
        populateOrderTable();
    }

    public void populateOrderTable(){
         DefaultTableModel tablemodel = (DefaultTableModel) tblOrderDetail.getModel();
        
        tablemodel.setRowCount(0);
        
       
        for (Restaurant restro:ecosystem.getRestaurantDirectory().getRestaurantDirectory()) {
           
            if (restro.getUserName().equals(account.getUsername())) {
                //System.out.println(restro.getOrderList());
               for(Order order:restro.getOrderList()){
                Object[] row = new Object[5];
                row[0] = order;
                row[1] = order.getCustomerName();
                row[2] = order.getDeliveryAddress();
                row[3] = order.getPrice();
                row[4] = order.getStatus();
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

        btnAssignDeliveryMan = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrderDetail = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnViewOrder = new javax.swing.JButton();
        txtSearchRes = new javax.swing.JTextField();
        SearchResbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 153));

        btnAssignDeliveryMan.setBackground(new java.awt.Color(0, 0, 0));
        btnAssignDeliveryMan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAssignDeliveryMan.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignDeliveryMan.setText("Assign Delivery Man to Order");
        btnAssignDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDeliveryManActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblOrderDetail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblOrderDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "Customer", "Delivery Location", "Price", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrderDetail);

        btnRefresh.setBackground(new java.awt.Color(0, 0, 0));
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnViewOrder.setBackground(new java.awt.Color(0, 0, 0));
        btnViewOrder.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnViewOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnViewOrder.setText("View Order");
        btnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Manage Orders");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnViewOrder)
                        .addGap(50, 50, 50)
                        .addComponent(btnAssignDeliveryMan)
                        .addGap(50, 50, 50)
                        .addComponent(btnRefresh)
                        .addGap(50, 50, 50)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearchRes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SearchResbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchResbtn))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssignDeliveryMan)
                    .addComponent(btnViewOrder)
                    .addComponent(btnRefresh)
                    .addComponent(btnBack))
                .addContainerGap(227, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDeliveryManActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrderDetail.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to assign delivery man to the order","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Order order  = (Order)tblOrderDetail.getValueAt(selectedRow, 0);
            DeliveryManAssignment deliveryAssignment =new DeliveryManAssignment(userProcessContainer,account,order,ecosystem);
            userProcessContainer.add("DeliveryManAssignment",deliveryAssignment);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

    }//GEN-LAST:event_btnAssignDeliveryManActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:userProcessContainer.remove(this);
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateOrderTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrderDetail.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view order details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Order order  = (Order)tblOrderDetail.getValueAt(selectedRow, 0);
            OrderDetails orderDetails=new OrderDetails(userProcessContainer,account,order,ecosystem);
            userProcessContainer.add("OrderDetails",orderDetails);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

    }//GEN-LAST:event_btnViewOrderActionPerformed

    private void SearchResbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchResbtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblOrderDetail.getModel();
        TableRowSorter<DefaultTableModel> tm = new TableRowSorter<>(model);
        tblOrderDetail.setRowSorter(tm);
        tm.setRowFilter(RowFilter.regexFilter(txtSearchRes.getText().trim()));
    }//GEN-LAST:event_SearchResbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchResbtn;
    private javax.swing.JButton btnAssignDeliveryMan;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnViewOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrderDetail;
    private javax.swing.JTextField txtSearchRes;
    // End of variables declaration//GEN-END:variables
}
