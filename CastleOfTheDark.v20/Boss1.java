import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Boss1 extends inimigo{
    static int vidaBoss1 = 3;
    boolean receberDano = false;
    int Contador = 0;
    GreenfootImage atacar = new GreenfootImage("Boss1.png");
    GreenfootImage naoAtacar = new GreenfootImage("Boss1f.png");
    public Boss1(int vida){vidaBoss1=vida;}
    public Boss1(){}
    
    public void act(){
        if (receberDano == true){
            setImage(atacar);
            colisao();
        }
        else if (receberDano == false){setImage(naoAtacar);}
        if (Contador == 500){
            receberDano = true ;
            Contador = 0;
            
        }
        
        atacar();
        criar();
        vidaM();
        mover_Boss();
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
        if (vidaBoss1 == 3){
            coracao_boss_1.bvivo1 = true;
            coracao_boss_1.bvivo2 = true;
            coracao_boss_1.bvivo3 = true;
        }
        else if (vidaBoss1 == 2){
            //coracao.bvivo1 = true;
            //coracao.bvivo2 = true;
            coracao_boss_1.bvivo3 = false;
        }
        else if (vidaBoss1 == 1){
            //coracao.bvivo1 = true;
            coracao_boss_1.bvivo2 = false;
            //coracao.bvivo3 = false;
        }
        else if (vidaBoss1 == 0){
            coracao_boss_1.bvivo1 = false;            
            getWorld().addObject(new portasNivel01(), 741,132);            
            getWorld().removeObject(this);
        }
    }
    public static void perderVida(){
        vidaBoss1--;
    }
    public void colisao(){
        Actor Player_atk = getOneIntersectingObject(Player_atk.class);
        if (Player_atk !=null){
            perderVida();
            World world = getWorld();
            getWorld().removeObject(Player_atk);
            receberDano = false;
            }
    }
    public void atacar(){
        World MyWorld;
        MyWorld = getWorld();
        if (getWorld().getObjects(fogo.class).isEmpty()){
            SpawnFogo(3);
            //Contador++;
        }    
    }
    public void mover_Boss(){
        int posicao1x = (389);
        int posicao1y = (171);
        
        int posicao2x = (670);
        int posicao2y = (267);
        
        int posicao3x = (872);
        int posicao3y = (127);
        
        int posicao4x = (162);
        int posicao4y = (233);
        
        int numero = Greenfoot.getRandomNumber(4);
        if (Contador % 150 == 0){
        if (numero == 0 ){setLocation(posicao1x, posicao1y);}
        else if (numero== 1 ){setLocation(posicao2x, posicao2y);}
        else if (numero == 2){setLocation(posicao3x, posicao3y);}
        else {setLocation(posicao4x, posicao4y);}} 
        Contador++;
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

























