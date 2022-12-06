import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class vida extends parede{
    public void act(){
        Actor Player = getOneIntersectingObject(Player.class);
        if (Player !=null){
            Player_1.vidap1=3;
            Player_2.vidap2=3;
            getWorld().removeObject(this);
        }
    }
}
