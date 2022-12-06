import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOver extends World{
    GreenfootSound mMorte = new GreenfootSound("morte.mp3");
    public GameOver(){    
        super(Param.LarguraDoCenario, Param.AlturaDoCenario, 1); 
        setBackground("GameOver.png");
        mMorte.play();
    }
    public void act(){
        String key = Greenfoot.getKey();
        if("enter".equals(key)){
            Greenfoot.setWorld(new Menu());
        }
    }
}
