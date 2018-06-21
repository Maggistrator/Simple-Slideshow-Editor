package model;

import model.XMLTranslatable;
import java.util.HashMap;
import org.w3c.dom.Document;

/**
 * @author Сова
 */
public class Slideshow implements XMLTranslatable{
    //коллекция слайдов

    private HashMap<Integer, Slide> slides = new HashMap<>();
    private int lifetime = 0;
    
    public void addSlide(Slide slide){
        lifetime += slide.lifetime;
        slides.put(slide.lifetime, slide);
    }

    @Override
    public Document getXML() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
