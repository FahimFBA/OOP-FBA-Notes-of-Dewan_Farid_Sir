public class Matrix_Mult {
    public static void main(String[] args){
        int[][] a = new int[3][3]; 
        int[][] b = new int[3][3]; 
        int[][] c = new int[3][3]; 

        for (int i = 0; i <= 2; i++) 
        for (int j = 0; j <= 2; j++){
            a [i][j] = 10 + i + j;
            b [i][j] = 20 + i + j;
        }
        System.out.println("Matrix A:");
        for (int i = 0; i <= 2; i++)
        {
            for (int j = 0; j <= 2; j++)
            System.out.print("\t" + a[i][j]);
            System.out.print("\n");
        }
        System.out.println("Matrix B:");
        for (int i = 0; i <= 2; i++)
        {
            for (int j = 0; j <= 2; j++)
            System.out.print("\t" + b[i][j]);
            System.out.print("\n");
        }
        // Matrix Multiplication
        for ( int i = 0; i <= 2; i++)
        for (int j = 0; j <= 2; j++)
        c[i][j] = (a[i][0] * b[0][j]) + (a[i][1] * b[1][j]) + (a[i][2] * b[2][j]);
        System.out.println("Matrix C:");
        for (int i = 0; i <= 2; i++)
        {
            for (int j = 0; j <= 2; j++)
            System.out.print("\t" + c[i][j]);
            System.out.print("\t");
        }
    }
}