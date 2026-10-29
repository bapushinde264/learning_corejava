package Strings;

public class stringMethods {
    public static void main(String[] args) {

        String name = "  Bapu";

        System.out.println(name.charAt(2));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(3));

        System.out.println(name.substring(2));
        System.out.println(name.substring(2, 3));
        System.out.println(name.replace('a', 'o'));

        System.out.println(name.startsWith("Ba"));
        System.out.println(name.trim());

    }

}
