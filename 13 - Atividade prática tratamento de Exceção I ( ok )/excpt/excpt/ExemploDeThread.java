    public class ExemploDeThread extends Thread{
    public ExemploDeThread(String nomeDaThread) {
        super (nomeDaThread);
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + this.getName());
            try {
                sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {}
        }
        System.out.println("Fim da Thread " + getName());
    }

    public static void main(String[] args) {
        ExemploDeThread thread1 = new ExemploDeThread("Thread 1.");
        ExemploDeThread thread2 = new ExemploDeThread("Thread 2.");
        thread2.setPriority(MAX_PRIORITY);
        thread1.start();
        thread2.start();
    }

    
}