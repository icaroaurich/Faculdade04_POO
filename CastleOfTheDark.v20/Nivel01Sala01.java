import greenfoot.*;
public class Nivel01Sala01 extends Nivel01{
    static GreenfootSound mNivel01 = new GreenfootSound("nivel01.mp3");
    public Nivel01Sala01(int pos_x, int pos_y){    
        setBackground(new GreenfootImage("base.png"));
        
        if(Player_1.vidap1>0){addObject(new Player_1(), pos_x,pos_y);}
        if(Player_2.vidap2>0){addObject(new Player_2(), pos_x,pos_y);}
        addObject(new portasNivel01(), NorteEntradaX,NorteEntradaY);
        addObject(new portao(), SulEntradaX,SulEntradaY);
        addObject(new enemy_bat(), 200,200);   
        mPorta.play();
        
    }
    public Nivel01Sala01(){    
        setBackground(new GreenfootImage("base.png"));

        addObject(new Player_1(), 520-50,300+80);  
        addObject(new Player_2(), 620-50,300+80);
        addObject(new portasNivel01(), NorteEntradaX,NorteEntradaY);
        addObject(new portao(), SulEntradaX,SulEntradaY);
        addObject(new enemy_bat(), 200,200);
        
        alvo.quebrado1 = false;
        alvo.quebrado2 = false;
        alvo.quebrado3 = false;
        Nivel00Intro.mIntro.stop();
        mNivel01.playLoop();
    }
}
