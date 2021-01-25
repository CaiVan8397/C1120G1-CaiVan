package s2_array_and_method.bai_tap_sao;

import java.util.Scanner;

public class SumDiagonalOfMatrix {
    public static int sumDiagonal(int[][] array) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum1 += array[i][i];
        }
        for (int i = 0; i < array.length; i++) {
            sum2 += array[i][array[i].length - 1 - i];
        }
        return (sum1+sum2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap số hàng của ma trận vuông: ");
        int i = input.nextInt();
        int sum;
        int[][] matrix = new int[i][i];
        for (int m=0; m < matrix.length; m++){
            for (int n = 0; n<matrix[m].length; n++){
                System.out.println("Nhập phần tử số " + (n+1) + " của hàng thứ " + (m+1) );
                matrix[m][n] = input.nextInt();
            }
        }
        sum = sumDiagonal(matrix);
        System.out.println("Tong 2 duong cheo cua ma tran la: " + sum);

    }
}
