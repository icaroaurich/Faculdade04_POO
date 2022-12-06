import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class FimNivel2 extends Nivel02{
    public FimNivel2(){
        setBackground(new GreenfootImage("FinalNivel2.png"));
        Nivel01Sala01.mNivel01.stop();
    }
    public void act(){
        String key = Greenfoot.getKey();
        if("enter".equals(key)){Greenfoot.setWorld(new Nivel03Sala01());}
    }
}
