package Extra;

import java.util.Hashtable;

public class test {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1,"123");
        hashtable.put(2,"123");
        hashtable.put(3,"123");

        System.out.println(hashtable.contains("123"));

        System.out.println(hashtable.containsValue("123"));
    }
}
