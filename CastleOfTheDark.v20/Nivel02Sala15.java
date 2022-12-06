import greenfoot.*;
public class Nivel02Sala15 extends Nivel02{
    public Nivel02Sala15(int posX, int posY){    
       if(Player_1.vidap1>0){addObject(new Player_1(), posX,posY);}
       if(Player_2.vidap2>0){addObject(new Player_2(), posX,posY);}
       //addObject (new porta_n02_s14(),520,25); // norte
       //addObject (new porta_n02_s12(),520,456); // sul
       //addObject (new porta_n02_s08(),998,230); // leste
       addObject (new portasNivel02(),OesteEntradaX,OesteEntradaY) ; // oeste
       
       addObject (new alavanca(),500,100) ; // oeste 
       
       addObject(new enemy_bat(), 800,100);
       addObject(new enemy_bat(), 900,400);
       addObject(new enemy_bat(), 700,300);
       addObject(new enemy_bat(), 600,300);
       addObject(new enemy_bat(), 600,400);
       
    }
}
