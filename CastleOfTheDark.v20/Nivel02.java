import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Nivel02 extends World{
    //Entrada e saidas norte
    public static int NorteEntradaX = 520;
    public static int NorteEntradaY= 25;
    public static int NorteSaidaX= 520;
    public static int NorteSaidaY= 390;
    
    //Entradas e saudas Sul
    public static int SulEntradaX = 520;
    public static int SulEntradaY= 456;
    public static int SulSaidaX= 520;
    public static int SulSaidaY= 90;
    
    //Entradas e saidas Leste
    public static int LesteEntradaX = 998;
    public static int LesteEntradaY= 230;
    public static int LesteSaidaX= 90;
    public static int LesteSaidaY= 230;
    
    //Entradas e saidas Oeste
    public static int OesteEntradaX = 27;
    public static int OesteEntradaY= 230;
    public static int OesteSaidaX= 930;
    public static int OesteSaidaY= 230;
    
    public Nivel02(){
        super(Param.LarguraDoCenario, Param.AlturaDoCenario, 1);
        setImageBackground();
    }
    public void setImageBackground(){
        setBackground(new GreenfootImage("base1.png"));
    }
}