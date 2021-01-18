package s10_stack_queue.optional;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        String string;
        Queue queue = new LinkedList();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chuoi muon kiem tra doi xung: ");
        string = input.next();
        for (int i=string.length() - 1; i>=0; i--){
            queue.add(string.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString = reverseString + queue.remove();
        }
        if (string.equals(reverseString))
            System.out.println("chuỗi đối xứng.");
        else
            System.out.println("chuỗi k đối xứng.");
    }
}
