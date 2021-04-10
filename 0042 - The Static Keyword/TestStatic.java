public class TestStatic{
    public static int count = 100;
    public static void incrementCount() {
        count++;
    }
    public static void main(String[] args){
        for (int i = 0; i < 3; i++) {
            System.out.println("Count is: " + TestStatic.count);
            TestStatic.incrementCount();
        }
    }
}