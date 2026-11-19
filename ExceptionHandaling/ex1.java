package ExceptionHandaling;

public class ex1 {
    public static void main(String[] args) {

        try {
            // int num1 = 10;
            // int num2 = 0;
            // int result = num1 / num2;
            // System.out.println("Result: " + result);

            int arr[] = { 1, 2, 3, 4, 5 };
            System.out.println(arr[5]);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred:" + e.getMessage());
        }
    }

}
