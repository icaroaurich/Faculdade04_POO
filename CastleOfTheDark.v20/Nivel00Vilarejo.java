import greenfoot.*;
public class Nivel00Vilarejo extends World{
    public Nivel00Vilarejo(){    
        super(Param.LarguraDoCenario, Param.AlturaDoCenario, 1); 
        setBackground(new GreenfootImage("00_01.png"));
        addObject(new Player_1(), 100,200);  
        addObject(new Player_2(), 100+100,200);  
        addObject(new portasNivel00(), 950,225);
    }
}
