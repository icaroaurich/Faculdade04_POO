import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class coracao2 extends Player_2{   
    static boolean bvivo01 = false;
    static boolean bvivo02 = false;
    static boolean bvivo03 = false;
    public void act(){
        GreenfootImage vivo = new GreenfootImage("coracao.png");
        GreenfootImage morto = new GreenfootImage("coracao_preto.png");
        int x = getX();
        if (x==800){if (bvivo01 == true){setImage(vivo);}else{setImage(morto);}}
        if (x==840){if (bvivo02 == true){setImage(vivo);}else{setImage(morto);}}
        if (x==880){if (bvivo03 == true){setImage(vivo);}else{setImage(morto);}}
    }
}
