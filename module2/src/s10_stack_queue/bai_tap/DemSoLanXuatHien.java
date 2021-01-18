package s10_stack_queue.bai_tap;

import java.util.Set;
import java.util.TreeMap;

public class DemSoLanXuatHien {
    public static void countingWord(String str){
        System.out.println(str+"\n");
        String[] arrStr = str.split(" ");  //tach chuoi dua tren khoang trang
        TreeMap<String, Integer> tree = new TreeMap<>();
        for(String word : arrStr){
            if(!tree.containsKey(word)){
                //boolean containsKey(Object key)	Nó được sử dụng để tìm kiếm key được chỉ định từ map hiện tại
                tree.put(word ,1);
            } else {
                tree.put(word ,tree.get(word)+ 1);
            }
        }
        show(tree);
    }
    public static void show(TreeMap tree){
        Set<String> keySet = tree.keySet();
        for(String key : keySet){
            System.out.println(key+" appear "+tree.get(key)+" times");
        }
    }
    public static void main(String args[])
    {
        System.out.println("Hello, Dcoder!");
        String str = "Today is a good day and a happy day";
        countingWord(str);
    }
}
