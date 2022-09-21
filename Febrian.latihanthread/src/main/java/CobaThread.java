/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import static java.lang.Thread.sleep;
/**
 *
 * @author Febrian Maulana
 */

public class CobaThread {
    public static void main(String[] args) {
        Thread t1=new Proses1();
        Thread t2=new Proses2();
        
        t1.start();
        t2.start();
    }
}

class Proses1 extends Thread{
    public void run(){
        try{
            sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();}
        System.out.println("Proses 1 Berjalan");
    }
}

class Proses2 extends Thread{
    public void run(){
        System.out.println("Proses 2 Berjalan");
    }
}
