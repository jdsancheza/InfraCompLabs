public class EjThreads02d implements Runnable {
    private String n;

    public EjThreads02d(String n) {
        System.out.println("Implementando la iterfaz Runnable");
        this.n = n;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(n + " valor: " + i);
                Thread.sleep(60);
            }
        } catch (Exception e) {
        }
        System.out.println("Saliendo: " + n);
    }

    public static void main(String[] args) {
        Thread t0 = new Thread(new EjThreads02d("Thread " + 0));
        Thread t1 = new Thread(new EjThreads02d("Thread " + 1));
        Thread t2 = new Thread(new EjThreads02d("Thread " + 2));
        t0.start();
        t1.start();
        t2.start();
    }
}
