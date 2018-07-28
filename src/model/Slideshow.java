package model;

import java.util.ArrayList;
import org.w3c.dom.Document;

/**
 * @author Сова
 */
public class Slideshow implements XMLTranslatable{
    //коллекция слайдов
    public boolean isAuto = true;
    public String name;
    public int current_index = 1;

    public Slideshow(String name) {
        this.name = name;
    }
    
    ArrayList<Slide> slides = new ArrayList<>();
    public int lifetime = 0;
    
    public void addSlide(Slide slide){
        if(isAuto) lifetime += slide.lifetime;
        slides.add(slide);
    }

    @Override
    public Document getXML() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

}
