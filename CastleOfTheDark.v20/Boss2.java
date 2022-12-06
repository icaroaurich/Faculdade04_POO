import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Boss2 extends inimigo{
    static int vidaBoss2 = 3;
    boolean receberDano = false;
    int Contador = 0;
    GreenfootImage atacar = new GreenfootImage("boss2f.png");
    GreenfootImage naoAtacar = new GreenfootImage("boss2.png");
    GreenfootSound mSnakedamage = new GreenfootSound("snakeDamage.mp3");
    public Boss2(int vida){vidaBoss2=vida;}
    public Boss2(){}
    
    public void act(){
        if (receberDano == true){setImage(atacar);colisao();}
        else if (receberDano == false){setImage(naoAtacar);}
        
        //if (Contador %  3 == 0){mover_Boss();}
        if (escuro.nivel == 4){receberDano = true ;}
        
        //atacar();
        criar();
        vidaM();
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
        if (vidaBoss2 == 3){
            coracao_boss_1.bvivo1 = true;
            coracao_boss_1.bvivo2 = true;
            coracao_boss_1.bvivo3 = true;
        }
        else if (vidaBoss2 == 2){
            //coracao.bvivo1 = true;
            //coracao.bvivo2 = true;
            coracao_boss_1.bvivo3 = false;
        }
        else if (vidaBoss2 == 1){
            //coracao.bvivo1 = true;
            coracao_boss_1.bvivo2 = false;
            //coracao.bvivo3 = false;
        }
        else if (vidaBoss2 == 0){
            coracao_boss_1.bvivo1 = false;            
            getWorld().addObject(new portasNivel02(), 520,25);            
            getWorld().removeObject(this);
        }
    }
    public static void perderVida(){
        vidaBoss2--;
    }
    public void colisao(){
        Actor Player_atk = getOneIntersectingObject(Player_atk.class);
        if (Player_atk !=null){
            perderVida();
            mSnakedamage.play();
            World world = getWorld();
            getWorld().removeObject(Player_atk);
            receberDano = false;
            
            tocha.tocha1 = false;
            tocha.tocha2 = false;
            tocha.tocha3 = false;
            tocha.tocha4 = false;
            
            escuro.nivel = 0;
            moverBoss();
            }
    }
    public void atacar(){
        World MyWorld;
        MyWorld = getWorld();
        if (getWorld().getObjects(fogo.class).isEmpty()){
            //SpawnFogo(3);
            Contador++;
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
        
        int normal = Greenfoot.getRandomNumber(4);
        if (normal == 0 ){
            setLocation(posicao1x, posicao1y);
            
        }else if (normal == 1 ){
            setLocation(posicao2x, posicao2y);
            
        }
        else if (normal == 2){ setLocation(posicao3x, posicao3y);
        }
        else { setLocation(posicao4x, posicao4y);
        }
        //Contador++;
    }
    public void SpawnFogo(int n){
        World MyWorld;
        MyWorld = getWorld();
        for (int i = 0; i < n; i++){
           int x = inimigo.getRandomNumberX();
           int y = inimigo.getRandomNumberY();
           MyWorld.addObject(new fogo(), x,y);
        }
    }
}

























