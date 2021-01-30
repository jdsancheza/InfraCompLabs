public class EjThreads01c extends Thread {
    private final static int MAX = 5;

    private String n;

    public EjThreads01c(String n) {
        System.out.println("Extendiendo la clase thread");
        this.n = n;
    }

    public void run() {
        System.out.println("El nombre es: " + n);
    }

    public static void main(String[] args) {
        EjThreads01c[] ta = new EjThreads01c[MAX];

        for (int i = 0; i < MAX; i++) {
            ta[i] = new EjThreads01c("Thread " + i);
        }
        for (int i = 0; i < MAX; i++) {
            ta[i].start();
        }
    }
}
