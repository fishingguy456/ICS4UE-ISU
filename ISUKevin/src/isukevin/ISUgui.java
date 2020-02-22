/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isukevin;

import java.awt.Desktop;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 335726246
 */
public class ISUgui extends javax.swing.JFrame {

    /**
     * Creates new form ISUgui
     */
    public ISUgui() throws FileNotFoundException, IOException, ClassNotFoundException, EOFException {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlUserAction = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLoginName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRegisterName = new javax.swing.JTextField();
        txtRegisterEmail = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        btnManual = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnOnlineHelp = new javax.swing.JButton();
        btnContact = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("User Login");

        jLabel3.setText("Username:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Register a User");

        jLabel5.setText("Username:");

        jLabel6.setText("Email:");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        lblError.setToolTipText("");

        btnManual.setText("User Manual (GAPPS only)");
        btnManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManualActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnOnlineHelp.setText("Online Help");
        btnOnlineHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnlineHelpActionPerformed(evt);
            }
        });

        btnContact.setText("Kevin's Fishing Depot Assistance");
        btnContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserActionLayout = new javax.swing.GroupLayout(pnlUserAction);
        pnlUserAction.setLayout(pnlUserActionLayout);
        pnlUserActionLayout.setHorizontalGroup(
            pnlUserActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserActionLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(196, 196, 196))
            .addGroup(pnlUserActionLayout.createSequentialGroup()
                .addGroup(pnlUserActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserActionLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit))
                    .addGroup(pnlUserActionLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUserActionLayout.createSequentialGroup()
                        .addGroup(pnlUserActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlUserActionLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(btnLogin))
                            .addGroup(pnlUserActionLayout.createSequentialGroup()
                                .addGroup(pnlUserActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlUserActionLayout.createSequentialGroup()
                                        .addGap(115, 115, 115)
                                        .addComponent(txtLoginName, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(136, 136, 136))
                                    .addGroup(pnlUserActionLayout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addComponent(btnOnlineHelp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnManual)
                                        .addGap(33, 33, 33)))
                                .addGroup(pnlUserActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlUserActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGroup(pnlUserActionLayout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(btnContact)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(pnlUserActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegister)
                            .addComponent(txtRegisterName, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRegisterEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlUserActionLayout.setVerticalGroup(
            pnlUserActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserActionLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlUserActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlUserActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLoginName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtRegisterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlUserActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtRegisterEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(pnlUserActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnRegister))
                .addGap(25, 25, 25)
                .addGroup(pnlUserActionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManual)
                    .addComponent(btnExit)
                    .addComponent(btnOnlineHelp)
                    .addComponent(btnContact))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Welcome to Kevin's Fishing Depot!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlUserAction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlUserAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static ArrayList<lure> lureCatalogue = new ArrayList<>();
    public static ArrayList<reel> reelCatalogue = new ArrayList<>();
    public static ArrayList<rod> rodCatalogue = new ArrayList<>();//store the products and users
    public static ArrayList<user> userList = new ArrayList<>();
    public static File lureFile = new File("Lures.txt");//files to store information
    public static File rodFile = new File("Rods.txt");
    public static File reelFile = new File("Reels.txt");
    public static File userFile = new File("Users.txt");
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        String newUsername = txtRegisterName.getText();//store the registered username and email
        String newEmail = txtRegisterEmail.getText();
        String errorOutput = "Please Enter: ";//error due to mismatch or empty fields
        boolean badName = false;
        boolean badEmail = false;//to check if the name or email is bad
        boolean exists = false;
        if (newUsername.equals("admin") && (newUsername.equals("") || newUsername.contains(",") || newUsername.contains(";") || newUsername.contains("!") || newUsername.contains(".") || newUsername.contains("/") || newUsername.contains("?"))) {
            //bad name
            errorOutput += "a valid username ";
            badName = true;
        }
        if (!newEmail.contains(".") || !newEmail.contains("@")) {
            //bad email
            errorOutput += "a valid email";
            badEmail = true;
        }
        user registration = new user(newUsername, newEmail);
        if (containsUser(registration)) {//check for if the user exists
            errorOutput = "That user is already registered";
            exists = true;
        }
        if (badName == false && badEmail == false && exists == false) {//registered successfully, email and name are good, user does not exist
            errorOutput = "You have successfully registered!";
            userList.add(new user(newUsername, newEmail));//add the user to the arraylist
            try {
                PrintWriter pw = new PrintWriter(userFile);
                writeUsers(pw);//store in file
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ISUgui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        lblError.setText(errorOutput);//display the errors
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String loginName = txtLoginName.getText();//login information
        boolean found = false;//if the user has been found
        if (loginName.equals("admin")) {//admin login
            ISUManagergui managerFrame = new ISUManagergui();//display new frame
            dispose();
            managerFrame.setVisible(true);
        }
        for (int i = 0; i < userList.size(); i++) {//look for the user
            if (userList.get(i).getName().equals(loginName)) {
                found = true;
                ISUUsergui userFrame = new ISUUsergui();//display new frame
                dispose();
                userFrame.setVisible(true);
            }
        }
        if (found == false) {//user does not exist
            lblError.setText("That user does not exist in the database");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManualActionPerformed
        // TODO add your handling code here:
        try {//user manual
            Desktop.getDesktop().browse(new URI("https://docs.google.com/document/d/1a0RGYl-GiN7Eb2pY1gbdFFTO6F0SUb5gb57kVGbaprk/edit?usp=sharing"));
            //link to the document
        } catch (IOException | URISyntaxException ex) {
            Logger.getLogger(ISUgui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnManualActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);//exit the app
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnOnlineHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnlineHelpActionPerformed
        // TODO add your handling code here:
        try {//link to online blog help
            Desktop.getDesktop().browse(new URI("https://stackoverflow.com/"));
            //link to the document
        } catch (IOException | URISyntaxException ex) {
            Logger.getLogger(ISUgui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnOnlineHelpActionPerformed

    private void btnContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactActionPerformed
        // TODO add your handling code here:
        try {//email the creator
            Desktop.getDesktop().browse(new URI("mailto:335726246@gapps.yrdsb.ca"));
            //link to the document
        } catch (IOException | URISyntaxException ex) {
            Logger.getLogger(ISUgui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnContactActionPerformed

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
            java.util.logging.Logger.getLogger(ISUgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ISUgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ISUgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ISUgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ISUgui().setVisible(true);//make the form visible
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ISUgui.class
                            .getName()).log(Level.SEVERE, null, ex);

                } catch (IOException ex) {
                    Logger.getLogger(ISUgui.class
                            .getName()).log(Level.SEVERE, null, ex);

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ISUgui.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    Scanner scLure = new Scanner(lureFile);
                    Scanner scRod = new Scanner(rodFile);
                    Scanner scReel = new Scanner(reelFile);
                    Scanner scUser = new Scanner(userFile);
                    readUsers(scUser);
                    readLures(scLure);
                    readRods(scRod);
                    readReels(scReel);//read everything into the file
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ISUgui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    /**
     * Check if the user exists
     * 
     * @param u the user to compare to
     * @return whether the user exists
     */
    public static boolean containsUser(user u){//check if the user exists
        for(int i = 0;i < userList.size(); i++){
            if(u.getName().equals(userList.get(i).getName())&&u.getEmail().equals(userList.get(i).getEmail())){//check each field
                return true;
            }
        }return false;
    }
    
    /**
     * Check if the rod exists
     * 
     * @param u the rod to compare to
     * @return whether it exists or not
     */
    public static boolean containsRod(rod u){//same as above
        for(int i = 0;i < rodCatalogue.size(); i++){
            if(u.getBrand().equals(rodCatalogue.get(i).getBrand())&&u.getModel().equals(rodCatalogue.get(i).getModel())&&u.getAction().equals(rodCatalogue.get(i).getAction())&&u.getWeight().equals(rodCatalogue.get(i).getWeight())&&u.getType().equals(rodCatalogue.get(i).getType())&&u.getPrice()==rodCatalogue.get(i).getPrice()&&u.getSku().equals(rodCatalogue.get(i).getSku())){
                return true;
            }
        }return false;
    }

    
    /**
     * Check if the reel exists
     * 
     * @param u the reel to compare to
     * @return whether it exists or not
     */
    public static boolean containsReel(reel u){//same as above
        for(int i = 0;i < reelCatalogue.size(); i++){
            if(u.getBrand().equals(reelCatalogue.get(i).getBrand())&&u.getModel().equals(reelCatalogue.get(i).getModel())&&u.getRetrieve().equals(reelCatalogue.get(i).getRetrieve())&&u.getGearRatio()==reelCatalogue.get(i).getGearRatio()&&u.getType().equals(reelCatalogue.get(i).getType())&&u.getPrice()==reelCatalogue.get(i).getPrice()&&u.getSku().equals(reelCatalogue.get(i).getSku())){
                return true;
            }
        }return false;
    }
    
    /**
     * Check if the lure exists
     * 
     * @param u the lure to compare to
     * @return whether it exists or not
     */
    
    public static boolean containsLure(lure u){//same as above
        for(int i = 0;i < lureCatalogue.size(); i++){
            if(u.getBrand().equals(lureCatalogue.get(i).getBrand())&&u.getModel().equals(lureCatalogue.get(i).getModel())&&u.getColour().equals(lureCatalogue.get(i).getColour())&&u.getSize()==lureCatalogue.get(i).getSize()&&u.getType().equals(lureCatalogue.get(i).getType())&&u.getPrice()==lureCatalogue.get(i).getPrice()&&u.getSku().equals(lureCatalogue.get(i).getSku())){
                return true;
            }
        }return false;
    }
    
    /**
     * Read all the fishing lures into ArrayLists
     *
     * @param sc The Scanner to use
     */
    public static void readLures(Scanner sc) {//read the lures into the program
        while (sc.hasNextLine()) {
            StringTokenizer st = new StringTokenizer(sc.nextLine(), ",");//split by commas as delimiters
            String brand = st.nextToken();
            String model = st.nextToken();
            String colour = st.nextToken();
            double size = Double.parseDouble(st.nextToken());
            String type = st.nextToken();
            double price = Double.parseDouble(st.nextToken());
            String sku = st.nextToken();//each element split up
            lureCatalogue.add(new lure(brand, model, colour, size, type, price, sku));//add to the arraylist
        }
    }

    /**
     * Read all the fishing reels into the ArrayLists
     *
     * @param sc The Scanner to use
     */
    public static void readReels(Scanner sc) {//same as above
        while (sc.hasNextLine()) {
            StringTokenizer st = new StringTokenizer(sc.nextLine(), ",");
            String brand = st.nextToken();
            String model = st.nextToken();
            String retrieve = st.nextToken();
            double gearRatio = Double.parseDouble(st.nextToken());
            String type = st.nextToken();
            double price = Double.parseDouble(st.nextToken());
            String sku = st.nextToken();
            reelCatalogue.add(new reel(brand, model, retrieve, gearRatio, type, price, sku));
        }
    }

    /**
     * Read all the fishing rods into the ArrayLists
     *
     * @param sc The Scanner to use
     */
    public static void readRods(Scanner sc) {//same as above
        while (sc.hasNextLine()) {
            StringTokenizer st = new StringTokenizer(sc.nextLine(), ",");
            String brand = st.nextToken();
            String model = st.nextToken();
            String action = st.nextToken();
            String weight = st.nextToken();
            String type = st.nextToken();
            double price = Double.parseDouble(st.nextToken());
            String sku = st.nextToken();
            rodCatalogue.add(new rod(brand, model, action, weight, type, price, sku));
        }
    }

    /**
     * Read all the users into the ArrayLists
     *
     * @param sc The Scanner to use
     */
    public static void readUsers(Scanner sc) {
        while (sc.hasNextLine()) {
            StringTokenizer st = new StringTokenizer(sc.nextLine(), ",");
            String username = st.nextToken();
            String email = st.nextToken();
            userList.add(new user(username, email));
        }
    }

    /**
     * Print the users into the user file
     * 
     * @param pw PrintWriter to use to write to the file
     */
    public static void writeUsers(PrintWriter pw) {//write the users into the file
        for (int i = 0; i < userList.size(); i++) {
            pw.println(userList.get(i).getName() + "," + userList.get(i).getEmail());//write each from the arraylist
        }
        pw.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContact;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnManual;
    private javax.swing.JButton btnOnlineHelp;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblError;
    private javax.swing.JPanel pnlUserAction;
    private javax.swing.JTextField txtLoginName;
    private javax.swing.JTextField txtRegisterEmail;
    private javax.swing.JTextField txtRegisterName;
    // End of variables declaration//GEN-END:variables
}