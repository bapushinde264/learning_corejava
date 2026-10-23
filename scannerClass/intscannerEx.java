package scannerClass;

import java.util.Scanner;

public class intscannerEx {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Age");
        int age = sc.nextInt(); // For salary sc.nextDouble();
        System.out.println("Age : " + age);

        sc.close();

    }
}
