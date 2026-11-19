package ExceptionHandaling;

public class throwsEx {

    static void cheackAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("You are not old enough");
        } else {
            System.out.println("You are an Adult");
        }
    }

    public static void main(String[] args) {
        try {
            cheackAge(9);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Occurred:" + e.getMessage());
        }
    }

}
