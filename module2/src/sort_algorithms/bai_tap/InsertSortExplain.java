package sort_algorithms.bai_tap;

import java.util.Arrays;

public class InsertSortExplain {
    public static void main(String[] args) {
        int[] myList = {2, 94, 35, 10, 23, 45, 34, 59, 9};
        System.out.println("Truoc khi sap xep: " + Arrays.toString(myList));
        explainInsert(myList);
    }
    public static void explainInsert(int[] list){
        for ( int i=1; i<list.length;i++){
            System.out.println("******* Lan lap thu " + i + "*******");
            int temp = list[i];
            int j = i-1;
            System.out.println(" - gia tri cua j = " + j + " , gia tri cua temp = " + temp);
            while (j>=0 && list[j] > temp){
                System.out.println(" - gia tri cua phan tu " + (j+1) + " la: " + list[j+1]);
                System.out.println(" - gia tri cua phan tu " + j + " la: " + list[j]);
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = temp;
        }
        System.out.println("List after sort: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "  ");
        }
    }
}
