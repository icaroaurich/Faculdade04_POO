import greenfoot.*;
public class Nivel01Sala06 extends Nivel01{
    public Nivel01Sala06(){    
       setBackground(new GreenfootImage("base.png"));
       
       if(Player_1.vidap1>0){addObject(new Player_1(), 520,390);}
       if(Player_2.vidap2>0){addObject(new Player_2(), 620,390);}
       
       addObject(new Boss1(3), 160,125);
       addObject(new portao(), SulEntradaX,SulEntradaY);
       mPorta.play();
       
    }
}
