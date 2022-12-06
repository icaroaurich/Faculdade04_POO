import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class alavanca extends parede
{
    static boolean fechado1 = true;
    static boolean fechado2 = true;
    static boolean fechado3 = true;
    static boolean fechado4 = true;
    static boolean fechado5 = true;
    static boolean fechado6 = true;
    
    GreenfootImage alavanca = new GreenfootImage("alavanca_1.png");
    GreenfootImage alavanca2 = new GreenfootImage("alavanca_2.png");
    public void act()
    {
        int y = getY();
        int x = getX();
        
        Actor Player_1_atk; 
        Player_1_atk = getOneIntersectingObject(Player_1_atk.class);
        
        if (x == 100 && y == 100){
            if (fechado1 == true){setImage(alavanca);}
            else{setImage(alavanca2);}
            if (Player_1_atk !=null){fechado1 = false;}
        }
        if (x == 200 && y == 100){
            if (fechado2 == true){setImage(alavanca);}
            else{setImage(alavanca2);}
            if (Player_1_atk !=null){fechado2 = false;}
        }
        if (x == 300 && y == 300){
            if (fechado3 == true){setImage(alavanca);}
            else{setImage(alavanca2);}
            if (Player_1_atk !=null){fechado3 = false;}
        }
        if (x == 400 && y == 300){
            if (fechado4 == true){setImage(alavanca);}
            else{setImage(alavanca2);}
            if (Player_1_atk !=null){fechado4 = false;}
        }
        if (x == 500 && y == 100){
            if (fechado5 == true){setImage(alavanca);}
            else{setImage(alavanca2);}
            if (Player_1_atk !=null){fechado5 = false;}
        }
        if (x == 600 && y == 100){
            if (fechado6 == true){setImage(alavanca);}
            else{setImage(alavanca2);}
            if (Player_1_atk !=null){fechado6 = false;}
        }
        if (fechado1 == false && fechado2 == false && fechado3 == false && fechado4 == false && fechado5 == false && fechado6 == false){portao.fechado=false;}
        
        
        }
    }
