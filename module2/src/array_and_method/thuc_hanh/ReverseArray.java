package array_and_method.thuc_hanh;

import java.util.Scanner;

public class ReverseArray {
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
        int indexFirst = 0;
        int indexLast = myArr.length-1;
        while (indexFirst<indexLast){
            int temp;
            temp = myArr[indexFirst];
            myArr[indexFirst] = myArr[indexLast];
            myArr[indexLast] = temp;
            indexFirst++;
            indexLast--;
        }
        System.out.print("Reverse array: ");
        for (int j = 0; j < myArr.length; j++) {
            System.out.print(myArr[j] + "\t");
        }

    }
}
