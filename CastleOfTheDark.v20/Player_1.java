import greenfoot.*;
public class Player_1 extends Player{
    int velocidade = 5;
    int direcao = 0;
    static int vidap1 = 3;
    int spawnAtaque = 20;
        public void act(){
            int y = getY();
            int x = getX();
            mover(x,y);
            
            if (Greenfoot.isKeyDown("j")){atacar(x,y,direcao);}

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
                        
            //Actor parede = getOneIntersectingObject(parede.class);
            //if (parede !=null){ColisaoParede(parede);} 
            
            vidaM();
            spawnAtaque--;
        }
        public void atacar(int x,int y,int direcao){ 
            World world = getWorld();
            //World MyWorld;
            //if (getWorld().getObjects(Player_1_atk.class).isEmpty()){
            if (spawnAtaque < 0){
                //MyWorld = getWorld();
                if (direcao == 0){
                    world.addObject(new Player_1_atk(), x,y-50);
                    Player_1_atk.direcao=0;}
                else if (direcao == 1){
                    world.addObject(new Player_1_atk(), x+50,y);
                    Player_1_atk.direcao=1;
                    }
                else if (direcao == 2){
                    world.addObject(new Player_1_atk(), x,y+50);
                    Player_1_atk.direcao=2;
                    }
                else if (direcao == 3){
                    world.addObject(new Player_1_atk(), x-50,y);
                    Player_1_atk.direcao=3;
                    }
                spawnAtaque = 100;
            }
        }
        public void mover(int x,int y){
            if (Greenfoot.isKeyDown("a")){
                setRotation(-90);
                direcao = 3;
                x = x-velocidade;}
            if (Greenfoot.isKeyDown("d")){
                direcao = 1;
                setRotation(90);
                x = x+velocidade;}
            if (Greenfoot.isKeyDown("w")){
                direcao = 0;
                setRotation(0);
                y = y-velocidade;}
            if (Greenfoot.isKeyDown("s")){
                direcao = 2;
                setRotation(180);
                y = y+velocidade;}
            setLocation(x,y);
        }
        public void vidaM(){
            criar();
            if (vidap1 == 3){
                coracao.bvivo1 = true;
                coracao.bvivo2 = true;
                coracao.bvivo3 = true;
            }
            else if (vidap1 == 2){
                coracao.bvivo3 = false;
            }
            else if (vidap1 == 1){
                coracao.bvivo2 = false;
            }
            else if (vidap1 == 0){
                coracao.bvivo1 = false;
                if (Player_1.vidap1 == 0 && Player_2.vidap2 == 0){Greenfoot.setWorld(new GameOver());}
                else{getWorld().removeObject(this);}
            }
        }
        public static void perderVida(){
            vidap1--;
        }
        public static void ganharVida(){
            vidap1++;
        }
        public void criar(){
            World MyWorld;
            MyWorld = getWorld();
            if (getWorld().getObjects(coracao.class).isEmpty()){
                MyWorld.addObject(new coracao(), 100,450);
                MyWorld.addObject(new coracao(), 140,450);
                MyWorld.addObject(new coracao(), 180,450);
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

