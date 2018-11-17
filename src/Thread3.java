public class Thread3 extends Thread {
    String name;
    Thread t;

    Thread3(String thname){
        name=thname;
        t= new Thread(this,name);
        System.out.println("Новый поток: "+t);
        t.start();
    }
}
