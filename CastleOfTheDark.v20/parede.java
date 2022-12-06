import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class parede here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class parede extends Actor
{
    /**
     * Act - do whatever the parede wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        Actor player = getOneIntersectingObject(Player.class);
        if (player !=null){}
            
    }
    public void receberDano(Actor inimigo){
                int recuo = 0;
                inimigo = (Actor)getWorld().getObjects(inimigo.class).get(0);
                int xe = inimigo.getX();
                int ye = inimigo.getY();
                
                int x = getX();
                int y = getY();
                
                if (x > xe){x = x+recuo;}
                if (x < xe){x = x-recuo;}
                if (y > ye){y = y+recuo;}
                if (y < ye){y = y-recuo;}
                setLocation(x,y);
        }
}
