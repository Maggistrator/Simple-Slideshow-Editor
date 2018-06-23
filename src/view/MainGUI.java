package view;


import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.Slide;
import model.Slideshow;

/**
 * @author Сова
 */
public class MainGUI extends javax.swing.JFrame {
    
    public Slideshow slideshow = new Slideshow();

    public MainGUI() { 
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "Не удалось настроить стиль интерфейса!");
        }
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        slidePanel = new javax.swing.JPanel();
        createSoundButton = new javax.swing.JButton();
        createSubtitleButton = new javax.swing.JButton();
        createAnimationButton = new javax.swing.JButton();
        generalToolPanel = new javax.swing.JPanel();
        createSlideButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        previousSlideButton = new javax.swing.JButton();
        nextSlideButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SlideshowTree = new javax.swing.JTree();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        picLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        slidePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Слайд", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 14))); // NOI18N

        createSoundButton.setText("Озвучка");

        createSubtitleButton.setText("Текст");

        createAnimationButton.setText("Анимация");

        javax.swing.GroupLayout slidePanelLayout = new javax.swing.GroupLayout(slidePanel);
        slidePanel.setLayout(slidePanelLayout);
        slidePanelLayout.setHorizontalGroup(
            slidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(slidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createSoundButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createSubtitleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createAnimationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        slidePanelLayout.setVerticalGroup(
            slidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slidePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createAnimationButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createSoundButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createSubtitleButton))
        );

        generalToolPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Основное", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 14))); // NOI18N

        createSlideButton.setText("Новый слайд");
        createSlideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createSlideButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Сохранить");

        loadButton.setText("Загрузить");

        javax.swing.GroupLayout generalToolPanelLayout = new javax.swing.GroupLayout(generalToolPanel);
        generalToolPanel.setLayout(generalToolPanelLayout);
        generalToolPanelLayout.setHorizontalGroup(
            generalToolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalToolPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(generalToolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createSlideButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        generalToolPanelLayout.setVerticalGroup(
            generalToolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalToolPanelLayout.createSequentialGroup()
                .addComponent(createSlideButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loadButton)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        previousSlideButton.setText("◄");
        previousSlideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousSlideButtonActionPerformed(evt);
            }
        });

        nextSlideButton.setText("►");

        playButton.setText("Play");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(previousSlideButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextSlideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousSlideButton)
                    .addComponent(nextSlideButton)
                    .addComponent(playButton)))
        );

        SlideshowTree.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Слайдшоу");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Слайд1");
        treeNode1.add(treeNode2);
        SlideshowTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        SlideshowTree.setEditable(true);
        SlideshowTree.setName("Слайдшоу"); // NOI18N
        SlideshowTree.setSelectionModel(null);
        jScrollPane1.setViewportView(SlideshowTree);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setText("Слайд 1 из 1");

        jPanel1.setFocusable(false);

        picLabel.setAlignmentX(0.5F);
        picLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        picLabel.setFocusable(false);
        picLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(generalToolPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(slidePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(generalToolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousSlideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousSlideButtonActionPerformed
        
    }//GEN-LAST:event_previousSlideButtonActionPerformed

    private void createSlideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createSlideButtonActionPerformed
        SlideUI slide = new SlideUI(this);
        slide.setVisible(true);
        slide.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_createSlideButtonActionPerformed

    public void processNewSlide(Slide slide){
        picLabel.setIcon(slide.ico);
        slideshow.addSlide(slide);
        //создание новой модели из коллекции слайдов        
        //SlideshowTree.setModel();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree SlideshowTree;
    private javax.swing.JButton createAnimationButton;
    private javax.swing.JButton createSlideButton;
    private javax.swing.JButton createSoundButton;
    private javax.swing.JButton createSubtitleButton;
    private javax.swing.JPanel generalToolPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton loadButton;
    private javax.swing.JButton nextSlideButton;
    private javax.swing.JLabel picLabel;
    private javax.swing.JButton playButton;
    private javax.swing.JButton previousSlideButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JPanel slidePanel;
    // End of variables declaration//GEN-END:variables
}
