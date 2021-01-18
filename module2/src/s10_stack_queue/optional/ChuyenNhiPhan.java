package s10_stack_queue.optional;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ChuyenNhiPhan {
    public static void main(String[] args) {
        Stack stack = new Stack();
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so muon chuyen sang nhi phan: ");
        num = input.nextInt();
        while (num!=0){
            int a;
            a = num % 2;
            stack.push(a);
            num = num/2;
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
