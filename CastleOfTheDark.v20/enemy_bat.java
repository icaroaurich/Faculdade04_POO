import greenfoot.*; public class enemy_bat extends inimigo{
    int quadro = 1;
    int timer = 10;
    static GreenfootSound mBat = new GreenfootSound("bat.mp3");
    public enemy_bat(){mBat.play();}
    public void act(){
        frames();
        seguir();
        colisao();}
    public void frames(){
        GreenfootImage bat = new GreenfootImage("bat"+quadro+".png");
        if (timer > 5) {quadro = 1;}
        if (timer < 5) {quadro = 2;}
        if (timer <= 0){timer = 10;}
        setImage(bat);
        timer--;}
    public void colisao(){
        Actor Player_atk = getOneIntersectingObject(Player_atk.class);
        if (Player_atk !=null){getWorld().removeObject(this);}}
    public void seguir(){
        Actor Player = (Actor)getWorld().getObjects(Player.class).get(0);
        int xp = Player.getX();
        int yp = Player.getY();
        int x = getX();
        int y = getY();
        if (x > xp){x--;}
        if (x < xp){x++;}
        if (y > yp){y--;}
        if (y < yp){y++;}
        setLocation(x,y);}
}
