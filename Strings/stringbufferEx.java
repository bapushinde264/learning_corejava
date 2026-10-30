package Strings;

public class stringbufferEx {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Bapu");

        sb.append(" Shinde");
        System.out.println(sb);

        sb.insert(0, "Hello ");
        System.out.println(sb);

        sb.replace(6, 10, "Sahil");
        System.out.println(sb);

        sb.delete(12, 18);
        System.out.println(sb);

        // System.out.println(sb.reverse());
        System.out.println(sb.append(" Garud"));
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        System.out.println(sb.charAt(1));
        sb.setCharAt(2, 't');

        System.out.println(sb);

        sb.ensureCapacity(50);
        System.out.println(sb.capacity());

        sb.trimToSize();
        System.out.println(sb.capacity());

    }
}
