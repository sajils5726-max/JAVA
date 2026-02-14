import java.util.Scanner;
public class Matrix
 {
    public static void main(String[] args) 
    {
        int row, col,i,j;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        row = s.nextInt();
        System.out.print("Enter the number of columns: ");
        col = s.nextInt();

        int matA[][] = new int[row][col];

        System.out.println("Enter the matrix elements:");
        for (i = 0; i < row; i++)
        {
            for ( j = 0; j < col; j++)
            {
                matA[i][j] = s.nextInt();
            }
        }

        System.out.println("Matrix");
        System.out.println("------");
        for ( i = 0; i < row; i++)
        {
            for (j = 0; j < col; j++) 
            {
                System.out.print(matA[i][j] + "\t");
            }
            System.out.println();
        }

        s.close();
    }
}