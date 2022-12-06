import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class escuro extends parede{
    GreenfootImage escuro0 = new GreenfootImage("escuro0.png");
    GreenfootImage escuro1 = new GreenfootImage("escuro1.png");
    GreenfootImage escuro2 = new GreenfootImage("escuro2.png");
    GreenfootImage escuro3 = new GreenfootImage("escuro3.png");
    static int nivel = 0;
    public void act()
    {
        if (nivel == 0){setImage(escuro0);}
        if (nivel == 1){setImage(escuro1);}
        if (nivel == 2){setImage(escuro2);}
        if (nivel == 3){setImage(escuro3);}
    }
}
