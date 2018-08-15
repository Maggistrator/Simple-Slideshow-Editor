package view;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
import model.Slide;
import model.Slideshow;

/**
 * @author Сова
 */
public class MainGUI extends javax.swing.JFrame {
    
    public Slideshow slideshow = new Slideshow("New Slideshow");
    private DefaultMutableTreeNode slideshowRepresent;

    public MainGUI() { 
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "Не удалось настроить стиль интерфейса!");
        }
        initComponents();
        slideshowRepresent = new DefaultMutableTreeNode(slideshow);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        createMusicButton.setIcon(new ImageIcon("sys/smallnote.png"));
        createSoundButton.setIcon(new ImageIcon("sys/smallsound.png"));
        createSubtitleButton.setIcon(new ImageIcon("sys/smalltext.png"));
        SlideshowTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        
        SlideshowTree.addTreeSelectionListener(new TreeSelectionListener() {
        public void valueChanged(TreeSelectionEvent e) {
            System.out.println("---обработка выделения---");
            
            DefaultMutableTreeNode node = (DefaultMutableTreeNode)
            SlideshowTree.getLastSelectedPathComponent();

            /* if nothing is selected */ 
            if (node == null) return;

            /* retrieve the node that was selected */ 
            try{
            Object obj = node.getUserObject();
            String name = (String)obj;
                System.out.println("это слайд "+obj);
                Slide slide = slideshow.getSlide(name);
                slideshow.current_index = slideshow.indexof(slide);
                System.out.println("его индекс "+slideshow.indexof(slide));
                System.out.println("а изображение "+slide.image);
                picLabel.setIcon(slide.image);
                repaint();
            }catch(Exception exc){
                System.out.println(">exc "+exc.getMessage());
            }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        slidePanel = new javax.swing.JPanel();
        createSoundButton = new javax.swing.JButton();
        createSubtitleButton = new javax.swing.JButton();
        createMusicButton = new javax.swing.JButton();
        generalToolPanel = new javax.swing.JPanel();
        createSlideButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        createSlideshow = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        previousSlideButton = new javax.swing.JButton();
        nextSlideButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SlideshowTree = new javax.swing.JTree();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        picLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple MIT Slideshow Editor");

        slidePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Слайд", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 14))); // NOI18N

        createSoundButton.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        createSoundButton.setText("Озвучка");

        createSubtitleButton.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        createSubtitleButton.setText("Текст");

        createMusicButton.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        createMusicButton.setText("Музыка");

        javax.swing.GroupLayout slidePanelLayout = new javax.swing.GroupLayout(slidePanel);
        slidePanel.setLayout(slidePanelLayout);
        slidePanelLayout.setHorizontalGroup(
            slidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(slidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createSoundButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createSubtitleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createMusicButton, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addContainerGap())
        );
        slidePanelLayout.setVerticalGroup(
            slidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slidePanelLayout.createSequentialGroup()
                .addComponent(createMusicButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createSoundButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createSubtitleButton)
                .addGap(12, 12, 12))
        );

        generalToolPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Основное", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 14))); // NOI18N

        createSlideButton.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        createSlideButton.setText("Новый слайд");
        createSlideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createSlideButtonActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        saveButton.setText("Сохранить");

        loadButton.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        loadButton.setText("Загрузить");

        createSlideshow.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        createSlideshow.setText("Новое слайдшоу");
        createSlideshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createSlideshowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout generalToolPanelLayout = new javax.swing.GroupLayout(generalToolPanel);
        generalToolPanel.setLayout(generalToolPanelLayout);
        generalToolPanelLayout.setHorizontalGroup(
            generalToolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalToolPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(generalToolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createSlideButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createSlideshow, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                .addContainerGap())
        );
        generalToolPanelLayout.setVerticalGroup(
            generalToolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalToolPanelLayout.createSequentialGroup()
                .addComponent(createSlideshow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createSlideButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadButton)
                .addGap(36, 36, 36))
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
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Слайд 0 из 0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(previousSlideButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextSlideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(77, 77, 77))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousSlideButton)
                    .addComponent(nextSlideButton)
                    .addComponent(playButton)))
        );

        jScrollPane1.setMaximumSize(new java.awt.Dimension(120, 400));

        SlideshowTree.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Слайдшоу");
        SlideshowTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        SlideshowTree.setAutoscrolls(true);
        SlideshowTree.setEditable(true);
        SlideshowTree.setMinimumSize(new java.awt.Dimension(81, 32));
        SlideshowTree.setName("Слайдшоу"); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, generalToolPanel, org.jdesktop.beansbinding.ELProperty.create("${minimumSize}"), SlideshowTree, org.jdesktop.beansbinding.BeanProperty.create("maximumSize"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(SlideshowTree);

        jPanel1.setFocusable(false);

        picLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
                .addComponent(picLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane3.setViewportView(jPanel1);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setText("ЭКСПОРТ!");

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("то же, что и Сохранить");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(generalToolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(generalToolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(slidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousSlideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousSlideButtonActionPerformed
        
    }//GEN-LAST:event_previousSlideButtonActionPerformed

    private void createSlideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createSlideButtonActionPerformed
        CreateSlideDialog slideDialog = new CreateSlideDialog(this);
        slideDialog.setVisible(true);
        slideDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        SlideshowTree.updateUI();
    }//GEN-LAST:event_createSlideButtonActionPerformed

    private void createSlideshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createSlideshowActionPerformed
        CreateSlideshowDialog createSlideshowUI = new CreateSlideshowDialog(SlideshowTree, slideshow, slideshowRepresent);
        createSlideshowUI.setVisible(true);
        createSlideshowUI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_createSlideshowActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed

    }//GEN-LAST:event_playButtonActionPerformed

    public void processNewSlide(Slide slide){
        picLabel.setIcon(slide.image);
        slideshow.addSlide(slide);
        DefaultMutableTreeNode root = (DefaultMutableTreeNode)SlideshowTree.getModel().getRoot();
        root.add(slide);
        SlideshowTree.updateUI();
        repaint();    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree SlideshowTree;
    private javax.swing.JButton createMusicButton;
    private javax.swing.JButton createSlideButton;
    private javax.swing.JButton createSlideshow;
    private javax.swing.JButton createSoundButton;
    private javax.swing.JButton createSubtitleButton;
    private javax.swing.JPanel generalToolPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
