package array_and_method.bai_tap;

import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        int size;
        int[] myArr;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = input.nextInt();
            if (size < 0)
                System.out.println("Try again!!!");
        } while (size < 0);
        myArr = new int[size];
        for (int i=0; i < myArr.length; i++){
            System.out.print("Enter element " + (i + 1) + ": ");
            myArr[i] = input.nextInt();
        }
        int min = myArr[0];
        for (int i = 0 ; i < myArr.length; i++){
            if (myArr[i]<min){
                min = myArr[i];
            }
        }
        System.out.println("Max value of array is: " + min);
    }
}

