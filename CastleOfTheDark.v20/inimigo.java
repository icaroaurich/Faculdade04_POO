import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class inimigo extends Actor{
    //static boolean causarDano;
    public void act()
    {
        //causarDano = true;
    }
    public static int getRandomNumberX(){
        int start = 85;
        int end = 940;
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }
    public static int getRandomNumberY(){
        int start = 257;
        int end = 410;
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }
}
