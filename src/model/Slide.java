package model;

import java.util.HashMap;
import javax.swing.ImageIcon;
import org.w3c.dom.Document;

/** 
 * Slide является элементом для Slideshow 
 * <br>Время жизни слайда равно длине дорожки озвучки, либо субтитров, 
 * в зависимости от того, что длинее (Вычисляется автоматически)
 * <br> Дорожки субтитров и озвучки идут параллельно
 * <br>Элеметы дорожек идут относительно друг-друга по-очереди, с учётом смещения
 * @author Сова
 * @see core.Slideshow
 * */
public class Slide implements XMLTranslatable{
	//ключевые свойства: время жизни слайда, имя и изображение
	public int lifetime = 0;
        public String name = "New Slide";
	public String image; 
        public ImageIcon ico;
        
        //служебные переменные, для вычисления длинны звуковой дорожки слайда, и субтитров
        private int text_lifetime = 0;
        private int voiceover_lifetime = 0;
        
        //коллекции озвучки и субтитров
	private HashMap<Integer, String> voiceover = new HashMap<>();
	private HashMap<Integer, String> replicas = new HashMap<>();

	private Slide(){} //закрываем конструктор по-умолчанию
        //TODO: нужен конструктор принимающий на вход Animation
        
	public Slide(String image, ImageIcon ico) {
            this.image = image;
            this.ico = ico;
	}

    /**
     * Позволяет добавить в дорожку озвучки новую реплику
     * @param lifetime - время жизни дорожки в тиках
     * @param sound - объект Sound, собственно - дорожка со звуком
     * @param shift - сдвиг начала дорожки на заданную величину
     */
    public void addVoiceover(int lifetime, int shift, String sound) {
        voiceover.put(lifetime, sound);
        voiceover_lifetime += lifetime;
        recalculateSlideLifetime();
    }

	/**
	 * Позволяет добавить на слайд реплику субтитров
	 * @param text - многострочный текст, который следует отобразить
	 * @param lifetime - время жизни отрисовки текста в тиках 
         * @param shift - сдвиг начала дорожки на заданную величину
	 * */
	public void addText(int lifetime, int shift, String text) {
		replicas.put(lifetime, text);
                text_lifetime += lifetime;
                recalculateSlideLifetime();
	}
        
        private void recalculateSlideLifetime(){
            if(text_lifetime > voiceover_lifetime) lifetime = text_lifetime;
            else lifetime = voiceover_lifetime;
        }

    public void setName(String name) {
        this.name = name;
    }   
        
    public String getName() {
        return name;
    }   
        
    @Override
    public Document getXML() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String toString() {
        return name;
    }
}
