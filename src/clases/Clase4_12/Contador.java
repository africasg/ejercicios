package clases.Clase4_12;


    public class Contador {
        private int contador = 0;
        public synchronized void incrementa() {
            System.out.println("Operación que no necesita sincronización");
            synchronized (this){
                contador++;
            }
        }
        public int getContador() {
            return contador;
        }
    }
