public class EjThreads02c implements Runnable {
    private final static int MAX = 5;

    private String n;

    public EjThreads02c(String n) {
        System.out.println("Implementando la iterfaz Runnable");
        this.n = n;
    }

    public void run() {
        System.out.println("El nombre es: " + n);
    }

    public static void main(String[] args) {
        Thread[] ta = new Thread[MAX];

        for (int i = 0; i < MAX; i++) {
            ta[i] = new Thread(new EjThreads02c("Thread " + i));
        }
        for (int i = 0; i < MAX; i++) {
            ta[i].start();
        }
    }
}
