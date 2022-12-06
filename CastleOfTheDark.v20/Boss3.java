import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Boss3 extends inimigo{
    static int vidaBoss3 = 3;
    boolean receberDano = false;
    static boolean causarDano = false;
    int contador = 0;
    GreenfootImage atacar = new GreenfootImage("BossFinal01.png");
    GreenfootImage naoAtacar = new GreenfootImage("BossFinal02.png");
    static GreenfootSound mPain = new GreenfootSound("boss3Death.mp3");
    boolean mover = true;
    
    public Boss3(int vida){vidaBoss3=vida;}
    public Boss3(){Nivel03Sala01.mBadalar.stop();}
    
    public void act(){
        if (receberDano == true){
            setImage(atacar);
            causarDano = true;
            colisao();
        }
        else if (receberDano == false){
            setImage(naoAtacar);
            causarDano = false;
        }
        if (contador == 800){
            receberDano = true ;
            mover = false;
            contador = 0;
        }
        
        atacar();
        criar();
        vidaM();
        if (mover){moverBoss();}
    }
    public void criar(){
        World MyWorld;
        MyWorld = getWorld();
        if (getWorld().getObjects(coracao_boss_1.class).isEmpty()){
            MyWorld.addObject(new coracao_boss_1(), 100,15);
            MyWorld.addObject(new coracao_boss_1(), 140,15);
            MyWorld.addObject(new coracao_boss_1(), 180,15);}
        }
    public void vidaM(){
        if (vidaBoss3 == 3){
            coracao_boss_1.bvivo1 = true;
            coracao_boss_1.bvivo2 = true;
            coracao_boss_1.bvivo3 = true;
        }
        else if (vidaBoss3 == 2){
            coracao_boss_1.bvivo3 = false;
        }
        else if (vidaBoss3 == 1){
            coracao_boss_1.bvivo2 = false;
        }
        else if (vidaBoss3 == 0){
            coracao_boss_1.bvivo1 = false;            
            //getWorld().addObject(new portasNivel01(), 741,132);    
            Greenfoot.setWorld(new Parabens());
            //getWorld().removeObject(this);
        }
    }
    public static void perderVida(){
        vidaBoss3--;
        mPain.play();
    }
    public void colisao(){
        Actor Player_atk = getOneIntersectingObject(Player_atk.class);
        if (Player_atk !=null){
            perderVida();
            World world = getWorld();
            getWorld().removeObject(Player_atk);
            receberDano = false;
            mover = true;
            }
    }
    public void atacar(){
        World MyWorld;
        MyWorld = getWorld();
        if (getWorld().getObjects(enemy_bat.class).isEmpty()){
            SpawnBat();
            //contador++;
        }   
    }
    public void moverBoss(){
        int posicao1x = (389);
        int posicao1y = (171);
        
        int posicao2x = (670);
        int posicao2y = (267);
        
        int posicao3x = (872);
        int posicao3y = (127);
        
        int posicao4x = (162);
        int posicao4y = (233);
        
        int numero = Greenfoot.getRandomNumber(4);
        if (contador % 50 == 0){
        if (numero == 0 ){setLocation(posicao1x, posicao1y);}
        else if (numero== 1 ){setLocation(posicao2x, posicao2y);}
        else if (numero == 2){setLocation(posicao3x, posicao3y);}
        else {setLocation(posicao4x, posicao4y);}}
        contador++;
    }
    public void SpawnBat(){
        World MyWorld;
        MyWorld = getWorld();
        int y = getY();
        int x = getX();
        MyWorld.addObject(new enemy_bat(), x,y);
    }
}

























