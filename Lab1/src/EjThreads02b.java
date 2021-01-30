public class EjThreads02b implements Runnable {
    private String n;

    public EjThreads02b(String n) {
        System.out.println("Implementando la interfaz");
        this.n = n;
    }

    public void run() {
        System.out.println("El nombre es: " + n);
    }

    public static void main(String[] args) {
        Thread t0 = new Thread(new EjThreads02b("Thread " + 0));
        Thread t1 = new Thread(new EjThreads02b("Thread " + 1));
        Thread t2 = new Thread(new EjThreads02b("Thread " + 2));
        t0.start();
        t1.start();
        t2.start();
    }
}
