import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class portao extends portas
{
    static boolean fechado = true;
    GreenfootImage portao = new GreenfootImage("portao.png");
    GreenfootImage portaoa = new GreenfootImage("portaoa.png");
    
    GreenfootImage portaob = new GreenfootImage("portaob.png");
    GreenfootImage portaoab = new GreenfootImage("portaoab.png");
    public void act()
    {
        int y = getY();
        int x = getX();

        if (x == 520 && y == 25){ 
            if (fechado == true){setImage(portaob);}
            else{
                setImage(portaoab);
                Actor Player;
                Player = getOneIntersectingObject(Player.class);
                if (Player !=null){
                    Greenfoot.setWorld(new Nivel01Sala06());
                    }
            }       
        }
        if (x == 520 && y == 30){ 
            if (fechado == true){setImage(portaob);}
            else{
                setImage(portaoab);
                Actor Player_1;
                Player_1 = getOneIntersectingObject(Player.class);
                if (Player_1 !=null){
                    Greenfoot.setWorld(new Nivel02Sala17(520,390));
                    }
            }       
        }
        if (x == 520 && y == 20){ 
            if (fechado == true){setImage(portao);}
            else{
                setImage(portaoab);
                Actor Player_1;
                Player_1 = getOneIntersectingObject(Player.class);
                if (Player_1 !=null){
                    //Greenfoot.setWorld(new Nivel03Sala01(520,390));
                    }
            }       
        }
    }
}