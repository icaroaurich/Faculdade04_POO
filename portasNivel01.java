import greenfoot.*;
public class portasNivel01 extends portas{
    public void act(){
        World world = getWorld();
        String txt = String.valueOf(world);
        String nivel = txt.substring(0, 13);
        if (nivel.equals("Nivel01Sala01")){porta0101(world);}
        if (nivel.equals("Nivel01Sala02")){porta0102(world);}
        if (nivel.equals("Nivel01Sala03")){porta0103(world);}
        if (nivel.equals("Nivel01Sala04")){porta0104(world);}
        if (nivel.equals("Nivel01Sala05")){porta0105(world);}
        if (nivel.equals("Nivel01Sala06")){porta0106(world);}
    }
    public void porta0101(World world){
        world.showText(" Nível 01\nSala 01", 55, 55);
        
        Actor Player = getOneIntersectingObject(Player.class);
        if (Player !=null){Greenfoot.setWorld(new Nivel01Sala02(NorteSaidaX,NorteSaidaY));}
    }
    public void porta0102(World world)
    {
        world.showText(" Nível 01\nSala 02", 55, 55);
        
        Actor Player = getOneIntersectingObject(Player.class);
        int y = getY();
        int x = getX();
        
        if (x == 27 && y == 230){ 
            setRotation(-90); // oeste
            if (Player !=null){ 
                Greenfoot.setWorld(new Nivel01Sala03(OesteSaidaX,OesteSaidaY));}
        }
        if (x == 520 && y == 456){ 
            setRotation(180); //sul
            if (Player !=null){
                Greenfoot.setWorld(new Nivel01Sala01(SulSaidaX,SulSaidaY));} 
        }
        if (x == 998 && y == 230){
            setRotation(90); // leste
            if (Player !=null){
                Greenfoot.setWorld(new Nivel01Sala05(LesteSaidaX,LesteSaidaY));} 
        }
    }
    public void porta0103(World world){
        world.showText(" Nível 01\nSala 03", 55, 55);
        
        Actor Player = getOneIntersectingObject(Player.class);
        int y = getY();
        int x = getX();
        if (x == 520 && y == 456){
            setRotation(180);
            if (Player !=null){
                Greenfoot.setWorld(new Nivel01Sala04(526,90));}
        }
        if (x == 998 && y == 230){
            setRotation(90);
            if (Player !=null){
                Greenfoot.setWorld(new Nivel01Sala02(90+50,234));}
        }
    }
    public void porta0104(World world){
        world.showText(" Nível 01\nSala 04", 55, 55);
        Actor Player = getOneIntersectingObject(Player.class);
        int y = getY();
        int x = getX();
        if (x == 520 && y == 25){
            //setRotation(180);
            if (Player !=null){
                Greenfoot.setWorld(new Nivel01Sala03(NorteSaidaX,NorteSaidaY));}
        }
    }
    public void porta0105(World world){
        Actor Player;
        world.showText(" Nível 01\nSala 05", 55, 55);
        Player = getOneIntersectingObject(Player.class);
        int y = getY();
        int x = getX();        
        if (x == 27 && y == 230){
            setRotation(-90);
            if (Player !=null){
                Greenfoot.setWorld(new Nivel01Sala02(870,230));}
        }
    }
    public void porta0106(World world){
        Actor Player_1;
        world.showText(" Nível 01\nSala 06\nBOSS", 55, 55);
        GreenfootImage buraco = new GreenfootImage("buraco.png");
        setImage(buraco);
        Player_1 = getOneIntersectingObject(Player_1.class);
        int y = getY();
        int x = getX();
        if (x == 741 && y == 132){
            //setRotation(180);
            if (Player_1 !=null){
                Greenfoot.setWorld(new FimNivel1());}
        }
    }
}
