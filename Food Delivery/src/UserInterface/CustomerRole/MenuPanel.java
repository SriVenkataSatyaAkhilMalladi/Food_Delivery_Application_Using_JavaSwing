/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Restaurant.Dishes;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author srikr
 */
public class MenuPanel extends javax.swing.JPanel {

    /**
     * Creates new form MenuPanel
     */
    private JPanel userProcessContainer;
    private Restaurant restaurant;
    private UserAccount userAccount;
    private EcoSystem ecosystem;
    ArrayList<Dishes> items=new ArrayList<Dishes>();
    int ad=0;
    int sum = 0;
    public MenuPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem, Restaurant restaurant) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = account;
        this.restaurant = restaurant;
        
        populateMenuTable();
    }

    public void populateMenuTable(){
         DefaultTableModel tablemodel = (DefaultTableModel) tblMenu1.getModel();
        
            tablemodel.setRowCount(0);
                Object[] row = new Object[3];
                for(Dishes dish:restaurant.getMenu()){
                     row[0] = dish;
                     row[1] = dish.getDescription();
                     row[2] = dish.getPrice();
                     tablemodel.addRow(row);
                } 
    }
    
    public void populateCart(Dishes dishitem){
        DefaultTableModel tablemodel = (DefaultTableModel) tblCart1.getModel();
        tablemodel.setRowCount(0);
        if(ad==1){
        items.add(dishitem);
        }else
        items.remove(dishitem);
         Object[] row = new Object[3];
                for(Dishes dish:items){
                     row[0] = dish;
                     row[1] = dish.getDescription();
                     row[2] = dish.getPrice();
                     sum=sum+Integer.parseInt(dish.getPrice());
                     tablemodel.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        enterpriseLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMenu1 = new javax.swing.JTable();
        btnRemoveFromCart1 = new javax.swing.JButton();
        backJButton1 = new javax.swing.JButton();
        valueLabel1 = new javax.swing.JLabel();
        txtSearchM1 = new javax.swing.JTextField();
        btnAddToCart1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblCart1 = new javax.swing.JTable();
        txtAddress1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        SearchM1btn = new javax.swing.JButton();
        btnOrder1 = new javax.swing.JButton();
        SearchM2btn = new javax.swing.JButton();
        txtSearchM2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(255, 255, 153));

        enterpriseLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        enterpriseLabel1.setText("Your Cart :");

        tblMenu1.setBackground(new java.awt.Color(255, 255, 153));
        tblMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tblMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblMenu1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Name", "Description", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMenu1.setRowHeight(26);
        tblMenu1.setRowMargin(1);
        tblMenu1.setShowHorizontalLines(true);
        tblMenu1.setShowVerticalLines(true);
        jScrollPane4.setViewportView(tblMenu1);

        btnRemoveFromCart1.setBackground(new java.awt.Color(0, 0, 0));
        btnRemoveFromCart1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRemoveFromCart1.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveFromCart1.setText("Remove Item");
        btnRemoveFromCart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveFromCart1ActionPerformed(evt);
            }
        });

        backJButton1.setBackground(new java.awt.Color(0, 0, 0));
        backJButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        backJButton1.setForeground(new java.awt.Color(255, 255, 255));
        backJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.jpg"))); // NOI18N
        backJButton1.setText("<<Back");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });

        valueLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        valueLabel1.setText("<value>");

        btnAddToCart1.setBackground(new java.awt.Color(0, 0, 0));
        btnAddToCart1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAddToCart1.setForeground(new java.awt.Color(255, 255, 255));
        btnAddToCart1.setText("Add To Cart");
        btnAddToCart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCart1ActionPerformed(evt);
            }
        });

        tblCart1.setBackground(new java.awt.Color(255, 255, 153));
        tblCart1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tblCart1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblCart1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Name", "Description", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCart1.setRowHeight(26);
        tblCart1.setRowMargin(1);
        tblCart1.setShowHorizontalLines(true);
        tblCart1.setShowVerticalLines(true);
        jScrollPane5.setViewportView(tblCart1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Delivery Address:");

        SearchM1btn.setBackground(new java.awt.Color(0, 0, 0));
        SearchM1btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SearchM1btn.setForeground(new java.awt.Color(255, 255, 255));
        SearchM1btn.setText("Search");
        SearchM1btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchM1btnActionPerformed(evt);
            }
        });

        btnOrder1.setBackground(new java.awt.Color(0, 0, 0));
        btnOrder1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnOrder1.setForeground(new java.awt.Color(255, 255, 255));
        btnOrder1.setText("Order");
        btnOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrder1ActionPerformed(evt);
            }
        });

        SearchM2btn.setBackground(new java.awt.Color(0, 0, 0));
        SearchM2btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SearchM2btn.setForeground(new java.awt.Color(255, 255, 255));
        SearchM2btn.setText("Search");
        SearchM2btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchM2btnActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/food.jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/food1.jpg"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/food2.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/food3.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearchM1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchM1btn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAddToCart1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtSearchM2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(SearchM2btn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemoveFromCart1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSearchM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SearchM1btn)
                                    .addComponent(btnAddToCart1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSearchM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SearchM2btn)
                                    .addComponent(btnRemoveFromCart1))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(30, 30, 30)))
                        .addComponent(btnOrder1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAddress1, txtSearchM2});

    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveFromCart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFromCart1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCart1.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to remove from cart","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Dishes item=(Dishes)tblCart1.getValueAt(selectedRow, 0);
            ad=0;
            populateCart(item);
        //model.setRowCount(0);
           // commented no use
            }
    }//GEN-LAST:event_btnRemoveFromCart1ActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CustomerAreaPanel cap = (CustomerAreaPanel) component;
        cap.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void btnAddToCart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCart1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMenu1.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to add","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Dishes dishItem=(Dishes)tblMenu1.getValueAt(selectedRow, 0);
            ad=1;
            
            populateCart(dishItem);
          
        }
    }//GEN-LAST:event_btnAddToCart1ActionPerformed

    private void SearchM1btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchM1btnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblMenu1.getModel();
        TableRowSorter<DefaultTableModel> tm = new TableRowSorter<>(model);
        tblMenu1.setRowSorter(tm);
        tm.setRowFilter(RowFilter.regexFilter(txtSearchM1.getText().trim()));
    }//GEN-LAST:event_SearchM1btnActionPerformed

    private void btnOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrder1ActionPerformed
        // TODO add your handling code here:
        String address=txtAddress1.getText();
        if(address.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Enter the Delivery Address");
            return;
        }
        restaurant.addOrder(restaurant.getName(), userAccount.getUsername(), null, items, String.valueOf(sum) , address);
        for(Customer cust:ecosystem.getCustomerDirectory().getCustomerDirectory()){
            if(userAccount.getUsername().equals(cust.getUserName())){
                cust.addOrder(restaurant.getName(), userAccount.getUsername(), null, items, String.valueOf(sum) , address);
                JOptionPane.showMessageDialog(null, "You Order placed successfully");
            }
        } 
    }//GEN-LAST:event_btnOrder1ActionPerformed

    private void SearchM2btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchM2btnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblCart1.getModel();
        TableRowSorter<DefaultTableModel> tm = new TableRowSorter<>(model);
        tblCart1.setRowSorter(tm);
        tm.setRowFilter(RowFilter.regexFilter(txtSearchM2.getText().trim()));
    }//GEN-LAST:event_SearchM2btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchM1btn;
    private javax.swing.JButton SearchM2btn;
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton btnAddToCart1;
    private javax.swing.JButton btnOrder1;
    private javax.swing.JButton btnRemoveFromCart1;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblCart1;
    private javax.swing.JTable tblMenu1;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtSearchM1;
    private javax.swing.JTextField txtSearchM2;
    private javax.swing.JLabel valueLabel1;
    // End of variables declaration//GEN-END:variables
}
