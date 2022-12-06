import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class FimNivel1 extends Nivel01{
    public FimNivel1(){
        setBackground(new GreenfootImage("FinalNivel1.png"));
        Nivel01Sala01.mNivel01.stop();
    }
    public void act(){
        String key = Greenfoot.getKey();
        if("enter".equals(key)){Greenfoot.setWorld(new Nivel02Sala01());}
    }
}
