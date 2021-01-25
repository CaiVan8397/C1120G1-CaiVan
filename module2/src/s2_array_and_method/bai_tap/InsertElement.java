package s2_array_and_method.bai_tap;

import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 4,6};
        int[] arrNew = new int[11];
        int num;
        int index;
        System.out.println("Input number");
        num = input.nextInt();
        do {
            System.out.println("Vị trí bạn muốn chèn trong mảng");
            index = input.nextInt();
        } while (index >= arr.length);
        for (int i = 0; i < index; i++){
            arrNew[i] = arr[i];
        }
        arrNew[index] = num;
        for (int i=index; i<arr.length; i++){
            arrNew[i+1] = arr[i];
        }
        System.out.println("Mang moi gồm: ");
        for (int i=0; i< arrNew.length; i++){
            System.out.print(arrNew[i] + " ");
        }
    }
}
