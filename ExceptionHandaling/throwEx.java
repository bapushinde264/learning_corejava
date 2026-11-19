package ExceptionHandaling;

public class throwEx {
    public static void main(String[] args) {
        int age = 17;
        if (age < 18) {
            throw new ArithmeticException("You are not old Enough to Vote");
        } else {
            System.out.println("You are an adult");
        }
    }

}
