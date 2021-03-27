public class Pyramid {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= 1; j--)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print(k + " ");

            for (int p = i - 1; p >= 1; p--)
                System.out.print(p + " ");

            System.out.println();

        }
    }
}