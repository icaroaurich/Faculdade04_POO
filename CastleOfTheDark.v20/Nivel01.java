import greenfoot.*; 
public class Nivel01 extends World{    
    int NorteEntradaX = 520;
    int NorteEntradaY= 25;    
    
    int SulEntradaX = 520;
    int SulEntradaY= 456;    
    
    int LesteEntradaX = 998;
    int LesteEntradaY= 230;    
    
    int OesteEntradaX = 27;
    int OesteEntradaY= 230;    
    
    static GreenfootSound mPorta = new GreenfootSound("porta.mp3");
    public Nivel01(){    
        super(Param.LarguraDoCenario, Param.AlturaDoCenario, 1); 
        //addObject(new ParedeHorizontal(), 999,240);
        //addObject(new ParedeHorizontal(), 22,240);
    }
}




