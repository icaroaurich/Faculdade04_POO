import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player_2_atk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_2_atk extends Player_atk{
    static int direcao;
    int timer = 60;
    int velocidadeFlexa = 18;
    GreenfootSound mArrow = new GreenfootSound("arrow.mp3");
    public Player_2_atk(){mArrow.play();}
    public void act(){
        int x = getX();
        int y = getY();
        if (direcao == 0){     setRotation(0);  y = y-velocidadeFlexa;}
        else if (direcao == 1){setRotation(90); x = x+velocidadeFlexa;}
        else if (direcao == 2){setRotation(180);y = y+velocidadeFlexa;}
        else if (direcao == 3){setRotation(270);x = x-velocidadeFlexa;}
        
        
        timer--;
        if (timer <= 0) {
            getWorld().removeObject(this);
        }
        setLocation(x,y);
    }
}
