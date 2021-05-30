public class MyThread extends Thread{
    public void run(){
        int i = 1;
        while(i <= 100){
            System.out.println("i: " + i);
            i++;
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        Thread thread2 = new MyThread();
        Thread thread3 = new MyThread();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
