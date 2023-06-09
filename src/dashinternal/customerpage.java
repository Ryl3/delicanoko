package dashinternal;

import config.dbconnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

public class customerpage extends javax.swing.JInternalFrame {

    public customerpage() {
        initComponents();

        displaydata();

        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bif = (BasicInternalFrameUI) this.getUI();
        bif.setNorthPane(null);
    }

    public void displaydata() {
        try {
            dbconnector dbc = new dbconnector();
            try (ResultSet rs = dbc.getdata("SELECT * FROM tbl_customer")) {
                customertable.setModel(DbUtils.resultSetToTableModel(rs));
            }
        } catch (SQLException e) {
            System.out.println("Errors" + e.getMessage());
        }
    }

    public void searchTable() {
        DefaultTableModel model = (DefaultTableModel) customertable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        customertable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(searchbar.getText().trim()));
    }

    public void clear() {
        cusid.setText("");
        fname.setText("");
        lname.setText("");
        contact.setText("");
        address.setText("");
        searchbar.setText("");
    }

    public void cancel() {
        add.setVisible(true);
        adduser.setVisible(true);
        edit.setVisible(true);
        updateuser.setVisible(true);
        delete.setVisible(true);
        load.setVisible(true);
        clear();
    }
    
    public void cnu(){
        add.setVisible(true);
        adduser.setVisible(true);
        edit.setVisible(true);
        updateuser.setVisible(true);
        delete.setVisible(true);
        load.setVisible(true);
        cancel.setVisible(true);
        clear.setVisible(true);
        cusid.setVisible(true);
        fname.setVisible(true);
        lname.setVisible(true);
        contact.setVisible(true);
        address.setVisible(true);
        l1.setVisible(true);
        l2.setVisible(true);
        l3.setVisible(true);
        l4.setVisible(true);
        l5.setVisible(true);
        searchbar.setVisible(true);
        find.setVisible(true);
    }
    
    public void ucn(){
        add.setVisible(false);
        adduser.setVisible(false);
        edit.setVisible(false);
        updateuser.setVisible(false);
        delete.setVisible(false);
        load.setVisible(false);
        cancel.setVisible(false);
        clear.setVisible(false);
        cusid.setVisible(false);
        fname.setVisible(false);
        lname.setVisible(false);
        contact.setVisible(false);
        address.setVisible(false);
        l1.setVisible(false);
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        l5.setVisible(false);
        searchbar.setVisible(false);
        find.setVisible(false);
    }

    Color enter = new Color(136, 1, 17);
    Color exit = new Color(157, 1, 27);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        load = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        searchbar = new javax.swing.JTextField();
        find = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customertable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        updateuser = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        adduser = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cancel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        clear = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        cnu = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        ucn = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        cusid = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        l3 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        l4 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        l5 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(157, 1, 27));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        load.setBackground(new java.awt.Color(157, 1, 27));
        load.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 2));
        load.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loadMouseExited(evt);
            }
        });
        load.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Load");
        load.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 30));

        jPanel1.add(load, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 80, 30));

        add.setBackground(new java.awt.Color(157, 1, 27));
        add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 2));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Add");
        add.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 30));

        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 80, 30));

        edit.setBackground(new java.awt.Color(157, 1, 27));
        edit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 2));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Edit");
        edit.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 30));

        jPanel1.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 80, 30));

        delete.setBackground(new java.awt.Color(157, 1, 27));
        delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 2));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Delete");
        delete.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 30));

        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 80, 30));

        searchbar.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        searchbar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        searchbar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchbarKeyPressed(evt);
            }
        });
        jPanel1.add(searchbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 180, 30));

        find.setBackground(new java.awt.Color(157, 1, 27));
        find.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 2));
        find.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                findMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                findMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                findMouseExited(evt);
            }
        });
        find.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Find");
        find.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 30));

        jPanel1.add(find, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 80, 30));

        customertable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPane1.setViewportView(customertable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 730, 180));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Customer Page.");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 30));

        updateuser.setBackground(new java.awt.Color(157, 1, 27));
        updateuser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        updateuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateuserMouseClicked(evt);
            }
        });
        updateuser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("+");
        updateuser.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel1.add(updateuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 30, 30));

        adduser.setBackground(new java.awt.Color(157, 1, 27));
        adduser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        adduser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adduserMouseClicked(evt);
            }
        });
        adduser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("+");
        adduser.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel1.add(adduser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 30, 30));

        cancel.setBackground(new java.awt.Color(157, 1, 27));
        cancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        cancel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Cancel");
        cancel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 30));

        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 80, 30));

        clear.setBackground(new java.awt.Color(157, 1, 27));
        clear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        clear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Clear");
        clear.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 30));

        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 80, 30));

        cnu.setBackground(new java.awt.Color(157, 1, 27));
        cnu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        cnu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cnuMouseClicked(evt);
            }
        });
        cnu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("C & U");
        cnu.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 30));

        jPanel1.add(cnu, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 70, 30));

        ucn.setBackground(new java.awt.Color(157, 1, 27));
        ucn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        ucn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ucnMouseClicked(evt);
            }
        });
        ucn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("U & C");
        ucn.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 30));

        jPanel1.add(ucn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 70, 30));

        l1.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setText("Customer ID");
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 30));

        l2.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setText("First Name");
        jPanel1.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 90, 30));

        cusid.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        cusid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cusid.setEnabled(false);
        jPanel1.add(cusid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 230, 30));

        fname.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 230, 30));

        l3.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setText("Last Name");
        jPanel1.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 90, 30));

        lname.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 230, 30));

        l4.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 255, 255));
        l4.setText("Contact");
        jPanel1.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 70, 30));

        address.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        address.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 260, 30));

        l5.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        l5.setForeground(new java.awt.Color(255, 255, 255));
        l5.setText("Address");
        jPanel1.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 70, 30));

        contact.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        contact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 260, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadMouseEntered
        load.setBackground(enter);
    }//GEN-LAST:event_loadMouseEntered

    private void loadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadMouseExited
        load.setBackground(exit);
    }//GEN-LAST:event_loadMouseExited

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(enter);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(exit);
    }//GEN-LAST:event_addMouseExited

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        edit.setBackground(enter);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        edit.setBackground(exit);
    }//GEN-LAST:event_editMouseExited

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(enter);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(exit);
    }//GEN-LAST:event_deleteMouseExited

    private void findMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findMouseEntered
        find.setBackground(enter);
    }//GEN-LAST:event_findMouseEntered

    private void findMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findMouseExited
        find.setBackground(exit);
    }//GEN-LAST:event_findMouseExited

    private void loadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadMouseClicked
        displaydata();
    }//GEN-LAST:event_loadMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        edit.setVisible(false);
        updateuser.setVisible(false);
        delete.setVisible(false);
        load.setVisible(false);
    }//GEN-LAST:event_addMouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        add.setVisible(false);
        adduser.setVisible(false);
        delete.setVisible(false);
        load.setVisible(false);
        int rowindex = customertable.getSelectedRow();
        if (rowindex < 0) {
            JOptionPane.showMessageDialog(null, "Please Select an Item!");
        } else {
            TableModel model = customertable.getModel();
            cusid.setText("" + model.getValueAt(rowindex, 0));
            fname.setText("" + model.getValueAt(rowindex, 1));
            lname.setText("" + model.getValueAt(rowindex, 2));
            contact.setText("" + model.getValueAt(rowindex, 3));
            address.setText("" + model.getValueAt(rowindex, 4));
        }
    }//GEN-LAST:event_editMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        int rowindex = customertable.getSelectedRow();
        if (rowindex < 0) {
            JOptionPane.showMessageDialog(null, "Please select data first from the table.");
        } else {
            TableModel model = customertable.getModel();
            Object value = model.getValueAt(rowindex, 0);
            String id = value.toString();
            int a = JOptionPane.showConfirmDialog(null, "Are you sure to Delete ID: " + id);
            if (a == JOptionPane.YES_OPTION) {
                dbconnector dbc = new dbconnector();
                int c_id = Integer.parseInt(id);
                dbc.deletedata(c_id, "tbl_customer", "c_id");
                displaydata();
            }
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void findMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findMouseClicked
        searchTable();
    }//GEN-LAST:event_findMouseClicked

    private void updateuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateuserMouseClicked
        dbconnector dbc = new dbconnector();
        dbc.updatedata("UPDATE tbl_customer "
                + "SET cus_fname = '" + fname.getText() + "', cus_lname='" + lname.getText() + "', "
                + "contact ='" + contact.getText() + "', cus_address='" + address.getText() + "' "
                + "WHERE cus_id = '" + cusid.getText() + "'");
        JOptionPane.showMessageDialog(null, "Updated Successfully!");
        displaydata();
        cancel();
    }//GEN-LAST:event_updateuserMouseClicked

    private void adduserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adduserMouseClicked
        dbconnector dbc = new dbconnector();
        if (fname.getText().isEmpty() || lname.getText().isEmpty() || contact.getText().isEmpty() || address.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Input your details");
        } else {
            dbc.insertdata("INSERT INTO tbl_customer (cus_fname, cus_lname, contact, cus_address) "
                    + "VALUES ('" + fname.getText() + "', '" + lname.getText() + "','" + contact.getText() + "','" + address.getText() + "')");
            JOptionPane.showMessageDialog(null, "Successfull added");
            displaydata();
            cancel();
        }
    }//GEN-LAST:event_adduserMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        cancel();
    }//GEN-LAST:event_cancelMouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        fname.setText("");
        lname.setText("");
        contact.setText("");
        address.setText("");
    }//GEN-LAST:event_clearMouseClicked

    private void cnuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cnuMouseClicked
        cnu();
    }//GEN-LAST:event_cnuMouseClicked

    private void ucnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ucnMouseClicked
        ucn();
    }//GEN-LAST:event_ucnMouseClicked

    private void searchbarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbarKeyPressed
        searchTable();
    }//GEN-LAST:event_searchbarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    public javax.swing.JTextField address;
    private javax.swing.JPanel adduser;
    private javax.swing.JPanel cancel;
    private javax.swing.JPanel clear;
    private javax.swing.JPanel cnu;
    public javax.swing.JTextField contact;
    public javax.swing.JTextField cusid;
    private javax.swing.JTable customertable;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel edit;
    private javax.swing.JPanel find;
    public javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    public javax.swing.JTextField lname;
    private javax.swing.JPanel load;
    private javax.swing.JTextField searchbar;
    private javax.swing.JPanel ucn;
    private javax.swing.JPanel updateuser;
    // End of variables declaration//GEN-END:variables
}
