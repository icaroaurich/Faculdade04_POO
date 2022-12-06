import greenfoot.*;
public class Nivel03Sala01 extends Nivel03{
    static GreenfootSound mBadalar = new GreenfootSound("badalar.mp3");
    
    public Nivel03Sala01(){     
       setBackground(new GreenfootImage("base3.png"));
       addObject(new Player_1(), 470,380);  
       addObject(new Player_2(), 570,380);  
       addObject (new portasNivel03(),NorteEntradaX,NorteEntradaY);       
       Nivel02Sala01.mNivel02.stop();
       mBadalar.play();
       addObject (new vida(),500,200) ; // norte
    }
}
