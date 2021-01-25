package s2_array_and_method.bai_tap;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size1, size2;
        do {
            System.out.print("Enter a size of array 1:");
            size1 = input.nextInt();
            if (size1 < 0)
                System.out.println("Try again!!");
        } while (size1 < 0);
        do {
            System.out.print("Enter a size of array 2:");
            size2 = input.nextInt();
            if (size2 < 0)
                System.out.println("Try again!!");
        } while (size2 < 0);

        int[] arr1 = new int[size1];
        for (int i=0; i < arr1.length; i++){
            System.out.print("Enter element of array 1:  " + (i + 1) + ": ");
            arr1[i] = input.nextInt();
        }

        int[] arr2 = new int[size2];
        for (int i=0; i < arr2.length; i++){
            System.out.print("Enter element of array 2: " + (i + 1) + ": ");
            arr2[i] = input.nextInt();
        }

        int[] arr3 = new int[size1+size2];
        for (int i=0; i < arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for (int i= 0; i < arr2.length; i++){
            arr3[size1 + i] = arr2[i];
        }
        System.out.println("Mang gop gom cac phan tu: ");
        for (int i=0; i < arr3.length; i++){
            System.out.print(arr3[i] + " ");
        }
    }
}
