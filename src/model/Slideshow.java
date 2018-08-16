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
    ArrayList<Music> music = new ArrayList<>();

    public int lifetime = 0;
    
    public int indexof(Slide slide){
        return slides.indexOf(slide);
    }
        
    public int indexof(String slide_name){
        int idx = -1;
        for(int i = 0; i<slides.size(); i++){
            if(slides.get(i).name.equals(slide_name)){
                idx = i;
                return idx;
            }
        }
        return idx;
    }
    
    public void addSlide(Slide slide){
        if(isAuto) lifetime += slide.lifetime;
        slides.add(slide);
        current_index++;
    }

    public Slide getSlide(int idx){
        return slides.get(idx);
    }
    
    public Slide getSlide(String name){
        System.out.println("getSlide(name):entered");
        System.out.println("indexOf(name): "+indexof(name));
        System.out.println("getSlide(idx): "+getSlide(indexof(name)));
        return getSlide(indexof(name));
    }
    
    public void removeSlide(int index){
        slides.remove(index);
    }
    
    public void addMusic(Music soundtrack) {
        music.add(soundtrack);
    }
    
    public void addMusic(int starts, String path) {
        music.add(new Music(starts, path));
    }

    public Music getMusic(int idx) {
        return music.get(idx);
    }
    
    public Music getMusic(String name) {
        Music soundtrack = null;
        int idx = music.indexOf(name);
        if(idx != -1){
            soundtrack = music.get(idx);
        }
        return soundtrack;
    }
    
    @Override
    public Document getXML() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

    public class Music{

        int starts;
        String path;
        
        public Music(int starts, String path) {
            this.starts = starts;
            this.path = path;
        }
        
        @Override
        public String toString() {
            String name = path.substring(path.lastIndexOf("\\")+1 , path.length()-1);
            return name;
        }
    }    
}
