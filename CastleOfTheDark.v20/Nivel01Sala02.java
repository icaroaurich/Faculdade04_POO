import greenfoot.*;
public class Nivel01Sala02 extends Nivel01{
    public Nivel01Sala02(int pos_x, int pos_y){
        
        setBackground(new GreenfootImage("base.png"));
       
        if(Player_1.vidap1>0){addObject(new Player_1(), pos_x,pos_y);}
        if(Player_2.vidap2>0){addObject(new Player_2(), pos_x,pos_y);}
       
        addObject(new portasNivel01(), SulEntradaX,SulEntradaY); //sul
        addObject(new portasNivel01(), OesteEntradaX,OesteEntradaY);  // oeste
        addObject(new portasNivel01(), LesteEntradaX,LesteEntradaY); // leste
        addObject(new enemy_bat(), 100,100);  
        mPorta.play();
    }
}
