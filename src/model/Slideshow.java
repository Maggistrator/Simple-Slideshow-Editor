package model;

import java.util.ArrayList;
import org.w3c.dom.Document;

/**
 * @author Сова
 */
public class Slideshow implements XMLTranslatable{
    //коллекция слайдов
    public int current_index = 1;

    ArrayList<Slide> slides = new ArrayList<>();
    private int lifetime = 0;
    
    public void addSlide(Slide slide){
        lifetime += slide.lifetime;
        slides.add(slide);
        slides.add(current_index, slide);
    }

    @Override
    public Document getXML() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
