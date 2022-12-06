import greenfoot.*;
public class Nivel02Sala17 extends Nivel02{

    public Nivel02Sala17(int posX, int posY){    
        if(Player_1.vidap1>0){addObject(new Player_1(), posX,posY);}
        if(Player_2.vidap2>0){addObject(new Player_2(), posX,posY);}
        addObject (new portasNivel02(),NorteEntradaX,NorteEntradaY) ; // norte
        addObject (new portasNivel02(),SulEntradaX,SulEntradaY) ; // norte
        addObject (new vida(),500,200) ; // norte
        // ter algo pra somar vida
    }
}
