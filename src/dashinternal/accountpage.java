package dashinternal;

import config.dbconnector;
import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class accountpage extends javax.swing.JInternalFrame {

    public accountpage() {
        initComponents();

        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bif = (BasicInternalFrameUI) this.getUI();
        bif.setNorthPane(null);
    }

    public byte[] imageBytes;
    String path;
    String filename = null;
    String imgPath = null;
    byte[] person_image = null;

    public ImageIcon ResizeImage(String ImagePath, byte[] pic) {
        ImageIcon MyImage = null;
        if (ImagePath != null) {
            MyImage = new ImageIcon(ImagePath);
        } else {
            MyImage = new ImageIcon(pic);
        }
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(image_display.getWidth(), image_display.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    Color enter = new Color(136, 8, 8);
    Color exit = new Color(74, 4, 4);
    Color plate = new Color(100, 4, 4);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        changepp = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        image_display = new javax.swing.JLabel();
        avatar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        updateuser = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        save = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        changepp.setBackground(new java.awt.Color(157, 1, 27));
        changepp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        changepp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Account Settings");
        changepp.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("ID");
        changepp.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Last Name:");
        changepp.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 100, -1));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Email:");
        changepp.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Username:");
        changepp.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        image_display.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/150duckwp.png"))); // NOI18N
        image_display.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        image_display.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image_displayMouseClicked(evt);
            }
        });
        image_display.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                image_displayComponentShown(evt);
            }
        });
        changepp.add(image_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 250, 220));

        avatar.setBackground(new java.awt.Color(255, 204, 51));
        avatar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        avatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avatarMouseClicked(evt);
            }
        });
        avatar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select Avatar");
        avatar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 10));

        changepp.add(avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 110, 30));

        fname.setBackground(new java.awt.Color(255, 102, 102));
        fname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fname.setForeground(new java.awt.Color(255, 255, 255));
        changepp.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, 30));

        lname.setEditable(false);
        lname.setBackground(new java.awt.Color(255, 102, 102));
        lname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lname.setForeground(new java.awt.Color(255, 255, 255));
        changepp.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 150, 30));

        email.setBackground(new java.awt.Color(255, 102, 102));
        email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        changepp.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 310, 30));

        username.setBackground(new java.awt.Color(255, 102, 102));
        username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        changepp.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 310, 30));

        updateuser.setBackground(new java.awt.Color(255, 204, 51));
        updateuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateuserMouseClicked(evt);
            }
        });
        updateuser.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Update User Info");
        updateuser.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 30));

        changepp.add(updateuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 130, 30));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("First Name: ");
        changepp.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        id.setEditable(false);
        id.setBackground(new java.awt.Color(255, 102, 102));
        id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        changepp.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, 30));

        save.setBackground(new java.awt.Color(255, 204, 51));
        save.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });
        save.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Save Avatar");
        save.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 10));

        changepp.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 110, 30));

        getContentPane().add(changepp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avatarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avatarMouseClicked
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
        chooser.addChoosableFileFilter(filter);
        int result = chooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            path = selectedFile.getAbsolutePath();
            image_display.setIcon(ResizeImage(path, null));
            imgPath = path;
            File f = chooser.getSelectedFile();
            filename = selectedFile.getAbsolutePath();
        } else {
            JOptionPane.showMessageDialog(null, "Canceled !");
        }

        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            person_image = bos.toByteArray();

        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_avatarMouseClicked

    private void updateuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateuserMouseClicked

    }//GEN-LAST:event_updateuserMouseClicked

    private void image_displayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image_displayMouseClicked
        try {
            dbconnector dbc = new dbconnector();
            ResultSet rs = dbc.getdata("SELECT * FROM img WHERE id = 1");
            if (rs.next()) {
                image_display.setIcon(ResizeImage(null, rs.getBytes("image")));

            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_image_displayMouseClicked

    private void image_displayComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_image_displayComponentShown

    }//GEN-LAST:event_image_displayComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restotracker", "root", "");
            String sql = "INSERT INTO img (name, image) VALUES (?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, filename);
            pst.setBytes(2, person_image);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Successfully Updated!");

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_saveMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel avatar;
    private javax.swing.JPanel changepp;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField id;
    public javax.swing.JLabel image_display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lname;
    private javax.swing.JPanel save;
    private javax.swing.JPanel updateuser;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
