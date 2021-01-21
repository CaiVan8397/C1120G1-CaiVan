package s12_searching_algorithms.optional;

import java.util.LinkedList;
import java.util.Scanner;

public class TimChuoiLienTiepCoDoDaiLonNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < string.length()-1; i++) {
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }else break;
            }

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        for (Character ch: max) { // single loop
            System.out.print(ch); // Simple statement
        }
    }
}
