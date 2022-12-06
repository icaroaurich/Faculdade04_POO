import greenfoot.*;
public class Nivel02Sala16 extends Nivel02{

    public Nivel02Sala16(int posX, int posY){    
       if(Player_1.vidap1>0){addObject(new Player_1(), posX,posY);}
       if(Player_2.vidap2>0){addObject(new Player_2(), posX,posY);}
       //addObject (new porta_n02_s14(),520,25); // norte
       //addObject (new porta_n02_s12(),520,456); // sul
       //addObject (new porta_n02_s08(),998,230); // leste
       addObject (new portasNivel02(),OesteEntradaX,OesteEntradaY) ; // oeste
       
       addObject (new alavanca(),600,100) ; // oeste 
    }
    public void act(){
        //World MyWorld = getWorld();
        if (this.getObjects(enemy_bat.class).isEmpty()){
            if (alavanca.fechado6 == false){
               addObject(new enemy_bat(), 100,100);
               addObject(new enemy_bat(), 100,150);
               addObject(new enemy_bat(), 100,200);
               addObject(new enemy_bat(), 100,250);
               addObject(new enemy_bat(), 100,300);
               addObject(new enemy_bat(), 100,350);
            }
        }
    }
}

