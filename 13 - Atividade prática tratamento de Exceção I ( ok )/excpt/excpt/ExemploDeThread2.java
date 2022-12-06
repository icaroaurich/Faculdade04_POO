public class ExemploDeThread2 implements Runnable{

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ");
            try {
                sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {}
        }
        System.out.println("Fim da Thread ");
    }

    public static void main(String[] args) {
        ExemploDeThread2 thread1 = new ExemploDeThread2();
        ExemploDeThread2 thread2 = new ExemploDeThread2();

        Thread nome = new Thread(thread1);
        nome.start();

        //thread2.setPriority(MAX_PRIORITY);
        //thread1.start();
        //thread2.start();
    }    
}