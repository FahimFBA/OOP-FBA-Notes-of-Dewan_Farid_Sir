public class Series {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            System.out.print(i);
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print(" - baz");
            else if (i % 3 == 0)
                System.out.print(" - foo");
            else if (i % 5 == 0)
                System.out.print(" - bar");
            System.out.println();
        }
    }
}