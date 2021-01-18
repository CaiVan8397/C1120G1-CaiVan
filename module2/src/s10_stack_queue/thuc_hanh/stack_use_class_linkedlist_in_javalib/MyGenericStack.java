package s10_stack_queue.thuc_hanh.stack_use_class_linkedlist_in_javalib;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack <T>{
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }
    //Cài đặt phương thức push()
    public void push(T element) {
        stack.addFirst(element);
    }
    //Cài đặt phương thức pop()
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    //Cài đặt phương thức size()
    public int size() {
        return stack.size();
    }
    //Cài đặt phương thức isEmpty()
    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
