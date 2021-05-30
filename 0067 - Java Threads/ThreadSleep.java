public class ThreadSleep implements Runnable{
    public void run(){
        int i = 1;
        while(i <= 10){
            System.out.println("i : " + i);
            i++;
            try {
                Thread.sleep(300); // 300 millisecond
            }catch(InterruptedException e){
                System.out.println(e);
            }

        }
    }

    public static void main(String[] args) {
        ThreadSleep ts = new ThreadSleep();
        Thread thread1 = new Thread(ts);
        Thread thread2 = new Thread(ts);
        Thread thread3 = new Thread(ts);
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
