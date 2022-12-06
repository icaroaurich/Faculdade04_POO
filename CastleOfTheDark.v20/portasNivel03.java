import greenfoot.*;
public class portasNivel03 extends portas{
    public void act(){
        World world = getWorld();
        world.showText(" Nível 03\nSala 01", 55, 55);
        Actor Player = getOneIntersectingObject(Player.class);
        
        int y = getY();
        int x = getX();        
        
        if (Player !=null){Greenfoot.setWorld(new Nivel03Sala02(520,390));}
    }
}