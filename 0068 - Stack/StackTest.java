public class StackTest {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        Producer p = new Producer(s);
        Thread t1 = new Thread(p);
        t1.start();
        Consumer c = new Consumer(s);
        Thread t2 = new Thread(c);
        t2.start();
    }
}
