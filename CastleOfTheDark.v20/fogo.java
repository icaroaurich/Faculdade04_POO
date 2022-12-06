import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class fogo extends Boss1{
    int quadro = 1;
    int timer = 150;
    static boolean causarDano = false;
    GreenfootImage fogo = new GreenfootImage("fogo.png");
    GreenfootImage sombra = new GreenfootImage("fogoSombra.png");
    static GreenfootSound mFogo = new GreenfootSound("fogo.mp3");
    public void act(){
        if (timer > 19) {
            setImage(sombra);
            causarDano = false;
            mFogo.play();}
        if (timer < 20) {
            causarDano = true;
            setImage(fogo);
            
            }
        
        timer--;
        if (timer <= 0) {
            getWorld().removeObject(this);
        }
    }
}
