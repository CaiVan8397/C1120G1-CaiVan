package s12_searching_algorithms.optional;

import java.util.Scanner;

public class SettingBinarySearch_dequy {
    public static void main(String[] args) {
        int[] array = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 45, 224,245, 24,85,4455,635};
        Scanner input = new Scanner(System.in);
        System.out.println("Input number: ");
        int num = input.nextInt();
        System.out.println("Index number of " + num+ " is " + binarySearch(array, 0, array.length-1, num));

    }
    public static int binarySearch(int[] arr, int low, int high, int value) {
        if (high >= low) {
            int mid = (low + high) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                return binarySearch(arr, low, mid - 1, value);
            }
            return binarySearch(arr, mid + 1, high, value);
        }
        return -1;
    }
}
