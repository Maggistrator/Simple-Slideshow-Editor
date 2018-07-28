package view;

import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import model.Slideshow;

/**
 * @author Сова
 */
public class CreateSlideshowUI extends javax.swing.JFrame {

    private JTree SlideshowTree;
    Slideshow slideshow;
    DefaultMutableTreeNode root;
    
    public CreateSlideshowUI(JTree SlideshowTree, Slideshow slideshow, DefaultMutableTreeNode root) {
        initComponents();
        
        setAlwaysOnTop(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        
        this.root = root;
        this.slideshow = slideshow;
        this.SlideshowTree = SlideshowTree;
        lifetimeField.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        isAuto = new javax.swing.JCheckBox();
        lifetimeLabel = new javax.swing.JLabel();
        lifetimeField = new javax.swing.JTextField();
        canselButton = new javax.swing.JButton();
        approveButton = new javax.swing.JButton();
        tipLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameField.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        nameField.setText("New Slideshow");

        nameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(102, 102, 102));
        nameLabel.setText("Имя:");

        isAuto.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        isAuto.setSelected(true);
        isAuto.setText("Авто");
        isAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isAutoActionPerformed(evt);
            }
        });

        lifetimeLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lifetimeLabel.setForeground(new java.awt.Color(102, 102, 102));
        lifetimeLabel.setText("Длительность:");

        lifetimeField.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lifetimeField.setText("5000");

        canselButton.setText("Отмена");
        canselButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canselButtonActionPerformed(evt);
            }
        });

        approveButton.setText("Создать");
        approveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveButtonActionPerformed(evt);
            }
        });

        tipLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        tipLabel.setForeground(new java.awt.Color(102, 102, 102));
        tipLabel.setText("(тиков FPS)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lifetimeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lifetimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(isAuto))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(approveButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(canselButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameField)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isAuto)
                    .addComponent(lifetimeLabel)
                    .addComponent(lifetimeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(canselButton)
                    .addComponent(approveButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void canselButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canselButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_canselButtonActionPerformed

    private void isAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isAutoActionPerformed
        lifetimeField.setEnabled(!isAuto.isSelected());
    }//GEN-LAST:event_isAutoActionPerformed

    private void approveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveButtonActionPerformed
        String name = nameField.getText();
        root = new DefaultMutableTreeNode(name);
        DefaultTreeModel model = (DefaultTreeModel)SlideshowTree.getModel();
        model.setRoot(root);
        slideshow = new Slideshow(name);
        if (isAuto.isSelected()) {
            slideshow.setLifetime(0);
            slideshow.isAuto = true;
        } else {
            slideshow.setLifetime(Integer.parseInt(lifetimeField.getText()));
            slideshow.isAuto = true;
        }
        SlideshowTree.updateUI();
        canselButtonActionPerformed(null);
    }//GEN-LAST:event_approveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveButton;
    private javax.swing.JButton canselButton;
    private javax.swing.JCheckBox isAuto;
    private javax.swing.JTextField lifetimeField;
    private javax.swing.JLabel lifetimeLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel tipLabel;
    // End of variables declaration//GEN-END:variables
}
