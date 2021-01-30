public class ThreadsParesImpares01 extends Thread{

    private String name;
    private int limite;
    private int sleeptime;
    private boolean even;

    public ThreadsParesImpares01(String name, int limite, int sleeptime, boolean even){
        System.out.println("Extendiendo la clase thread");
        this.limite = limite;
        this.sleeptime = sleeptime;
        this.even = even;
        this.name = name;
    }

    public void run(){
        try{
            int i = 0;
            if(!even)
                i++;
            for (; i < limite; i+=2) {
                System.out.println(name + ": " + i);
                Thread.sleep(sleeptime);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Fin " + name);

    }


    public static void main(String[] args) {
        int limite = Integer.parseInt(args[0]);
        int sleeptime = Integer.parseInt(args[1]);
        ThreadsParesImpares01 t0 = new ThreadsParesImpares01("Par  ", limite, sleeptime, true);
        ThreadsParesImpares01 t1 = new ThreadsParesImpares01("Impar", limite, sleeptime, false);

        t0.start();
        t1.start();
    }
}
