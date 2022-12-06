import greenfoot.*;
public class Nivel03Sala02 extends Nivel03{

    public Nivel03Sala02(int pos_x, int pos_y){    
       setBackground(new GreenfootImage("salaFinal.png"));
       addObject(new Player_1(), pos_x,pos_y);       
       addObject(new Player_2(), pos_x,pos_y);  
       addObject(new Boss3(),520,100);
       GreenfootSound mBoss3 = new GreenfootSound("boss3.mp3");
       mBoss3.play();
    }
    public Nivel03Sala02(){    
       setBackground(new GreenfootImage("salaFinal.png"));
       addObject(new Player_1(), 100,100);       
       addObject(new Player_2(), 100,100);  
       addObject(new Boss3(),520,100);
       GreenfootSound mBoss3 = new GreenfootSound("boss3.mp3");
       mBoss3.play();
    }
}
