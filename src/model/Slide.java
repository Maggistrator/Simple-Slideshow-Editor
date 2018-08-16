package model;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;
import org.w3c.dom.Document;

/** 
 * Slide является элементом для Slideshow 
 * @author Сова
 * @see core.Slideshow
 * */
public class Slide extends DefaultMutableTreeNode implements XMLTranslatable{
	//ключевые свойства: время жизни слайда, имя и изображение
	public int lifetime = 0;
        public String name = "New Slide";
	public String imageFilePath; 
        public ImageIcon image;
        
        //коллекции озвучки и субтитров
	private ArrayList<Sound> voiceover = new ArrayList<>();
	private ArrayList<Subtitle> replicas = new ArrayList<>();

	private Slide(){} //закрываем конструктор по-умолчанию
        //TODO: нужен конструктор принимающий на вход Animation
        
	public Slide(String image, ImageIcon img) {
            super("New Slide");
            this.imageFilePath = image;
            this.image = img;
	}

    /**
     * Позволяет добавить к слайду новую реплику или звук
     * @param starts - время начала дорожки (в тик FPS), относительно начала слайда 
     * @param sound - путь к дорожке с озвучкой
     */
    public void addVoiceover(int starts, String sound) {
        voiceover.add(new Sound(starts, sound));
    }

    public void addVoiceover(Sound sound) {
        voiceover.add(sound);
    }
    
    /**
     * Позволяет добавить на слайд реплику субтитров
     * @param text - многострочный текст, который следует отобразить
     * @param starts - время начала отрисовки текста (в тиках FPS)
     * */
    public void addText(int starts, String text) {
        replicas.add(new Subtitle(starts, text));
    }
    
    public void addText(Subtitle sub) {
        replicas.add(sub);
    }

    public void setName(String name) {
        this.name = name;
        super.setUserObject(name);
    }   
        
    public String getName() {
        return name;
    }   

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }
        
    @Override
    public Document getXML() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String toString() {
        return name;
    }
    
    public class Sound{
        
        public int starts;
        public String path;
        
        public Sound(int starts, String path) {
            this.starts = starts;
            this.path = path;
        }

        @Override
        public String toString() {
            //имя файла
            String name = path.substring(path.lastIndexOf("\\") , path.length()-1);
            return name;
        }
    }
    
    public class Subtitle{

        int starts;
        String text;
        
        public Subtitle(int starts, String text) {
            this.text = text;
            this.starts = starts;
        }

        @Override
        public String toString() {
            return text.split(" ")[0]+"...";
        }
        
    }
}
