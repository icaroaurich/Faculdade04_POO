import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class tocha extends parede
{
    GreenfootImage tochaOff = new GreenfootImage("tocha0.png");
    GreenfootImage tochaOn = new GreenfootImage("tocha1.png");
    static GreenfootSound mFogo = new GreenfootSound("fogo.mp3");
    
    static boolean tocha1 = false;
    static boolean tocha2 = false;
    static boolean tocha3 = false;
    static boolean tocha4 = false;
    
    public void act()
    {
        int y = getY();
        int x = getX();
        
        if (x == 30 && y == 100){
            if (tocha1 == true){setImage(tochaOn);mFogo.play();}
            else{setImage(tochaOff);}
            Actor Player_2_atk = getOneIntersectingObject(Player_2_atk.class);
            if (Player_2_atk !=null){
                if(tocha1 == true){}
                else{
                tocha1=true;
                escuro.nivel++;
                getWorld().removeObject(Player_2_atk);}}}
                
        if (x == 997 && y == 100){
            if (tocha2 == true){setImage(tochaOn);mFogo.play();}
            else{setImage(tochaOff);}
            Actor Player_2_atk = getOneIntersectingObject(Player_2_atk.class);
            if (Player_2_atk !=null){
                //if(tocha2 == true){}else{
                tocha2=true;
                escuro.nivel++;
                getWorld().removeObject(Player_2_atk);}}//}
                
        if (x == 30 && y == 356){
            if (tocha3 == true){setImage(tochaOn);mFogo.play();}
            else{setImage(tochaOff);}
            Actor Player_2_atk = getOneIntersectingObject(Player_2_atk.class); 
            if (Player_2_atk !=null){
                if(tocha3 == true){}
                else{
                tocha3=true;
                escuro.nivel++;
                getWorld().removeObject(Player_2_atk);}}}
                
        if (x == 997 && y == 356){
            if (tocha4 == true){setImage(tochaOn);mFogo.play();}
            else{setImage(tochaOff);}
            Actor Player_2_atk = getOneIntersectingObject(Player_2_atk.class);
            if (Player_2_atk !=null){
                if(tocha4 == true){}
                else{
                tocha4=true;
                escuro.nivel++;
                getWorld().removeObject(Player_2_atk);}}}
                
    }
}
