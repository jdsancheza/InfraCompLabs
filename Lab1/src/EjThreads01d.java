public class EjThreads01d extends Thread {
    private String n;

    public EjThreads01d(String n) {
        System.out.println("Extendiendo la clase thread");
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
        EjThreads01d t0 = new EjThreads01d("Thread " + 0);
        EjThreads01d t1 = new EjThreads01d("Thread " + 1);
        EjThreads01d t2 = new EjThreads01d("Thread " + 2);
        t0.start();
        t1.start();
        t2.start();
    }
}
