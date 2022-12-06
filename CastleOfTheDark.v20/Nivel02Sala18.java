import greenfoot.*;             
public class Nivel02Sala18 extends Nivel02{
    public Nivel02Sala18(int posX, int posY){    
       addObject(new Boss2(), 100,100);
       addObject(new escuro(),512,240);
       
       if(Player_1.vidap1>0){addObject(new Player_1(), posX,posY);}
       if(Player_2.vidap2>0){addObject(new Player_2(), posX,posY);}
       
       addObject(new tocha(),30,100); // 1
       addObject(new tocha(),997,100); // 2
       addObject(new tocha(),30,356); // 3
       addObject(new tocha(),997,356); // 4
       
       tocha.tocha1 = false;
       tocha.tocha2 = false;
       tocha.tocha3 = false;
       tocha.tocha4 = false;
    }
}
