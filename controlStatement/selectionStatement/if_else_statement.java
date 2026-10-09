package controlStatement.selectionStatement;

public class if_else_statement {
    public static void main(String[] args) {
        int age = 10;
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");

        }

        int marks = 30;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else if (marks >= 40) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
    }
}
