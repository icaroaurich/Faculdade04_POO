import greenfoot.*;
public class portasNivel02 extends portas{
    public void act(){
        World world = getWorld();
        String txt = String.valueOf(world);
        String nivel = txt.substring(0, 13);
        if (nivel.equals("Nivel02Sala01")){porta0201(world);}
        if (nivel.equals("Nivel02Sala02")){porta0202(world);}
        if (nivel.equals("Nivel02Sala03")){porta0203(world);}
        if (nivel.equals("Nivel02Sala04")){porta0204(world);}
        if (nivel.equals("Nivel02Sala05")){porta0205(world);}
        if (nivel.equals("Nivel02Sala06")){porta0206(world);}
        if (nivel.equals("Nivel02Sala07")){porta0207(world);}
        if (nivel.equals("Nivel02Sala08")){porta0208(world);}
        if (nivel.equals("Nivel02Sala09")){porta0209(world);}
        if (nivel.equals("Nivel02Sala10")){porta0210(world);}
        if (nivel.equals("Nivel02Sala11")){porta0211(world);}
        if (nivel.equals("Nivel02Sala12")){porta0212(world);}
        if (nivel.equals("Nivel02Sala13")){porta0213(world);}
        if (nivel.equals("Nivel02Sala14")){porta0214(world);}
        if (nivel.equals("Nivel02Sala15")){porta0215(world);}
        if (nivel.equals("Nivel02Sala16")){porta0216(world);}
        if (nivel.equals("Nivel02Sala17")){porta0217(world);}
        if (nivel.equals("Nivel02Sala18")){porta0218(world);}
    }
    public void porta0201(World world){
        world.showText(" Nível 02\nSala 01", 55, 55);
        Actor Player = getOneIntersectingObject(Player.class);
        
        int y = getY();
        int x = getX();        
        
        if (x == 520 && y == 25){
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala02(520,390));}
        } 
        if (x == 998 && y == 230){
            setRotation(90);
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala07(90,230));}
        }
    }
    public void porta0202(World world)
    {
        world.showText(" Nível 02\nSala 02", 55, 55);
        
        Actor Player = getOneIntersectingObject(Player.class);
        int y = getY();
        int x = getX();        
        if (x == 520 && y == 456){
            setRotation(180);
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala01(520,90));}
        }        
        else if (x == 27 && y == 230){
            setRotation(-90);
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala03(931,255));}
        }
    }
    public void porta0203(World world){
        world.showText(" Nível 02\nSala 03", 55, 55);
        
        Actor Player = getOneIntersectingObject(Player.class);
        int y = getY();
        int x = getX();        
        if (x == 520 && y == 456){
            setRotation(180); 
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala04(520,90));}
        }
        
        if (x == 998 && y == 230){
            setRotation(90); // leste
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala02(90,230));}
        }
    }
    public void porta0204(World world){
        world.showText(" Nível 02\nSala 04", 55, 55);
        
        Actor Player = getOneIntersectingObject(Player.class);
        int y = getY();
        int x = getX();
        if (x == 520 && y == 25){
            //setRotation(180); // norte
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala03(520,390));}
        }
        
        if (x == 520 && y == 456){
            setRotation(180); //sul
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala05(520,90));}
        }
    }
    public void porta0205(World world){
        world.showText(" Nível 02\nSala 05", 55, 55);
        
        Actor Player = getOneIntersectingObject(Player.class);
        int y = getY();
        int x = getX();
        if (x == 520 && y == 25){
            //setRotation(180); // norte
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala04(520,390));}
        }
        
        if (x == 520 && y == 456){
            setRotation(180); //sul
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala06(520,90));}
        }
    }
    public void porta0206(World world){
        world.showText(" Nível 02\nSala 06", 55, 55);
        
        Actor Player = getOneIntersectingObject(Player.class);
        int y = getY();
        int x = getX();
        if (x == 520 && y == 25){
            //setRotation(180); // norte
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala05(520,390));}
        }
    }
    public void porta0207(World world){
        world.showText(" Nível 02\nSala 07", 55, 55);
        
        Actor Player = getOneIntersectingObject(Player.class);
        int y = getY();
        int x = getX();
        if (x == 520 && y == 25){
            //setRotation(180); // norte
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala08(520,390));}
        }        
        if (x == 27 && y == 230){
            setRotation(-90);
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala01(930,230));}
        }
    }
    public void porta0208(World world){
        world.showText(" Nível 02\nSala 08", 55, 55);
        
        Actor Player = getOneIntersectingObject(Player.class);
        int y = getY();
        int x = getX();
        if (x == 520 && y == 456){
            setRotation(180); //sul
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala07(520,90));}
        }        
        if (x == 998 && y == 230){
            setRotation(90); // oeste
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala09(90,230));}
        }
    }
    public void porta0209(World world){
        world.showText(" Nível 02\nSala 09", 55, 55);
        
        Actor Player = getOneIntersectingObject(Player.class);
        int y = getY();
        int x = getX();
        if (x == 27 && y == 230){
            setRotation(-90);
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala08(930,230));}
        }        
        if (x == 998 && y == 230){
            setRotation(90); // oeste
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala10(90,230));}
        }
    }
    public void porta0210(World world){
        world.showText(" Nível 02\nSala 10", 55, 55);
        
        Actor Player = getOneIntersectingObject(Player.class);
        int y = getY();
        int x = getX();
        
        if (x == 520 && y == 25){
            //setRotation(180); // norte 1
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala11(520,390));}
        }      
        if (x == 590 && y == 25){
            //setRotation(180); // norte 2
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala12(520,390));}
        }            
        
        if (x == 520 && y == 456){
            setRotation(180); //sul
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala13(520,90));}
        }
        if (x == 590 && y == 456){
            setRotation(180); //sul
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala14(520,90));}
        }
        
        if (x == 998 && y == 230){
            setRotation(90); // leste 1
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala15(90,230));}
        }
        if (x == 998 && y == 300){
            setRotation(90); // leste 1
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala16(90,230));}
        }
        
        if (x == 27 && y == 230){
            setRotation(-90);
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala09(930,230));}
        }
    }
    public void porta0211(World world){
        world.showText(" Nível 02\nSala 11", 55, 55);
        
        Actor Player = getOneIntersectingObject(Player.class);
        int y = getY();
        int x = getX();
        if (x == 520 && y == 456){
            setRotation(180); //sul
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala10(520,90));}
        }
    }
    public void porta0212(World world){
        world.showText(" Nível 02\nSala 12", 55, 55);
        
        Actor Player = getOneIntersectingObject(Player.class);
        int y = getY();
        int x = getX();
        if (x == 520 && y == 456){
            setRotation(180); //sul
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala10(590,90));}
        } 
    }
    public void porta0213(World world){
        world.showText(" Nível 02\nSala 13", 55, 55);
        
        Actor Player = getOneIntersectingObject(Player.class);
        int y = getY();
        int x = getX();
        if (x == 520 && y == 25){
            //setRotation(180); // sul
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala10(520,390));}
        }  
    }
    public void porta0214(World world){
        world.showText(" Nível 02\nSala 14", 55, 55);
        
        Actor Player = getOneIntersectingObject(Player.class);
        int y = getY();
        int x = getX();
        if (x == 520 && y == 25){
            //setRotation(180); // sul
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala10(590,390));}
        }  
    }
    public void porta0215(World world){
        world.showText(" Nível 02\nSala 15", 55, 55);
        
        Actor Player = getOneIntersectingObject(Player.class);
        int y = getY();
        int x = getX();
        if (x == 27 && y == 230){
            setRotation(-90);
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala10(930,230));}
        } 
    }
    public void porta0216(World world){
        world.showText(" Nível 02\nSala 16", 55, 55);
        
        Actor Player = getOneIntersectingObject(Player.class);
        int y = getY();
        int x = getX();
        if (x == 27 && y == 230){
            setRotation(-90);
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala10(930,300));}
        } 
    }
    public void porta0217(World world){
        world.showText(" Nível 02\nSala 17", 55, 55);
        
        Actor Player = getOneIntersectingObject(Player.class);
        int y = getY();
        int x = getX();
        if (x == 520 && y == 456){
            setRotation(180); //sul
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala09(583,87));}
        } 
        if (x == 520 && y == 25){
            //setRotation(180); // sul
            if (Player !=null){
                Greenfoot.setWorld(new Nivel02Sala18(590,390));}
        } 
    }
    public void porta0218(World world){
        world.showText(" Nível 02\nSala 18\nBOSS", 55, 55);
        
        Actor Player = getOneIntersectingObject(Player.class);
        int y = getY();
        int x = getX();
        if (x == 520 && y == 25){
            //setRotation(180); // sul
            if (Player !=null){
                Greenfoot.setWorld(new FimNivel2());}
        } 
    }
}
