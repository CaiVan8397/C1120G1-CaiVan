package s13_sort_algorithms.bai_tap;

public class SettingInsertSort {
    public static void main(String[] args) {
        int[] myList = {2, 94, 35, 10, 23, 45, 34, 59, 9};
        InsertSort(myList);
    }
    public static void InsertSort(int[] list){
        for ( int i=1; i<list.length;i++){
            int temp = list[i];
            int j = i-1;
            while (j>=0 && temp < list[j]){
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
