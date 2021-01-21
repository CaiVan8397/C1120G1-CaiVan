package s12_searching_algorithms.thuc_hanh;

import java.util.Scanner;

public class SettingBinarySearch {
    public static void main(String[] args) {
        int[] array = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so can tim");
        int num = input.nextInt();
        System.out.println(binarySearch(array , num));
    }
    public static int binarySearch(int[] arr, int value){
        int low = 0;
        int high = arr.length-1;
        while (high>=low){
            int mid = (low + high)/2;
            if (value == arr[mid]){
                return mid;
            }else if (value<arr[mid]){
                high = mid-1;
            } else {
                low= mid +1;
            }
        }
        return -1;
    }
}
