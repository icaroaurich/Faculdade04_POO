import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Creditos extends World{
    public Creditos(){    
        super(Param.LarguraDoCenario, Param.AlturaDoCenario, 1); 
        setBackground("creditos.png");
    }
    public void act(){
        String key = Greenfoot.getKey();
        if("enter".equals(key)){
            Greenfoot.setWorld(new Menu());
        }
    }
}
