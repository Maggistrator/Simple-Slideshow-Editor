package model;

import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 * @author Сова
 */
public class Image extends DefaultMutableTreeNode{
    ImageIcon image;

    public Image(String path) {
        this.image = new ImageIcon(path);
    }
    
}
