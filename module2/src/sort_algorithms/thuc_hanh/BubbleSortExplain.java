package sort_algorithms.thuc_hanh;


import java.util.Arrays;

public class BubbleSortExplain {
    public static void main(String[] args) {
        int[] myList = {2, 4, 7, 10, 67, 45, 50, 59, 60, 66, 69, 70, 79};
        bubbleSort(myList);
    }
    public static void bubbleSort(int[] list){
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++){
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++){
                int temp = list[i];
                if (list[i] > list[i+1]){
                    temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    needNextPass  = true;
                }
            }
            if (!needNextPass) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.println(Arrays.toString(list));
        }
    }
}
