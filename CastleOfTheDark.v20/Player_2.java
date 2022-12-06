import greenfoot.*;
public class Player_2 extends Player{
    int velocidade = 5;
    int direcao = 0;
    static int vidap2 = 3;
        public void act(){
            int y = getY();
            int x = getX();
            mover(x,y);
            
            if (Greenfoot.isKeyDown("5")){atacar(x,y,direcao);}
            
            Actor inimigo;
            inimigo = getOneIntersectingObject(inimigo.class);
            
            if (inimigo !=null){
                if (getWorld().getObjects(fogo.class).isEmpty()){
                    if (getWorld().getObjects(Boss3.class).isEmpty()){receberDano(inimigo);}
                    else {
                        Actor aboss = (Actor)getWorld().getObjects(Boss3.class).get(0);
                        if (Boss3.causarDano == true){receberDano(inimigo);}}
                }
                else {
                    //Actor afogo = (Actor)getWorld().getObjects(fogo.class).get(0);
                    if (fogo.causarDano == true){receberDano(inimigo);}}
            }
            
            
            vidaM();
            }
        public void atacar(int x,int y,int direcao){
            World world = getWorld();
            World MyWorld;
            if (getWorld().getObjects(Player_2_atk.class).isEmpty()){
                MyWorld = getWorld();
                if (direcao == 0){
                    world.addObject(new Player_2_atk(), x,y-50);
                    Player_2_atk.direcao=0;}
                else if (direcao == 1){
                    world.addObject(new Player_2_atk(), x+50,y);
                    Player_2_atk.direcao=1;
                }
                else if (direcao == 2){
                    world.addObject(new Player_2_atk(), x,y+50);
                    Player_2_atk.direcao=2;
                }
                else if (direcao == 3){
                    world.addObject(new Player_2_atk(), x-50,y);
                    Player_2_atk.direcao=3;
                }
            }
        }
        public void mover(int x,int y){
            if (Greenfoot.isKeyDown("left")){
                setRotation(-90);
                direcao = 3;
                x = x-velocidade;}
            if (Greenfoot.isKeyDown("right")){
                direcao = 1;
                setRotation(90);
                x = x+velocidade;}
            if (Greenfoot.isKeyDown("up")){
                direcao = 0;
                setRotation(0);
                y = y-velocidade;}
            if (Greenfoot.isKeyDown("down")){
                direcao = 2;
                setRotation(180);
                y = y+velocidade;}
            setLocation(x,y);
        }
        public void vidaM(){
            criar();
            if (vidap2 == 3){
                coracao2.bvivo01 = true;
                coracao2.bvivo02 = true;
                coracao2.bvivo03 = true;
            }
            else if (vidap2 == 2){
                coracao2.bvivo03 = false;
            }
            else if (vidap2 == 1){
                coracao2.bvivo02 = false;
            }
            else if (vidap2 == 0){
                coracao2.bvivo01 = false;
                if (Player_1.vidap1 == 0 && Player_2.vidap2 == 0){Greenfoot.setWorld(new GameOver());}
                else{getWorld().removeObject(this);}
            }
                    }
        public static void perderVida(){
            vidap2--;
        }
        public static void ganharVida(){
            vidap2++;
        }
        public void criar(){
            World MyWorld;
            MyWorld = getWorld();
            if (getWorld().getObjects(coracao2.class).isEmpty()){
                MyWorld.addObject(new coracao2(), 800,450);
                MyWorld.addObject(new coracao2(), 840,450);
                MyWorld.addObject(new coracao2(), 880,450);
            }
        }
        public void receberDano(Actor inimigo){
                int recuo = 80;
                int xe = inimigo.getX();
                int ye = inimigo.getY();
                
                int x = getX();
                int y = getY();
                
                if (x > xe){x = x+recuo;}
                if (x < xe){x = x-recuo;}
                if (y > ye){y = y+recuo;}
                if (y < ye){y = y-recuo;}
                perderVida();
                setLocation(x,y);
        }
}

