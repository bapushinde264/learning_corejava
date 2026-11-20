package collectionFramework;

import java.util.ArrayList;

public class arraylistStrEx {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Bapu");
        names.add("Adesh");
        names.add("Nagesh");
        names.add("Gopa");

        System.out.println("Size of the list: " + names.size());
        names.remove("Gopa");
        System.out.println("Size of the list after remove: " + names.size());
        System.out.println(names.get(1));

        System.out.println("Index of 'Nagesh': " + names.indexOf("Nagesh"));

        System.out.println(names.isEmpty());

    }

}
