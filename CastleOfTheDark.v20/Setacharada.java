import greenfoot.*;
public class Setacharada extends portas{
    GreenfootImage preto = new GreenfootImage("seta_charada_cima.png");
    GreenfootImage verde = new GreenfootImage("seta_charada_cima_verde.png");
    GreenfootSound mSucess = new GreenfootSound("sucess.mp3");
    GreenfootSound mOpen = new GreenfootSound("open.mp3");
    
    static boolean cima = false;
    static boolean baixo = false;
    static boolean esquerda = false;
    static boolean direita = false;
    
    public void act(){
        int y = getY();
        int x = getX();
        
        Actor Player_atk = getOneIntersectingObject(Player_1_atk.class);
        
        if (x == 520 && y == 260){
            setRotation(0);
            if (cima==true){setImage(verde);}
            else{setImage(preto);}
            if (Player_atk != null){
                if (Setacharada.cima == false){cima = true; mSucess.play();}
                else{Setacharada.cima = false; Setacharada.baixo = false; Setacharada.esquerda = false; Setacharada.direita = false;}
            } // cima
        }
        
        if (x == 520 && y == 370){
            setRotation(180);
            if (baixo==true){setImage(verde);}
            else{setImage(preto);}
            if (Player_atk !=null){
                if (Setacharada.cima){baixo = true; mSucess.play();}
                else{Setacharada.cima = false; Setacharada.baixo = false; Setacharada.esquerda = false; Setacharada.direita = false;}
            } // baixo
        }
            
        if (x == 420 && y == 310){
            setRotation(270);
            if (esquerda==true){setImage(verde);}
            else{setImage(preto);}
            if (Player_atk !=null){
                if (cima == true && baixo == true){esquerda = true; mSucess.play();}
                else{cima = false; baixo = false; esquerda = false; direita = false;}
            } // esquerda
        }
        
        if (x == 620 && y == 310){
            setRotation(90);
            if (direita==true){setImage(verde);}
            else{setImage(preto);}
            if (Player_atk !=null){
                if (cima == true && baixo == true && esquerda == true){direita = true; mOpen.play();}
                else{cima = false; baixo = false; esquerda = false; direita = false;}
            } // direita
        }
    }
    public void porta0001(World world){
        setImage(preto);
    }
}
