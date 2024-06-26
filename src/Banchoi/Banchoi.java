/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Banchoi;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author ADMIN
 */
public class Banchoi extends javax.swing.JFrame{

    /**
     * Creates new form Banchoi
     */
    private int x = 50, y = -240;
    private int xVelocity = 5, yVelocity = 1;
    private boolean isOpening = true;
    
    ImageIcon bau = new ImageIcon("C:\\code\\Baucuatomca\\src\\Assets\\bau.png");
    ImageIcon cua = new ImageIcon("C:\\code\\Baucuatomca\\src\\Assets\\cua.png");
    ImageIcon tom = new ImageIcon("C:\\code\\Baucuatomca\\src\\Assets\\tom.png");
    ImageIcon ca = new ImageIcon("C:\\code\\Baucuatomca\\src\\Assets\\ca.png");
    ImageIcon ga = new ImageIcon("C:\\code\\Baucuatomca\\src\\Assets\\ga.png");
    ImageIcon nai = new ImageIcon("C:\\code\\Baucuatomca\\src\\Assets\\nai.png");
    ImageIcon[] imageArr = {bau, cua, tom, ca, ga, nai};
    public Banchoi() {
        initComponents();
        caiNap.setBounds(50, -240, caiNap.getSize().width, caiNap.getSize().height);
        napPanel.add(caiNap);
        dangXoc.setText("");
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        diaPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        dicePanel = new javax.swing.JPanel();
        dice1 = new javax.swing.JLabel();
        dice2 = new javax.swing.JLabel();
        dice3 = new javax.swing.JLabel();
        napPanel = new javax.swing.JPanel();
        caiNap = new javax.swing.JLabel();
        dangXoc = new javax.swing.JLabel();
        moNap = new javax.swing.JButton();
        dongNap = new javax.swing.JButton();
        xoaDia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/plate.png"))); // NOI18N

        javax.swing.GroupLayout diaPanelLayout = new javax.swing.GroupLayout(diaPanel);
        diaPanel.setLayout(diaPanelLayout);
        diaPanelLayout.setHorizontalGroup(
            diaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(diaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(diaPanelLayout.createSequentialGroup()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        diaPanelLayout.setVerticalGroup(
            diaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(diaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(diaPanelLayout.createSequentialGroup()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 28, Short.MAX_VALUE)))
        );

        dicePanel.setOpaque(false);

        dice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/bau.png"))); // NOI18N

        dice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/bau.png"))); // NOI18N

        dice3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/bau.png"))); // NOI18N

        javax.swing.GroupLayout dicePanelLayout = new javax.swing.GroupLayout(dicePanel);
        dicePanel.setLayout(dicePanelLayout);
        dicePanelLayout.setHorizontalGroup(
            dicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dicePanelLayout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addGroup(dicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dicePanelLayout.createSequentialGroup()
                        .addComponent(dice3)
                        .addGap(56, 56, 56)
                        .addComponent(dice1)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dicePanelLayout.createSequentialGroup()
                        .addComponent(dice2)
                        .addGap(209, 209, 209))))
        );
        dicePanelLayout.setVerticalGroup(
            dicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dicePanelLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(dicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dice3)
                    .addComponent(dice1))
                .addGap(36, 36, 36)
                .addComponent(dice2)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        napPanel.setOpaque(false);

        caiNap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/hihi.png"))); // NOI18N

        dangXoc.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        dangXoc.setForeground(new java.awt.Color(255, 0, 51));
        dangXoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dangXoc.setText("Đang Xóc");
        dangXoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout napPanelLayout = new javax.swing.GroupLayout(napPanel);
        napPanel.setLayout(napPanelLayout);
        napPanelLayout.setHorizontalGroup(
            napPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 497, Short.MAX_VALUE)
            .addGroup(napPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, napPanelLayout.createSequentialGroup()
                    .addGap(0, 50, Short.MAX_VALUE)
                    .addComponent(caiNap, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(napPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(napPanelLayout.createSequentialGroup()
                    .addGap(121, 121, 121)
                    .addComponent(dangXoc, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(121, Short.MAX_VALUE)))
        );
        napPanelLayout.setVerticalGroup(
            napPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
            .addGroup(napPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(caiNap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE))
            .addGroup(napPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(napPanelLayout.createSequentialGroup()
                    .addGap(419, 419, 419)
                    .addComponent(dangXoc)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );

        moNap.setBackground(new java.awt.Color(15, 112, 74));
        moNap.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        moNap.setForeground(new java.awt.Color(255, 255, 255));
        moNap.setText("Mở nắp");
        moNap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moNapActionPerformed(evt);
            }
        });

        dongNap.setBackground(new java.awt.Color(200, 55, 47));
        dongNap.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        dongNap.setForeground(new java.awt.Color(255, 255, 255));
        dongNap.setText("Đóng nắp");
        dongNap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dongNapActionPerformed(evt);
            }
        });

        xoaDia.setBackground(new java.awt.Color(255, 189, 20));
        xoaDia.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        xoaDia.setText("Xóc");
        xoaDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaDiaActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(diaPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(dicePanel, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(napPanel, javax.swing.JLayeredPane.MODAL_LAYER);
        jLayeredPane1.setLayer(moNap, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(dongNap, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(xoaDia, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(diaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(dongNap, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(xoaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(moNap, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap(246, Short.MAX_VALUE)
                    .addComponent(dicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(241, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap(251, Short.MAX_VALUE)
                    .addComponent(napPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(252, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(diaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moNap, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dongNap, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xoaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(dicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 126, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(napPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 128, Short.MAX_VALUE)))
        );

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 0, 1000, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moNapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moNapActionPerformed
        // TODO add your handling code here:
        if(isOpening == false)
        {
            Thread animation = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i = caiNap.getY(); i >= -240; i--)
                {
                    caiNap.setLocation(x, i);
                    try {
                        Thread.sleep(5);
                    } catch (Exception e) {
                    System.out.println(e.getMessage());
                    }
                    if(i == -240)
                    {
                        isOpening = true;
                    }
                }
            }     
        });
            animation.start();
        }
    }//GEN-LAST:event_moNapActionPerformed

    private void dongNapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dongNapActionPerformed
        // TODO add your handling code here:
        if(isOpening == true)
        {
            Thread animation = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i = caiNap.getY(); i <= 0; i++)
                {
                    
                    caiNap.setLocation(x, i);
                    try {
                        Thread.sleep(5);
                    } catch (Exception e) {
                    System.out.println(e.getMessage());
                    }
                    if(i == 0)
                    {
                        isOpening = false;
                    }
                }
            }     
        });
            animation.start();
        }
    }//GEN-LAST:event_dongNapActionPerformed

    private void xoaDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaDiaActionPerformed
        // TODO add your handling code here:  
        Shuffle();
    }//GEN-LAST:event_xoaDiaActionPerformed

    private void Shuffle()
    {
        Thread shuffleThread = new Thread(new Runnable(){
            @Override
            public void run() {
                Random random = new Random();
                for(int i = 0; i < 30; i++)
                {
                    dice1.setIcon(imageArr[random.nextInt(6)]);
                    dice2.setIcon(imageArr[random.nextInt(6)]);
                    dice3.setIcon(imageArr[random.nextInt(6)]);
                    try {
                        dangXoc.setText("Đang Xóc.");
                        Thread.sleep(50);
                        dangXoc.setText("Đang Xóc.."); 
                        Thread.sleep(50);
                        dangXoc.setText("Đang Xóc...");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                dangXoc.setText("Đã Xong");
            }
        });
        shuffleThread.start();
    }
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
            java.util.logging.Logger.getLogger(Banchoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Banchoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Banchoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Banchoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banchoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel caiNap;
    private javax.swing.JLabel dangXoc;
    private javax.swing.JPanel diaPanel;
    private javax.swing.JLabel dice1;
    private javax.swing.JLabel dice2;
    private javax.swing.JLabel dice3;
    private javax.swing.JPanel dicePanel;
    private javax.swing.JButton dongNap;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton moNap;
    private javax.swing.JPanel napPanel;
    private javax.swing.JButton xoaDia;
    // End of variables declaration//GEN-END:variables
}
