public class Log {
    public static void main(String[] args){
        new Thread2("Первый");
        new Thread2("Второй");

        try{
            Thread.sleep(7500);
        }
        catch (InterruptedException e){
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}
