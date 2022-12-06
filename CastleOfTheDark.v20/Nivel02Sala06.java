import greenfoot.*;
public class Nivel02Sala06 extends Nivel02{
  
    public Nivel02Sala06(int posX, int posY){     
       if(Player_1.vidap1>0){addObject(new Player_1(), posX,posY);}
       if(Player_2.vidap2>0){addObject(new Player_2(), posX,posY);}
       addObject (new portasNivel02(),NorteEntradaX,NorteEntradaY) ; // norte
       addObject (new Setacharada(),520,260) ; // cima
       addObject (new Setacharada(),520,370) ; // baixo
       addObject (new Setacharada(),420,310) ; // esquerda
       addObject (new Setacharada(),620,310) ; // direita
    }
}
