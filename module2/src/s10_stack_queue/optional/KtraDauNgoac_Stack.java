package s10_stack_queue.optional;

import java.util.Scanner;
import java.util.Stack;

public class KtraDauNgoac_Stack {
    public static boolean ktraDauNgoac(String string) {
        Stack<Character> stackLeft = new Stack<Character>();
        Stack<Character> stackRight = new Stack<Character>();
        boolean check = false;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '(') {
                stackLeft.push(string.charAt(i));
            }
            if (string.charAt(i) == ')') {
                if (stackLeft.isEmpty()) {
                    return check;
                } else {
                    stackRight.push(string.charAt(i));
                }
            }
        }
        if (stackLeft.size() == stackRight.size()){
            check = true;
        };
        return check;
    }

    public static void main(String[] args) {
        String string;
        System.out.println("Nhap doan bieu thuc muon kiem tra: ");
        Scanner input = new Scanner(System.in);
        string = input.next();
        if (ktraDauNgoac(string)){
            System.out.println("Bieu thuc su dung dung dau ngoac");
        } else {
            System.out.println("Bieu thuc su dung sai dau ngoac");
        }
    }
}
