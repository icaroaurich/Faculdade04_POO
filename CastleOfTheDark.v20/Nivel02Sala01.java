import greenfoot.*;
public class Nivel02Sala01 extends Nivel02{  
    static GreenfootSound mNivel02 = new GreenfootSound("nivel02.mp3");
    public Nivel02Sala01(int posX, int posY){ 
       if(Player_1.vidap1>0){addObject(new Player_1(), posX,posY);}
       if(Player_2.vidap2>0){addObject(new Player_2(), posX,posY);}
       addObject (new portasNivel02(),NorteEntradaX,NorteEntradaY) ;
       addObject(new enemy_bat(), 200,400);
       addObject(new enemy_bat(), 200,300);
       addObject(new enemy_bat(), 400,400);
       if (Setacharada.cima == true && Setacharada.baixo == true && Setacharada.esquerda == true && Setacharada.direita == true){
           addObject (new portasNivel02(),LesteEntradaX,LesteEntradaY);
       }
    }
    public Nivel02Sala01(){    
       addObject(new Player_1(), 741,132);  
       addObject(new Player_2(), 741+10,132+10);
       
       addObject (new portasNivel02(),NorteEntradaX,NorteEntradaY) ;
       addObject(new enemy_bat(), 200,400);
       addObject(new enemy_bat(), 200,300);
       addObject(new enemy_bat(), 400,400);
       
       alavanca.fechado1 = true;
       alavanca.fechado2 = true;
       alavanca.fechado3 = true;
       alavanca.fechado4 = true;
       alavanca.fechado5 = true;
       alavanca.fechado6 = true;
       portao.fechado = true;
       Setacharada.cima = false;
       Setacharada.baixo = false;
       Setacharada.esquerda = false;
       Setacharada.direita = false;
       
       mNivel02.playLoop();
    }
    //@Override
    public void setImageBackground(){
        setBackground(new GreenfootImage("base2.png"));
    }
}
