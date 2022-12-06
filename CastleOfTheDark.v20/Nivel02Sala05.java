import greenfoot.*;
public class Nivel02Sala05 extends Nivel02{
    
    public Nivel02Sala05(int posX, int posY){    
       if(Player_1.vidap1>0){addObject(new Player_1(), posX,posY);}
       if(Player_2.vidap2>0){addObject(new Player_2(), posX,posY);}
       addObject (new portasNivel02(),NorteEntradaX,NorteEntradaY) ; // norte
       addObject (new portasNivel02(),SulEntradaX,SulEntradaY); // sul
       addObject(new inimigo_zumbi(), 50,200);
    }
}
