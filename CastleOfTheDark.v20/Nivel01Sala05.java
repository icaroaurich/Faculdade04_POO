import greenfoot.*;
public class Nivel01Sala05 extends Nivel01{
    public Nivel01Sala05(int pos_x, int pos_y){    
       setBackground(new GreenfootImage("base.png"));
       if(Player_1.vidap1>0){addObject(new Player_1(), pos_x,pos_y);}
       if(Player_2.vidap2>0){addObject(new Player_2(), pos_x,pos_y);}
       
       addObject(new portao(), NorteEntradaX,NorteEntradaY);
       addObject(new portasNivel01(), OesteEntradaX,OesteEntradaY);
       addObject (new vida(),500,200) ; // norte
       mPorta.play();
    }
}
