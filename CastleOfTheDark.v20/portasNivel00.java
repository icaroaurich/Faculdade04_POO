import greenfoot.*;
public class portasNivel00 extends portas{
    public void act(){
        World world = getWorld();
        String txt = String.valueOf(world);
        String nivel = txt.substring(0, 7);
        if (nivel.equals("Nivel00")){porta0001(world);}
    }
    public void porta0001(World world){
        world.showText(" Nível 00\nSala 01", 55, 55);
        
        setImage("seta.png");
        Actor Player = getOneIntersectingObject(Player.class);
        if (Player !=null){Greenfoot.setWorld(new Nivel01Sala01());}
    }}