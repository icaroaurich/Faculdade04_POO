import greenfoot.*;
public class Nivel02Sala12 extends Nivel02{
    //static int pos_x = 520;
    //static int pos_y = 390;
    public Nivel02Sala12(int posX, int posY){    
       if(Player_1.vidap1>0){addObject(new Player_1(), posX,posY);}
       if(Player_2.vidap2>0){addObject(new Player_2(), posX,posY);}
       
       //addObject (new porta_n02_s07(),520,25) ; // norte
       addObject (new portasNivel02(),SulEntradaX,SulEntradaY); // sul
       //addObject (new porta_n02_s08(),998,230); // leste
       //addObject (new porta_n02_s07(),27,230) ; // oeste
       
       addObject(new enemy_bat(), 100,100);
       addObject(new enemy_bat(), 500,100);
       //addObject(new enemy_bat(), 700,100);
       addObject (new alavanca(),200,100) ; // oeste 
       
    }
}
