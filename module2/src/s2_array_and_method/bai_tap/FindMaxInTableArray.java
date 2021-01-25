package s2_array_and_method.bai_tap;

import java.util.Scanner;

public class FindMaxInTableArray {
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
        float max = matrix[0][0];
        for (int a=0; a< matrix.length; a ++) {
            for (int b = 0; b < matrix[a].length; b++) {
                if (matrix[a][b] > max) {
                    max = matrix[a][b];
                }
            }
        }
        System.out.println("Giá trị lớn nhất của mảng là: " + max);
        for (int a=0; a< matrix.length; a ++) {
            for (int b = 0; b < matrix[a].length; b++) {
                if (matrix[a][b] == max) {
                    System.out.println("Vị trí của " + max + " tại hàng thứ " + (a+1) + " vị trí thứ " + (b+1));
                }
            }
        }
    }
}
