/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chatguiclient;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Konstant
 */
public class ChatFrame extends javax.swing.JFrame {

    /**
     * Creates new form ChatFrame
     */
    public ChatFrame(String IP, String UserName) {
        initComponents();
        UserName.replace(' ', '_');
        users = new ArrayList(10);
        if(UserName.length() > 30)
        {
            UserName = UserName.substring(0, 30);
        }
        try {
            s = new Socket(IP, 19534);
            TextArea.append("\nConected to server!");
            s.getOutputStream().write((byte)UserName.length());
            s.getOutputStream().write(UserName.getBytes());
            s.getOutputStream().flush();
            new Thread(){@Override
            public void run(){MessageReader();}}.start();
        } catch (IOException ex) {
            Logger.getLogger(ChatFrame.class.getName()).log(Level.SEVERE, null, ex);
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
        TextArea = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        UsersArea = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        TextMessage = new javax.swing.JTextField();
        SendButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        TextArea.setEditable(false);
        TextArea.setColumns(20);
        TextArea.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("Сейчас в чате находятся:");

        UsersArea.setColumns(10);
        UsersArea.setRows(5);
        jScrollPane2.setViewportView(UsersArea);

        TextMessage.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        SendButton.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        SendButton.setText("Отправить");
        SendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendButtonActionPerformed(evt);
            }
        });

        ExitButton.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        ExitButton.setText("Выход");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2))
                                    .addComponent(ExitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SendButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExitButton))
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SendButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendButtonActionPerformed
        try {
            // TODO add your handling code here:
            String message = TextMessage.getText();
            if(message.length() > 200)
            {
                message = message.substring(0, 200);
            }
            TextMessage.setText("");
            s.getOutputStream().write((byte)message.length());
            s.getOutputStream().write(message.getBytes());
            s.getOutputStream().flush();
        } catch (IOException ex) {
            Logger.getLogger(ChatFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SendButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        try {
            // TODO add your handling code here:
            s.getOutputStream().write(((byte)255));
            s.getOutputStream().flush();
            System.exit(1);
        } catch (IOException ex) {
            Logger.getLogger(ChatFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ExitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    Socket s;
    ArrayList<String> users;
    int users_count = 0;

    public void MessageReader()
    {
        while(true)
        {
            try {
                if(s.getInputStream().available() != 0)
                {
                    int cbyte = s.getInputStream().read();
                    if(cbyte<231)
                    {
                    byte[] message = new byte[cbyte];
                    s.getInputStream().read(message);
                    TextArea.append("\n" + new String(message));
                    }
                    else
                    {
                        switch(cbyte)
                        {
                            case 231 : {
                                users_count = s.getInputStream().read();
                                users.clear();
                                for(int j = 0; j < users_count; j++)
                                {
                                    int l = s.getInputStream().read();
                                    byte[] bname = new byte[l];
                                    s.getInputStream().read(bname);
                                    users.add(new String(bname));
                                }
                                UpdateUsers();
                            }break;
                            case 232 : {
                                int l = s.getInputStream().read();
                                byte[] bname = new byte[l];
                                s.getInputStream().read(bname);
                                users.add(new String(bname));
                                users_count++;
                                UpdateUsers();
                                TextArea.append("\n" + new String(bname) + " joined chat.");
                            }break;
                            case 233 : {
                                int l = s.getInputStream().read();
                                byte[] bname = new byte[l];
                                s.getInputStream().read(bname);
                                users.remove(users.indexOf(new String(bname)));
                                users_count--;
                                UpdateUsers();
                                TextArea.append("\n" + new String(bname) + " left the chat.");
                            }break;
                        }
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(ChatFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private void UpdateUsers()
    {
        UsersArea.setText("");
        for(int j = 0; j < users_count; j++)
        {
            UsersArea.append("\n" + users.get(j));
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton SendButton;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JTextField TextMessage;
    private javax.swing.JTextArea UsersArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
