import greenfoot.*;
public class Nivel01Sala04 extends Nivel01{
    public Nivel01Sala04(int pos_x, int pos_y){     
       setBackground(new GreenfootImage("base.png"));
       
       if(Player_1.vidap1>0){addObject(new Player_1(), pos_x,pos_y);}
       if(Player_2.vidap2>0){addObject(new Player_2(), pos_x,pos_y);}
       
       addObject(new portasNivel01(), NorteEntradaX,NorteEntradaY);
       
       addObject (new alvo(),22,113);
       addObject (new alvo(),22,260);
       addObject (new alvo(),22,390);
       
       SpawnInimigo(5);
       mPorta.play();
    }
    public void SpawnInimigo(int n){
        for (int i = 0; i < n; i++){
           int x = inimigo.getRandomNumberX();
           int y = inimigo.getRandomNumberY();
           addObject(new inimigo_zumbi(), x,y);
       }
    }
}
