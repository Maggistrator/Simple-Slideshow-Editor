package view;


import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import model.Slide;

/**
 * @author Сова
 */
public class CreateSlideDialog extends javax.swing.JFrame {

    private Slide slide;
    File chosenImage = null;
    MainGUI parent;
    
    public CreateSlideDialog(MainGUI parent) {
        this.parent = parent;
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgPathField = new javax.swing.JTextField();
        chooseImageButton = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        slideNameFieldLabel = new javax.swing.JLabel();
        imgFieldLabel = new javax.swing.JLabel();
        approveFileButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        srcFieldLabel = new javax.swing.JLabel();
        srcFolderField = new javax.swing.JTextField();
        dummyfield = new javax.swing.JLabel();
        isAnimation = new javax.swing.JCheckBox();
        lifetimeLabel = new javax.swing.JLabel();
        lifetimeField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imgPathField.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        imgPathField.setText("D:/data/pic.png");

        chooseImageButton.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        chooseImageButton.setLabel("Выбрать..");
        chooseImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseImageButtonActionPerformed(evt);
            }
        });

        nameField.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        nameField.setText("New Slide");
        nameField.setToolTipText("");

        slideNameFieldLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        slideNameFieldLabel.setForeground(new java.awt.Color(102, 102, 102));
        slideNameFieldLabel.setText("Имя слайда: ");

        imgFieldLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        imgFieldLabel.setForeground(new java.awt.Color(102, 102, 102));
        imgFieldLabel.setText("Изображениe:");

        approveFileButton.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        approveFileButton.setText("Добавить");
        approveFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveFileButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        cancelButton.setText("Отмена");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        srcFieldLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        srcFieldLabel.setForeground(new java.awt.Color(102, 102, 102));
        srcFieldLabel.setText("Папка с ресурсами:");

        srcFolderField.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        srcFolderField.setText("textures");

        dummyfield.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        dummyfield.setForeground(new java.awt.Color(102, 102, 102));
        dummyfield.setText("/sample.png");

        isAnimation.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        isAnimation.setText("Анимация");
        isAnimation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isAnimationActionPerformed(evt);
            }
        });

        lifetimeLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lifetimeLabel.setForeground(new java.awt.Color(102, 102, 102));
        lifetimeLabel.setText("Время жизни:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(isAnimation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(approveFileButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(srcFieldLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(srcFolderField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(imgFieldLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(imgPathField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(dummyfield, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(chooseImageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(slideNameFieldLabel)
                                        .addGap(20, 20, 20)
                                        .addComponent(nameField))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lifetimeLabel)
                                .addGap(18, 18, 18)
                                .addComponent(lifetimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slideNameFieldLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imgPathField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseImageButton)
                    .addComponent(imgFieldLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(srcFieldLabel)
                    .addComponent(srcFolderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dummyfield))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lifetimeLabel)
                            .addComponent(lifetimeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(isAnimation)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(approveFileButton)
                            .addComponent(cancelButton))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseImageButtonActionPerformed
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            chosenImage = fc.getSelectedFile();
            imgPathField.setText(chosenImage.getPath());
            dummyfield.setText("/" + chosenImage.getName());
            this.repaint();
        }
    }//GEN-LAST:event_chooseImageButtonActionPerformed

    private void approveFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveFileButtonActionPerformed
    if(parent.slideshow.indexof(nameField.getText())==-1){   
        try{
            String filename = chosenImage.getName();
            ImageIcon ico = new ImageIcon(chosenImage.getPath());
            //расширение входит в имя
            //TODO: создать фильтры FileChooser для того, чтобы нельзя было выбрать не-картинку           
            slide = new Slide(srcFolderField.getText()+"/"+filename, ico);
            slide.setName(nameField.getText());
            //TODO: запилить валидаторы для всех полей 
            try{
                int lifetime = Integer.parseInt(lifetimeField.getText());
                slide.setLifetime(lifetime);
                slide.add(new DefaultMutableTreeNode(filename));
                parent.processNewSlide(slide);
                //Motherf*ker HoI!!! TeMmiE GoiNg to thE ColLeGE sooN!
                this.dispose();
            }catch(NumberFormatException exc){
                JOptionPane.showMessageDialog(this, "Введите корректное время жизни слайда!");
            }
        }
        catch(NullPointerException npe){
            JOptionPane.showMessageDialog(null, "Укажите изображение в формате .png .jpg или .jpeg");
        }
    }else{
        JOptionPane.showMessageDialog(null, "Это имя уже используется!");
        System.err.println(">same name");
    }
    }//GEN-LAST:event_approveFileButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void isAnimationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isAnimationActionPerformed
        JOptionPane.showMessageDialog(this, "Анимации появятся в следующей версии протокола!");       
        isAnimation.setSelected(false);
    }//GEN-LAST:event_isAnimationActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveFileButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton chooseImageButton;
    private javax.swing.JLabel dummyfield;
    private javax.swing.JLabel imgFieldLabel;
    private javax.swing.JTextField imgPathField;
    private javax.swing.JCheckBox isAnimation;
    private javax.swing.JTextField lifetimeField;
    private javax.swing.JLabel lifetimeLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel slideNameFieldLabel;
    private javax.swing.JLabel srcFieldLabel;
    private javax.swing.JTextField srcFolderField;
    // End of variables declaration//GEN-END:variables
}
