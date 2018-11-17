/*
public class Thread1 extends Thread {
    Thread1(){
        super("Поток исходный");
        System.out.println("Дочерний поток 1: "+this);
        start();
    }

    public void run() {
        try{
            for (int i=5;i>0;i--){
                System.out.println("Дочерний поток: "+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Дочерний поток завершен");
    }
}
*/
import java.text.SimpleDateFormat;
import java.util.Date;

public class Thread1 extends Thread {
    String name;
    Thread t;
    Date dateNow;
    SimpleDateFormat formatForDateNow;

    Thread1(String thname){
        name=thname;
        formatForDateNow =new SimpleDateFormat("E yyyy.MM.dd hh:mm:ss:SS");
        t= new Thread(this,name);
        System.out.println("Новый поток: "+t);
        t.start();
    }

    public void run(){
        try{
            for (int i=5;i>0;i--){
                dateNow=new Date();
                System.out.println(name+": "+formatForDateNow.format(dateNow));
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println(name + " прерван");
        }
        System.out.println(name+" завершен");
    }
}
