public class ThreadTest implements Runnable{
    public void run(){
        int i = 1;
        while(i <= 100){
            System.out.println("i: " + i);
            i++;
        }
    }

    public static void main(String[] args){
        ThreadTest t = new ThreadTest();
        Thread thread1 = new Thread(t);
        Thread thread2 = new Thread(t);
        Thread thread3 = new Thread(t);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

