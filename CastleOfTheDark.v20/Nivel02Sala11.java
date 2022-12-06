import greenfoot.*;
public class Nivel02Sala11 extends Nivel02{
    public Nivel02Sala11(int posX, int posY){    
       if(Player_1.vidap1>0){addObject(new Player_1(), posX,posY);}
       if(Player_2.vidap2>0){addObject(new Player_2(), posX,posY);}
       
       //addObject (new porta_n02_s10(),520,25) ; // norte
       addObject (new portasNivel02(),SulEntradaX,SulEntradaY); // sul
       //addObject (new porta_n02_s10(),998,230); // leste
       //addObject (new porta_n02_s10(),27,230) ; // oeste
       
       addObject (new alavanca(),100,100) ; // oeste 
       
       addObject(new enemy_bat(), 100,100);
       
    }
}

