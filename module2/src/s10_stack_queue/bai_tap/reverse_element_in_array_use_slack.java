package s10_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class reverse_element_in_array_use_slack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter a size:");
            size = input.nextInt();
            if (size < 0)
                System.out.println("Try again!!!");
        } while (size < 0);
        int[] myArr = new int[size];
        for (int i=0; i < myArr.length; i++){
            System.out.print("Enter element " + i  + ": ");
            myArr[i] = input.nextInt();
        }
        for (int i=myArr.length-1; i >= 0; i--){
            stack.push(myArr[i]);
        }
        System.out.println("Mang dao nguoc la: ");
        System.out.println(stack);
    }
}
