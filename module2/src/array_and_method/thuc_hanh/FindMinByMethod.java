package array_and_method.thuc_hanh;

public class FindMinByMethod {
    public static int findMIn(int[] array){
        int min = array[0];
        for (int i=0; i < array.length; i ++){
            if (min>array[i]){
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int min = findMIn(arr);
        System.out.println("The smallest element in the array is: " + min);
        for (int i=0; i<arr.length; i++){
            if (min == arr[i]){
                System.out.println("Thr position of smallest element in the array is: " + i);
            }
        }
    }
}
