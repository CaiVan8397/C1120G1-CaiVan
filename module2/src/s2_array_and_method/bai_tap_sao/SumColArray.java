package s2_array_and_method.bai_tap_sao;

import java.util.Scanner;

public class SumColArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap số hàng muốn tạo: ");
        int i = input.nextInt();
        System.out.println("Nhập số phần tử của hàng: ");
        int j = input.nextInt();
        float[][] matrix = new float[i][j];
        for (int a=0; a< matrix.length; a ++){
            for (int b=0; b < matrix[a].length; b++){
                System.out.println("Nhập phần tử số " + (b+1) + " của hàng thứ " + (a+1) );
                matrix[a][b] = input.nextFloat();
            }
        }
        System.out.println("Nhập cột bạn muốn tính tổng");
        int col = input.nextInt();
        float sum = 0;
        for (int n =0; n < matrix.length; n++){
            sum += matrix[n][col];
        }
        System.out.println("Tổng cột thứ " + col + " của mảng là " + sum);
    }
}
