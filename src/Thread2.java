import java.text.SimpleDateFormat;
import java.util.Date;

public class Thread2 extends Thread {
    String name;
    Thread t;
    Date dateNow;
    SimpleDateFormat formatForDateNow;

    Thread2(String thname){
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
