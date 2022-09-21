/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import static java.lang.Thread.sleep;
/**
 *
 * @author Febrian Maulana
 */

public class TugasThread {
    public static void main (String [] args) {
    Celana celana1 = new Celana("Celana-1");
    Celana celana2 = new Celana("Celana-2");
    celana1.start();
    celana2.start();
    }
}
    class Celana extends Thread {
        public Celana (String id) {
            super (id);
        }
    
    @Override
    public void run() {
        String nama = getName();
        for (int i=0; i<6; i++) {
            try {
                sleep(3000);
}
            catch(InterruptedException ie) {
                System.out.println("Terinterupsi");
            }
            System.out.println("Thread " + nama + ":Posisi" +i ); 
        }
}
    }