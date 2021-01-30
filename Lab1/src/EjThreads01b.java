public class EjThreads01b extends Thread {
    private String n;

    public EjThreads01b(String n) {
        System.out.println("Extendiendo la clase thread");
        this.n = n;
    }

    public void run() {
        System.out.println("El nombre es: " + n);
    }

    public static void main(String[] args) {
        EjThreads01b t0 = new EjThreads01b("Thread " + 0);
        EjThreads01b t1 = new EjThreads01b("Thread " + 1);
        EjThreads01b t2 = new EjThreads01b("Thread " + 2);
        t0.start();
        t1.start();
        t2.start();
    }
}
