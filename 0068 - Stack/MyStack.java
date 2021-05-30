public class MyStack {
    private int idx = 0;
    private char[] data = new char[6];

    public synchronized void push(char c){
        this.notify();
        if(idx != 5){
            data[idx] = c;
            idx++;
        }
    }

    public synchronized char pop(){
        if(idx == 0){
            try {
                this.wait();
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
        idx--;
        return  data[idx];
    }
}

class Producer implements Runnable{
    private MyStack stack;
    public Producer(MyStack s){
        stack = s;
    }

    public void run(){
        char c;
        for (int i = 0; i <  50; i++){
            c = (char) (Math.random() * 26 + 'A');
            stack.push(c);
            System.out.println("Producer: " + c);
            try {
                Thread.sleep((int)(Math.random() * 300));
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class Consumer implements Runnable{
    private MyStack stack;

    public Consumer(MyStack s){
        stack = s;
    }

    public void run(){
        char c;
        for (int i = 0; i < 50; i++){
            c = stack.pop();
            System.out.println("Consumer: " + c);
            try {
                Thread.sleep((int)(Math.random() * 300));
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
