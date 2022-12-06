import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class coracao_boss_1 extends Boss1{   
    static boolean bvivo1 = false;
    static boolean bvivo2 = false;
    static boolean bvivo3 = false;
    //static boolean bvivo4 = false;
    public void act(){
        GreenfootImage vivo = new GreenfootImage("coracao_boss.png");
        GreenfootImage morto = new GreenfootImage("coracao_preto.png");
        int x = getX();
        if (x==100){if (bvivo1 == true){setImage(vivo);}else{setImage(morto);}}
        if (x==140){if (bvivo2 == true){setImage(vivo);}else{setImage(morto);}}
        if (x==180){if (bvivo3 == true){setImage(vivo);}else{setImage(morto);}}
    }
}
