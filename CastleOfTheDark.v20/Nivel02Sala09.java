import greenfoot.*;             
public class Nivel02Sala09 extends Nivel02{
    
    public Nivel02Sala09(int posX, int posY){    
       if(Player_1.vidap1>0){addObject(new Player_1(), posX,posY);}
       if(Player_2.vidap2>0){addObject(new Player_2(), posX,posY);}
       addObject(new portao(), NorteEntradaX,30);
       addObject (new portasNivel02(),LesteEntradaX,LesteEntradaY);
       addObject (new portasNivel02(),OesteEntradaX,OesteEntradaY) ;
       addObject (new vida(),500,200) ; // norte
    }
}