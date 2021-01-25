package s2_array_and_method.bai_tap;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num;
        System.out.println("Input number");
        num = input.nextInt();
        int delIndex = 0;
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                delIndex = i;
                check = true;
            }
        }
        if (check == true) {
            for (int i = delIndex; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0;
            System.out.println("Mang moi gom");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println(num + " k có trong mảng");
        }
    }
}
