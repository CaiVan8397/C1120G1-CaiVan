package s2_array_and_method.thuc_hanh;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        int size;
        int[] myArr;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = input.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        myArr = new int[size];
        for (int i=0; i < myArr.length; i++){
            System.out.print("Enter element " + (i + 1) + ": ");
            myArr[i] = input.nextInt();
        }
        int max = myArr[0];
        for (int i = 0 ; i < myArr.length; i++){
            if (myArr[i]>max){
                max = myArr[i];
            }
        }
        System.out.println("Max value of array is: " + max);
    }
}
