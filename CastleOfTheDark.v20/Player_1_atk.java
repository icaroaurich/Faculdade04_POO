import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player_1_atk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_1_atk extends Player_atk{
    static int direcao;
    int timer = 4;
    GreenfootSound mSword = new GreenfootSound("sword.mp3");
    public Player_1_atk(){mSword.play();}
    public void act(){
        if (direcao == 0){setRotation(0);}
        else if (direcao == 1){setRotation(90);}
        else if (direcao == 2){setRotation(180);}
        else if (direcao == 3){setRotation(270);}
        
        
        timer--;
        if (timer <= 0) {
            getWorld().removeObject(this);
        }
        
    }
}