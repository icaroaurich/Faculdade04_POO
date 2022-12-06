import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class alvo extends parede
{
    static boolean quebrado1 = false;
    static boolean quebrado2 = false;
    static boolean quebrado3 = false;
    
    GreenfootImage alvo = new GreenfootImage("alvo.png");
    GreenfootImage alvoQuebrado= new GreenfootImage("alvoQuebrado.png");
    public void act()
    {
        int y = getY();
        int x = getX();
        
        if (x==22 && y == 113){
            if (quebrado1 == false){setImage(alvo);}
            else{setImage(alvoQuebrado);}
            Actor Player_2_atk = getOneIntersectingObject(Player_2_atk.class);
            if (Player_2_atk !=null){quebrado1=true;}}
            
        if (x==22 && y == 260){
            if (quebrado2 == false){setImage(alvo);}
            else{setImage(alvoQuebrado);}
            Actor Player_2_atk = getOneIntersectingObject(Player_2_atk.class);
            if (Player_2_atk !=null){quebrado2=true;}}
        
        if (x==22 && y == 390){
            if (quebrado3 == false){setImage(alvo);}
            else{setImage(alvoQuebrado);}
            Actor Player_2_atk = getOneIntersectingObject(Player_2_atk.class);
            if (Player_2_atk !=null){quebrado3=true;}}
        
        if (quebrado1 == true && quebrado2 == true && quebrado3 == true){portao.fechado = false;}
        
                
    }
}