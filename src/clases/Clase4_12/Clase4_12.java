package clases.Clase4_12;

public class Clase4_12 {

    public static class Contador {
        private int contador = 0;

        public synchronized void incrementa() {
            contador++;
        }

        public synchronized int getContador() {
            return contador;
        }
    }

    public static class ContadorRunnable implements Runnable {
        private final Contador count;

        public ContadorRunnable(Contador count) {
            this.count = count;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                this.count.incrementa();
            }
        }
    }

    public static class ContadorMainSinExecutor {
        public static void main(String[] args) throws InterruptedException {
            Contador contador = new Contador();

            Thread t1 = new Thread(new ContadorRunnable(contador));
            Thread t2 = new Thread(new ContadorRunnable(contador));

            t1.start();
            t2.start();

            t1.join();
            t2.join();

            System.out.println("Final count: " + contador.getContador());
        }
    }
}
