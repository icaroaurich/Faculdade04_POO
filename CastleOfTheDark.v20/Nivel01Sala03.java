import greenfoot.*;
public class Nivel01Sala03 extends Nivel01{
    public Nivel01Sala03(int pos_x, int pos_y){    
       setBackground(new GreenfootImage("base.png"));
       
       if(Player_1.vidap1>0){addObject(new Player_1(), pos_x,pos_y);}
       if(Player_2.vidap2>0){addObject(new Player_2(), pos_x,pos_y);}
        
       addObject(new portasNivel01(), SulEntradaX,SulEntradaY);
       addObject(new portasNivel01(), LesteEntradaX,LesteEntradaY);
       mPorta.play();
    }
}
